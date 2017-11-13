package com.rodrigo.scrush;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class exercise extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton_act,radioButton_act1,radioButton_act2,radioButton_act3,radioButton_act4,radioButton_act5,radioButton_act6,radioButton_act7;
    private Button next;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButton_act=(RadioButton)findViewById(R.id.radioButton_act);
        radioButton_act1=(RadioButton)findViewById(R.id.radioButton_act1);
        next=(Button)findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButton_act.isChecked()){
                    Intent intent = new Intent(context, exercise.class);
                    startActivity(intent);
                }else if(radioButton_act1.isChecked()){
                    Intent intent = new Intent(context, exercise2.class);
                    startActivity(intent);
                }

            }
        });
    }
}
