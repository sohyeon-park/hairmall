package com.example.hairmall2;

import android.view.View;

public abstract class KnowIndexOnClickListener implements View.OnClickListener{

    protected  int index;

    public KnowIndexOnClickListener(int index){
        this.index = index;
    }
}
