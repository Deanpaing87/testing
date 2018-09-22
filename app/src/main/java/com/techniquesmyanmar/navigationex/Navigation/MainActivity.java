package com.techniquesmyanmar.navigationex.Navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.techniquesmyanmar.navigationex.R;

/**
 * Created by user on 9/7/2018.
 */

public class MainActivity extends AppCompatActivity{

    Toolbar tb;
    DrawerLayout dl;
    NavigationView nv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        tb=findViewById(R.id.tb_ma);
        dl=findViewById(R.id.dl_ma);
        nv=findViewById(R.id.nv_ma);

        setSupportActionBar(tb);
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(
                MainActivity.this,
                dl,
                tb,
                R.string.open_drawer,
                R.string.close_drawer
        );

        dl.setDrawerListener(toggle);
        toggle.syncState();
    }
}
