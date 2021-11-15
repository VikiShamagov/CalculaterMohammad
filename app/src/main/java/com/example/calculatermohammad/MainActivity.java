package com.example.calculatermohammad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    TextView tv;
    ImageButton plus,power,divid,mult,minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.eNumber1);
        et2=findViewById(R.id.eNumber2);
        tv=findViewById(R.id.textView2);
        power=findViewById(R.id.power);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mult=findViewById(R.id.cfl);
    }

    public void calc(View view) {
        if(view==plus){
            int sum=0;
            String s1=et1.getText().toString();
            String s2=et2.getText().toString();
            sum=Integer.parseInt(s1)+Integer.parseInt(s2);
            tv.setText("Result = "+sum);
        }
        if(view==minus){
            int sum=0;
            String s1=et1.getText().toString();
            String s2=et2.getText().toString();
            sum=Integer.parseInt(s1)-Integer.parseInt(s2);
            tv.setText("Result = "+sum);
        }
        if(view==mult){
            int sum=0;
            String s1=et1.getText().toString();
            String s2=et2.getText().toString();
            sum=Integer.parseInt(s1)*Integer.parseInt(s2);
            tv.setText("Result = "+sum);
        }
        if(view==power){

        }
    }
}