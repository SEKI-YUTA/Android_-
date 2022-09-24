package com.example.japanesestylecounter.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.japanesestylecounter.R;

public class MainFragment extends Fragment {
    private ImageView img_count;
    private Button btn_up;
    private int count = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        img_count = view.findViewById(R.id.img_count);
        btn_up = view.findViewById(R.id.btn_up);

        btn_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++count;
                int state = count % 5;
                if(state == 0) {
                    state = 5;
                }
                String imgName = String.format("count_%d", state);
                Log.d("MyLog", imgName);
                int imgRes = getResources().getIdentifier
                        (imgName, "drawable", getContext().getPackageName());
                img_count.setImageResource(imgRes);
            }
        });
        return view;
    }
}