package com.example.events;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * User: ycx
 * Date: 13-9-11
 * Time: 下午2:58
 */
public interface Constants extends BaseColumns {
    public static final String TABLE_NAME = "events";
    public static final String TIME = "time";
    public static final String TITLE = "title";
    /*
    * Content Provider使用uri来寻址，
    * 形式为：content://authority/path/id
    * authority为提供者名称，
    * path是提供者内部的一个虚拟目录，用于标识被请求的数据类型，
    * id是被请求的特定记录的主键
    *
    * */
    public static final String AUTHORITY = "com.example.events";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);
}
