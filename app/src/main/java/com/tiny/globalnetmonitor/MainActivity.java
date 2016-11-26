package com.tiny.globalnetmonitor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tiny.connect_change.ConnectionChangeAnnotation;
import com.tiny.connect_change.ConnectionChangeUtils;
import com.tiny.connect_change.NetStatus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnectionChangeUtils.register(this);

        startActivity(new Intent(MainActivity.this, SecondActivity.class));

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConnectionChangeUtils.unregister(this);
    }

    @ConnectionChangeAnnotation(tag = NetStatus.HAVE_NET)
    public void test1() {
        Toast.makeText(getApplicationContext(), "test1", Toast.LENGTH_SHORT).show();
    }

    @ConnectionChangeAnnotation(tag = NetStatus.NET_2G)
    public void test2() {
        Toast.makeText(getApplicationContext(), "test2", Toast.LENGTH_SHORT).show();
    }
}
