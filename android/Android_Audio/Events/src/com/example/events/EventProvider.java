package com.example.events;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/**
 * User: ycx
 * Date: 13-9-12
 * Time: 下午2:50
 * pdf上代码不完整，需要去网站上下载
 */
public class EventProvider extends ContentProvider {
    private static final int EVENTS = 1;
    private static final int EVENTS_ID = 2;
    //The MIME type of a directory of events
    private static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.example.event";
    //The MIME type of a single event
    private static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.example.event";
    private EventsData events;
    private UriMatcher uriMatcher;

    @Override
    public boolean onCreate() {
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] strings, String s, String[] strings2, String s2) {
        return null;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override
    public int delete(Uri uri, String s, String[] strings) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues contentValues, String s, String[] strings) {
        return 0;
    }
}
