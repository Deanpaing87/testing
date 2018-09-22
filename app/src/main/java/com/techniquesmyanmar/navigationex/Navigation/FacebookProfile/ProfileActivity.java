package com.techniquesmyanmar.navigationex.Navigation.FacebookProfile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.techniquesmyanmar.navigationex.R;

/**
 * Created by user on 9/10/2018.
 */

public class ProfileActivity extends AppCompatActivity {

    Toolbar tb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tb=findViewById(R.id.tb_fb);

        setSupportActionBar(tb);
    }
}
