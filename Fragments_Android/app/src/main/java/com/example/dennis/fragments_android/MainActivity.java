package com.example.dennis.fragments_android;

import android.app.Dialog;


import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.moodbutton) Button moodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button
        ButterKnife.bind(this);

        //Setting an onclick listener
        moodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Fragment Manager
                FragmentManager fm = getSupportFragmentManager();
                MoodDialogFragment moodDialogFragment = new MoodDialogFragment ();
                moodDialogFragment.show(fm, "Sample Fragment");
            }
        });

    }

}
