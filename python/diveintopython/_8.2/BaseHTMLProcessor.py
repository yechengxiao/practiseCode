import htmlentitydefs
from sgmllib import SGMLParser


class BaseHTMLProcessor(SGMLParser):
    def reset(self):
        # extend(called by SGMLParser.__init__)
        self.pieces = []
        SGMLParser.reset(self)

    def unknown_starttag(self, tag, attrs):
        # called for each starttag
        # attrs is a list of (attr, value) tuples
        # e.g. for <pre class = "screen">, tag = "pre", attrs = [("class", "screen)]
        # Ideally we would like to reconstruct original tag and attributes, but
        # we ma end up quoting attribute values that weren't quoted in the source
        # document,or we may change the type of quotes around the attribute
        # value (single to double quotes).
        # Note that improperly ebedded non-HTML code(like client-side Javascript)
        # may be parsed incorrectly by the ancestor, causing runtime script errors.
        # All non-HTML code must be enclosed in HTML commnet tag(<!-code->
        # to ensure that it will pass through this parser unaltered (in ahndle_commnet).
        strattrs = "".join(['%s="%s"' % (k, v) for k, v in attrs])
        self.pieces.append("<%(tag)s%(strattrs)s>" % locals())

    def unknown_endtag(self, tag):
        # called for each end tag, e.g. for </pre>, tag will be "pre"
        # Reconstruct the original end tag.
        self.pieces.append("</%(tag)s>" % locals())

    def handle_charref(self, ref):
        # called for each chatacter reference, e.g. for "&#160;", ref will be "160"
        # Reconstruct the original character reference.
        self.pieces.append("&#%(ref)s;" % locals())

    def handle_entityref(self, ref):
        # called for each entity reference, e.g. for "&copy;", ref will be "copy"
        # Reconstruct the original reference.
        self.pieces.append("&%(ref)s" % locals())
        # standard HTML entities are closed with a semicolon; other entities are not
        if htmlentitydefs.entitydefs.has_key(ref):
            self.pieces.append(";")

    def handle_data(self, text):
        # called for each block of plain test, i.e. outside of any tag and
        # not containing any character or entity fererences
        # Store the original text verbatim.
        self.pieces.append(text)

    def handle_commnet(self, text):
        # called for each HTML comment, e.g. <!--insert javascript code here-->
        # Reconstruct the original commnet.
        # It is especially important that the source document enclose client-side
        # code (like javascript) within commnets so it can pass through this
        #processor undisturbed; see commnets in unknown_starttag for details.
        self.pieces.append("<!--%(text)" % locals())

    def handle_pi(self, text):
        # called for each processing instruction, e.g. <?instruction>
        # Reconstruct original processing instruction.
        self.pieces.append("<?%(text)s>" % locals())

    def handle_decl(self, text):
        # called for the DOCTYPE, if present, e.g.
        # <!DOCTYPE html PUBLIC" -//W3C//DTD HTML 4.01 Transitional//EN'
        #   "http://www.w3.org/TR/html4/loose.dtd">
        # Reconstruct original DOCTYPE
        self.pieces.append("<!%(text)s" % locals())

    def output(self):
        """
        Return Processed HTML as a single string
        """
        return "".join(self.pieces)
