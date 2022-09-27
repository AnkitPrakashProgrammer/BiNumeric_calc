package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

class number{
    String x="";
    String y="";
    Boolean add=false;
    Boolean mul=false;
    Boolean div=false;
    Boolean sub=false;
    Boolean mod=false;
}

public class MainActivity extends AppCompatActivity {
    TextView e1,e2;
    Button A1,A2,A3,A4,B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4,E1,E2,E3,E4;
    Button b1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A1 = findViewById(R.id.buttonA1);
        A2 = findViewById(R.id.buttonA2);
        A3 = findViewById(R.id.buttonA3);
        A4 = findViewById(R.id.buttonA4);
        B1 = findViewById(R.id.buttonB1);
        B2 = findViewById(R.id.buttonB2);
        B3 = findViewById(R.id.buttonB3);
        B4 = findViewById(R.id.buttonB4);
        C1 = findViewById(R.id.buttonC1);
        C2 = findViewById(R.id.buttonC2);
        C3 = findViewById(R.id.buttonC3);
        C4 = findViewById(R.id.buttonC4);
        D1 = findViewById(R.id.buttonD1);
        D2 = findViewById(R.id.buttonD2);
        D3 = findViewById(R.id.buttonD3);
        D4 = findViewById(R.id.buttonD4);
        E1 = findViewById(R.id.buttonE1);
        E2 = findViewById(R.id.buttonE2);
        E3 = findViewById(R.id.buttonE3);
        E4 = findViewById(R.id.buttonE4);
        e1 = findViewById(R.id.editTextTextPersonName1);
        e2 = findViewById(R.id.editTextTextPersonName2);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView4);


number num = new number();

            E4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    try {


                        String s1 = e1.getText().toString();
                        String s2 = e2.getText().toString();

                        Double a = Double.parseDouble(s1);
                        Double b = Double.parseDouble(s2);
                        Double c=0.0;
                        if(num.add)
                        {
                             c = a+b;
                        }
                        else if(num.mul)
                        {
                             c = a*b;
                        }
                        else if(num.div)
                        {
                             c= a/b;
                        }
                        else if(num.sub)
                        {
                             c=a-b;
                        }
                        else if(num.mod)
                        {
                            c=(a*b)/100;
                        }


                        t1.setText("value = " + String.format("%.4f",c));

                        Toast.makeText(getApplicationContext(), "\uD83E\uDD29 Answer \uD83E\uDD73", Toast.LENGTH_SHORT).show();
                    }
                    catch (Exception e)
                    {
                        String msg= e.getMessage();
                        Toast.makeText(getApplicationContext(), "\uD83E\uDD2E"+ msg+"\uD83D\uDCA9", Toast.LENGTH_SHORT).show();
                    }

                }
            });

            E2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                        num.x = num.x + "0";
                        e1.setText(String.valueOf(num.x));
                    }
                    else {
                        num.y = num.y + "0";
                        e2.setText(String.valueOf(num.y));
                    }
                }
            });
        D1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "1";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "1";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });
        D2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "2";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "2";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });
        D3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "3";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "3";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        C1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "4";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "4";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        C2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "5";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "5";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        C3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "6";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "6";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "7";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "7";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "8";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "8";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "9";
                    e1.setText(String.valueOf(num.x));
                }
                else{
                    num.y = num.y + "9";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });

        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(num.add || num.div || num.sub || num.mul || num.mod)) {
                    num.x = num.x + "00";
                    e1.setText(String.valueOf(num.x));
                }
                else {
                    num.y = num.y + "00";
                    e2.setText(String.valueOf(num.y));
                }
            }
        });
        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    if(num.y.isEmpty()) {
                        num.x = num.x.substring(0, num.x.length() - 1);
                        e1.setText(String.valueOf(num.x));
                        num.add=false;
                        num.mul=false;
                        num.div=false;
                        num.sub=false;
                        num.mod=false;
                        t2.setText("");
                    }
                    else
                    {
                        num.y = num.y.substring(0, num.y.length() - 1);
                        e2.setText(String.valueOf(num.y));
                    }
                }
                catch (Exception e)
                {
                    String msg2=e.getMessage();
                    Toast.makeText(getApplicationContext(), "\uD83E\uDD22"+msg2+"\uD83E\uDDD0", Toast.LENGTH_SHORT).show();
                }
            }
        });

        D4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!num.x.isEmpty()) {
                   num.add = true;
                   num.mod=false;
                   num.mul = false;
                   num.div = false;
                   num.sub = false;
                   t2.setText("+");
               }
               else
               {
                   Toast.makeText(MainActivity.this, "\uD83D\uDD95 Enter number 1 \uD83D\uDE12", Toast.LENGTH_SHORT).show();
               }
            }
        });

        C4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num.x.isEmpty()) {
                    num.add = false;
                    num.mod=false;
                    num.mul = false;
                    num.div = false;
                    num.sub = true;
                    t2.setText("-");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "\uD83E\uDDE0 Enter number 1 \uD83D\uDE12", Toast.LENGTH_SHORT).show();
                }
            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num.x.isEmpty()) {
                    num.add = false;
                    num.mul = true;
                    num.mod=false;
                    num.div = false;
                    num.sub = false;
                    t2.setText("X");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "\uD83D\uDE3E Enter number 1 \uD83D\uDE12", Toast.LENGTH_SHORT).show();
                }

            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num.x.isEmpty()) {
                    num.add = false;
                    num.mul = false;
                    num.div = true;
                    num.mod=false;
                    num.sub = false;
                    t2.setText("/");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "\uD83E\uDD2C Enter number 1 \uD83D\uDE12", Toast.LENGTH_SHORT).show();
                }
            }
        });
        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!num.x.isEmpty()) {
                    num.add = false;
                    num.mul = false;
                    num.div = false;
                    num.mod=true;
                    num.sub = false;
                    t2.setText("%");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "\uD83E\uDD2C Enter number 1 \uD83D\uDE12", Toast.LENGTH_SHORT).show();
                }
            }
        });

        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                num.x=num.x.substring(0,0);
//                num.y=num.x.substring(0,0);
                num.x="";
                num.y="";
                num.add=false;
                num.mul=false;
                num.mod=false;
                num.div=false;
                num.sub=false;
                e1.setText(num.x);
                e2.setText(num.y);
                t1.setText("");
                t2.setText("");
                Toast.makeText(MainActivity.this, "\uD83E\uDD16 Reset \uD83D\uDC80", Toast.LENGTH_SHORT).show();

            }
        });





    }
}