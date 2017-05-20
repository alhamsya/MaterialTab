package com.example.alhamsya.materialtab.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.alhamsya.materialtab.R;

public class Tab2Fragment extends Fragment {

    private Button btnClick;

    public Tab2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tab2, container, false);
        btnClick = (Button) view.findViewById(R.id.btn_click);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        btnClick.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(getActivity(), "Kamu Sedang Berada di Tab 2", Toast.LENGTH_LONG).show();
            }
        });
    }
}
