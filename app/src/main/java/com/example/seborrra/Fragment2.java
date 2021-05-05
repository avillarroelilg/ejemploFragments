package com.example.seborrra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    private static final String ARG_TEXT = "argText";
    private static final String ARG_NUMBER = "argNumber";
    private String text;
    private int number;

    public static Fragment2 newInstance(String text,int number){
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT,text);
        args.putInt(ARG_NUMBER,number);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        TextView textView = view.findViewById(R.id.textfragment2);
        if(getArguments() != null ){
            text = getArguments().getString("argText");
            number = getArguments().getInt("argNumber");
        }

        textView.setText(text+number);

        return view;
    }
}