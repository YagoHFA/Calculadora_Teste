package Models.Interfaces;

/**
 * @author YagoHFA
 * @version 2.0
 * @since versão 1.0 da aplicação
 *
 * Interface a ser utilizada para implementar a regra de soma
 */
public interface Soma {

    /**
     * Regra de soma a ser implementada na calculadora
     *
     * @param a uma do tipo variavel inteira para compor a logica de soma a ser uilizada
     * @param b uma do tipo variavel inteira para compor a logica de soma a ser uilizada
     *
     * @return {@code int} o resultado da soma entre variavel a e b, como sendo do tipo inteiro
     */
    public int soma(int a, int b);
}
