package com.example.yvtc.b062702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        int a = it.getIntExtra("va",0);
        int b = it.getIntExtra("vb",0);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(String.valueOf(a+b));
    }
}
