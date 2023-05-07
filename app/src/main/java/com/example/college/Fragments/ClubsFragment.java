package com.example.college.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.college.R;

import java.util.ArrayList;

public class ClubsFragment extends Fragment {
    private ArrayList<String> clubs;

    public ClubsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        init();



        return inflater.inflate(R.layout.fragment_clubs, container, false);
    }
    private void init(){
        clubs.add("Technical Board");
        clubs.add("Cultural & Music Club");
        clubs.add("Debate, Dramatics and Quiz Club");
        clubs.add("Fine Arts Club");
        clubs.add("Magazine Board");
        clubs.add("COE for AI, Robotics");
        clubs.add("Maths Club");
        clubs.add("NSS Club");
        clubs.add("Sports Club");
        clubs.add("Spiritual Club");
        clubs.add("Open Source Software Club");
        clubs.add("SAE AIT Collegiate Club");
        clubs.add("Nature Club");
        clubs.add("Radio Club");
        clubs.add("Competitive Coding Club");
        clubs.add("Info Sec & Digi Forensic Club");
        clubs.add("Electric Vehicle cell");
        clubs.add("Cycling Club");
        clubs.add("AR/ VR Club");
        clubs.add("Quantum Club");
    }
}