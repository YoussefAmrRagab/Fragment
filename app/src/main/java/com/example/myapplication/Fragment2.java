package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragment2 extends Fragment implements Communcator {

    private Bundle bundle;

    @Override
    public void setArguments(@Nullable Bundle args) {
        bundle = args;
    }

    public Fragment2() {
        // Required empty public constructor
    }

    private View view;
    Button btn;
    EditText txt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_2, container, false);

        btn = view.findViewById(R.id.btn2);
        txt = view.findViewById(R.id.txt2);
     
        Toast.makeText(getActivity(), bundle.getString("txtID"), Toast.LENGTH_SHORT).show();

        btn.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("txtID2",txt.getText().toString());
            onClick(bundle);
        });


        return view;
    }

    @Override
    public void onClick(Bundle bundle) {
        Fragment3 fragment = new Fragment3();
        fragment.setArguments(bundle);
        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame,fragment);
        transaction.commit();
    }
}