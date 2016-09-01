package com.colors.android.androidlogs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.colors.android.mylibrary.QLog;
import com.colors.android.mylibrary.ToastUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QLog.d("Qlog.d");
        QLog.e("Qlog.e");
        ToastUtil.showShort(this,"Toast");
        ToastUtil.showLong(this,"Long");
    }
}
