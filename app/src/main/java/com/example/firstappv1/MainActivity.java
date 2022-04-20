package com.example.firstappv1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    //TAG那个参数只是,String类型，一般是当前页面， 是为了区分不同页面的log
    private static final String TAG = "button_log";
    private static final String TAGv2 = "get edit_view log by button";
    private static final String TAGv3 = "get toolbar log by button";
    private ProgressBar progressBar;
    private NotificationManager manager;
    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//====================通过id定位属性值，并在客户端设置新属性值=======================
//        TextView page_text = findViewById(R.id.page_text);
//        page_text.setText("this is change by mainactivity.java");
//===========================================================================

//=====================button 相关操作=======================================
//        //获取button动作
//        //点击事件
//        Button my_button = findViewById(R.id.button_id);
//        my_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.e(TAG, "onClick");
//            }
//        });
//        //长按事件
//        my_button.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Log.e(TAG, "onLongClick");
//                return false;
//            }
//        });
//        //触摸事件
//        my_button.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.e(TAG, "onTouchClick");
//                return false;
//            }
//        });
//===========================================================================

//=======================EditView 相关操作=====================================
//        Button user_login_btn = findViewById(R.id.user_login);
//        EditText user_account = findViewById(R.id.user_account);
//        EditText user_pwd = findViewById(R.id.user_password);
//        user_login_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String account_text = user_account.getText().toString();
//                String pwd_text = user_pwd.getText().toString();
//                Log.e(TAGv2, "onclick\t" + account_text + '\t' + pwd_text);
//            }
//        });
//==========================进度条======================================
//        progressBar = findViewById(R.id.progressBar_barid);

//========================通知类=======================================
        //构建notifica管理器
//        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        //VERSION是当前系统版本
//        //VERSION_CODES是现有系统版本
//        //https://blog.csdn.net/FussyCat/article/details/118094354
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            //当前安卓系统版本大于安卓6的情况
//            NotificationChannel channel = new NotificationChannel("NT_channel", "message notify",
//                    NotificationManager.IMPORTANCE_HIGH);
//            //创建channel并在管理器中注册
//            manager.createNotificationChannel(channel);
//        }
//        //构建页面跳转
//        Intent intent = new Intent(this, NotifyActivity.class);


//        PendingIntent可以看作是对Intent的一个封装，但它不是立刻执行某个行为，而是满足某些条件或触发某些事件后才执行指定的行为。
//PendingIntent获取有三种方式:通过Activity,Service,BroadcastReceiver获取.
//1. 你可以通过getActivity(Context context, int requestCode, Intent intent, int flags)系列方法从系统
// 取得一个用于启动一个Activity的PendingIntent对象.
//
//2.可以通过getService(Context context, int requestCode, Intent intent, int flags)方法从系统
// 取得一个用于启动一个Service的PendingIntent对象.
//
//3.可以通过getBroadcast(Context context, int requestCode, Intent intent, int flags)方法从系统
// 取得一个用于向BroadcastReceiver的发送广播的PendingIntent对象.
// 第一个参数是上下文.
//
//第二个参数是每次requestcode不同,就能产生多个Pendingintent.
//
//第三个参数是用来存储信息.
//
//第四个参数是对不同操作作标识.
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//        //构建notification对象
//        notification = new NotificationCompat.Builder(this, "NT_channel")
//                .setContentTitle("message_notify")
//                .setContentText("this is notify content")
//                //设置图标
//                .setSmallIcon(R.drawable.ic_baseline_person_account)
//                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.auto))
////                设置颜色，需要把rgb转为int类型
//                .setColor(Color.parseColor("#ff0000"))
////                设置页面跳转
//                .setContentIntent(pendingIntent)
////                设置通知删除
//                .setAutoCancel(true)
//                .build();

//==========================Toolbar=======================================

//===========================================================================
//===========================================================================
//===========================================================================
    }

    public void back_to_prepage(View view) {
        startActivity(new Intent(this, NotifyActivity.class));
        Log.e(TAGv2, "cilck back button");
    }

//    public void bar_display_change(View view) {
//        if (progressBar.getVisibility() == View.GONE) {
//            //显示进度条
//            progressBar.setVisibility(View.VISIBLE);
//        } else {
//            //隐藏进度条
//            progressBar.setVisibility(View.GONE);
//        }
//    }

//    public void send_notification(View view) {
//        manager.notify(1, notification);
//    }
//
//    public void clear_notification(View view) {
//        manager.cancel(1);
//    }

}