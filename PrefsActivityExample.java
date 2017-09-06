package com.example.storage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

public class PrefsActivityExample extends Activity {

    Button delete,add,clear,read;
    TextView txt;
    EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prefs_example);
        add = (Button)findViewById(R.id.addbtn);
        clear = (Button)findViewById(R.id.clearbtn);
        delete = (Button)findViewById(R.id.delbtn);
        txt = (TextView)findViewById(R.id.textView);
        edt = (EditText)findViewById(R.id.editText);
        read = (Button)findViewById(R.id.readbtn);
        //check if shareprefs file exists
        findTheSharePrefFile("sample");

        //add some info
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               addInfoToSharedFile("sample","quote");
            }
        });
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readprefs("sample","quote");
            }
        });
        //clear the info in the sharedpref file
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearInfoOfSharedFile("sample","quote");
            }
        });
        //deletes the actual sharepref FILE!
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteTheFile("sample");
            }
        });

    }
    void findTheSharePrefFile(String name){
      //  File sss = new File(PrefsActivityExample.this.getFilesDir()+"/shared_prefs/");//wrong path!
        File sharedPreferenceFile = new File(PrefsActivityExample.this.getFilesDir().getParent()+"/shared_prefs/");
        File[] listFiles = sharedPreferenceFile.listFiles();
        boolean found = false;
        if (listFiles!=null) {
            for (File file : listFiles) {
                if (file.getName().equals(name + ".xml")) {
                    found = true;
                    break;
                }
            }
                if (found) {
                    txt.setText("sharedPref file " + name + " found.");

                } else
                    txt.setText("sharedPref file " + name + " NOT FOUND!");

        }
        else
            txt.setText("sharepref folder is empty");
    }
    void readprefs(String name,String key){
        SharedPreferences spref = PrefsActivityExample.this.getSharedPreferences(name, Context.MODE_PRIVATE);
        if(spref.contains(key))//may not be needed
        {
            String value =spref.getString(key,"default value");
            txt.setText(value);

        }
        else
            txt.setText("key not found");
    }
    void clearInfoOfSharedFile(String sharedFileName,String key){
        SharedPreferences spref = PrefsActivityExample.this.getSharedPreferences(sharedFileName, Context.MODE_PRIVATE);
        if(spref.contains(key))
        {
            SharedPreferences.Editor editor = spref.edit();
            editor.remove(key);
            boolean isCommitted = editor.commit();
            if (isCommitted)
                txt.setText("key cleared");
            else
                txt.setText("key not cleared");
        }

    }

    void addInfoToSharedFile(String name, String key){
        SharedPreferences spref = PrefsActivityExample.this.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = spref.edit();
        editor.putString(key,edt.getText().toString());//cannot have more than one key of the same name
        boolean isCommitted = editor.commit();
        if (isCommitted)
            txt.setText("key modified");
        else
            txt.setText("key not modified");
    }
    void deleteTheFile(String name) {
        File sharedPreferenceFile = new File(PrefsActivityExample.this.getFilesDir().getParent()+"/shared_prefs/");
        File[] listFiles = sharedPreferenceFile.listFiles();
        boolean found = false;
        boolean deleted = false;
        File foundFile;
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.getName().equals(name+".xml")) {

                    deleted = file.delete();
                    if (deleted)
                        txt.setText("The file has been deleted");
                    else
                        txt.setText("File found but NOT deleted!");
                    break;
                }
                if (found) {//file found, try to deleteit

                }
                if (!found)
                    txt.setText("sharedPref file " + name + " NOT FOUND!");
                //file.delete();
            }
        }
        else
            txt.setText("empty folder no files to delete");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pref, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent rr = new Intent(PrefsActivityExample.this,Main.class);
        startActivity(rr);
        return super.onOptionsItemSelected(item);
    }
}
