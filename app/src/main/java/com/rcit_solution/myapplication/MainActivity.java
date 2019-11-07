package com.rcit_solution.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewManager;
import android.widget.Button;
import android.widget.TextView;

import java.sql.ResultSetMetaData;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int count = 0;
    private Button buttonLogin, buttonLogout;
    private TextView Test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogout = findViewById(R.id.buttonLogout);
        Test = findViewById(R.id.Test);

        buttonLogin.setOnClickListener(this
//                new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count ++;
//                Test.setText("The Button is Clicked " + count + " times");
//            }
//        }
        );
        buttonLogout.setOnClickListener(this
//                new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count--;
//                Test.setText("The Button is Clicked " + count + " times");
//            }
//        }
        );

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.buttonLogin){
            count ++;
            Test.setText("The Button is Clicked " + count + " times");
        }
        if (v.getId()==R.id.buttonLogout){
            count --;
            Test.setText("The Button is Clicked " + count + " times");
        }

    }
}
