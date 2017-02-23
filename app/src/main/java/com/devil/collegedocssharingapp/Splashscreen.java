package com.devil.collegedocssharingapp;

import android.app.Activity;
import android.app.Notification;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

/**
 * Created by devil on 2/21/2017.
 */

public class Splashscreen extends Activity {
    ProgressBar p1;
    Handler h;
    ProgressDialog d;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        p1=(ProgressBar)findViewById(R.id.progressBar);
       // p1.setMax(10000);
       h=new Handler()
        {
            public void handleMessage(Notification.MessagingStyle.Message m){

                Intent i=new Intent(Splashscreen.this,Firstpage.class);
                startActivity(i);
            }
        };
        final Thread v=new Thread(){
            public void run() {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(6000);


                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                h.sendEmptyMessage(0);
                d.dismiss();
            }
        };

        //d=ProgressDialog.show(MainActivity.this, "Loading", "Please Wait");
        v.start();
    }

    }
