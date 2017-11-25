package com.example.ran.singletonexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ran.singletoneexercise.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);
        TextView salaryTextView = (TextView) findViewById(R.id.salary_text_view);

        //TODO: make the manager object with some name and salary

        //TODO: Get the name and salary of the manager and display them in the TextViews

        //TODO: Try to make another manager object then display the name and salary in the TextViews, run the code and observe the result

        //Finally what if we need to change the info in the singleton object (eg., the manger is changed)?
        // TODO: Use the setters you already implemented in the manager class to change the name and salary, display the new info in the TextViews, then run the code and observe the result

    }
}
