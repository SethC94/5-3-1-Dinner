package com.example.bootycall20.a5_3_1_dinner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import static com.example.bootycall20.a5_3_1_dinner.MainActivity.userInput;

/**
 * Created by BootyCall2.0 on 3/14/2017.
 */

public class VenueOptions extends AppCompatActivity {

    String venueText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_options_display);



        EditText venueOption1 = (EditText) findViewById(R.id.venueOption1);
        ToggleButton venueButton1 = (ToggleButton) findViewById(R.id.venueButton1);
        venueText = userInput.get(0);
        venueButton1.setText(venueText);

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
    public void venueOptions5(View view) {
        Intent intent = new Intent(this, UpdatedVenues.class);
        startActivity(intent);
    }

}
