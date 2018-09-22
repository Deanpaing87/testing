package com.techniquesmyanmar.navigationex.Navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.techniquesmyanmar.navigationex.R;

/**
 * Created by user on 9/11/2018.
 */

public class FragOne extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragone, null);
        return v;
    }
}
