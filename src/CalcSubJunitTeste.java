import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcSubJunitTeste {

    //Subtraindo dois números positivos com minuendo maior
    @Test
    public void SubtraindoMaiorMinuendo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(7, 2);

        Assertions.assertEquals(5,sub);
    }

    //Subtraindo dois números positivos com subtraendo maior
    @Test
    public void SubtraindoMaiorSubtraendo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(2, 7);

        Assertions.assertEquals(-5,sub);
    }

    //Subtraindo dois números com minuendo maior negativo
    @Test
    public void SubtraindoMaiorMinuendoNegativo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(-7, 2);

        Assertions.assertEquals(-9,sub);
    }

    //Subtraindo dois números com subtraendo maior
    @Test
    public void SubtraindoMaiorSubtraendoNegativo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(2, -7);

        Assertions.assertEquals(9,sub);
    }

    //Subtraindo dois numero com minuendo sendo zero
    @Test
    public void SubtraindoZeroMinuendo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(0, 7);

        Assertions.assertEquals(-7,sub);
    }

    //Subtraindo dois numero com subtraendo sendo zero
    @Test
    public void SubtraindoZeroSubtraendo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(7, 0);

        Assertions.assertEquals(7,sub);
    }

    //Subtraindo dois numero com minuendo sendo zero e subtraendo negativo
    @Test
    public void SubtraindoZeroSubtraindoNegativo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(0, -7);

        Assertions.assertEquals(7,sub);
    }

    //Subtraindo dois numero com subtraendo sendo zero e minueno negativo
    @Test
    public void SubtraindoZeroMinuendoNegativo(){
        Calculadora calcSub = new Calculadora();
        int sub = calcSub.sub(-7, 0);

        Assertions.assertEquals(-7,sub);
    }
}
