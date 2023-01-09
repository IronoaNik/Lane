package com.example.lane;

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

    //launch to do list page
    public void toDoListPage(View v){
        Intent i = new Intent(this, ToDoList.class);
        startActivity(i);
    }


}