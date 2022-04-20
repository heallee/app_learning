package com.example.firstappv1;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class NotifyActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        需要在layout下构建activity_notify.xml文件，并在此处引用。且在AndroidManife.xml中注册组件
        setContentView(R.layout.activity_notify);
    }
}
