# Calculadora Teste

## Descrição
  <p> Este é um projeto de teste de uma calculadora utilizando Junit, realizando diversos testes com os operadores de +, -, / e * com uso de dois números inteiros</p>

## Documentação

<p> Foi realizada a documentação das classes e métodos presentes neste projeto de claculadora</p>

## Interfaces
<p>
    Documentação da Ineterface de divisao:
</p> 
   
    /**
    * @author YagoHFA
    * @version 2.0
    * @since versao 1.0 da aplicacao
    *
    * Interface a ser utilizada para implementar a regra de divisao
    */
    public interface Divisao {
              /**
              * Regra de divisao a ser implementada na calculadora
              *
              * @param a uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
              * @param b uma do tipo variavel inteira para compor a logica de divisao a ser uilizada
              *
              * @return {@code int} o resultado da divisao entre variavel a e b, como sendo do tipo inteiro
              *
              * @throws ArithmeticException lanca excecao, para que divisao por zero possa ser tratada
                */
                public int divisao(int a, int b) throws  ArithmeticException;
            }
<p>
    Documentação da Interface de Multiplicacao
</p>
package Models.Interfaces;

    /**
    * @author YagoHFA
    * @version 2.0
    * @since versao 1.0 da aplicacao
    *
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
<p>
 Documentação da Interface subtracao
</p>

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
<p>
    Documentação da Interface Soma
</p>

    /**
    * @author YagoHFA
    * @version 2.0
    * @since versao 1.0 da aplicacao
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

## Classes
<p>
    Documentação da Classe Abstrata de Calculadora
</p>

    /**
     * @author YagoHFA
     * @version 1.0
     * @since versao 1.0 da aplicacao
     *
     * Classe abstrata que serve de molde para que a classe calculadora poder ser implementada
     */
    public abstract class ICalculadora implements Soma, Subtracao, Divisao, Multiplicacao {
    
    }

<p>
    Documentação da Classe Calculadora
</p>



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

