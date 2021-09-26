package com.me.module_common;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {

    private TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolBar();
        setContentView(getLayout());
        initData();
    }

    public abstract int getLayout();

    public abstract boolean isNeedToolBar();

    public abstract void initData();

    private void initToolBar() {
        ActionBar supportActionBar = getSupportActionBar();
        if (isNeedToolBar() && supportActionBar == null) {
            Toolbar toolbar = findViewById(R.id.toolbar);
            if (toolbar == null) {
                return;
            }
            setSupportActionBar(toolbar);
            tvTitle = toolbar.findViewById(R.id.tv_title);
            toolbar.setNavigationOnClickListener(v ->
                    finish()
            );
        }
    }

    public void setToolbarTitle(String title) {
        if (tvTitle != null) {
            tvTitle.setText(title);
        }
    }
}