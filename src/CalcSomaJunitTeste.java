import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcSomaJunitTeste {

        @SuppressWarnings("Deprecation")

        //Somando dois numeros positivos
        @Test
        public void SomarDoisNumeroPositivos(){
            Calculadora calcSoma = new Calculadora();
            int soma = calcSoma.soma(3, 7);

            Assertions.assertEquals(10, soma);
        }

        //Somando dois numeros um sendo negativo
        @Test
        public void SomarUmNumeroNegativo(){
            Calculadora calcSoma = new Calculadora();
            int soma = calcSoma.soma(3, -2);
            Assertions.assertEquals(1, soma);
        }

        //Somando dois numeros negativos
        @Test
        public void SomarDoisNegativos(){
            Calculadora calcSoma = new Calculadora();
            int soma = calcSoma.soma(-1,-3);
            Assertions.assertEquals(-4, soma);
        }

        //Somando dois numero um sendo zero
        @Test
        public void SomarUmZero(){
            Calculadora calcSoma = new Calculadora();
            int soma = calcSoma.soma(3,0);
            Assertions.assertEquals(3, soma);
        }

    //Somando dois numero sendo zero
    @Test
    public void SomarZero(){
        Calculadora calcSoma = new Calculadora();
        int soma = calcSoma.soma(0,0);
        Assertions.assertEquals(0, soma);
    }

    //Somando dois numero um sendo zero e outro sendo negativo
    @Test
    public void SomarUmZeroComNegativo(){
        Calculadora calcSoma = new Calculadora();
        int soma = calcSoma.soma(-3,0);
        Assertions.assertEquals(-3, soma);
    }

    //Somando dois numero com negativo maior
    @Test
    public void SomarMaiorNegativo(){
        Calculadora calcSoma = new Calculadora();
        int soma = calcSoma.soma(-7,5);
        Assertions.assertEquals(-2, soma);
    }
}
