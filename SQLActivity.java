package com.example.storage;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SQLActivity extends Activity{
SQL db;
Button writebtn,readbtn,deletebtn;
TextView seeTxt;
SQLiteDatabase qdb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sql_activity);
		
		writebtn = (Button)findViewById(R.id.writeBTN);
		writebtn.setOnClickListener(clickme);
		readbtn = (Button)findViewById(R.id.readBTN);
		readbtn.setOnClickListener(clickme);
		seeTxt  =(TextView)findViewById(R.id.DBtxt);
		deletebtn = (Button)findViewById(R.id.deletebtn);
		deletebtn.setOnClickListener(clickme);
		 db = new SQL(this,"mydb1.db",null,1);
		qdb = db.getReadableDatabase();
		//1 table name
		//2 array of column names to return, null returns all columns
		//3 the WHERE clause, null all data, do not use the word where i.e._id=19 and summary=?"
		//4 selection arguments, have ? in the WHERE and the placeholder gets replace with these
		//5 GROUP by clause, null means rows wont be grouped
		//6 HAVING clause, null means no filter
		//7 ORDER BY clause, null no ordering
		//Cursor recordset1 = qdb.query("employees", null, null, null, null, null, null);
		
		//1 sql query
		//2 selection argument, having ? in the query replace them with strings
		
		//Cursor recordset2 = qdb.rawQuery("SELECT * FROM employees", null);
		//Cursor recordset3 = qdb.rawQuery("select * from todo where _id = ?", new String[] { id });
	}
	
	OnClickListener clickme = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.readBTN:
			Cursor recordset1 = qdb.query("employees1", null, null, null, null, null, null);
			Cursor recordset2 = qdb.rawQuery("SELECT * FROM employees1", null);
			StringBuilder theRow = new StringBuilder();
			recordset2.moveToFirst();
			if (recordset2.getCount()>0) {
				for (int i = 0; i < recordset2.getCount(); i++) {
					theRow.append(recordset2.getString(0));
					theRow.append(",");
					theRow.append(recordset2.getString(1));
					theRow.append(",");
					theRow.append(recordset2.getString(2));
					theRow.append(",");
					theRow.append(recordset2.getString(3));
					theRow.append(",");
					theRow.append(recordset2.getString(4));
					theRow.append(",");
				}
				seeTxt.setText("row info: " + theRow.toString());
			}
			else
				seeTxt.setText("no rows in the cursor");
			break;
			
		case R.id.writeBTN:

			ContentValues values = new ContentValues();
			 values.put("name", "carlos");
			 values.put("ext", "123");
			 values.put("mob","mobi");
			 values.put("age",23);
			 //returns row id or -1 if error
			String str="";
			StringBuffer buf = new StringBuffer();
			//InputStream is = this.getResources().openRawResource(R.drawable.my_base_data);
			InputStream iss = null;
			try {
				iss = SQLActivity.this.getResources().getAssets().open("textfile.txt");
				BufferedReader reader = new BufferedReader(new InputStreamReader(iss));
				if (iss!=null)
				{
					while ((str = reader.readLine()) != null)
					{
						//ContentValues values = new ContentValues();
						buf.append(str + "\n" );
					}
					iss.close();

					Toast.makeText(getBaseContext(),buf.toString(), Toast.LENGTH_LONG).show();
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 long ins = qdb.insert("employees1", null,values);

			 if (ins > 0)
				 seeTxt.setText("row inserted, row# "+ins);
			 else
				 seeTxt.setText("row not insertd");
			break;
			case R.id.deletebtn:
				boolean deleted = SQLActivity.this.deleteDatabase("mydb1.db");
				if (deleted)
					seeTxt.setText("database deleted");
				else
					seeTxt.setText("database not deleted");
				break;
		}
			
		}
	};
	
	
}
