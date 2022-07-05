
@Netshoes
Feature: compra no site Netshoes

		Background: Abrir site
		Given "https://www.netshoes.com.br/" e aberto

  @Netshoes_Compra
  Scenario: Acessar site
  		And abra todas as categorias, click em Tenis a aba masculina
			And escolha tamanho "<tamanho>", marca do tenis "<marca>" e ordena por maior preco
			When o site apresenta os tenis, ele pode escolher o tenis desejado
			And escolha o tamanho, consulte o prazo de entrega "<entrega>"
			Then podera continuar com o processo de compra e finaliza-lo

 

    Examples: 
	  	| tamanho |     41    |
	  	|  marca  |   Adidas  |
	  	| entrega | 08253-520 |