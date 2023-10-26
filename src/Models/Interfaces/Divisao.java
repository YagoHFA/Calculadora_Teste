package Models.Interfaces;

/**
 * Interface a ser utilizada para implementar a regra de divisao
 */
public interface Divisao {
    /**
     * Regra de divisao a ser implementada na calculadora
     *
     * @param a uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
     *
     * @return {@code int} o resultado da divisao entre variavél a e b, como sendo do tipo inteiro
     *
     * @throws ArithmeticException lanca excecao, para que divisão por zero possa ser tratada
     */
    public int divisao(int a, int b) throws  ArithmeticException;
}