package com.example.androidmanager.ui.alarmM;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlarmManagerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlarmManagerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}