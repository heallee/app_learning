package com.example.firstappv1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ToolbarActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "R.id.progressbar_id button_log";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        需要在layout下构建activity_notify.xml文件，并在此处引用。且在AndroidManife.xml中注册组件
        setContentView(R.layout.activity_toobar);
        
//        
        View toolbar = findViewById(R.id.Toolbar_back_id);
        toolbar.setOnClickListener(this);

        Button button =findViewById(R.id.go_to_notify_btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Toolbar_back_id:
                back_to_prepage(view);
                break;
            case R.id.go_to_notify_btn:
                go_to_notify(view);
                break;
            default:
                break;
        }
    }

    private void go_to_notify(View view) {
        startActivity(new Intent(this, NotifyActivity.class));
        Log.e(TAG, "cilck go_to_notify button");
    }

    public void back_to_prepage(View view) {
        startActivity(new Intent(this, MainActivity.class));
        Log.e(TAG, "cilck back button");
    }


}
