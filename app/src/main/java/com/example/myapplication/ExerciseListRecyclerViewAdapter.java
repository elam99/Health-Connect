package com.example.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Model.ExerciseModel;

import java.util.List;

public class ExerciseListRecyclerViewAdapter extends RecyclerView.Adapter<ExerciseItemViewHolder> {

    private List<ExerciseModel> exerciseList;

    @NonNull
    @Override
    public ExerciseItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.exercise_item, viewGroup, false);
        ExerciseItemViewHolder viewHolder = new ExerciseItemViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseItemViewHolder exerciseItemViewHolder, int i) {
        ExerciseModel model = this.exerciseList.get(i);
        exerciseItemViewHolder.setup(model);
    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    public void setExerciseList(List<ExerciseModel> exerciseList) {
        this.exerciseList = exerciseList;
    }
}

class ExerciseItemViewHolder extends RecyclerView.ViewHolder{

    private ImageView mImageView;
    private TextView mNameTextView;

    public ExerciseItemViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.exercise_image);
        this.mNameTextView = itemView.findViewById(R.id.exercise_name);
    }

    public void setup(ExerciseModel model) {
        this.mImageView.setImageDrawable(model.getImage());
        this.mNameTextView.setText(model.getName());
    }
}

