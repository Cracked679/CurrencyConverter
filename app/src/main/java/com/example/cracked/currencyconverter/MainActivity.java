package com.example.cracked.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        Log.i("info", "Button is Clicked!! ");
        EditText dollarValue = (EditText)findViewById(R.id.inputvalue);

        Log.i("amount",dollarValue.getText().toString());
        Double dollarValueDouble = Double.parseDouble(dollarValue.getText().toString());

        Double rupeesValueDouble = dollarValueDouble*65.21;

        Toast.makeText(MainActivity.this,"₹"+String.format("%.2f",rupeesValueDouble),Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
