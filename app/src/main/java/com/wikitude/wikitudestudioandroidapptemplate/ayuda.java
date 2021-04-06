package com.wikitude.wikitudestudioandroidapptemplate;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ayuda extends AppCompatActivity implements View.OnClickListener {

    private Button atrasmenu ;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infocarrera);
        setTheme(R.style.Theme_AppCompat);
        atrasmenu=(Button) findViewById(R.id.atras_principal);
        atrasmenu.setOnClickListener(this);
    }


    public void onClick(View view) {

        if (view == atrasmenu){
            Intent b2 = new Intent(this, actprincipal.class);
            startActivity(b2);
        }

    }



}
