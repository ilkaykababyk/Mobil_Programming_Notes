package com.ilkay.ybs4ahafta4;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText my_txt1;
    EditText my_txt2;
    TextView my_result_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        my_txt1=findViewById(R.id.txt_num1) ;
        my_txt2=findViewById(R.id.txt_num2);

        my_result_text = findViewById(R.id.textView);

        System.out.println("create method is called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("you app is just started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("welcome back again!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("yor app is paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("yor app is stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("your app is destroyed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("your app is restarting");
    }
    @SuppressLint("SetTextI18n")
    public void sum(View view){
        int my_num1 = Integer.parseInt(my_txt1.getText().toString());
        int my_num2 = Integer.parseInt(my_txt2.getText().toString());

        int my_result = my_num1+my_num2;

        my_result_text.setText("Result of Sum = "+my_result);


    }

    public void multiplication(View view) {
        int my_num1 = Integer.parseInt(my_txt1.getText().toString());
        int my_num2 = Integer.parseInt(my_txt2.getText().toString());

        int my_result = my_num1 * my_num2;

        my_result_text.setText("Result of Multiplication = " + my_result);

    }

    public void deduct(View view) {
        int my_num1 = Integer.parseInt(my_txt1.getText().toString());
        int my_num2 = Integer.parseInt(my_txt2.getText().toString());

        int my_result = my_num1 - my_num2;

        if (my_result >= 0) {
            my_result_text.setText("Result of Deduct = " + my_result);
        }
        else {
            my_result_text.setText("Lütfen ilk sayıyı daha büyük giriniz");
        }
    }
    public void divide(View view) {
        int my_num1 = Integer.parseInt(my_txt1.getText().toString());
        int my_num2 = Integer.parseInt(my_txt2.getText().toString());

        int my_result = my_num1 / my_num2;

        my_result_text.setText("Result of Divide = " + my_result);
    }
}