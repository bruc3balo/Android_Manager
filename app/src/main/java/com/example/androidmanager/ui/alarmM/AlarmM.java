package com.example.androidmanager.ui.alarmM;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.androidmanager.R;

public class AlarmM extends Fragment {

    private AlarmManagerViewModel alarmManagerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        alarmManagerViewModel =
                ViewModelProviders.of(this).get(AlarmManagerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_alarm_m, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        alarmManagerViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}