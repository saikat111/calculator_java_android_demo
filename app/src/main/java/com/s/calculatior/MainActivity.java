package com.s.calculatior;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button num1,num2,num3,num4,num5,num6,num7,num8,num9;
    private Button sum,sub,mul,div;
    private Button equal,clear,zero,dot,per,average,memory;
    private TextView result;
    String temp="" , temp2 = "", temp3 = "";
    String whatToDo ="";
    int operationGiven = 0;
         int re;
         int number1, number2;
         String convert = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);


        per =findViewById(R.id.per);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("%");
            }
        });



        dot=findViewById(R.id.dot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(".");
            }
        });
        zero = findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "0";
                if(operationGiven == 1){
                temp3 = temp3 + "0";
                }
                result.setText(temp);
            }
        });

        num1 = findViewById(R.id.num1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "1";
                if(operationGiven == 1){
                     temp3 = temp3 + "1";
                }
                result.setText(temp);
            }
        });

        num2 = findViewById(R.id.num2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp = temp + "2";
                if(operationGiven ==1){
                          temp3 = temp3 + "2";
                }


                result.setText(temp);
            }
        });

        num3 = findViewById(R.id.num3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                     temp = temp + "3";
                if(operationGiven == 1){
                   temp3 = temp3 + "3";
                }

                result.setText(temp);
            }
        });

        num4 = findViewById(R.id.num4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             temp = temp + "4";
                if(operationGiven == 1){
               temp3 = temp3 + "4";
                }

                result.setText(temp);
            }
        });

        num5 = findViewById(R.id.num5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("5");
                temp = temp + "5";
            }
        });

        num6 = findViewById(R.id.num6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("6");
                temp = temp + "6";
            }
        });

        num7 = findViewById(R.id.num7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("7");
                temp = temp + "7";
            }
        });

        num8 = findViewById(R.id.num8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("8");
                temp = temp + "8";
            }
        });

        num9 = findViewById(R.id.num9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("9");
                temp = temp + "9";
            }
        });

        sum = findViewById(R.id.sum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationGiven = 1;
                whatToDo = "+";
                temp2 = temp;
                temp = temp + "+";
                result.setText(temp);

            }
        });

        sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatToDo = "-";
                result.setText("-");
            }
        });

        mul = findViewById(R.id.mul);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("*");
            }
        });

        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("/");
            }
        });

        equal = findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(whatToDo.equals("+")){
                   number1 = Integer.parseInt(temp2);
                   number2 = Integer.parseInt(temp3);
                   re = number1 + number2;
                    convert = temp + "=";
                      result.setText(String.valueOf(re))     ;
                    convert = convert + String.valueOf(re);
                    result.setText(convert);

                }

                  temp = String.valueOf(re);  // Store the result for next operation
                         temp2 = "";  // Reset the first operand
                         temp3 = "";  // Reset the second operand
                         whatToDo = "";  // Reset the operation type
                         operationGiven = 0;  // Reset operation flag


                if(whatToDo.equals("-")){




                }
            }
        });

        clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp = "";
                temp2 = "";
                temp3 = "";
                convert = "";
                number2 = 0;
                number1 = 0;
                re = 0;
                result.setText("");
            }
        });

        average =findViewById(R.id.average);
        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        memory=findViewById(R.id.memory);
        memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }}