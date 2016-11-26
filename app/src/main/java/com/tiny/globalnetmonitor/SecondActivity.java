package com.tiny.globalnetmonitor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.tiny.connect_change.ConnectionChangeAnnotation;
import com.tiny.connect_change.ConnectionChangeUtils;
import com.tiny.connect_change.NetStatus;

/**
 * Created by tiny on 16/11/26.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConnectionChangeUtils.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ConnectionChangeUtils.unregister(this);
    }

    @ConnectionChangeAnnotation(tag = NetStatus.NO_NET)
    public void test3() {
        Toast.makeText(getApplicationContext(), "testtest", Toast.LENGTH_LONG).show();

    }
}
