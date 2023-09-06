public class CalcSoma {
    public static void main(String[] args) {

        Calculadora calcSoma = new Calculadora();

        //Cenario de teste 1: Soma de dois valores
        int soma = calcSoma.soma(3,7);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 2: Soma de dois valores um sendo zero
        soma = calcSoma.soma(3, 0);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 3: Soma de dois valores ambos sendo zero
        soma = calcSoma.soma(0, 0);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 4: Soma de dois valores sendo um negativo
        soma = calcSoma.soma(3, -1);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 5: Soma de dois valores ambos sendo negativo
        soma = calcSoma.soma(-3, -1);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 6: Soma de dois com A sendo negativo maior
        soma = calcSoma.soma(-3, 1);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 7: Soma de um valor negativo com zero
        soma = calcSoma.soma(-3, 0);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 8: Soma de um valor negativo com zero, invertendo a ordem
        soma = calcSoma.soma(0, -3);
        System.out.println(soma);
        //Este cenario resulta no resultado esperado


    }
}