package com.example.genuvaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConcertPlace extends AppCompatActivity {
CardView SakiaConcret , OperaConcret ;
ImageView Sakia, Opera;
TextView Sakianame , Operaname;
Button myticket , logout , controlpanel ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concert_place);
        SakiaConcret =findViewById(R.id.Sakia_place);
        OperaConcret=findViewById(R.id.Opera_cardview);
        Sakia=findViewById(R.id.Skia_image);
        Opera=findViewById(R.id.opera_image);
        myticket=findViewById(R.id.myticket_btn);
        logout=findViewById(R.id.logout_btn);
        controlpanel=findViewById(R.id.control_panel_btn);

        Sakia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConcertPlace.this ,SakiaConcert.class);
                startActivity(intent);
            }
        });
        

    }
}
