package com.example.calculator;


import android.os.Bundle;
import android.view.View;

import com.example.calculator.databinding.MainActivityBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding binding;

    private final char MULTIPLY = '*';
    private final char DIVIDE = '/';
    private final char SUBTR = '-';
    private final char ADD = '+';


    private char CALC_SIGN;


    private boolean calcSignAllowed;
    private boolean dotAllowed;
    private boolean isNegative;

    private double firstValue;
    private double secondValue;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity);


        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "0");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "0");
                calcSignAllowed = true;


            }
        });

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "1");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "1");
                calcSignAllowed = true;

            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "2");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "2");
                calcSignAllowed = true;

            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "3");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "3");
                calcSignAllowed = true;


            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "4");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "4");
                calcSignAllowed = true;


            }
        });
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "5");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "5");
                calcSignAllowed = true;

            }
        });
        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "6");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "6");
                calcSignAllowed = true;

            }
        });
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "7");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "7");
                calcSignAllowed = true;

            }
        });
        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(binding.textViewResult.getText() + "8");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "8");
                calcSignAllowed = true;
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.textViewResult.setText(binding.textViewResult.getText() + "9");
                binding.textViewHistory.setText(binding.textViewHistory.getText() + "9");
                calcSignAllowed = true;
            }
        });


        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    firstValue = Double.valueOf(binding.textViewResult.getText().toString());
                    CALC_SIGN = ADD;
                    binding.textViewResult.setText(binding.textViewResult.getText() + "+");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + "+");
                    binding.textViewResult.setText(null);
                    calcSignAllowed = false;
                    isNegative=false;
                }
            }
        });

        binding.buttonDivid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    firstValue = Double.valueOf(binding.textViewResult.getText().toString());
                    CALC_SIGN = DIVIDE;
                    binding.textViewResult.setText(binding.textViewResult.getText() + "/");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + "/");
                    binding.textViewResult.setText(null);
                    calcSignAllowed = false;
                    isNegative=false;
                }
            }
        });
        binding.buttonMultipl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    firstValue = Double.valueOf(binding.textViewResult.getText().toString());
                    CALC_SIGN = MULTIPLY;
                    binding.textViewResult.setText(binding.textViewResult.getText() + "*");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + "*");
                    binding.textViewResult.setText(null);
                    calcSignAllowed = false;
                    isNegative=false;
                }
            }
        });
        binding.buttonSubtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    firstValue = Double.valueOf(binding.textViewResult.getText().toString());
                    CALC_SIGN = SUBTR;
                    binding.textViewResult.setText(binding.textViewResult.getText() + "-");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + "-");
                    binding.textViewResult.setText(null);
                    calcSignAllowed = false;
                } else if (isNegative==false) {
                    binding.textViewResult.setText("-");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + "-");
                    isNegative=true;
                }
            }
        });


        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    binding.textViewResult.setText(binding.textViewResult.getText() + ".");
                    binding.textViewHistory.setText(binding.textViewHistory.getText() + ".");
                    calcSignAllowed = false;
                    dotAllowed = false;
                }
            }
        });


        binding.buttonClearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textViewResult.setText(null);
                binding.textViewHistory.setText(null);
                CALC_SIGN=' ';
                firstValue=0;
                secondValue=0;
                isNegative=false;
                calcSignAllowed=false;

            }
        });


        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcSignAllowed == true) {
                    calculate();
                    CALC_SIGN = ' ';
                    binding.textViewResult.setText(String.valueOf(firstValue));
                }
            }
        });


    }

    private void calculate() {
        secondValue = Double.valueOf(binding.textViewResult.getText().toString());

        switch (CALC_SIGN) {
            case (ADD):
                this.firstValue = firstValue + secondValue;
                break;
            case (DIVIDE):
                this.firstValue = firstValue / secondValue;
                break;
            case (SUBTR):
                this.firstValue = firstValue - secondValue;
                break;
            case (MULTIPLY):
                this.firstValue = firstValue * secondValue;
                break;
            default:
                this.firstValue = firstValue;

        }
        if(firstValue==Double.NaN){
            binding.textViewResult.setText("Not allowed");
        }


    }


}
