def build_connection_string(params):
    '''
    build a connection string from a dictionary of parameters.
    return string.
    '''

    return '; '.join(["%s = %s" % (k, v) for k, v in params.items()])

if __name__ == "__main__":
    myParams = {"server": "mpilgrim",\
                "database": "master",\
		"uid": "sa",\
		"pwd": "secret"\
    }
    print build_connection_string(myParams)
