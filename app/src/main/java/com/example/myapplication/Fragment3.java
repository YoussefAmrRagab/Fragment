package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }

    private View view;
    private Bundle bundle;
    @Override
    public void setArguments(@Nullable Bundle args) {
        bundle = args;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_3, container, false);

                Toast.makeText(getActivity(), bundle.getString("txtID2"), Toast.LENGTH_SHORT).show();

        return view;
    }
}