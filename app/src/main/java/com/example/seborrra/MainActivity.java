package com.example.seborrra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_opt1).setOnClickListener(this::changeFragment);
        findViewById(R.id.btn_opt2).setOnClickListener(this::changeFragment);
        findViewById(R.id.btn_opt3).setOnClickListener(this::changeFragment);

    }

    private void changeFragment(View view) {

        switch (view.getId()){
            case R.id.btn_opt1:

                BlankFragment fragment = BlankFragment.newInstance("FRAGMENT1",1);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                return;
            case R.id.btn_opt2:
                Fragment2 fragment2 = Fragment2.newInstance("FRAGMENT2",2);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
                return;

            case R.id.btn_opt3:
                ItemFragment fragment3 = ItemFragment.newInstance(1);
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
                return;
            default:
                Log.d("TAG", "changeFragment: option defoult");
        }
    }
}