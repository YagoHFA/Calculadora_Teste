public class CalcDiv {
    public static void main(String[] args) {
        Calculadora calcDiv = new Calculadora();

        //Cenario de teste 1: Divisão de dois valores positivos
        int div = calcDiv.divisão(3, 2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 2: Divisão de dois valores com dividendo negativo
        div = calcDiv.divisão(-3, 2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 3: Divisão de dois valores com divisor negativo
        div = calcDiv.divisão(3, -2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 4: Divisão de dois valores negativos
        div = calcDiv.divisão(-3, -2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 5: Divisão de dois valores com dividendo sendo zero
        div = calcDiv.divisão(0, 2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 6: Divisão de dois valores com divisor sendo zero
        //div = calcDiv.divisão(3, 0);
        //System.out.println(div);
        //Este Cenario retorna o erro esperado de divisão por zero

        //Cenario de teste 7: Divisão de com dividendo sendo zero e divisor negativo
        div = calcDiv.divisão(0, -2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 8: Divisão de com dividendo sendo negativo e divisor zero
        //div = calcDiv.divisão(-3, 0);
        //System.out.println(div);
        //Este Cenario retorna o erro esperado de divisão por zero

        //Cenario de teste 9: Divisão de com ambos sendo zero
        //div = calcDiv.divisão(0, 0);
        //System.out.println(div);
        //Este Cenario retorna o erro esperado de divisão por zero

        //Cenario de teste 10: Divisão de com um dividendo sendo zero negativo
        div = calcDiv.divisão(-0, 2);
        System.out.println(div);
        //Este cenario resulta inteiro esperado

        //Cenario de teste 11: Divisão de com um divisor sendo zero negativo
        //div = calcDiv.divisão(3, -0);
        //System.out.println(div);
        //Este Cenario retorna o erro esperado de divisão por zero

        //Cenario de teste 12: Divisão de com ambos valores sendo zero negativo
        //div = calcDiv.divisão(-0, -0);
        //System.out.println(div);
        //Este Cenario retorna o erro esperado de divisão por zero
    }
}
