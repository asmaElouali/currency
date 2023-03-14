package com.example.currency_convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 =findViewById(R.id.spfrom);
        sp2 =findViewById(R.id.spto);
        b1 = findViewById(R.id.btn);

        String[] from ={"DOLLARS","MAD","EURO"};
        ArrayAdapter ad = new ArrayAdapter<String>( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[]  to={"DOLLARS","MAD","EURO"};
        ArrayAdapter ad1 = new ArrayAdapter<String>( this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;

                Double amount=Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString() == "DOLLARS" && sp2.getSelectedItem().toString() == "MAD" ){
                    tot = amount*10.42;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" MAD"),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "DOLLARS" && sp2.getSelectedItem().toString() == "EURO" ){
                    tot = amount*0.94;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" EURO"),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "DOLLARS" ){
                    tot = amount*0.096;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" DOLLARS"),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "MAD" && sp2.getSelectedItem().toString() == "EURO" ){
                    tot = amount*0.090;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" EURO"),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "DOLLARS" ){
                    tot = amount*1.06;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" DOLLARS"),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "EURO" && sp2.getSelectedItem().toString() == "MAD" ){
                    tot = amount*11.09;
                    Toast.makeText(getApplicationContext(),tot.toString().concat(" MAD"),Toast.LENGTH_LONG).show();
                }

            }

        });
    }
}