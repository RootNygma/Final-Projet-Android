package com.crousresto.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //instanciation de firebaseAuth
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initialisation de firebase
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        // verifier si un utilisateur est connecté
        if (mAuth.getCurrentUser() != null) {
            //handle the already login user
        }
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
