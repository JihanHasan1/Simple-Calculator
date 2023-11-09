package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class calculatorActivity extends AppCompatActivity {
    TextView tvEquation;
    TextView tvResult;
    private Button btnDelete, btnC, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnDivide, btnMul, btnMinus, btnEqual, btnDot, btnPre, btnNext;

    String preEq, nextEq, preRes, nextRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tvEquation = findViewById(R.id.tvEquation);
        tvResult = findViewById(R.id.tvResult);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMul = findViewById(R.id.btnMul);
        btnMinus = findViewById(R.id.btnMinus);
        btnEqual = findViewById(R.id.btnEqual);
        btnDot = findViewById(R.id.btnDot);
        btnDelete = findViewById(R.id.btnDelete);
        btnC = findViewById(R.id.btnC);
        btnPre = findViewById(R.id.btnPre);
        btnNext = findViewById(R.id.btnNext);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 0;
                tvEquation.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 1;
                tvEquation.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 2;
                tvEquation.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 3;
                tvEquation.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 4;
                tvEquation.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 5;
                tvEquation.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 6;
                tvEquation.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 7;
                tvEquation.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 8;
                tvEquation.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + 9;
                tvEquation.setText(text);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + "-";
                tvEquation.setText(text);
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + "×");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                text = text + "÷";
                tvEquation.setText(text);
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                tvEquation.setText(text + ".");
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tvEquation.getText().toString();
                if (text == null) {
                    text = "";
                }
                if (text.length() > 0) {
                    tvEquation.setText(text.substring(0, text.length() - 1));
                }
                tvResult.setText(null);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvEquation.getText().toString().equals("")){
                    preEq = tvEquation.getText().toString();
                    preRes = tvResult.getText().toString();

                    tvEquation.setText("");
                    tvResult.setText("");
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvEquation.getText().toString();
                if(val.contains("÷0")) {
                    Toast.makeText(calculatorActivity.this, "Denominator can't be zero !", Toast.LENGTH_SHORT).show();
                } else if (val.contains("++") || val.contains("--") || val.contains("××") || val.contains("÷÷") || val.contains("+-")
                        || val.contains("+×") || val.contains("+÷") || val.contains("-+") || val.contains("-×") || val.contains("-÷")
                        || val.contains("×+") || val.contains("×-") || val.contains("×÷") || val.contains("÷+") || val.contains("÷-")
                        || val.contains("÷×")) {
                    Toast.makeText(calculatorActivity.this, "Operator Error !", Toast.LENGTH_SHORT).show();
                    tvResult.setText("");
                } else if (val.contains("..")) {
                    Toast.makeText(calculatorActivity.this, "Multiple Dots can't be used !", Toast.LENGTH_SHORT).show();
                    tvResult.setText("");
                } else if (val.endsWith("+") || val.endsWith("-") || val.endsWith("×") || val.endsWith("÷")) {
                    Toast.makeText(calculatorActivity.this, "Last digit can't be an operator!", Toast.LENGTH_SHORT).show();
                } else if (val.endsWith(".")) {
                    Toast.makeText(calculatorActivity.this, "Last digit can't be a dot !", Toast.LENGTH_SHORT).show();
                } else {
                    String reString = val.replace('÷', '/').replace('×', '*');
                    double res = calculate(reString);
                    String result = res+""; //Convert Double to String
                    tvResult.setText(result);

                    nextEq = tvEquation.getText().toString();
                    nextRes = tvResult.getText().toString();
                }
            }
            double calculate(final String str) {
                return new Object() {
                    int pos = -1, ch;
                    void nextChar(){
                        ch = (++pos < str.length()) ? str.charAt(pos) : -1;
                    }
                    boolean eat(int charToEat) {
                        while (ch == ' ') nextChar();
                        if (ch == charToEat) {
                            nextChar();
                            return true;
                        }
                        return false;
                    }
                    double parse() {
                        nextChar();
                        double x = parseExpression();
                        if (pos < str.length())
                            throw new RuntimeException("Unexpected: " + (char)ch);
                        return x;
                    }
                    double parseExpression() {
                        double x = parseTerm();
                        for (;;) {
                            if(eat('+'))
                                x += parseTerm();
                            else if(eat('-'))
                                x -= parseTerm();
                            else
                                return x;
                        }
                    }
                    double parseTerm() {
                        double x = parseFactor();
                        for (;;) {
                            if(eat('*'))
                                x *= parseFactor();
                            else if (eat('/'))
                                x /= parseFactor();
                            else
                                return x;
                        }
                    }
                    double parseFactor() {
                        if (eat('+'))
                            return parseFactor();
                        if (eat('-'))
                            return -parseFactor();

                        double x;
                        int startPos = this.pos;
                        if ((ch >= '0' && ch <= '9') || ch == '.') {
                            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                            x = Double.parseDouble(str.substring(startPos, this.pos));
                        }
                        else {
                            throw new RuntimeException("Unexpected: " + (char)ch);
                        }
                        return x;
                    }
                }.parse();
            }
        });

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvEquation.setText(preEq);
                tvResult.setText(preRes);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvEquation.setText(nextEq);
                tvResult.setText(nextRes);
            }
        });
    }

    public void onStart(){
        super.onStart();

    }
}