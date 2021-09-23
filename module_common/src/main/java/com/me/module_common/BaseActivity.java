package com.me.module_common;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

abstract class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar supportActionBar = getSupportActionBar();
        if (isNeedToolBar() && supportActionBar != null) {
            toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }
        setContentView(getLayout());
        initData();
    }

    abstract int getLayout();

    abstract boolean isNeedToolBar();

    abstract void initData();

    public void setToolbarTitle(String title) {
        TextView textView = findViewById(R.id.tv_title);
        textView.setText(title);
        toolbar.setNavigationOnClickListener(v ->
                finish()
        );
    }
}