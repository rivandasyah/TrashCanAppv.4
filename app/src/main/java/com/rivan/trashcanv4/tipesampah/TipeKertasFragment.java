package com.rivan.trashcanv4.tipesampah;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rivan.trashcanv4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TipeKertasFragment extends Fragment {


    public TipeKertasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tipe_kertas, container, false);
    }

}
