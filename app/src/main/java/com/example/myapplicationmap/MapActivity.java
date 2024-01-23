package com.example.myapplicationmap;


import androidx.annotation.NonNull;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import com.google.android.gms.maps.model.LatLng;

import com.google.android.gms.maps.model.MarkerOptions;


public class MapActivity extends FragmentActivity implements OnMapReadyCallback{

    FrameLayout map;
    GoogleMap gMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map = findViewById(R.id.map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
    @Override
    public  void onMapReady(@NonNull GoogleMap googleMap){
        this.gMap=googleMap;
        LatLng Nahriamap =  new LatLng( 33.0085 , 35.0981);

        this.gMap.addMarker(new MarkerOptions().position(Nahriamap).title("Putskerte"));
        this.gMap.moveCamera(CameraUpdateFactory.newLatLng(Nahriamap));

    }
}

