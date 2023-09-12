import Models.ICalculadora;
import Models.Soma;

public class Calculadora extends ICalculadora {


    @Override
    public int divisão(int a, int b) throws ArithmeticException{
        try {
            return a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Está é uma divisão por zero");
        }
        return a / b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
