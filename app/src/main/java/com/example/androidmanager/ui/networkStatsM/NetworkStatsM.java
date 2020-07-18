package com.example.androidmanager.ui.networkStatsM;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androidmanager.R;

public class NetworkStatsM extends Fragment {

    private NetworkStatsMViewModel mViewModel;

    public static NetworkStatsM newInstance() {
        return new NetworkStatsM();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.network_stats_m_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(NetworkStatsMViewModel.class);
        // TODO: Use the ViewModel
    }

}