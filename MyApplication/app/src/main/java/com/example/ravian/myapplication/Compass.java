package com.example.ravian.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class Compass extends AppCompatActivity {

    ImageView compass,tasbeeh,findP,prayerT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compass);
        compass=(ImageView) findViewById(R.id.imageView);
        tasbeeh=(ImageView) findViewById(R.id.imageView2);
        findP=(ImageView) findViewById(R.id.imageView3);
        prayerT=(ImageView) findViewById(R.id.imageView4);

        compass.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
                startActivity(new Intent(Compass.this,Compas.class));
            }
        });

        tasbeeh.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
                startActivity(new Intent(Compass.this,MainActivity.class));
            }
        });

        findP.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String uri = "http://maps.google.com/maps?f=d&hl=en";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        prayerT.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(new Intent(Compass.this,AndroidTimeActivity.class));
            }
        });

    }


}
