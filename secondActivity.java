package com.example.veera.myapplication_game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.view.View.VISIBLE;


public class secondActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener
{

    Spinner spinner;
    ImageView imgv1,imgv2,imgv3,imgv4,imgv5,imgv6,imgv7,imgv8,imgv9,imgv10,imgv11,imgv12,imgv13,imgv14,imgv15,imgv16,imgv17,imgv18,imgv19,imgv20;
    int i,j,k,l,m,n,o,p,q,r,s,t,u,w,x,y,z,a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        spinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


        spinner = (Spinner) findViewById(R.id.spinner1);

        switch(position)
        {

            case 1:

                spinner.setVisibility(View.INVISIBLE);
            {
                imgv1 = (ImageView) findViewById(R.id.imageView1);
                imgv1.setVisibility(VISIBLE);
                imgv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv1.setImageResource(R.drawable.apple);
                        imgv1.setEnabled(false);
                        i = 1;
                        if (i == j) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                           // imgv1 = (ImageView) findViewById(R.id.imageView1);
                            imgv1.startAnimation(rotate);
                            imgv4.startAnimation(rotate);
                             imgv1.setAlpha(0.5f);
                            imgv4.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);

                        }

                    }
                });

                imgv2 = (ImageView) findViewById(R.id.imageView2);
                imgv2.setVisibility(VISIBLE);
                imgv2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        imgv2.setImageResource(R.drawable.banana);
                        imgv2.setEnabled(false);
                        k = 1;
                        if (k == l) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                           // imgv2 = (ImageView) findViewById(R.id.imageView2);
                            imgv2.startAnimation(rotate);
                            imgv5.startAnimation(rotate);
                            imgv2.setAlpha(0.5f);
                            imgv5.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }
                    }
                });
                imgv3 = (ImageView) findViewById(R.id.imageView3);
                imgv3.setVisibility(VISIBLE);
                imgv3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv3.setImageResource(R.drawable.mango);
                        imgv3.setEnabled(false);
                        m = 1;
                        if (m == n) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            imgv3 = (ImageView) findViewById(R.id.imageView3);
                            imgv3.startAnimation(rotate);
                            imgv6.startAnimation(rotate);
                            imgv3.setAlpha(0.5f);
                            imgv6.setAlpha(0.5f);


                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }
                    }
                });
                imgv4 = (ImageView) findViewById(R.id.imageView6);
                imgv4.setVisibility(VISIBLE);
                imgv4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv4.setImageResource(R.drawable.apple);
                        imgv4.setEnabled(false);
                        j = 1;
                        if (i == j) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview1 = (ImageView) findViewById(R.id.imageView1);
                            imgv1.startAnimation(rotate);
                            imgv4.startAnimation(rotate);
                            imgv1.setAlpha(0.5f);
                            imgv4.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });

                imgv5 = (ImageView) findViewById(R.id.imageView7);
                imgv5.setVisibility(VISIBLE);
                imgv5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv5.setImageResource(R.drawable.banana);
                        imgv5.setEnabled(false);
                        l = 1;
                        if (k == l) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imgv2 = (ImageView) findViewById(R.id.imageView2);
                            imgv2.startAnimation(rotate);
                            imgv5.startAnimation(rotate);
                            imgv2.setAlpha(0.5f);
                            imgv5.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }
                    }
                });
                imgv6 = (ImageView) findViewById(R.id.imageView8);
                imgv6.setVisibility(VISIBLE);
                imgv6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv6.setImageResource(R.drawable.mango);
                        imgv6.setEnabled(false);
                        n = 1;
                        if (m == n) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv3.startAnimation(rotate);
                            imgv6.startAnimation(rotate);
                            imgv3.setAlpha(0.5f);
                            imgv6.setAlpha(0.5f);


                        }
                        if((i+j+k+l+m+n)==6){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);

                        }

                    }
                });

            }

            break;


            case 2:
                spinner.setVisibility(View.INVISIBLE);
                imgv1.setAlpha(1.0f);   //To bring back to original imageview
                imgv1.clearAnimation();
                imgv1.setImageResource(R.drawable.front);
                imgv2.setAlpha(1.0f);
                imgv2.clearAnimation();
                imgv2.setImageResource(R.drawable.front);
                imgv3.setAlpha(1.0f);
                imgv3.clearAnimation();
                imgv3.setImageResource(R.drawable.front);
                imgv4.setAlpha(1.0f);
                imgv4.clearAnimation();
                imgv4.setImageResource(R.drawable.front);
                imgv5.setAlpha(1.0f);
                imgv5.clearAnimation();
                imgv5.setImageResource(R.drawable.front);
                imgv6.setAlpha(1.0f);
                imgv6.clearAnimation();
                imgv6.setImageResource(R.drawable.front);
            {
                imgv1 = (ImageView) findViewById(R.id.imageView1);
                imgv1.setVisibility(VISIBLE);
                imgv1.setEnabled(true);
                imgv1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        imgv1.setImageResource(R.drawable.apple);
                        i = 2;
                        if (i == j) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            // imgv1 = (ImageView) findViewById(R.id.imageView1);
                            imgv1.startAnimation(rotate);
                            imgv4.startAnimation(rotate);
                            imgv1.setAlpha(0.5f);
                            imgv4.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }

                });

                imgv2 = (ImageView) findViewById(R.id.imageView2);
                imgv2.setVisibility(VISIBLE);
                imgv2.setEnabled(true);
                imgv2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv2.setImageResource(R.drawable.banana);
                        k = 2;
                        if (k == l) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            // imgv2 = (ImageView) findViewById(R.id.imageView2);
                            imgv2.startAnimation(rotate);
                            imgv5.startAnimation(rotate);
                            imgv2.setAlpha(0.5f);
                            imgv5.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });
                imgv3 = (ImageView) findViewById(R.id.imageView3);
                imgv3.setVisibility(VISIBLE);
                imgv3.setEnabled(true);
                imgv3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv3.setImageResource(R.drawable.mango);
                        m = 2;
                        if (m == n) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            imgv3 = (ImageView) findViewById(R.id.imageView3);
                            imgv3.startAnimation(rotate);
                            imgv6.startAnimation(rotate);
                            imgv3.setAlpha(0.5f);
                            imgv6.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });
                imgv4 = (ImageView) findViewById(R.id.imageView6);
                imgv4.setVisibility(VISIBLE);
                imgv4.setEnabled(true);
                imgv4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv4.setImageResource(R.drawable.apple);
                        j = 2;
                        if (i == j) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview1 = (ImageView) findViewById(R.id.imageView1);
                            imgv1.startAnimation(rotate);
                            imgv4.startAnimation(rotate);
                            imgv1.setAlpha(0.5f);
                            imgv4.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }


                    }
                });

                imgv5 = (ImageView) findViewById(R.id.imageView7);
                imgv5.setVisibility(VISIBLE);
                imgv5.setEnabled(true);
                imgv5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv5.setImageResource(R.drawable.banana);
                        l = 2;
                        if (k == l) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imgv2 = (ImageView) findViewById(R.id.imageView2);
                            imgv2.startAnimation(rotate);
                            imgv5.startAnimation(rotate);
                            imgv2.setAlpha(0.5f);
                            imgv5.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });
                imgv6 = (ImageView) findViewById(R.id.imageView8);
                imgv6.setVisibility(VISIBLE);
                imgv6.setEnabled(true);
                imgv6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv6.setImageResource(R.drawable.mango);
                        n = 2;
                        if (m == n) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv3.startAnimation(rotate);
                            imgv6.startAnimation(rotate);
                            imgv3.setAlpha(0.5f);
                            imgv6.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }


                    }
                });
                imgv7 = (ImageView)findViewById(R.id.imageView4);
                imgv7.setVisibility(VISIBLE);
                imgv7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv7.setImageResource(R.drawable.cherries);
                        o = 2;
                        if (o == p) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv7.startAnimation(rotate);
                            imgv8.startAnimation(rotate);
                            imgv7.setAlpha(0.5f);
                            imgv8.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });
                imgv8 = (ImageView)findViewById(R.id.imageView9);
                imgv8.setVisibility(VISIBLE);
                imgv8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv8.setImageResource(R.drawable.cherries);
                        p = 2;
                        if (o == p) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv7.startAnimation(rotate);
                            imgv8.startAnimation(rotate);
                            imgv7.setAlpha(0.5f);
                            imgv8.setAlpha(0.5f);
                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }


                    }
                });
                imgv9 = (ImageView)findViewById(R.id.imageView5);
                imgv9.setVisibility(VISIBLE);
                imgv9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv9.setImageResource(R.drawable.kiwi);
                        q = 2;
                        if (q == r) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv9.startAnimation(rotate);
                            imgv10.startAnimation(rotate);
                            imgv9.setAlpha(0.5f);
                            imgv10.setAlpha(0.5f);

                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }


                    }
                });
                imgv10 = (ImageView)findViewById(R.id.imageView10);
                imgv10.setVisibility(VISIBLE);
                imgv10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgv10.setImageResource(R.drawable.kiwi);
                        r = 2;
                        if (q == r) {
                            Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                            // shake.AnimationListener(shakeListener);
                            //imageview3 = (ImageView) findViewById(R.id.imageView3);
                            imgv9.startAnimation(rotate);
                            imgv10.startAnimation(rotate);
                            imgv9.setAlpha(0.5f);
                            imgv10.setAlpha(0.5f);


                        }
                        if((i+j+k+l+m+n+o+p+q+r)==20){
                            Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                            spinner.setVisibility(VISIBLE);
                        }

                    }
                });

            }

         break;


   case 3:
       spinner.setVisibility(View.INVISIBLE);
       imgv1.setAlpha(1.0f);   //To bring back to original imageview
       imgv1.clearAnimation();
       imgv1.setImageResource(R.drawable.front);
       imgv2.setAlpha(1.0f);
       imgv2.clearAnimation();
       imgv2.setImageResource(R.drawable.front);
       imgv3.setAlpha(1.0f);
       imgv3.clearAnimation();
       imgv3.setImageResource(R.drawable.front);
       imgv4.setAlpha(1.0f);
       imgv4.clearAnimation();
       imgv4.setImageResource(R.drawable.front);
       imgv5.setAlpha(1.0f);
       imgv5.clearAnimation();
       imgv5.setImageResource(R.drawable.front);
       imgv6.setAlpha(1.0f);
       imgv6.clearAnimation();
       imgv6.setImageResource(R.drawable.front);
       imgv7.setAlpha(1.0f);
       imgv7.clearAnimation();
       imgv7.setImageResource(R.drawable.front);
       imgv8.setAlpha(1.0f);
       imgv8.clearAnimation();
       imgv8.setImageResource(R.drawable.front);
       imgv9.setAlpha(1.0f);
       imgv9.clearAnimation();
       imgv9.setImageResource(R.drawable.front);
       imgv10.setAlpha(1.0f);
       imgv10.clearAnimation();
       imgv10.setImageResource(R.drawable.front);
   {
       imgv1 = (ImageView) findViewById(R.id.imageView1);
       imgv1.setVisibility(VISIBLE);
       imgv1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv1.setImageResource(R.drawable.apple);
               i = 3;
               if (i == j) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   // imgv1 = (ImageView) findViewById(R.id.imageView1);
                   imgv1.startAnimation(rotate);
                   imgv4.startAnimation(rotate);
                   imgv1.setAlpha(0.5f);
                   imgv4.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });

       imgv2 = (ImageView) findViewById(R.id.imageView2);
       imgv2.setVisibility(VISIBLE);
       imgv2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv2.setImageResource(R.drawable.banana);
               k = 3;
               if (k == l) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   // imgv2 = (ImageView) findViewById(R.id.imageView2);
                   imgv2.startAnimation(rotate);
                   imgv5.startAnimation(rotate);
                   imgv2.setAlpha(0.5f);
                   imgv5.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });
       imgv3 = (ImageView) findViewById(R.id.imageView3);
       imgv3.setVisibility(VISIBLE);
       imgv3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv3.setImageResource(R.drawable.mango);
               m = 3;
               if (m == n) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   imgv3 = (ImageView) findViewById(R.id.imageView3);
                   imgv3.startAnimation(rotate);
                   imgv6.startAnimation(rotate);
                   imgv3.setAlpha(0.5f);
                   imgv6.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });
       imgv4 = (ImageView) findViewById(R.id.imageView6);
       imgv4.setVisibility(VISIBLE);
       imgv4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv4.setImageResource(R.drawable.apple);
               j = 3;
               if (i == j) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview1 = (ImageView) findViewById(R.id.imageView1);
                   imgv1.startAnimation(rotate);
                   imgv4.startAnimation(rotate);
                   imgv1.setAlpha(0.5f);
                   imgv4.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });

       imgv5 = (ImageView) findViewById(R.id.imageView7);
       imgv5.setVisibility(VISIBLE);
       imgv5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv5.setImageResource(R.drawable.banana);
               l = 3;
               if (k == l) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imgv2 = (ImageView) findViewById(R.id.imageView2);
                   imgv2.startAnimation(rotate);
                   imgv5.startAnimation(rotate);
                   imgv2.setAlpha(0.5f);
                   imgv5.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });
       imgv6 = (ImageView) findViewById(R.id.imageView8);
       imgv6.setVisibility(VISIBLE);
       imgv6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv6.setImageResource(R.drawable.mango);
               n = 3;
               if (m == n) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv3.startAnimation(rotate);
                   imgv6.startAnimation(rotate);
                   imgv3.setAlpha(0.5f);
                   imgv6.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv7 = (ImageView)findViewById(R.id.imageView4);
       imgv7.setVisibility(VISIBLE);
       imgv7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv7.setImageResource(R.drawable.cherries);
               o = 3;
               if (o == p) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv7.startAnimation(rotate);
                   imgv8.startAnimation(rotate);
                   imgv7.setAlpha(0.5f);
                   imgv8.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });
       imgv8 = (ImageView)findViewById(R.id.imageView9);
       imgv8.setVisibility(VISIBLE);
       imgv8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv8.setImageResource(R.drawable.cherries);
               p = 3;
               if (o == p) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv7.startAnimation(rotate);
                   imgv8.startAnimation(rotate);
                   imgv7.setAlpha(0.5f);
                   imgv8.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv9 = (ImageView)findViewById(R.id.imageView5);
       imgv9.setVisibility(VISIBLE);
       imgv9.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv9.setImageResource(R.drawable.kiwi);
               q = 3;
               if (q == r) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv9.startAnimation(rotate);
                   imgv10.startAnimation(rotate);
                   imgv9.setAlpha(0.5f);
                   imgv10.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv10 = (ImageView)findViewById(R.id.imageView10);
       imgv10.setVisibility(VISIBLE);
       imgv10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv10.setImageResource(R.drawable.kiwi);
               r = 3;
               if (q == r) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv9.startAnimation(rotate);
                   imgv10.startAnimation(rotate);
                   imgv9.setAlpha(0.5f);
                   imgv10.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });

       imgv11 = (ImageView)findViewById(R.id.imageView11);
       imgv11.setVisibility(VISIBLE);
       imgv11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv11.setImageResource(R.drawable.papaya);
               s = 3;
               if (s == t) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv11.startAnimation(rotate);
                   imgv12.startAnimation(rotate);
                   imgv11.setAlpha(0.5f);
                   imgv12.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv12 = (ImageView)findViewById(R.id.imageView20);
       imgv12.setVisibility(VISIBLE);
       imgv12.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv12.setImageResource(R.drawable.papaya);
               t = 3;
               if (s == t) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv11.startAnimation(rotate);
                   imgv12.startAnimation(rotate);
                   imgv11.setAlpha(0.5f);
                   imgv12.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv13 = (ImageView)findViewById(R.id.imageView12);
       imgv13.setVisibility(VISIBLE);
       imgv13.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv13.setImageResource(R.drawable.pineapple);
               u = 3;
               if (u == w) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv13.startAnimation(rotate);
                   imgv14.startAnimation(rotate);
                   imgv13.setAlpha(0.5f);
                   imgv14.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv14 = (ImageView)findViewById(R.id.imageView19);
       imgv14.setVisibility(VISIBLE);
       imgv14.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               imgv14.setImageResource(R.drawable.pineapple);
               w = 3;
               if (u == w) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv13.startAnimation(rotate);
                   imgv14.startAnimation(rotate);
                   imgv13.setAlpha(0.5f);
                   imgv14.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv15 = (ImageView)findViewById(R.id.imageView13);
       imgv15.setVisibility(VISIBLE);
       imgv15.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv15.setImageResource(R.drawable.grapes);
               x = 3;
               if (x == y) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv15.startAnimation(rotate);
                   imgv16.startAnimation(rotate);
                   imgv15.setAlpha(0.5f);
                   imgv16.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv16 = (ImageView)findViewById(R.id.imageView18);
       imgv16.setVisibility(VISIBLE);
       imgv16.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv16.setImageResource(R.drawable.grapes);
               y = 3;
               if (x == y) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv15.startAnimation(rotate);
                   imgv16.startAnimation(rotate);
                   imgv15.setAlpha(0.5f);
                   imgv16.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv17 = (ImageView)findViewById(R.id.imageView14);
       imgv17.setVisibility(VISIBLE);
       imgv17.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv17.setImageResource(R.drawable.watermelon);
               z = 3;
               if (z == a) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv17.startAnimation(rotate);
                   imgv18.startAnimation(rotate);
                   imgv17.setAlpha(0.5f);
                   imgv18.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv18 = (ImageView)findViewById(R.id.imageView17);
       imgv18.setVisibility(VISIBLE);
       imgv18.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv18.setImageResource(R.drawable.watermelon);
               a = 3;
               if (z == a) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv17.startAnimation(rotate);
                   imgv18.startAnimation(rotate);
                   imgv17.setAlpha(0.5f);
                   imgv18.setAlpha(0.5f);
               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }
           }
       });
       imgv19 = (ImageView)findViewById(R.id.imageView15);
       imgv19.setVisibility(VISIBLE);
       imgv19.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv19.setImageResource(R.drawable.orange);
               b = 3;
               if (b == c) {

                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv19.startAnimation(rotate);
                   imgv20.startAnimation(rotate);
                   imgv19.setAlpha(0.5f);
                   imgv20.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });
       imgv20 = (ImageView)findViewById(R.id.imageView16);
       imgv20.setVisibility(VISIBLE);
       imgv20.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               imgv20.setImageResource(R.drawable.orange);
               c = 3;
               if (b == c) {
                   Animation rotate = AnimationUtils.loadAnimation(secondActivity.this, R.anim.rotation);
                   // shake.AnimationListener(shakeListener);
                   //imageview3 = (ImageView) findViewById(R.id.imageView3);
                   imgv19.startAnimation(rotate);
                   imgv20.startAnimation(rotate);
                   imgv19.setAlpha(0.5f);
                   imgv20.setAlpha(0.5f);

               }
               if((i+j+k+l+m+n+o+p+q+r+s+t+u+w+x+y+z+a+b+c)==60){
                   Toast.makeText(spinner.getContext(),"Game over",Toast.LENGTH_SHORT).show();
                   spinner.setVisibility(VISIBLE);
               }

           }
       });



   }

      break;
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



   }


Animation.AnimationListener shakeListener=new Animation.AnimationListener() {
    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        Toast.makeText(secondActivity.this,"shakedone",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
};


}









