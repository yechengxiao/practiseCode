package com.example.events;

import android.app.ListActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

import static com.example.events.Constants.*;

public class Events extends ListActivity {
    private EventsData events;
    private static int count = 0;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        events = new EventsData(this);

        try {
            addEvents("hello" + count);
            Cursor cursor = getEvents();
            showEvents(cursor);
            count++;
        } finally {
            events.close();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private void addEvents(String string) {
        //9.5
        ContentValues values = new ContentValues();
        values.put(TIME, System.currentTimeMillis());
        values.put(TITLE, string);
        getContentResolver().insert(CONTENT_URI, values);

        //9.3
        //SQLiteDatabase db = events.getWritableDatabase();
        //ContentValues values = new ContentValues();
        //values.put(TIME, System.currentTimeMillis());
        //values.put(TITLE, string);
        //db.insertOrThrow(TABLE_NAME, null, values);
    }

    private static String[] FROM = {_ID, TIME, TITLE};
    private static String ORDER_BY = TIME + " DESC";

    private Cursor getEvents() {
        //9.5
        return getContentResolver().query(CONTENT_URI, FROM, null, null, ORDER_BY);


        //9.3
        //SQLiteDatabase db = events.getReadableDatabase();
        //Cursor cursor;
        //cursor = db.query(TABLE_NAME, FROM, null, null, null, null, ORDER_BY);
        //startManagingCursor(cursor);
        //return cursor;
    }

    private static int[] TO = {R.id.rowid, R.id.time, R.id.title};

    private void showEvents(Cursor c) {
        //9.4 数据绑定后的显示方式
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.item, c, FROM, TO);
        setListAdapter(adapter);//该适配器充当着一种媒介,连接视图与其数据源。

        //9.3
        /*
        StringBuilder builder = new StringBuilder("Saved events:\n");
        long id;
        long time;
        String title;
        while (c.moveToNext()) {
            id = c.getLong(0);
            time = c.getLong(1);
            title = c.getString(2);
            builder.append(id + ": ").append(time + ": ").append(title + "\n");
        }
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(builder);
       */
    }

}
