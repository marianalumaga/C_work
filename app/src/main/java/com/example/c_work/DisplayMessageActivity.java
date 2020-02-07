package com.example.c_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent=getIntent();
        String message = intent.getStringExtra("Message");
        TextView messageVeiw=(TextView)findViewById(R.id.messageTextVeiw);
        messageVeiw.setText(message);

    }
    public void onClose(View view){

        super.finish();
    }
}
