package Models;

import Models.Interfaces.Divisao;
import Models.Interfaces.Multiplicacao;
import Models.Interfaces.Soma;
import Models.Interfaces.Subtracao;

/**
 * @author YagoHFA
 * @version 1.0
 * @since versao 1.0 da aplicacao
 *
 * Classe abstrata que serve de molde para que a classe calculadora poder ser implementada
 */
public abstract class ICalculadora implements Soma, Subtracao, Divisao, Multiplicacao {

}
