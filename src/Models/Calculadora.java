package Models;

/**
 * @author YagoHFA
 * @version 2.0
 * @since versao 1.0 da aplicacao
 *
 *  Classe calculadora onde as regras de operacoes serao implementadas
 */
public class Calculadora extends ICalculadora {


    /**
     *
     * @param a uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
     *
     * @return {@code int} a divisao entre a variavel a e b, como sendo do tipo inteiro
     * @throws ArithmeticException lanca excecao, para que divisao por zero possa ser tratada
     */
    @Override
    public int divisao(int a, int b) throws ArithmeticException{
        try {
            return a / b;
        }
        catch (ArithmeticException e){
            System.out.println("Está é uma divisão por zero");
        }
        return a / b;
    }

    /**
     *
     * @param a uma do tipo variavel inteira para compor a logica de multiplicacao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de multiplicacao a ser uilizada
     *
     * @return {@code int} a multiplicacao entre variavel a e b, como sendo do tipo inteiro
     */
    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    /**
     *
     * @param a uma do tipo variavel inteira para compor a logica de soma a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de soma a ser uilizada
     *
     * @return {@code int} a soma entre a variavel a e b, como sendo do tipo inteiro
     */
    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    /**
     *
     * @param a uma do tipo variavel inteira para compor a logica de subtracao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de subtracao a ser uilizada
     *
     * @return {@code int} a subtracao entre a variavel a e b, como sendo do tipo inteiro
     */
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}
