package com.example.user.final_project_67;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DB  extends SQLiteOpenHelper {
    private static final String database = "order.db";
    private static final int version = 1;

    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DB(Context context) {
        this(context, database, null, version);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE orderTable(_id integer primary key autoincrement," + "title text no null," + "count text no null," + "sum text no null,"+"other text no null)");
        db.execSQL("CREATE TABLE orderTable1(_id integer primary key autoincrement," + "title text no null," + "count text no null," + "sum text no null,"+"other text no null)");
    }

    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        db.execSQL("DROP TABLE IF EXISTS orderTable");
        db.execSQL("DROP TABLE IF EXISTS orderTable1");
        onCreate(db);
    }
}
