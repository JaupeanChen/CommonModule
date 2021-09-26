package com.ylz.commonmodule;

import android.content.Intent;
import android.widget.Button;

import com.me.module_common.BaseActivity;

public class MainActivity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public boolean isNeedToolBar() {
        return false;
    }

    @Override
    public void initData() {
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(v ->
                startActivity(new Intent(this, SecActivity.class))
        );
    }
}