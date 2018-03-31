package com.example.sankalpdayal.app_a_thonhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    String[] yoj={"2014","2015","2016","2017"};
    String[] course={"B. Tech","M. Tech","PhD"};
    String[] school={"SCOPE","SITE","SENSE","SELECT","SMEC"};
    String[] homes={"Bihar","Assam","Andhra Pradesh","Tamil Nadu","Kerela","West Bengal","Uttar Pradesh","Telangana","Delhi"};

    RadioButton rbf;
    RadioButton rbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        RadioButton rbf = (RadioButton)findViewById(R.id.female);
        RadioButton rbm = (RadioButton)findViewById(R.id.male);

        EditText text = (EditText)findViewById(R.id.editText);
        EditText text2 = (EditText)findViewById(R.id.editText2);
        EditText text3 = (EditText)findViewById(R.id.editText3);
        EditText text4 = (EditText)findViewById(R.id.editText4);

        final String n=text.getText().toString();
        final String n2=text2.getText().toString();
        final String n3=text3.getText().toString();
        final String n4=text4.getText().toString();


        Button form_sub = (Button)findViewById(R.id.form_submit);

        form_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n.isEmpty()){
                    Toast.makeText(Form.this, "Fill the required fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Form.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });


        Spinner spin1=(Spinner)findViewById(R.id.spinner3);
        //spin1.setOnItemSelectedListener(this);
        ArrayAdapter a1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,course);
        a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(a1);

        Spinner spin = (Spinner) findViewById(R.id.spinner1);
        //spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,yoj);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        Spinner spin2=(Spinner)findViewById(R.id.spinner5);
        //spin2.setOnItemSelectedListener(this);
        ArrayAdapter a2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,school);
        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(a2);

        Spinner spin3=(Spinner)findViewById(R.id.spinner4);
        //spin3.setOnItemSelectedListener(this);
        ArrayAdapter a3 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,homes);
        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(a3);

    }


}
