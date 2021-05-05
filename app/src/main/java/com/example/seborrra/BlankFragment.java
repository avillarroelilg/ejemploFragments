package com.example.seborrra;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    private static final String ARG_TEXT = "argText";
    private static final String ARG_NUMBER = "argNumber";
    private String text;
    private int number;

    public static BlankFragment newInstance(String text,int number){
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT,text);
        args.putInt(ARG_NUMBER,number);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_blank,container,false);
        TextView textView = v.findViewById(R.id.textfragment1);
        //return super.onCreateView(inflater, container, savedInstanceState);
        if(getArguments() != null ){
            text = getArguments().getString("argText");
            number = getArguments().getInt("argNumber");
        }

        textView.setText(text+number);
        return v;
    }
}