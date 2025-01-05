package com.sanmay.tictactoe_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }
    public void init(){
        jbtn1=findViewById(R.id.btn1);
        jbtn2=findViewById(R.id.btn2);
        jbtn3=findViewById(R.id.btn3);
        jbtn4=findViewById(R.id.btn4);
        jbtn5=findViewById(R.id.btn5);
        jbtn6=findViewById(R.id.btn6);
        jbtn7=findViewById(R.id.btn7);
        jbtn8=findViewById(R.id.btn8);
        jbtn9=findViewById(R.id.btn9);
    }

    int flag=0;
    int count=0;
    public  void newGame(){
        jbtn1.setText(" ");
        jbtn2.setText(" ");
        jbtn3.setText(" ");
        jbtn4.setText(" ");
        jbtn5.setText(" ");
        jbtn6.setText(" ");
        jbtn7.setText(" ");
        jbtn8.setText(" ");
        jbtn9.setText(" ");
        flag=0;
        count=0;
    }


    public void Check(View view){
        Button btnCurrent=(Button) view;

        if((btnCurrent.getText().toString()).equals(" ")) {
            count++;
            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                b1 = jbtn1.getText().toString();
                b2 = jbtn2.getText().toString();
                b3 = jbtn3.getText().toString();
                b4 = jbtn4.getText().toString();
                b5 = jbtn5.getText().toString();
                b6 = jbtn6.getText().toString();
                b7 = jbtn7.getText().toString();
                b8 = jbtn8.getText().toString();
                b9 = jbtn9.getText().toString();


                if (b1.equals(b2) && b2.equals(b3) && !b1.equals(" ")) {
                    Toast.makeText(this, "Winner" + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals(" ")) {
                    Toast.makeText(this, "Winner" + b4, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b7.equals(b8) && b8.equals(b9) && !b8.equals(" ")) {

                    Toast.makeText(this, "Winner" + b7, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b1.equals(b4) && b4.equals(b7) && !b4.equals(" ")) {
                    Toast.makeText(this, "Winner" + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b2.equals(b5) && b5.equals(b8) && !b5.equals(" ")) {
                    Toast.makeText(this, "Winner" + b2, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals(" ")) {
                    Toast.makeText(this, "Winner" + b3, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals(" ")) {
                    Toast.makeText(this, "Winner" + b1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals(" ")) {
                    Toast.makeText(this, "Winner" + b3, Toast.LENGTH_SHORT).show();
                    newGame();
                }else if(count==9){
                    Toast.makeText(this, "Match is Drawn", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }
    }}
