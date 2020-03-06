package com.example.experiment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c_arm,c_ears,c_eyebrows,c_eyes,c_glasses,c_hat,c_mouth,c_mustache,c_nose,c_shoes;
        final ImageView p_arm,p_ears,p_eyebrows,p_eyes,p_glasses,p_hat,p_mouth,p_mustache,p_nose,p_shoes;
        c_arm = findViewById(R.id.c_arms);
        c_ears = findViewById(R.id.c_ears);
        c_eyebrows = findViewById(R.id.c_eyebrows);
        c_eyes = findViewById(R.id.c_eyes);
        c_glasses = findViewById(R.id.c_glasses);
        c_hat = findViewById(R.id.c_hat);
        c_mouth = findViewById(R.id.c_mouth);
        c_mustache = findViewById(R.id.c_mustache);
        c_nose = findViewById(R.id.c_nose);
        c_shoes = findViewById(R.id.c_shoes);

        p_arm = findViewById(R.id.p_arms);
        p_ears = findViewById(R.id.p_ears);
        p_eyebrows = findViewById(R.id.p_eyebrows);
        p_eyes = findViewById(R.id.p_eyes);
        p_glasses = findViewById(R.id.p_glasses);
        p_hat = findViewById(R.id.p_hat);
        p_mouth = findViewById(R.id.p_mouth);
        p_mustache = findViewById(R.id.p_mustache);
        p_nose = findViewById(R.id.p_nose);
        p_shoes = findViewById(R.id.p_shoes);

        c_arm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_arm.setVisibility(View.VISIBLE);
                }else{
                    p_arm.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_ears.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_ears.setVisibility(View.VISIBLE);
                }else{
                    p_ears.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_eyebrows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_eyebrows.setVisibility(View.VISIBLE);
                }else{
                    p_eyebrows.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_eyes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_eyes.setVisibility(View.VISIBLE);
                }else{
                    p_eyes.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_glasses.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_glasses.setVisibility(View.VISIBLE);
                }else{
                    p_glasses.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_hat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_hat.setVisibility(View.VISIBLE);
                }else{
                    p_hat.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_mouth.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_mouth.setVisibility(View.VISIBLE);
                }else{
                    p_mouth.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_mustache.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_mustache.setVisibility(View.VISIBLE);
                }else{
                    p_mustache.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_nose.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_nose.setVisibility(View.VISIBLE);
                }else{
                    p_nose.setVisibility(View.INVISIBLE);
                }
            }
        });

        c_shoes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                // TODO Auto-generated method stub
                if(isChecked){
                    p_shoes.setVisibility(View.VISIBLE);
                }else{
                    p_shoes.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
