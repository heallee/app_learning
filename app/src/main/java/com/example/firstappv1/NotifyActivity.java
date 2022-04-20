package com.example.firstappv1;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;


public class NotifyActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
    }

    @Override
    public void onClick(View view) {
    }
}


