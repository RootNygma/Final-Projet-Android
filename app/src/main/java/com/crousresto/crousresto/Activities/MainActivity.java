package com.crousresto.crousresto.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.crousresto.crousresto.R;

public class MainActivity extends AppCompatActivity {
    EditText registrationEmail;
    EditText registrationPassword;
    Button signInButton;
    TextView loginMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
