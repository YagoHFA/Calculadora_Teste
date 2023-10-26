package Models.Interfaces;

/**
 * Interface a ser utilizada para implementar a regra de multiplicacao
 */
public interface Multiplicacao {

    /**
     * Regra de multiplicacao a ser implementada na calculadora
     *
     * @param a uma do tipo variavel inteira para compor a logica de multiplicacao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de multiplicacao a ser uilizada
     *
     * @return {@code int} o resultado da multiplicacao entre variavel a e b, como sendo do tipo inteiro
     */
    public int mult(int a, int b);
}
