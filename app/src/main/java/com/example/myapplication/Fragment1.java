package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {

    private Communcator communcator;

    public Fragment1() {
        // Required empty public constructor
    }
    private View view;
    Button btn;
    EditText txt;
    DataViewModel model;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);
        model = new ViewModelProvider(requireActivity()).get(DataViewModel.class);
        btn = view.findViewById(R.id.btn);
//        communcator = (MainActivity) getActivity();
        txt = view.findViewById(R.id.txt);
        btn.setOnClickListener(v -> {
//        Bundle bundle = new Bundle();
//        bundle.putString("txtID",txt.getText().toString());
//        getParentFragmentManager().setFragmentResult("id",bundle);
//        communcator.onClick(bundle);
        model.setData(txt.getText().toString());

        });

        return view;
    }

}