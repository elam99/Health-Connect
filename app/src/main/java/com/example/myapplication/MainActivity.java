/*package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

    }

    public void nutritionClick(View v){
        //Toast.makeText(MainActivity.this, "button clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), Nutrition.class);
        startActivity(intent);
        finish();
    }

    public void eventClick(View v){
        Intent intent2 = new Intent(getApplicationContext(), Events.class);
        startActivity(intent2);
        finish();
    }

    public void exerciseClick(View v){
        Intent intent3 = new Intent(getApplicationContext(), Exercise.class);
        startActivity(intent3);
        finish();
    }

} */

package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.myapplication.Events;
import com.example.myapplication.exerciseActivity;
import com.example.myapplication.Nutrition;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(mainGrid);

    }
    private void setSingleEvent(GridLayout mainGrid) {

        CardView exercise = (CardView) mainGrid.findViewById(R.id.exercise);
        CardView food = (CardView) mainGrid.findViewById(R.id.food);
        CardView event = (CardView) mainGrid.findViewById(R.id.events);
        CardView calendar = (CardView) mainGrid.findViewById(R.id.calendar);

        exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent exercisePage = new Intent(getApplicationContext(), exerciseActivity.class);
                startActivity(exercisePage);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodPage = new Intent(getApplicationContext(), Nutrition.class);
                startActivity(foodPage);
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eventPage = new Intent(getApplicationContext(), contact.class);
                startActivity(eventPage);
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calendarPage = new Intent(getApplicationContext(),Events.class);
                startActivity(calendarPage);
            }
        });

    }
}
