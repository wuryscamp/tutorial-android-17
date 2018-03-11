package com.wuriyanto.tutorial17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSubmit = (Button) findViewById(R.id.btn_submit);

        buttonSubmit.setOnClickListener(new ButtonSubmitListener());

    }

    private class ButtonSubmitListener implements View.OnClickListener {

        private DatePicker datePicker;
        private TextView textViewResult;

        public ButtonSubmitListener(){
            datePicker = (DatePicker) findViewById(R.id.date_picker);
            textViewResult = (TextView) findViewById(R.id.tv_result);
        }

        @Override
        public void onClick(View view) {

            StringBuilder builder = new StringBuilder();
            builder.append("Date : "+datePicker.getDayOfMonth() +"\n");
            builder.append("Month : "+(datePicker.getMonth() + 1) + "\n");
            builder.append("Year : "+datePicker.getYear());

            textViewResult.setText(builder.toString());
        }
    }
}
