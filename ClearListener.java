package edu.purdue.kidd9.cs180;

import android.view.View;
import android.widget.TextView;

/**
 * ClearListener
 * @Steven Kidd
 */
public class ClearListener implements View.OnClickListener {

    private TextView dieDisplay;
    private TextView sumdisplay;

    public ClearListener(TextView dieDisplay, TextView sumdisplay) {
        this.dieDisplay = dieDisplay;
        this.sumdisplay = sumdisplay;
    }

    @Override
    public void onClick(View view) {
        dieDisplay.setText("Throw Die");
        sumdisplay.setText("0");
    }
}
