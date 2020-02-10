package com.crousresto.crousresto.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.crousresto.crousresto.R;

public class HomeDashboard extends AppCompatActivity implements View.OnClickListener{

    private CardView refresh;
    private CardView pay;
    private CardView services;
    private Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

        refresh=findViewById(R.id.refresh);
        pay=findViewById(R.id.pay);
        services=findViewById(R.id.services);
        spin=findViewById(R.id.spin);

        refresh.setOnClickListener(this);
        pay.setOnClickListener(this);
        services.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.refresh:
                i = new Intent(this, RechargerCompte.class); startActivity(i); break;
            case R.id.pay:
                i =new Intent(this, History.class); startActivity(i); break;
            case R.id.services:
                i = new Intent(this, MenuResto.class); startActivity(i); break;
            default:break;
        }
    }
}
