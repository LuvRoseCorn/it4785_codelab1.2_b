package com.chuyennt.codelab1_2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btToast;
    private TextView tvNumber;
    private Button btCount;
    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Capture views from layout
        btToast = (Button) findViewById(R.id.btToast);
        tvNumber = (TextView) findViewById(R.id.tvNumber);
        btCount = (Button) findViewById(R.id.btCount);
        //Handle event when click button Toast to show Toast "Hello Toast!"
        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.helloToast, Toast.LENGTH_SHORT).show();
            }
        });
        //Handle event when click button Count to increase the number in the textView
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                tvNumber.setText(Integer.toString(num));
            }
        });
    }
}