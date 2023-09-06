public class CalcSub {
    public static void main(String[] args) {
        Calculadora calcSub = new Calculadora();

        //Cenario de teste 1: Subtraindo dois valores positivos
        int sub = calcSub.sub(3, 3);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 2: Subtraindo dois valores com um sendo zero
        sub = calcSub.sub(0, 3);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 3: Subtraindo dois valores com um sendo zero, invetendo a ordem
        sub = calcSub.sub(3, 0);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 4 : Subtraindo dois valores com um sendo zero e um negativo
        sub = calcSub.sub(0, -3);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 5 : Subtraindo dois valores com um sendo zero e um negativo, invertendo a ordem
        sub = calcSub.sub(-3, 0);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 6 : Subtraindo dois valores com um sendo zero negativo
        sub = calcSub.sub(-0, 3);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 7 : Subtraindo dois valores dois negativos com um sendo zero
        sub = calcSub.sub(-0, -3);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 7 : Subtraindo dois valores dois negativos com um sendo zero, invertendo a ordem
        sub = calcSub.sub(-3, -0);
        System.out.println(sub);
        //Este cenario resulta no resultado esperado
    }
}
