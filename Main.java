package com.example.storage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends Activity{
Button readBtn,writeBtn,deleteBtn,assetBtn;
EditText showTxt,writeTxt,assetTxt;
TextView existTxt;
	TextView seeTxt;
	SQLiteDatabase qdb;
	SQL db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//read asset file
		assetBtn = (Button)findViewById(R.id.assetsBtn);
		assetBtn.setOnClickListener(work);

		assetTxt = (EditText)findViewById(R.id.assetTxt);

	}
	
	OnClickListener work = new OnClickListener() {


		@Override
		public void onClick(View v)
		{
			switch (v.getId())
			{
					
			case R.id.assetsBtn:
				/*file = new File(Main.this.getFilesDir(),filename);
				file = new File(Main.this.getFilesDir(),filename1);
*/
				String str="",str1="",str2="",str3="",str4="",str5="",str6="";

				StringBuffer buf = new StringBuffer();
				try {


						BufferedReader reader = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("age.txt")));
					    BufferedReader reader1 = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("colors.txt")));
					BufferedReader reader2 = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("diet.txt")));
					BufferedReader reader3 = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("food.txt")));
					BufferedReader reader4 = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("names.txt")));
					BufferedReader reader5 = new BufferedReader(new InputStreamReader(Main.this.getResources().getAssets().open("salary.txt")));



					while ((str = reader.readLine()) != null && (str1=reader1.readLine())!=null&& (str2=reader2.readLine())!=null && (str3=reader3.readLine())!=null&& (str4=reader4.readLine())!=null&& (str1=reader5.readLine())!=null)
					{
						buf.append(str + "^" + str1 + "^" + str2 +"^" + str3 +"^" + str4 +"^" + str5 );
					}
					Toast.makeText(getBaseContext(),buf.toString(), Toast.LENGTH_LONG).show();

					String PREFS_NAME = "MyApp_Settings";
					SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
					SharedPreferences.Editor editor = settings.edit();
					editor.putString("key",buf.toString());
					editor.commit();

					// Reading from SharedPreferences
					String value = settings.getString("key", "");
					Log.d("TAG", value);

					/*db = new SQL(this,"mydb1.db",null,1);
					qdb = db.getReadableDatabase();
					long ins = qdb.insert("employees1", null,value);

					if (ins > 0)
						seeTxt.setText("row inserted, row# "+ins);
					else
						seeTxt.setText("row not insertd");
					break;
*/
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}//end of switch
			
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.toSQL) {
			Intent rr = new Intent(Main.this,SQLActivity.class);
			startActivity(rr);
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
