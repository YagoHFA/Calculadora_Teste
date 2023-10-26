package Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Models.Calculadora;

public class CalcMultJunitTeste {

    //Multiplicando dois numeros positivos
    @Test
    public void MultiplicandoPositivos(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(4, 4);

        Assertions.assertEquals(16, mult);
    }

    //Multiplicando dois numeros com um sendo negativo
    @Test
    public void MultiplicandoPositivoComNegativo(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(4, -4);

        Assertions.assertEquals(-16, mult);
    }

    //Multiplicando dois numeros com um negativo invertendo ordens
    @Test
    public void MultiplicandoNegativoComPositivo(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(-4, 4);

        Assertions.assertEquals(-16, mult);
    }

    //Multiplicando dois numeros negativos
    @Test
    public void MultiplicandoNegativos(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(-4, -4);

        Assertions.assertEquals(16, mult);
    }

    //Multiplicando dois numeros um sendo zero e outro positivo
    @Test
    public void MultiplicandoPositivoComZero(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(4, 0);

        Assertions.assertEquals(0, mult);
    }

    //Multiplicando dois numeros um sendo zero e o outro negativo
    @Test
    public void MultiplicandoNegativoComZero(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(-4, 0);

        Assertions.assertEquals(0, mult);
    }

    //Multiplicando dois numeros sendo zero
    @Test
    public void MultiplicandoZeros(){
        Calculadora calcMult = new Calculadora();
        int mult = calcMult.mult(0, 0);

        Assertions.assertEquals(0, mult);
    }




}
