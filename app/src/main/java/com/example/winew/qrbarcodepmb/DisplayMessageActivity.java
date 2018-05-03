package com.example.winew.qrbarcodepmb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

       textView = (TextView) findViewById(R.id.textView);
        Intent i=getIntent();

        String Data=i.getStringExtra("data");
        textView.setText(Data);
    }

    @Override
    public void onBackPressed(){
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
}
