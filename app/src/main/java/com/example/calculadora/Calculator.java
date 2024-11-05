package com.example.calculadora;


/**
 * @author nico
 *  @version 1.0
 *  @since 2024-11-04
 */
public class Calculator {


    /**
     * Instantiates a new Calculator.
     */
    public Calculator() {
        super();
    }

    /**
     * Calcular double.
     *
     * @param str the str
     * @return the double
     * @throws Exception the exception
     */
    public double calcular(String str) throws Exception {

        str = str.trim();

        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
        }

        String[] operadores = {"+", "-", "*", "/"};

        for (String op : operadores) {
            int index = str.lastIndexOf(op);
            if (index != -1) {
                String left = str.substring(0, index);
                String right = str.substring(index + 1);


                switch (op) {
                    case "+":
                        return calcular(left) + calcular(right);
                    case "-":
                        return calcular(left) - calcular(right);
                    case "*":
                        return calcular(left) * calcular(right);
                    case "/":
                        double divisor = calcular(right);
                        if (divisor == 0) throw new Exception("División por cero");
                        return calcular(left) / divisor;
                }
            }
        }

        throw new Exception("Operador desconocido");
    }

}
