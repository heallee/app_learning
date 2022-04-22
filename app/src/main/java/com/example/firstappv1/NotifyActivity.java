package com.example.firstappv1;

import static com.example.firstappv1.R.*;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;


public class NotifyActivity extends Activity {
    private NotificationManager manager;
    private Notification notification;
    private static final String TAG = "notify log";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_notify);
//        获取通知管理器
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        构建channel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("NT_channel", "message notify",
                    NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }
//        声明对象跳转
        Intent intent = new Intent(this, NotifyActivity.class);
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
//第二个参数是每次requestcode不同,就能产生多个Pendingintent.
//第三个参数是用来存储信息.
//        使用PendingIntent封装
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        notification = new NotificationCompat.Builder(this, "NT_channel")
                .setContentTitle("Hello Word!")
                .setContentText("How are you")
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), drawable.auto))
                .setSmallIcon(drawable.ic_baseline_person_account)
//                设置颜色，需要把rgb转为int类型
                .setColor(Color.parseColor("#ff0000"))
//                设置页面跳转
                .setContentIntent(pendingIntent)
//                设置通知删除
                .setAutoCancel(true)
                .build();
    }


    public void send_notify(View view) {
        manager.notify(1, notification);
    }

    public void clear_notify(View view) {
        manager.cancel(1);
    }
}


