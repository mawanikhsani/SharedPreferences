package com.example.aplikasiactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    //inisiasi button
    private Button btnFirstFragment, btnSecondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //untuk menyambungkan apa yang sudah diinisiasikan dengan id nya
        btnFirstFragment = findViewById(R.id.btnFirstFragment);
        btnSecondFragment = findViewById(R.id.btnSecondFragment);

        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new FirstFragment());//untuk memanggil firstfragment
            }
        });

        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());//untuk memanggil secondfragment
            }
        });
    }

    //fungsi untuk me load fragment
    private void loadFragment(Fragment fragment){
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}