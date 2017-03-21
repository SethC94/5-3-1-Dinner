package com.example.bootycall20.a5_3_1_dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button button;
    EditText venueOption1;
    ToggleButton venueButton1;
    public static List<String> userInput;
    String userInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        venueOption1 = (EditText) findViewById(R.id.venueOption1);
        venueButton1 = (ToggleButton) findViewById(R.id.venueButton1);
        button = (Button) findViewById(R.id.button);
        userInput = new ArrayList<>();
       userInputText = new String();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                venueOption1 = (EditText) findViewById(R.id.venueOption1);
                getUserInput(userInput);

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
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }



        return super.onOptionsItemSelected(item);


    }

    public List<String> getUserInput(List<String> userInput){
        venueOption1 = (EditText) findViewById(R.id.venueOption1);
        String userInput1 = venueOption1.getText().toString();
        userInput.add(userInput1);
        return userInput;
    }

}
