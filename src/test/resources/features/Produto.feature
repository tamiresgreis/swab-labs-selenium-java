#language: pt
# charset: UFT -8

  Funcionalidade: Comprar um produto
    Eu como usuario
    Gostaria de logar a Swag Labs
    Adquirir um produto com sucesso


    @wip
    Cenário: Comprar o produto Sauce Labs Backpack
      Dado que eu esteja logado na Swag labs
      Quando eu incluo o produto no carrinho
      E eu efetuo o pagamento
      Então eu irei visualizar a mensagem "Thank you for your order!"