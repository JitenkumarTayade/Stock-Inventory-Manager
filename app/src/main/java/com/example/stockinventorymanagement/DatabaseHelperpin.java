package com.example.stockinventorymanagement;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelperpin extends SQLiteOpenHelper {

    //Database version
    private static final int DATABASE_VERSION = 1;
    //Database Name
    private static final String DATABASE_NAME = "pin_database.db";
    //Database Table name
    private static final String TABLE_NAME = "PIN";
    //Table columns
    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String PNAMES = "pnames";
    public static final String TRANSTYPE = "transtype";
    public static final String CS = "cs";
    public static final String Q = "q";
    private SQLiteDatabase sqLiteDatabase;


    //creating table query
    private static final String CREATE_TABLE = "create table " + TABLE_NAME +"("+ID+
            " INTEGER PRIMARY KEY AUTOINCREMENT," + DATE + " TEXT NOT NULL,"+PNAMES+" TEXT NOT NULL,"+TRANSTYPE+" TEXT NOT NULL,"+TRANSTYPE+" TEXT NOT NULL,"+CS+" TEXT NOT NULL,"+Q+" TEXT NOT NULL);";
    //Constructor
    public DatabaseHelperpin (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //Add Employee Data
    public void addPin(PinModelClass pinModelClass){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelperpin.DATE, pinModelClass.getDate());
        contentValues.put(DatabaseHelperpin.PNAMES, pinModelClass.getPnames());


        contentValues.put(DatabaseHelperpin.TRANSTYPE, pinModelClass.getTranstype());
        contentValues.put(DatabaseHelperpin.CS, pinModelClass.getCs());
        contentValues.put(DatabaseHelperpin.Q, pinModelClass.getQ());
        sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.insert(DatabaseHelperpin.TABLE_NAME, null,contentValues);
    }

    public List<PinModelClass> getPinList(){
        String sql = "select * from " + TABLE_NAME;
        sqLiteDatabase = this.getReadableDatabase();
        List<PinModelClass> storeEmployee = new ArrayList<>();
        Cursor cursor = sqLiteDatabase.rawQuery(sql,null);
        if (cursor.moveToFirst()){
            do {
                int id = Integer.parseInt(cursor.getString(0));
                String date = cursor.getString(1);
                String pnames = cursor.getString(2);
                String transtype = cursor.getString(3);
                String cs = cursor.getString(4);
                String q = cursor.getString(5);
                storeEmployee.add(new PinModelClass(id,date,pnames,transtype,cs,q));
            }while (cursor.moveToNext());
        }
        cursor.close();
        return storeEmployee;
    }

    public void updatePin(PinModelClass pinModelClass){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelperpin.DATE,pinModelClass.getDate());
        contentValues.put(DatabaseHelperpin.PNAMES,pinModelClass.getPnames());
        contentValues.put(DatabaseHelperpin.TRANSTYPE,pinModelClass.getTranstype());
        contentValues.put(DatabaseHelperpin.CS,pinModelClass.getCs());
        contentValues.put(DatabaseHelperpin.Q,pinModelClass.getQ());
        sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.update(TABLE_NAME,contentValues,ID + " = ?" , new String[]
                {String.valueOf(pinModelClass.getId())});
    }

    public void deletePin(int id){
        sqLiteDatabase = this.getWritableDatabase();
        sqLiteDatabase.delete(TABLE_NAME, ID + " = ? ", new String[]
                {String.valueOf(id)});
    }
}