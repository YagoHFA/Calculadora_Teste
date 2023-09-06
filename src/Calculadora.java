import Models.ICalculadora;
import Models.Soma;

public class Calculadora extends ICalculadora {


    @Override
    public int divisão(int a, int b) {
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
