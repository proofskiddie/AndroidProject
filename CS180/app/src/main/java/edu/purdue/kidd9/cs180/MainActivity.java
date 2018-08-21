package edu.purdue.kidd9.cs180;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Button throwButton = (Button) findViewById(R.id.Throw);
        Button clearButton = (Button) findViewById(R.id.Reset);
        */

        /*
        throwButton.setOnClickListener(new ThrowListener(dieDisplay, sumDisplay));
        clearButton.setOnClickListener(new ClearListener(dieDisplay, sumDisplay));
        */
    }

    public void throwDie(View view) {
        Random r = new Random();
        TextView dieDisplay = (TextView) findViewById(R.id.Die);
        TextView sumDisplay = (TextView) findViewById(R.id.Sum);

        int temp = r.nextInt(7);
        dieDisplay.setText("" + temp);
        sumDisplay.setText("" + (temp + Integer.parseInt(sumDisplay.getText() + "")));


    }

    public void resetDie(View view) {
        TextView dieDisplay = (TextView) findViewById(R.id.Die);
        TextView sumDisplay = (TextView) findViewById(R.id.Sum);
        sumDisplay.setText("0");
        dieDisplay.setText("Throw Die");
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
}
