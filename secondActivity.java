package com.example.veera.myapplication_flags;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class secondActivity extends AppCompatActivity {
      TextView textView,textView1;
      Button btn1,btn2,btn3,btn4,btn5;
    ImageView img1,img2,img3,img4,img5;
    AssetManager mgr;
    String[] flagList;
    int i,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0;
    int width, height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
        DisplayMetrics dim=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dim);
        int width=dim.widthPixels;
        int height=dim.heightPixels;

        img1 = (ImageView)findViewById(R.id.imageView);
        img2 = (ImageView)findViewById(R.id.imageView2);
        img3 = (ImageView)findViewById(R.id.imageView3);
        img4 = (ImageView)findViewById(R.id.imageView4);
        img5=(ImageView)findViewById(R.id.imageView5) ;
        textView1 = (TextView)findViewById(R.id.textView) ;
        textView = (TextView)findViewById(R.id.textView3) ;
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);


        FrameLayout.LayoutParams vf1 = new FrameLayout.LayoutParams((int)(width*.3),(int)(height*.05));
        vf1.setMargins((int)(width*.1),(int)(height*.1), 0, 0);
        textView1.setLayoutParams(vf1);
        FrameLayout.LayoutParams vf2 = new FrameLayout.LayoutParams((int)(width*.2),(int)(height*.1));
        vf2.setMargins((int)(width*.4),(int)(height*.2), 0, 0);
        textView.setLayoutParams(vf2);

        FrameLayout.LayoutParams vf3 = new FrameLayout.LayoutParams((int)(width*.3),(int)(height*.15));
        vf3.setMargins((int)(width*.1),(int)(height*.25), 0, 0);
        img1.setLayoutParams(vf3);

        FrameLayout.LayoutParams vf4 = new FrameLayout.LayoutParams((int)(width*.3),(int)(height*.15));
        vf4.setMargins((int)(width*.6),(int)(height*.25), 0, 0);
        img2.setLayoutParams(vf4);

        FrameLayout.LayoutParams vf5 = new FrameLayout.LayoutParams((int)(width*.3),(int)(height*.15));
        vf5.setMargins((int)(width*.1),(int)(height*.4), 0, 0);
        img3.setLayoutParams(vf5);

        FrameLayout.LayoutParams vf6 = new FrameLayout.LayoutParams((int)(width*.3),(int)(height*.15));
        vf6.setMargins((int)(width*.6),(int)(height*.4), 0, 0);
        img4.setLayoutParams(vf6);

        FrameLayout.LayoutParams vf7 = new FrameLayout.LayoutParams((int)(width*.5),(int)(height*.4));
        vf7.setMargins((int)(width*.25),(int)(height*.3), 0, 0);
        img5.setLayoutParams(vf7);

        FrameLayout.LayoutParams vf8 = new FrameLayout.LayoutParams((int)(width*.4),(int)(height*.1));
        vf8.setMargins(0,(int)(height*.6), 0, 0);
        btn1.setLayoutParams(vf8);
        FrameLayout.LayoutParams vf9 = new FrameLayout.LayoutParams((int)(width*.4),(int)(height*.1));
        vf9.setMargins((int)(width*.5),(int)(height*.6), 0, 0);
        btn2.setLayoutParams(vf9);
        FrameLayout.LayoutParams vf10 = new FrameLayout.LayoutParams((int)(width*.4),(int)(height*.1));
        vf10.setMargins(0,(int)(height*.7), 0, 0);
        btn3.setLayoutParams(vf10);
        FrameLayout.LayoutParams vf11 = new FrameLayout.LayoutParams((int)(width*.4),(int)(height*.1));
        vf11.setMargins((int)(width*.5),(int)(height*.7), 0, 0);
        btn4.setLayoutParams(vf11);
        FrameLayout.LayoutParams vf12 = new FrameLayout.LayoutParams((int)(width*.4),(int)(height*.1));
        vf12.setMargins((int)(width*.5),(int)(height*.7), 0, 0);
        btn5.setLayoutParams(vf12);

        question1();
        //get the info from activity 1
        Intent tent = getIntent();
        String theString = tent.getStringExtra("info");
        btn1.setText(theString);
    }
    public void dorotate(){
        //load animation xml
        Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
        //set a variable listener that will show a toast when the animation is done
        rotate.setAnimationListener(rotateListener);
        //use the animation
        btn1.startAnimation(rotate);
    }
    Animation.AnimationListener rotateListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            switch (i)
            {
                case 1:
                    question2();
                    break;
                case 2:
                    question3();
                    break;
                case 3:
                    question4();
                    break;
                case 4:
                    question5();
                    break;
                case 5:
                    question6();
                    break;
                case 6:
                    question7();
                    break;
                case 7:
                    question8();
                    break;
                case 8:
                    question9();
                    break;
                case 9:
                    question10();
                    break;
                case 10:
                        Intent intent = new Intent(secondActivity.this,thirdActivity.class);
                        //add some info to intent to be sent to activity 2
                        intent.putExtra("info1","Question1 Incorrect count:  "+j);
                        intent.putExtra("info2","Question2 Incorrect count:  "+k);
                        intent.putExtra("info3","Question3 Incorrect count:  "+l);
                        intent.putExtra("info4","Question4 Incorrect count:  "+m);
                        intent.putExtra("info5","Question5 Incorrect count:  "+n);
                        intent.putExtra("info6","Question6 Incorrect count:  "+o);
                        intent.putExtra("info7","Question7 Incorrect count:  "+p);
                        intent.putExtra("info8","Question8 Incorrect count:  "+q);
                        intent.putExtra("info9","Question9 Incorrect count:  "+r);
                        intent.putExtra("info10","Question10 Incorrect count:  "+s);


                    //2 methods
                        //startActivity(intent);
                        //if info is coming back
                        startActivityForResult(intent,100);


            }

        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };

    public void doshake(){
        //load animation xml
        Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
        //set a variable listener that will show a toast when the animation is done
        shake.setAnimationListener(shakeListener);
        //use the animation
        btn2.startAnimation(shake);

    }
    Animation.AnimationListener shakeListener = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
           // Toast.makeText(secondActivity.this,"shake done",Toast.LENGTH_LONG).show();
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };
    public void question1()
    {
        textView1.setText("Question 1 of 10");
        mgr = getAssets();
        //list of items in a particular
        flagList = new String[4];
        try {
            flagList = mgr.list("Asia");
            //get the first flag
            InputStream image = mgr.open("Asia/"+flagList[0]);
            Drawable drawable = Drawable.createFromStream(image,null);
            img1.setImageDrawable(drawable);


            InputStream image2 = mgr.open("Asia/"+flagList[1]);
            Drawable drawable2 = Drawable.createFromStream(image2,null);
            img2.setImageDrawable(drawable2);


            InputStream image3 = mgr.open("Asia/"+flagList[2]);
            Drawable drawable3 = Drawable.createFromStream(image3,null);
            img3.setImageDrawable(drawable3);


            InputStream image4 = mgr.open("Asia/"+flagList[3]);
            Drawable drawable4 = Drawable.createFromStream(image4,null);
            img4.setImageDrawable(drawable4);

            InputStream image5 = mgr.open("Asia/"+flagList[2]);
            Drawable drawable5 = Drawable.createFromStream(image5,null);
            img5.setImageDrawable(drawable5);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("list","folder not found");
        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.setText("correct");
                textView.setTextColor(Color.GREEN);
                dorotate();
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                i=1;
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                doshake();
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                j++;
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                j++;

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                j++;
            }
        });
    }

    public void question2()
    {

        textView1.setText("Question 2 of 10");
        //  Toast.makeText(secondActivity.this,"rotate done",Toast.LENGTH_LONG).show();
        img5.setVisibility(View.VISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);

        btn1.setText(flagList[1].substring(flagList[1].indexOf('-')+1).replace(".png",""));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                k++;

            }
        });


        btn2.setText(flagList[2].substring(flagList[2].indexOf('-')+1).replace(".png",""));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("AWESOME!");
                textView.setTextColor(Color.GREEN);
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
               // rotation();

                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                img5.startAnimation(rotate);
               i=2;


            }
        });

        btn3.setText(flagList[3].substring(flagList[3].indexOf('-')+1).replace(".png",""));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                k++;

            }
        });

        btn4.setText(flagList[4].substring(flagList[4].indexOf('-')+1).replace(".png",""));
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                k++;

            }
        });



    }


    public void question3()
    {
        img5.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.VISIBLE);
        img3.setVisibility(View.VISIBLE);
        img4.setVisibility(View.VISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);


        textView1.setText("Question 3 of 10");
        mgr = getAssets();
        //list of items in a particular
        flagList = new String[4];
        try {
            flagList = mgr.list("Africa");
            //get the first flag
            InputStream image = mgr.open("Africa/"+flagList[0]);
            Drawable drawable = Drawable.createFromStream(image,null);
            img1.setImageDrawable(drawable);


            InputStream image2 = mgr.open("Africa/"+flagList[1]);
            Drawable drawable2 = Drawable.createFromStream(image2,null);
            img2.setImageDrawable(drawable2);


            InputStream image3 = mgr.open("Africa/"+flagList[2]);
            Drawable drawable3 = Drawable.createFromStream(image3,null);
            img3.setImageDrawable(drawable3);


            InputStream image4 = mgr.open("Africa/"+flagList[3]);
            Drawable drawable4 = Drawable.createFromStream(image4,null);
            img4.setImageDrawable(drawable4);

            InputStream image5 = mgr.open("Africa/"+flagList[2]);
            Drawable drawable5 = Drawable.createFromStream(image5,null);
            img5.setImageDrawable(drawable5);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("list","folder not found");
        }
       btn1.setText("Asia");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);

                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                l++;
                btn4.setAlpha(0.5f);
            }
        });
        btn2.setText("Africa");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("correct");
                textView.setTextColor(Color.GREEN);
                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                btn2.startAnimation(rotate);

                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                i=3;
            }
        });
        btn3.setText("Europe");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                l++;

            }
        });
        btn4.setText("North_America");
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                l++;

            }
        });

    }
    public void question4()
    {
        textView1.setText("Question 4 of 10");
        //  Toast.makeText(secondActivity.this,"rotate done",Toast.LENGTH_LONG).show();
        img5.setVisibility(View.VISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);

        btn1.setText(flagList[1].substring(flagList[1].indexOf('-')+1).replace(".png",""));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                m++;

            }
        });


        btn2.setText(flagList[2].substring(flagList[2].indexOf('-')+1).replace(".png",""));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("AWESOME!");
                textView.setTextColor(Color.GREEN);
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                // rotation();

                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                img5.startAnimation(rotate);
                i=4;

            }
        });

        btn3.setText(flagList[3].substring(flagList[3].indexOf('-')+1).replace(".png",""));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                m++;

            }
        });

        btn4.setText(flagList[4].substring(flagList[4].indexOf('-')+1).replace(".png",""));
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                m++;
            }
        });


    }
    public void question5()
    {
        img5.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.VISIBLE);
        img3.setVisibility(View.VISIBLE);
        img4.setVisibility(View.VISIBLE);

        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);


        textView1.setText("Question 5 of 10");
        mgr = getAssets();
        //list of items in a particular
        flagList = new String[4];
        try {
            flagList = mgr.list("Europe");
            //get the first flag
            InputStream image = mgr.open("Europe/"+flagList[0]);
            Drawable drawable = Drawable.createFromStream(image,null);
            img1.setImageDrawable(drawable);


            InputStream image2 = mgr.open("Europe/"+flagList[1]);
            Drawable drawable2 = Drawable.createFromStream(image2,null);
            img2.setImageDrawable(drawable2);


            InputStream image3 = mgr.open("Europe/"+flagList[2]);
            Drawable drawable3 = Drawable.createFromStream(image3,null);
            img3.setImageDrawable(drawable3);


            InputStream image4 = mgr.open("Europe/"+flagList[3]);
            Drawable drawable4 = Drawable.createFromStream(image4,null);
            img4.setImageDrawable(drawable4);

            InputStream image5 = mgr.open("Europe/"+flagList[2]);
            Drawable drawable5 = Drawable.createFromStream(image5,null);
            img5.setImageDrawable(drawable5);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("list","folder not found");
        }
        btn1.setText("Asia");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);

                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                n++;
            }
        });
        btn2.setText("Africa");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);

                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn2.startAnimation(shake);

                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                n++;

            }
        });
        btn3.setText("Europe");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("correct");
                textView.setTextColor(Color.GREEN);

                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                btn3.startAnimation(rotate);
                i=5;

            }
        });
        btn4.setText("North_America");
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                n++;

            }
        });

    }
    public void question6()
    {
        textView1.setText("Question 6 of 10");
        //  Toast.makeText(secondActivity.this,"rotate done",Toast.LENGTH_LONG).show();
        img5.setVisibility(View.VISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);

        btn1.setText(flagList[1].substring(flagList[1].indexOf('-')+1).replace(".png",""));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                o++;

            }
        });


        btn2.setText(flagList[2].substring(flagList[2].indexOf('-')+1).replace(".png",""));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("AWESOME!");
                textView.setTextColor(Color.GREEN);
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                // rotation();

                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                img5.startAnimation(rotate);
                i=6;


            }
        });

        btn3.setText(flagList[3].substring(flagList[3].indexOf('-')+1).replace(".png",""));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                o++;

            }
        });

        btn4.setText(flagList[4].substring(flagList[4].indexOf('-')+1).replace(".png",""));
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                o++;
            }
        });


    }

    public void question7()
    {
        img5.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.VISIBLE);
        img3.setVisibility(View.VISIBLE);
        img4.setVisibility(View.VISIBLE);

        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);


        textView1.setText("Question 7 of 10");
        mgr = getAssets();
        //list of items in a particular
        flagList = new String[4];
        try {
            flagList = mgr.list("North_America");
            //get the first flag
            InputStream image = mgr.open("North_America/"+flagList[0]);
            Drawable drawable = Drawable.createFromStream(image,null);
            img1.setImageDrawable(drawable);


            InputStream image2 = mgr.open("North_America/"+flagList[1]);
            Drawable drawable2 = Drawable.createFromStream(image2,null);
            img2.setImageDrawable(drawable2);


            InputStream image3 = mgr.open("North_America/"+flagList[2]);
            Drawable drawable3 = Drawable.createFromStream(image3,null);
            img3.setImageDrawable(drawable3);


            InputStream image4 = mgr.open("North_America/"+flagList[3]);
            Drawable drawable4 = Drawable.createFromStream(image4,null);
            img4.setImageDrawable(drawable4);

            InputStream image5 = mgr.open("North_America/"+flagList[2]);
            Drawable drawable5 = Drawable.createFromStream(image5,null);
            img5.setImageDrawable(drawable5);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("list","folder not found");
        }
        btn1.setText("Asia");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);

                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                p++;
            }
        });
        btn2.setText("Africa");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);

                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn2.startAnimation(shake);

                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                p++;

            }
        });
        btn3.setText("Europe");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);


                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                p++;


            }
        });
        btn4.setText("North_America");
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("correct");
                textView.setTextColor(Color.GREEN);

                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                btn4.startAnimation(rotate);
                i=7;


            }
        });

    }
    public void question8()
    {
        textView1.setText("Question 8 of 10");
        //  Toast.makeText(secondActivity.this,"rotate done",Toast.LENGTH_LONG).show();
        img5.setVisibility(View.VISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn4.setAlpha(1.0f);

        btn1.setText(flagList[1].substring(flagList[1].indexOf('-')+1).replace(".png",""));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                q++;

            }
        });


        btn2.setText(flagList[2].substring(flagList[2].indexOf('-')+1).replace(".png",""));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("AWESOME!");
                textView.setTextColor(Color.GREEN);
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                // rotation();

                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                img5.startAnimation(rotate);
                i=8;

            }
        });

        btn3.setText(flagList[3].substring(flagList[3].indexOf('-')+1).replace(".png",""));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                btn4.setAlpha(0.5f);
                q++;

            }
        });

        btn4.setText(flagList[4].substring(flagList[4].indexOf('-')+1).replace(".png",""));
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn4.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                q++;

            }
        });


    }
    public void question9()
    {
        img5.setVisibility(View.INVISIBLE);
        img1.setVisibility(View.VISIBLE);
        img2.setVisibility(View.VISIBLE);
        img3.setVisibility(View.VISIBLE);
        img4.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);



        textView1.setText("Question 9 of 10");
        mgr = getAssets();
        //list of items in a particular
        flagList = new String[4];
        try {
            flagList = mgr.list("South_America");
            //get the first flag
            InputStream image = mgr.open("South_America/"+flagList[0]);
            Drawable drawable = Drawable.createFromStream(image,null);
            img1.setImageDrawable(drawable);


            InputStream image2 = mgr.open("South_America/"+flagList[1]);
            Drawable drawable2 = Drawable.createFromStream(image2,null);
            img2.setImageDrawable(drawable2);


            InputStream image3 = mgr.open("South_America/"+flagList[2]);
            Drawable drawable3 = Drawable.createFromStream(image3,null);
            img3.setImageDrawable(drawable3);


            InputStream image4 = mgr.open("South_America/"+flagList[3]);
            Drawable drawable4 = Drawable.createFromStream(image4,null);
            img4.setImageDrawable(drawable4);

            InputStream image5 = mgr.open("South_America/"+flagList[2]);
            Drawable drawable5 = Drawable.createFromStream(image5,null);
            img5.setImageDrawable(drawable5);

        } catch (IOException e) {
            e.printStackTrace();
            Log.e("list","folder not found");
        }
        btn1.setText("Asia");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);

                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                r++;
            }
        });
        btn2.setText("Africa");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);

                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn2.startAnimation(shake);

                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                r++;

            }
        });
        btn3.setText("Europe");
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);


                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                r++;


            }
        });
        btn5.setText("South_America");
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView.setText("correct");
                textView.setTextColor(Color.GREEN);

                btn1.setAlpha(0.5f);
                btn2.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                btn5.startAnimation(rotate);
                i=9;


            }
        });

    }
    public void question10()
    {
        textView1.setText("Question 10 of 10");
        //  Toast.makeText(secondActivity.this,"rotate done",Toast.LENGTH_LONG).show();
        img5.setVisibility(View.VISIBLE);
        img1.setVisibility(View.INVISIBLE);
        img2.setVisibility(View.INVISIBLE);
        img3.setVisibility(View.INVISIBLE);
        img4.setVisibility(View.INVISIBLE);
        btn1.setAlpha(1.0f);
        btn2.setAlpha(1.0f);
        btn3.setAlpha(1.0f);
        btn5.setAlpha(1.0f);

        btn1.setText(flagList[1].substring(flagList[1].indexOf('-')+1).replace(".png",""));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn1.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                s++;

            }
        });


        btn2.setText(flagList[2].substring(flagList[2].indexOf('-')+1).replace(".png",""));
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("AWESOME!");
                textView.setTextColor(Color.GREEN);
                btn1.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                // rotation();

                Animation rotate = AnimationUtils.loadAnimation(secondActivity.this,R.anim.rotate);
                //set a variable listener that will show a toast when the animation is done
                rotate.setAnimationListener(rotateListener);
                //use the animation
                img5.startAnimation(rotate);
                i=10;

            }
        });

        btn3.setText(flagList[3].substring(flagList[3].indexOf('-')+1).replace(".png",""));
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn3.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                btn5.setAlpha(0.5f);
                s++;

            }
        });

        btn5.setText(flagList[4].substring(flagList[4].indexOf('-')+1).replace(".png",""));
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Incorrect");
                textView.setTextColor(Color.RED);
                Animation shake = AnimationUtils.loadAnimation(secondActivity.this,R.anim.shake);
                shake.setAnimationListener(shakeListener);
                //use the animation
                btn5.startAnimation(shake);
                btn2.setAlpha(0.5f);
                btn3.setAlpha(0.5f);
                btn1.setAlpha(0.5f);
                s++;

            }
        });


    }


    @Override
    public void onActivityResult(int reqCode,int resultCode,Intent data){
        if(reqCode == 100){
            if (resultCode == 0){//0 is my ok code
                String myinfo = data.getStringExtra("info");
                textView.setText(myinfo);
            }
        }
    }
}
