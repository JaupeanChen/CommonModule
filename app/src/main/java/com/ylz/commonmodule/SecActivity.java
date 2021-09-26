package com.ylz.commonmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.me.module_common.BaseActivity;

public class SecActivity extends BaseActivity {


    @Override
    public int getLayout() {
        return R.layout.activity_sec;
    }

    @Override
    public boolean isNeedToolBar() {
        return true;
    }

    @Override
    public void initData() {
        setToolbarTitle("购物车");

    }
}