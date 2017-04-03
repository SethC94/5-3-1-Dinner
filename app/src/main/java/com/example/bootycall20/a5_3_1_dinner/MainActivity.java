package com.example.bootycall20.a5_3_1_dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    EditText venueOption1;
    EditText venueOption2;
    EditText venueOption3;
    EditText venueOption4;
    EditText venueOption5;

    Button UpdateVenueButton;

    public static ArrayList<String> userInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        venueOption1 = (EditText) findViewById(R.id.venueOption1);
        venueOption2 = (EditText) findViewById(R.id.venueOption2);
        venueOption3 = (EditText) findViewById(R.id.venueOption3);
        venueOption4 = (EditText) findViewById(R.id.venueOption4);
        venueOption5 = (EditText) findViewById(R.id.venueOption5);


        UpdateVenueButton = (Button) findViewById(R.id.button);

        userInput = new ArrayList<>(4);




        UpdateVenueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venueOption1 = (EditText) findViewById(R.id.venueOption1);
                getUserInput(userInput(0));

                venueOption2 = (EditText) findViewById(R.id.venueOption2);
                getUserInput(userInput(1));

                venueOption3 = (EditText) findViewById(R.id.venueOption3);
                getUserInput(userInput(2));

                venueOption4 = (EditText) findViewById(R.id.venueOption4);
                getUserInput(userInput(3));

                venueOption5 = (EditText) findViewById(R.id.venueOption5);
                getUserInput(userInput(4));

                Intent intent = new Intent(v.getContext(), VenueOptions.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up UpdateVenueButton, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);


    }

    public ArrayList<String> getUserInput(ArrayList<String> userInput){
        venueOption1 = (EditText) findViewById(R.id.venueOption1);
        String userInput1 = venueOption1.getText().toString();
        userInput.add(userInput1);

        venueOption2 = (EditText) findViewById(R.id.venueOption2);
        String userInput2 = venueOption2.getText().toString();
        userInput.add(userInput2);

        venueOption3 = (EditText) findViewById(R.id.venueOption3);
        String userInput3 = venueOption3.getText().toString();
        userInput.add(userInput3);

        venueOption4 = (EditText) findViewById(R.id.venueOption4);
        String userInput4 = venueOption4.getText().toString();
        userInput.add(userInput4);

        venueOption5 = (EditText) findViewById(R.id.venueOption5);
        String userInput5 = venueOption5.getText().toString();
        userInput.add(userInput5);

        return userInput;
    }

}
