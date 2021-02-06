package com.example.ravian.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.telecom.StatusHints;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends Activity implements OnClickListener {

    TextView et1;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    int counter=0;
    int position=0;
    int Sc=0;

    protected void onStart(){

        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int Hints = sp.getInt("position", position);
            super.onStart();
        if(Hints==0) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("zero", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;}
        if(Hints==1){
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("fst", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==2) {

            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("sec", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==3) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("third", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==4) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("four", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==5) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("five", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==6) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("six", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==7) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("seven", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==8) {
            spinner.setSelection(Hints);
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("eight", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
}

    protected void onRestart(){
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int Hints = sp.getInt("position", position);
        super.onRestart();

        if(Hints==0){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("zero", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
                    }
        if(Hints==1){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("fst", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==2){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("sec", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==3){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("third", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==4){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("four", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==5){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("five", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==6){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("six", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==7){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("seven", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==8){
            spinner.setSelection(Hints);
            SharedPreferences s= getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("eight", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }

    }

    protected void onStop() {
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int Hints = sp.getInt("position", position);
        super.onStop();

        if(Hints==0){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
                SharedPreferences s = getPreferences(MODE_PRIVATE);
                int mHints = s.getInt("zero", counter);
                et1.setText(Integer.toString(mHints));
                counter = counter + mHints;
                    }
        if(Hints==1){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("fst", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==2){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("sec", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==3){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("third", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==4){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("four", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==5){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("five", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==6){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("six", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==7){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("seven", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }
        if(Hints==8){
            spinner.setSelection(Hints);
            et1.setText(Integer.toString(counter));
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int mHints = s.getInt("eight", counter);
            et1.setText(Integer.toString(mHints));
            counter = counter + mHints;
        }


    }
    Button b1;
    Button b2;
    Button b3;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        et1 = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b3.setOnClickListener(this);

        List<String> categories = new ArrayList<String>();
       // String mystring = getResources().getString(R.string.select);

        categories.add("Subhan Allah");
        categories.add("Allah Hu Akbar");
        categories.add(" Alhamdulillah");
        categories.add("Bismillah-ir-Rahman-ir-Rahim");
        categories.add("Rabbana wa taqabbal Du’a");
        categories.add("Rabbana la Ghafurun shaku");
        categories.add("Ghuf-raa naka");
        categories.add("Bismillahi wa 'ala baraka-tillah");
        categories.add("Other");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parrent, View view, int position, long id) {
                String item = parrent.getItemAtPosition(position).toString();
                Toast toast=Toast.makeText(parrent.getContext(),item +" Selected " , Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.CENTER, 0, 0);
                toast.show();
                counter=0;
                if (position == 0) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("zero", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;

                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("a", counter);
                    spe.commit();

                }
                if (position == 1) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("fst", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("b", counter);
                    spe.commit();


                }
                if (position == 2) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("sec", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("c", counter);
                    spe.commit();

                }
                if (position == 3) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("third", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("d", counter);
                    spe.commit();


                }
                if (position == 4) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("four", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("e", counter);
                    spe.commit();

                }
                if (position == 5) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("five", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("f", counter);
                    spe.commit();
                }
                if (position == 6) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("six", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("g", counter);
                    spe.commit();

                }
                if (position == 7) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("seven", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("h", counter);
                    spe.commit();

                }
                if (position == 8) {
                    SharedPreferences s = getPreferences(MODE_PRIVATE);
                    int Sc = s.getInt("eight", counter);
                    et1.setText(Integer.toString(Sc));
                    counter = Sc;
                    SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
                    spe.putInt("i", counter);
                    spe.commit();

                }

                SharedPreferences.Editor sp = getPreferences(MODE_PRIVATE).edit();
                sp.putInt("position", position);
                sp.commit();


            }


            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });


    }

    public void onClick(View v) {

        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        int Hints = sp.getInt("position", position);

        if (Hints == 0) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int a = s.getInt("a",counter);
            et1.setText(Integer.toString(a));

            if (v == b1 && Hints == 0) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 0) {

                if (counter > 0 && Hints==0) {

                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==0){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==0) {

                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 0) {
                counter = 0;

                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("zero", counter);
            spe.commit();


        }


       if (Hints == 1) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int b = s.getInt("b",counter);
            et1.setText(Integer.toString(b));

            if (v == b1 && Hints == 1) {

                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 1) {

                if (counter > 0 && Hints==1) {

                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==1){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==1) {

                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 1) {
                counter = 0;

                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("fst", counter);
            spe.commit();


        }
        if (Hints == 2) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int c = s.getInt("c",counter);
            et1.setText(Integer.toString(c));


            if (v == b1 && Hints == 2) {

                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 2) {

                if (counter > 0 && Hints==2) {

                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==2){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==2) {

                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 2) {
                counter = 0;

                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("sec", counter);
            spe.commit();


        }
        if (Hints == 3) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int d = s.getInt("d",counter);
            et1.setText(Integer.toString(d));


            if (v == b1 && Hints == 3) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 3) {

                if (counter > 0 && Hints==3) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==3){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==3) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 3) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("third", counter);
            spe.commit();


        }
        if (Hints == 4) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int e = s.getInt("e",counter);
            et1.setText(Integer.toString(e));


            if (v == b1 && Hints == 4) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 4) {

                if (counter > 0 && Hints==4) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==4){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==4) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 4) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("four", counter);
            spe.commit();


        }
        if (Hints == 5) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int f= s.getInt("f",counter);
            et1.setText(Integer.toString(f));


            if (v == b1 && Hints == 5) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 5) {

                if (counter > 0 && Hints==5) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==5){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==5) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 5) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("five", counter);
            spe.commit();


        }
        if (Hints == 6) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int g = s.getInt("g",counter);
            et1.setText(Integer.toString(g));


            if (v == b1 && Hints == 6) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 6) {

                if (counter > 0 && Hints==6) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==6){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==6) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 6) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("six", counter);
            spe.commit();


        }
        if (Hints == 7) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int h = s.getInt("h",counter);
            et1.setText(Integer.toString(h));


            if (v == b1 && Hints == 7) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 7) {

                if (counter > 0 && Hints==7) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==7){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==7) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 7) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("seven", counter);
            spe.commit();


        }
        if (Hints == 8) {
            SharedPreferences s = getPreferences(MODE_PRIVATE);
            int i = s.getInt("i",counter);
            et1.setText(Integer.toString(i));


            if (v == b1 && Hints == 8) {
                counter++;
                et1.setText(Integer.toString(counter));
            }

            if (v == b2 && Hints == 8) {

                if (counter > 0 && Hints==8) {
                    counter--;
                    et1.setText(Integer.toString(counter));
                }
                if(counter==0&& Hints==8){
                    counter=0;
                    et1.setText(Integer.toString(counter));
                }
                if (counter < 0 && Hints==8) {
                    counter = 0;
                    et1.setText(Integer.toString(counter));
                }
            }
            if (v == b3 && Hints == 8) {
                counter = 0;
                et1.setText(Integer.toString(counter));
            }

            SharedPreferences.Editor spe = getPreferences(MODE_PRIVATE).edit();
            spe.putInt("eight", counter);
            spe.commit();


        }



    }
    }












