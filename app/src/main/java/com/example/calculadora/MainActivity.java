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

/**
 * @author nico
 *  @version 1.0
 *  @since 2024-11-04
 */
public class MainActivity extends AppCompatActivity {

    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    /**
     * The Txt.
     */
    TextView txt;
    /**
     * The Control presionado.
     */
    boolean controlPresionado = false;
    /**
     * The Calculator.
     */
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }


    /**
     * V 0.
     *
     * @param view the view
     */
    public void v0(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"0");
    }

    /**
     * V 1.
     *
     * @param view the view
     */
    public void v1(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"1");
    }

    /**
     * V 2.
     *
     * @param view the view
     */
    public void v2(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"2");
    }

    /**
     * V 3.
     *
     * @param view the view
     */
    public void v3(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"3");
    }

    /**
     * V 4.
     *
     * @param view the view
     */
    public void v4(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"4");
    }

    /**
     * V 5.
     *
     * @param view the view
     */
    public void v5(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"5");
    }

    /**
     * V 6.
     *
     * @param view the view
     */
    public void v6(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"6");
    }

    /**
     * V 7.
     *
     * @param view the view
     */
    public void v7(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"7");
    }

    /**
     * V 8.
     *
     * @param view the view
     */
    public void v8(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"8");
    }

    /**
     * V 9.
     *
     * @param view the view
     */
    public void v9(View view){
        txt=(TextView)findViewById(R.id.texto);
        txt.setText(txt.getText()+"9");
    }

    /**
     * Operator.
     *
     * @param view the view
     */
    public void operator(View view) {
        String operador = ((Button) view).getText().toString();
        txt.setText(txt.getText() + operador);
    }

    /**
     * Igual.
     *
     * @param view the view
     * @throws Exception the exception
     */
    public void igual(View view) throws Exception {
        try {
            String expresion = txt.getText().toString().trim();
            if (expresion.isEmpty()) {
                txt.setText("Error: Expresión vacía");
                return;
            }
            double resultado = calculator.calcular(expresion);
            txt.setText(String.valueOf(resultado));
        } catch (Exception e) {
            txt.setText("Error: " + e.getMessage());
        }
    }

    /**
     * Limpiar.
     *
     * @param view the view
     */
    public void limpiar(View view) {
        txt.setText("");
    }

}