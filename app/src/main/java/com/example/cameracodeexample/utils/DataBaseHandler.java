package com.example.cameracodeexample.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseHandler extends SQLiteOpenHelper {
    public Context context;
    public static final String DATABASE_NAME = "dataManager";

    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "data";
    public static final String KEY_ID = "id";
    public static final String KEY_IMG_URL = "ImgFavourite";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        //Toast.makeText(context, "Constructor called", Toast.LENGTH_LONG).show();
    }

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + KEY_ID +
            " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_IMG_URL + " TEXT" + ")";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME + "";

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void deleteEntry(long row) {
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        sqLiteDatabase.delete(TABLE_NAME, KEY_ID + "=" + row, null);
    }

}
