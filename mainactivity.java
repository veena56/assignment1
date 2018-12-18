package com.demo.acer.eventhandling;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{





            private LinearLayout linearLayout = null;

            // Button1 and button2 is added in layout xml file.
            private Button button1 = null;
            private Button button2 = null;

            private Context context = null;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                setTitle(" Android Button Example.");

                initControls();

                // Button3 is created in java code dynamically.
                // Create button3 in code.
                Button button3 = new Button(context);
                button3.setText("Button Three Is Added In Code");
                button3.setTextSize(20);
                button3.setAllCaps(false);
                button3.setBackgroundColor(Color.GREEN);

                // Add a OnClickListener object to button3.
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast = Toast.makeText(context, "You clicked button three.", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }
                });

                // Add button3 to the wrapper linear layout object to show it.
                linearLayout.addView(button3);
            }


            /* Initialise layout and button components. */
            private void initControls()
            {
                if(linearLayout == null)
                {
                    linearLayout = (LinearLayout)findViewById(R.id.button_layout);
                }

                if(button1 == null)
                {
                    button1 = (Button)findViewById(R.id.button_1);
                }

                if(button2 == null)
                {
                    button2 = (Button)findViewById(R.id.button_2);
                }

                if(context == null)
                {
                    context = getApplicationContext();
                }

        /* Must set the on click listener to this activity,
           otherwise the override onClick method will bot be invoked.*/
                linearLayout.setOnClickListener(this);
                button1.setOnClickListener(this);
                button2.setOnClickListener(this);

            }


            /* This method is called when any of the activity's view components is clicked. */
            @Override
            public void onClick(View view) {
                if(view != null)
                {
                    String message = "";

                    // Get view component id.
                    int id = view.getId();

                    // Show different message when click different view component.
                    if(id == R.id.button_1)
                    {
                        message = "Button one is clicked.";
                    }else if(id == R.id.button_2)
                    {
                        message = "Button two is clicked.";
                    }else if(id == R.id.button_layout)
                    {
                        message = "You clicked button layout.";
                    }

                    // Create the toast popup message.
                    Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                }
            }
        }