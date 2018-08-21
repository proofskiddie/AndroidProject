package edu.purdue.kidd9.cs180;

import android.view.View;
import android.widget.TextView;

import java.util.Random;

/**
 * ThrowListener
 * @Steven Kidd
 */
public class ThrowListener implements View.OnClickListener {

    private TextView dieDisplay;
    private TextView sumdisplay;
    Random r = new Random();

    public ThrowListener(TextView dieDisplay, TextView sumdisplay) {
        this.dieDisplay = dieDisplay;
        this.sumdisplay = sumdisplay;
    }

    @Override
    public void onClick(View view) {
        int temp = r.nextInt(7);
        dieDisplay.setText("" + temp);
        sumdisplay.setText("" + (temp + Integer.parseInt(sumdisplay.getText() + "")));
    }
}
