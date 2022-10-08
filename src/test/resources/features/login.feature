#language:pt

  Funcionalidade: Realizar Login
    Testes da API de login

  Cenario: Realizar login com sucesso
    Dado que tenha um payload valido da API de login
    Quando envio uma requisição do tipo POST de login
    Então valido que recebo status 200 no response
    E armazeno o token que recebo do response de login

  Cenario: Realizar login com usuario invalido
    Dado que tenha um payload da API de login com as seguintes informacoes
      | email | invalido@email.com |
      | senha | 123456             |
    Quando envio uma requisição do tipo POST de login
    Então valido que recebo status 400 no response




