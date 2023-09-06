public class CalcMult {
    public static void main(String[] args) {
        Calculadora calcMult = new Calculadora();

        //Cenario de teste 1: Multiplicação de dois valors positivos
        int mult = calcMult.mult(3, 3);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 2: Multiplicação de dois valors com um valor sendo negativo
        mult = calcMult.mult(3, -3);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 3: Multiplicação de dois valors com dois valores sendo negativo
        mult = calcMult.mult(-3, -3);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 4: Multiplicação de dois valors com um valor sendo zero
        mult = calcMult.mult(3, 0);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 5: Multiplicação de dois valors com um valor sendo zero e um negativo
        mult = calcMult.mult(-3, 0);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado

        //Cenario de teste 6: Multiplicação de dois valors zero
        mult = calcMult.mult(0, 0);
        System.out.println(mult);
        //Este cenario resulta no resultado esperado



        }
}
