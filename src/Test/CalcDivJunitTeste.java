package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Models.Calculadora;

public class CalcDivJunitTeste {

    //Dividindo dois numero com divisor maior
    @Test
    public void DividindoMaoirDivisor(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(3, 4);

        Assertions.assertEquals(0,  div);
    }

    //Dividindo dois numero com dividendo maior
    @Test
    public void DividindoMaiorDividendo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(4, 3);

        Assertions.assertEquals(1,  div);
    }

    //Dividindo dois numeros iguais
    @Test
    public void DividindoNumeroIguais(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(4, 4);

        Assertions.assertEquals(1,  div);

    }

    //Dividindo com um divisor negativo menor que o dividendo
    @Test
    public void DividindoMenorDivisorNegativo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(3, -2);

        Assertions.assertEquals(-1,  div);

    }

    //Dividindo com um divisor negativo maior que o dividendo
    @Test
    public void DividindoMaiorDivisorNegativo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(3, -4);

        Assertions.assertEquals(0,  div);
    }

    //Dividindo com um dividendo negativo menor que o divisor
    @Test
    public void DividindoMenorDividendoNegativo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(-3, 4);

        Assertions.assertEquals(0,  div);
    }

    //Dividindo um dividendo negativo maior que o divisor
    @Test
    public void DividindoMaiorDividendoNegativo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(-5, 4);

        Assertions.assertEquals(-1,  div);
    }

    //Dividindo dois numeros negativos iguais
    @Test
    public void DividindoNegativos(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(-3, -3);

        Assertions.assertEquals(1,  div);
    }

    //Dividindo dois negativos com divisor negativo maior
    @Test
    public void DividindoNegativosComMaiorDivisor(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(-3, -4);

        Assertions.assertEquals(0,  div);
    }

    //Dividindo dois negativos com dividendo sendo maior
    @Test
    public void DividindoNegativosComMaiorDividendo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(-7, -4);

        Assertions.assertEquals(1,  div);
    }

    //Dividindo zero com um número positivo
    @Test
    public void DividindoZeroPositivo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(0, 5);

        Assertions.assertEquals(0, div);
    }

    //Dividindo zero com um número negativo
    @Test
    public void DividindoZeroNegativo(){
        Calculadora calcDiv = new Calculadora();
        int div = calcDiv.divisao(0, -3);

        Assertions.assertEquals(0,  div);

    }

    //Dividindo um número negativo com zero
    @Test
    public void DividindoNegativoZero(){
        Calculadora calcDiv = new Calculadora();

        Assertions.assertThrows(ArithmeticException.class, ()-> calcDiv.divisao(-4, 0));
    }

    //Dividindo um número Positivo com zero
    @Test
    public void DividindoPositivoZero(){
        Calculadora calcDiv = new Calculadora();
        Assertions.assertThrows(ArithmeticException.class, ()-> calcDiv.divisao(4, 0));
    }

    //Dividindo dois numeros sendo zeros
    @Test
    public void DividindoZeros(){
        Calculadora calcDiv = new Calculadora();
        Assertions.assertThrows(ArithmeticException.class, ()-> calcDiv.divisao(0, 0));
    }
}