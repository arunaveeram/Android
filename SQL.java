package com.example.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SQL extends SQLiteOpenHelper{

	int DB_VERSION = 1;
    String DB_NAME = "mydb1.db";
    Context context;
	
	public SQL(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		 // Store the context for later use
        this.context = context;
		DB_VERSION = version;
		DB_NAME = name;
        //check if db exists, if not it calls onCreate If it does exists then it checks 
        //the version. If the version is different then it calls the onUpgrade.
	}
	//if you want just basic, use this constructor instead of the above
   // public SQL (Context context)
    //{
    //	super(context, DB_NAME,null,DB_VERSION);
   // 	this.context = context;
    //}
    
    
	@Override
	public void onCreate(SQLiteDatabase db) {
		
		db.execSQL("CREATE TABLE employees1 ("
				+ " _id INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "name TEXT NOT NULL, "
				+ "ext TEXT NOT NULL, "
			    + "mob TEXT NOT NULL, "
			    + "age INTEGER NOT NULL DEFAULT '0')"
			      );
		//better to create a txt file with all the scripts if they become complex
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

		//erase or upgrade database
		
	}

}
