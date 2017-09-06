package com.example.veera.table_layout;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.nio.channels.SeekableByteChannel;

public class TableActivity extends AppCompatActivity {
    private static SeekBar seek_bar;
    private static TextView text_view,text_view1,text_view2,text_view3,text_view4,text_view5;
    private static Button btn;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
        calculate();

    }


public void calculate()
{
    btn = (Button) findViewById(R.id.button1);
    text_view = (TextView) findViewById(R.id.editText1);
    text_view1 = (TextView) findViewById(R.id.editText2);
    text_view2 = (TextView) findViewById(R.id.editText3);
    text_view3 = (TextView) findViewById(R.id.editText4);
    text_view4 = (TextView) findViewById(R.id.editText5);
    text_view5 = (TextView) findViewById(R.id.textView12);

    seek_bar = (SeekBar) findViewById(R.id.sb);
    seek_bar.setMax(39);

    text_view5 = (TextView) findViewById(R.id.textView12);

    seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

        int siz;
        int progress_value;

                                            public void onProgressChanged(SeekBar seekBar, int progress, boolean forUser)
                                            {

                                                int siz=progress+11;
                                                progress_value=siz;
                                                text_view5.setText("" +progress_value);
                                            }

                                            public void onStartTrackingTouch(SeekBar seekBar)
                                            {

                                            }
                                            public void onStopTrackingTouch(SeekBar seekBar)
                                            {
                                                text_view5.setText("" + progress_value );
                                            }
                                        }
    );


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Double num1=Double.parseDouble(text_view.getText().toString());
            Double num2 = Double.parseDouble(text_view1.getText().toString());
            Double sum = num1 + num2;
            Double num3 = Double.parseDouble(text_view5.getText().toString());
            text_view2.setText(Double.toString(sum+(sum*5/100)));
            text_view3.setText(Double.toString(sum+(sum*10/100)));
            text_view4.setText(Double.toString(sum+(sum*num3/100)));

        }
    }
    );
}

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Table Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}



