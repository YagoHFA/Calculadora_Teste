# Calculadora_Teste

## Descrição
  <p> Este é um projeto de teste de uma calculadora utilizando Junit, realizando diversos testes com os operadores de +, -, / e * com uso de dois números inteiros</p>

## Operações

<img src="img/Calculadora.PNG">

  <p>
      A soma é realizada com dois númerros inetiros sendo a e b os parâmetros, o número a esquerda(a) sempre será somado com o número a direita(b)
      ou seja a regra de sinais será dependente do valor de b sendo negativo ou positivo;
  </p>

   <p>
      A subtração também é relizada com dois números inteiros, a e b, onde o número a esquerda(a) será subtraido pelo número a direita(b) a regra de sinais será dita 
      pela variavel b; 
   </p>

   <p>
     A divisão é realiza por dois números inteiros, ou seja seus resultados não podem ser 'Quebrados'(número real), sendo apenas resultados inteiros, o cálculo é feito com
     dois parâmetros a e b, onde a será o dividendo e o b o divisor, ambas as variaveis podem influenciar a regras de siansi matematicos;
   </p>

   <p>
     A multiplicação é realizada com dois números inteiros onde número a é multiplicado por número b e retorna o resultado da multiplicação, ambos on números podem influenciar a regra de sinais matematicos.
   </p>

## Testes
### Soma:
Teste 1:
<img src="img/SomaTeste1.PNG">
<p> 
    Este é um teste realizando a soma de dois números inteiros positivos, 
    3 e 7 com o resultado esperado sendo 10
</p>
Resultado:
<img src="img/SomaResult1.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado 10 esperado 
</p>
Teste 2:
<img src="img/SomaTeste2.PNG">
<p> 
    Este é um teste realizando a soma de dois números inteiros,
    um sendo positivo 3 e um negativo -1 com o resultado esperado sendo 1
</p>
Resultado:
<img src="img/SomaResult2.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado 1 esperado 
</p>


### Divisão:
Teste 1:
<img src="img/DivTeste1.PNG">
<p> 
    Este é um teste realizando a divião de dois números inteiros positivos iguais, 
    o resultado esperado será 1
</p>
Resultado:
<img src="img/DivResult1.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado 1 esperado 
</p>
Teste 2:
<img src="img/DivTeste2.PNG">
<p> 
    Este é um teste realizando a divisão de um número negativo(dividendo) -4 com 0 sendo o divisor,
    este teste visa testar se o o método é capaz de detectar o erro divisão por zero e trata-lo
</p>
Resultado:
<img src="img/DivResult2.PNG">
<p> 
    Este é a saída da execução do teste, o teste foi capaz de identificar uma Exception sendo lançada, 
    que tem o objetivo de evitar que o erro divisão por zero seja exibido ao usuario
</p>

### Multiplicação:
Teste 1:
<img src="img/MultTeste1.PNG">
<p> 
    Este é um teste realizadn o a  multiplicação de dois número coum um sendo zero e o outro um número 
    negativo, sendo -4 o número usado e como resultado esperado 0
</p>
Resultado:
<img src="img/MultResult1.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado 0 esperado 
</p>
Teste 2:
<img src="img/MultTeste2.PNG">
<p>
    Este é um teste de multiplicação com dois números positivos, 
    sendo eles ambos 4 o resultado espereado dessa operação é 16
</p>
Resultado:
<img src="img/MultResult2.PNG">
<p> 
    Esta é a saida da execução do teste, dizendo que o teste teve um resultado positivo com 16 sendo devolvido
</p>

### Subtração:
Teste 1:
<img src="img/SubTeste1.PNG">
<p> 
    Este é um teste de subtração com dois números positivos onde o Minuendo sendo omaior núemro da expessão, com 7 e 2
    o resultado esperado é 5
</p>
Resultado:
<img src="img/SubResult1.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado 5 esperado 
</p>
Teste 2:
<img src="img/SubTeste2.PNG">
<p> 
    Este é um teste de subtração com dois números positivos, onde o Subtraendo é o maior número da expressão, 
    com 2 e 7 o resultado esperado é -5
</p>
Resultado:
<img src="img/SubResult2.PNG">
<p> 
    Este é a saída da execução do teste, afirmando positivo para o resultado -5 esperado
</p>
