package Models.Interfaces;

/**
 * @author YagoHFA
 * @version 2.0
 * @since versao 1.0 da aplicacao
 *
 * Interface a ser utilizada para implementar a regra de subtracao
 */
public interface Subtracao {
    /**
     * Regra de subtracao a ser implementada na calculadora
     *
     * @param a uma do tipo variavel inteira para compor a logica de subtracao a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de subtracao a ser uilizada
     *
     * @return {@code int} o resultado da subtracao entre variavel a e b, como sendo do tipo inteiro
     */
    public int sub (int a, int b);
}
