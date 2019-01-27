package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Nutrition extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        button1 = (Button) findViewById(R.id.breakfast);
        button2 = (Button) findViewById(R.id.lunch);
        button3 = (Button) findViewById(R.id.dinner);
        button4 = (Button) findViewById(R.id.snacks);
    }

    public void breakfastClick(View v){
        //Toast.makeText(Nutrition.this, "button clicked", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(getApplicationContext(), Breakfast.class);
        startActivity(intent1);
        finish();
    }


}
