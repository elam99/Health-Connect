package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Model.ExerciseModel;

import java.util.ArrayList;
import java.util.List;

public class exerciseActivity extends AppCompatActivity {

    private RecyclerView mExerciseList;
    private ExerciseListRecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        mExerciseList = findViewById(R.id.listOfExer);

        mAdapter = new ExerciseListRecyclerViewAdapter();

        mExerciseList.setHasFixedSize(true);

        mExerciseList.setLayoutManager(new LinearLayoutManager(this));
        mExerciseList.setAdapter(this.mAdapter);

        List<ExerciseModel> tmpList = new ArrayList<>();

        Drawable cyclingImage = getDrawable(R.drawable.newcycling);
        Drawable runningImage = getDrawable(R.drawable.newrunning);
        Drawable rockImage = getDrawable(R.drawable.rock);
        Drawable yogaImage = getDrawable(R.drawable.yoga);
        Drawable danceImage = getDrawable(R.drawable.dance);

        tmpList.add(new ExerciseModel("Cycling", cyclingImage));
        tmpList.add(new ExerciseModel("Running", runningImage));
        tmpList.add(new ExerciseModel("Rock Climbing", rockImage));
        tmpList.add(new ExerciseModel("Yoga", yogaImage));
        tmpList.add(new ExerciseModel("Dance", danceImage));


        mAdapter.setExerciseList(tmpList);

        mAdapter.notifyDataSetChanged();
    }


}