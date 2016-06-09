package com.brjpapps.android.policebrutalityquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizActivity5 extends AppCompatActivity {
    TextView final_result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5);
        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setEnabled(false);

        btn = (Button)findViewById(R.id.next_page);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent in = new Intent(getApplicationContext(), ResultActivity.class);
                startActivity(in);
            }
        });
    }

    public void selectForce(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.question5_o1:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q5o1ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question5_o2:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q5o2ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question5_o3:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q5o3ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
            case R.id.question5_o4:
                if (checked) {
                    final_result.setText(getResources().getString(R.string.q5o4ans));
                    final_result.setEnabled(true);
                } else {
                    final_result.setEnabled(false);
                }
                break;
        }
    }
}