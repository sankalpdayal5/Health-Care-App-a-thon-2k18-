package com.example.sankalpdayal.app_a_thonhack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Form extends AppCompatActivity {
    RadioButton rbf;
    RadioButton rbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        RadioButton rbf = (RadioButton)findViewById(R.id.female);
        RadioButton rbm = (RadioButton)findViewById(R.id.male);
    }

    public void radio(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.male:
                rbf.setSelected(false);
                break;
            case R.id.female:
                rbm.setSelected(false);
        }
    }

}
