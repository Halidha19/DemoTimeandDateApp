package sg.edu.rp.c346.id22035802.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;

    Button btnReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById((R.id.buttonDisplayTime));
        tvDisplay = findViewById(R.id.textView2);
        btnReset = findViewById(R.id.buttonreset);

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String date = "Today is" + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) + "/"+ dp.getYear();
                tvDisplay.setText(date);

            }
        });

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getHour() + ":" + tp.getMinute();
                tvDisplay.setText(time);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setHour(0);
                tp.setMinute(0);
                dp.updateDate(2023, 2,1 );
                tvDisplay.setText("");





            }
        });


    }
}