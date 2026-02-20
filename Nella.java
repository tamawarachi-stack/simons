package com.nella.app;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;

public class Nella extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("เชื่อมต่อสำเร็จ! \n\n บอกแนวแอปที่คุณต้องการมาได้เลย \n เดี๋ยวผมเขียนโค้ดใหม่ให้ครับ");
        tv.setTextSize(24);
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}
