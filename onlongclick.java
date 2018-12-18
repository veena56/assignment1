package com.demo.acer.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class onlongclick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onlongclick);

        Button button = (Button)findViewById(R.id.b1);

        button.setOnLongClickListener(

                new Button.OnLongClickListener() {


                    public boolean onLongClick (View V){
                        EditText e1 = (EditText) findViewById(R.id.editText);
                        android.widget.TextView tv = (android.widget.TextView) findViewById(R.id.t1);
                        tv.setText("long data "+e1.getText());
                        return true;

                    }

                }


        );

    }
}