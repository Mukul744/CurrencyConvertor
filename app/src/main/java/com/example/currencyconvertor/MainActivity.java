package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


    private Button button1;
   private Button button;
 //  private EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button1=findViewById(R.id.button2);
         button=findViewById(R.id.button);

        final EditText editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double convert = Double.parseDouble(editText.getText().toString()) * 0.014;
                    Toast.makeText(MainActivity.this, "" + String.format("%.2f", convert) + "$", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Log.i("","");
                    Toast.makeText(MainActivity.this, "Enter Some Value!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double pound=Double.parseDouble(editText.getText().toString())*0.011;
                    Toast.makeText(MainActivity.this, ""+String.format("%.2f", pound)+"£", Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Enter Some Value!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}
