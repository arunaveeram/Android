package com.example.veera.myapplication_flags;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity_flags extends AppCompatActivity implements View.OnClickListener{
       int i=0;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_flags);
        btn=(Button)findViewById(R.id.button);
        btn.setEnabled(false);
        btn.setOnClickListener(this);
        Toast.makeText(this, "click start in menu first ", Toast.LENGTH_SHORT).show();



    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.flags,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu_2:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                i++;
               // Toast.makeText(this, "Clicked: Menu No. 1", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_3:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                i++;
                //Toast.makeText(this, "Clicked: Menu No. 2 ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_4:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                i++;
               // Toast.makeText(this, "Clicked: Menu No. 3 ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_5:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                i++;
               // Toast.makeText(this, "Clicked: Menu No. 4 ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_6:
                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                i++;
                //Toast.makeText(this, "Clicked: Menu No. 5 ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_7:
                if(i==0)
                {
                    Toast.makeText(this, "A region must be picked before continue ", Toast.LENGTH_SHORT).show();

                }
                else if(i<4)
                {

                    Toast.makeText(this, "pick atleast 4 regions ", Toast.LENGTH_SHORT).show();

                }
                else
                {   btn.setEnabled(true);
                    Button btn = (Button) findViewById(R.id.button);
                    btn.getBackground().setAlpha(1);

                }

        }
        return true;
    }



    @Override
    public void onClick(View v) {

        if(i==4) {
            Intent intent = new Intent(MainActivity_flags.this, secondActivity.class);
            //add some info to intent to be sent to activity 2
            intent.putExtra("info", "Asia");
            startActivityForResult(intent, 100);

        }
    }


}
