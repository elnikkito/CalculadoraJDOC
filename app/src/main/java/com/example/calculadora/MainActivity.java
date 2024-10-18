package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    double n1,n2;
    String operador;
    boolean controlPresionado = false;

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

    }

    public void v0(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"0");
    }
    public void v1(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"1");
    }
    public void v2(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"2");
    }
    public void v3(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"3");
    }
    public void v4(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"4");
    }
    public void v5(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"5");
    }
    public void v6(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"6");
    }
    public void v7(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"7");
    }
    public void v8(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"8");
    }
    public void v9(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"9");
    }

    public void operator(View view) {
        n1 = Double.parseDouble(txt.getText().toString());
        operador = ((Button)view).getText().toString();
        controlPresionado = true;
        txt.setText("");
    }

    public void igual(View view) {
        n2 = Double.parseDouble(txt.getText().toString());
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = n1 + n2;
                break;
        }
        txt.setText(String.valueOf(resultado));
    }

    public void limpiar(View view) {
        txt.setText("");
        n1 = 0;
        n2 = 0;
        operador = "";
        controlPresionado = false;
    }


}