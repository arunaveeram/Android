package com.example.veera.myapplication_game;

import android.widget.Button;

/**
 * Created by veera on 2/25/2017.
 */

public class Cards
{
    public int x;
    public int y;
    public Button button;

    public Cards(Button button, int x,int y) {
        this.x = x;
        this.y=y;
        this.button=button;
    }
}
