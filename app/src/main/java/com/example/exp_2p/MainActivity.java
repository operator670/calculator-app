package com.example.exp_2p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button nine,eight,seven,six,five,four,three,two,one,zero,dot,plus,minus,into,devide,mod,equals,CLEAR;
EditText res;
String operatorPressed="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=findViewById(R.id.res);
        nine=findViewById(R.id.nine);
        eight=findViewById(R.id.eight);
        seven=findViewById(R.id.seven);
        six=findViewById(R.id.six);
        five=findViewById(R.id.five);
        four=findViewById(R.id.four);
        three=findViewById(R.id.three);
        two=findViewById(R.id.two);
        one=findViewById(R.id.one);
        zero=findViewById(R.id.zero);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        into=findViewById(R.id.into);
        devide=findViewById(R.id.devide);
        mod=findViewById(R.id.mod);
        dot=findViewById(R.id.dot);
        equals=findViewById(R.id.equals);
        CLEAR=findViewById(R.id.CLEAR);
        nine.setOnClickListener(this);
        eight.setOnClickListener(this);
        seven.setOnClickListener(this);
        six.setOnClickListener(this);
        five.setOnClickListener(this);
        four.setOnClickListener(this);
        three.setOnClickListener(this);
        two.setOnClickListener(this);
        one.setOnClickListener(this);
        zero.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        into.setOnClickListener(this);
        devide.setOnClickListener(this);
        mod.setOnClickListener(this);
        dot.setOnClickListener(this);
        equals.setOnClickListener(this);
        CLEAR.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
 switch (view.getId()){
     case R.id.nine:res.append("9");break;
     case R.id.eight:res.append("8");break;
     case R.id.seven:res.append("7");break;
     case R.id.six:res.append("6");break;
     case R.id.five:res.append("5");break;
     case R.id.four:res.append("4");break;
     case R.id.three:res.append("3");break;
     case R.id.two:res.append("2");break;
     case R.id.one:res.append("1");break;
     case R.id.zero:res.append("0");break;
     case R.id.plus:res.append("+");operatorPressed="+";break;
     case R.id.minus:res.append("-");operatorPressed="-";break;
     case R.id.into:res.append("*");operatorPressed="*";break;
     case R.id.devide:res.append("/");operatorPressed="/";break;
     case R.id.mod:res.append("%");operatorPressed="+";break;
     case R.id.CLEAR:res.setText("");break;
     case R.id.equals:
         double finalres=compute(res.getText().toString(),operatorPressed);
         res.setText(String.valueOf(finalres));
 }
    }

    private double compute(String toString, String operatorPressed) {
        String mArray[]=toString.split("\\+|-|\\*|\\/|\\%");
        double op1=Double.parseDouble((mArray[0]));
        double op2=Double.parseDouble((mArray[1]));
        switch(operatorPressed){
            case "+":return op1+op2;
            case "-":return op1-op2;
            case "*":return op1*op2;
            case "/":return op1/op2;
            case "%":return op1%op2;

        }
        return 0.0;
    }
}