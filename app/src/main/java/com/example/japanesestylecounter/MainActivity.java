package com.example.japanesestylecounter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;

import com.example.japanesestylecounter.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentContainerView fragmentContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentContainer = findViewById(R.id.fragmentContainer);
        getSupportFragmentManager().beginTransaction().add(fragmentContainer.getId(), new MainFragment())
                .commit();

    }
}