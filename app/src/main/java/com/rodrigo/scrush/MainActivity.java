package com.rodrigo.scrush;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton,radioButton1;
    private Button next;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton1=(RadioButton)findViewById(R.id.radioButton1);
        next=(Button)findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton.isChecked()){
                    Intent intent = new Intent(context, exercise.class);
                    startActivity(intent);
                }else if(radioButton1.isChecked()){
                    Intent intent = new Intent(context, exercise2.class);
                    startActivity(intent);
                }

            }
        });
    }
}
