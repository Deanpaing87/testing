package com.techniquesmyanmar.navigationex.Navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.techniquesmyanmar.navigationex.R;

/**
 * Created by user on 9/11/2018.
 */

public class BNV_Activity extends AppCompatActivity{

    BottomNavigationView bnv;
    Toolbar tb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bnv_activity);
        bnv=findViewById(R.id.bnv);
        tb=findViewById(R.id.tb_bnv);
        setSupportActionBar(tb);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.bnv_home:
                        showFragment(new FragOne());
                        break;

                    case R.id.bnv_settings:
                        showFragment(new FragTwo());
                        break;

                    case R.id.bnv_category:
                        showFragment(new FragThree());
                        break;
                }

                Toast.makeText(BNV_Activity.this, item.getTitle(), Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    public void showFragment(Fragment frag){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frag_holder_bnv,frag).commit();
    }
}
