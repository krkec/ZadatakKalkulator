package hr.krkec.zadatakkalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double broj1 = null;
    Double broj2 = null;
    TextView tvRezultat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacije();
    }

    private void operacije() {
        EditText etUnos1 = findViewById(R.id.etUnos1);
        EditText etUnos2 = findViewById(R.id.etUnos2);
        tvRezultat = findViewById(R.id.tvRezultat);
/*
        if (etUnos1.getText()!=null&etUnos2.getText()!=null) {
            broj1 = Integer.parseInt(etUnos1.getText().toString());
            broj2 = Integer.parseInt(etUnos2.getText().toString());
        } else {
            Toast.makeText(this, "Upišite ispravan broj", Toast.LENGTH_SHORT).show();
            return;
        }*/

        //Operacija množenja
        Button btnMultiply = findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUnos1 = findViewById(R.id.etUnos1);
                EditText etUnos2 = findViewById(R.id.etUnos2);
                broj1 = Double.parseDouble(etUnos1.getText().toString());
                broj2 = Double.parseDouble(etUnos2.getText().toString());
                Double b = broj1*broj2;
;               tvRezultat.setText(b.toString());
            }
        });
        Button btnDivide = findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUnos1 = findViewById(R.id.etUnos1);
                EditText etUnos2 = findViewById(R.id.etUnos2);
                broj1 = Double.parseDouble(etUnos1.getText().toString());
                broj2 = Double.parseDouble(etUnos2.getText().toString());
                if (broj2 != 0) {
                    Double b = broj1/broj2;
                    tvRezultat.setText(b.toString());
                }
            }
        });
        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUnos1 = findViewById(R.id.etUnos1);
                EditText etUnos2 = findViewById(R.id.etUnos2);
                broj1 = Double.parseDouble(etUnos1.getText().toString());
                broj2 = Double.parseDouble(etUnos2.getText().toString());
                Double b = broj1+broj2;
                tvRezultat.setText(b.toString());
            }
        });
        Button btnSubtract = findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUnos1 = findViewById(R.id.etUnos1);
                EditText etUnos2 = findViewById(R.id.etUnos2);
                broj1 = Double.parseDouble(etUnos1.getText().toString());
                broj2 = Double.parseDouble(etUnos2.getText().toString());
                Double b = broj1-broj2;
                tvRezultat.setText(b.toString());
            }
        });
    }


}
