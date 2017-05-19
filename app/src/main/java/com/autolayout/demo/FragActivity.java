package com.autolayout.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.zjl.autolayout.AutoUtils;

public class FragActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
        AutoUtils.auto(this);
        getSupportFragmentManager().beginTransaction().add(R.id.fl_context,new MianFragment()).commit();
    }
}
