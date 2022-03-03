#language:pt
Funcionalidade: Formulario de teste
  Eu como entrevistado
  Quero automatizar o formulario
  Para ser avaliado através da minha automação

  Contexto: 
    Dado que estou na pagina de formulario

  @Formulario
  Esquema do Cenário: Preencher os dados do formulario
    E preencho o campo de nome '<nome>'
    E preencho o campo de email '<email>'
    E seleciono a minha cor favorita '<cor>'
    E seleciono ou digito uma sobremesa '<sobremesa>'
    E seleciono a comida favorita '<comida>'
    E seleciono a nota referente ao meu gosto por animais '<numero>'
    E avalio os esportes
    E montar os lanches com os respectivos ingredientes
    E informar a data de hoje
    Quando informar o horario adicionando uma hora
    Então clico no botao enviar

    Exemplos: 
      | nome             | email                | cor      | sobremesa | numero | comida  |
      | Maria da Silva   | igorctc226@gmail.com | Azul     | Sorvete   |      5 | Carnes  |
      | Joao da Silva    | igorctc226@gmail.com | Vermelho | Bolo      |      8 | Todas   |
      | Pedro da Silva   | igorctc226@gmail.com | Verde    | Fruta     |     10 | Massas  |
      | Matheus da Silva | igorctc226@gmail.com | Azul     | Mamão     |      1 | Legumes |
