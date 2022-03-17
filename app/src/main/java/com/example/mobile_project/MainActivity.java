package com.example.mobile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.subTopic1:
                intent = new Intent(this, TopicActivity.class);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
        startActivity(intent);
    }
}