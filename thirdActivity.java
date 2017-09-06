package com.example.veera.myapplication_flags;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {

    }

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tv1 = (TextView)findViewById(R.id.textView5) ;
        tv2 = (TextView)findViewById(R.id.textView6) ;
        tv3 = (TextView)findViewById(R.id.textView7) ;
        tv4 = (TextView)findViewById(R.id.textView8) ;
        tv5 = (TextView)findViewById(R.id.textView9) ;
        tv6 = (TextView)findViewById(R.id.textView10) ;
        tv7 = (TextView)findViewById(R.id.textView11) ;
        tv8 = (TextView)findViewById(R.id.textView12) ;
        tv9 = (TextView)findViewById(R.id.textView13) ;
        tv10 = (TextView)findViewById(R.id.textView14) ;

        prev = (Button)findViewById(R.id.btn);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //just close the intent
                //finish();
                //send someinfo back
                Intent i=new Intent(thirdActivity.this,MainActivity_flags.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
               /*Intent tent = new Intent();
                tent.putExtra("info","New Game!!");
                setResult(0,tent);*/
                //finish();
            }
        });
        //get the info from activity 1
        Intent tent = getIntent();
        String s1 = tent.getStringExtra("info1");
        tv1.setText(s1);
        String s2 = tent.getStringExtra("info2");
        tv2.setText(s2);
        String s3 = tent.getStringExtra("info3");
        tv3.setText(s3);
        String s4 = tent.getStringExtra("info4");
        tv4.setText(s4);
        String s5 = tent.getStringExtra("info5");
        tv5.setText(s5);
        String s6 = tent.getStringExtra("info6");
        tv6.setText(s6);
        String s7 = tent.getStringExtra("info7");
        tv7.setText(s7);
        String s8 = tent.getStringExtra("info8");
        tv8.setText(s8);
        String s9 = tent.getStringExtra("info9");
        tv9.setText(s9);
        String s10 = tent.getStringExtra("info10");
        tv10.setText(s10);

    }

}

