package com.example.Events;

import android.app.Activity;
import android.content.ContentValues;
import android.content.CursorLoader;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.Events.Constants.*;

public class Events extends Activity {
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
        SQLiteDatabase db = events.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(TIME, System.currentTimeMillis());
        values.put(TITLE, string);
        db.insertOrThrow(TABLE_NAME, null, values);
    }

    private static String[] FROM = {_ID, TIME, TITLE};
    private static String ORDER_BY = TIME + " DESC";

    private Cursor getEvents() {
        SQLiteDatabase db = events.getReadableDatabase();
        Cursor cursor;
        cursor = db.query(TABLE_NAME, FROM, null, null, null, null, ORDER_BY);
        startManagingCursor(cursor);

        CursorLoader cursorLoader = new CursorLoader(this, , null, null, null, ORDER_BY);
        return cursor;
    }

    private void showEvents(Cursor c) {
        StringBuilder builder = new StringBuilder("Saved Events:\n");
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
    }

}
