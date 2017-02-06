package com.test.example.nextpagefragment;

import android.content.Context;
import android.content.Intent;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //This is Main Activity

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton()
    {
        firstPage a = new firstPage();
        FragmentManager fm1 = getFragmentManager();
        FragmentTransaction ft = fm1.beginTransaction();
        ft.add(R.id.main_lin,a);
        ft.commit();
    }
}
