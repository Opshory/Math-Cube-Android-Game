package com.shantokumarkuetgmail.mathcube;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ShantO on 12/18/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "mathCube.db";
    public static final String TABLE_NAME = "mathCube_table";
    public static final String COL_0 = "ROW";
    public static final String COL_1 = "C1";
    public static final String COL_2 = "C2";
    public static final String COL_3 = "C3";
    public static final String COL_4 = "C4";
    public static final String COL_5 = "C5";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table " + TABLE_NAME + "(ROW INTEGER PRIMARY KEY AUTOINCREMENT, C1 INTEGER, C2 INTEGER, C3 INTEGER, C4 INTEGER, C5 INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void insertData(String C1, String C2,String C3, String C4, String C5)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, C1);
        contentValues.put(COL_2, C2);
        contentValues.put(COL_3, C3);
        contentValues.put(COL_4, C4);
        contentValues.put(COL_5, C5);
        db.insert(TABLE_NAME, null, contentValues);
        /*long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1) return false;
        else return true;*/
    }

    public Cursor getAllData() {

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from " + TABLE_NAME, null);
        return res;
    }

    /*public boolean updateData(String id, String name, String surname, String marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, id);
        contentValues.put(COL_2, name);
        contentValues.put(COL_3, surname);
        contentValues.put(COL_4, marks);
        db.update(TABLE_NAME, contentValues, "ID = ?", new String[] { id });
        return true;
    }*/

    /*public int deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?", new String[] {id});
    }*/

}
