package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataViewModel extends ViewModel {

    public final MutableLiveData<String> Data = new MutableLiveData<String>();

    public void setData(String data){
        Data.setValue(data);
    }

    public LiveData<String> getData() {
        return Data;
    }
}
