package com.adarsh.datepickertutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    DatePicker picker;
    Button displayDate;
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1 = findViewById(R.id.textView1);
        displayDate = findViewById(R.id.button1);
        picker = findViewById(R.id.datePicker);

        textview1.setText("currentDate" + getCurrentDate());

        displayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview1.setText("ChangeDate"+getCurrentDate());
            }
        });

    }

    public String getCurrentDate() {
        StringBuilder builder = new StringBuilder();
        builder.append((picker.getMonth() + 1) + "/"); //month is zero based
        builder.append(picker.getDayOfMonth() + "/");
        builder.append(picker.getYear());
        return builder.toString();
    }
}