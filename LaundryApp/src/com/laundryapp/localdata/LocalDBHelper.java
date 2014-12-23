package com.laundryapp.localdata;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LocalDBHelper extends SQLiteOpenHelper{

	private static final int DATABASE_VERSION = 1; // Database Version
	private static final String DATABASE_NAME = "laundry"; // Database Name
	
	//User Table
	private static final String TABLE_USER = "user";
	private static final String FIELD_USER_ID = "userid";
	private static final String FIELD_USER_EMAIL = "email";
	private static final String FIELD_USER_PASSWORD = "password";
	private static final String FIELD_USER_PHONE = "phone";
	
	private static LocalDBHelper mInstance = null;
	public static LocalDBHelper getInstance(Context ctx) {

		// Use the application context, which will ensure that you 
		// don't accidentally leak an Activity's context.
		if (mInstance == null) {
			mInstance = new LocalDBHelper(ctx.getApplicationContext());
		}
		return mInstance;
	}
	public LocalDBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
	}
}
