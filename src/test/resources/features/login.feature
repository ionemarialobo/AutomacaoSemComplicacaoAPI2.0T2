#language:pt

@login
Funcionalidade: Realizar Login
  Testes da API de login

  Cenario: Realizar login com sucesso
    Dado que tenha um payload valido da API de login
    Quando envio uma requisição do tipo POST de login
    Então valido que recebo status 200 no response
    E armazeno o token que recebo do response de login

  Esquema do Cenario: Realizar login com <cenario>
    Dado que tenha um payload da API de login com as seguintes informacoes
      | email | <email> |
      | senha | <senha> |
    Quando envio uma requisição do tipo POST de login
    Então valido que recebo status 400 no response

    Exemplos:
      | cenario          | email              | senha    |
      | usuario invalido | invalido@email.com | 123456   |
      | senha invalida   | aluno@email.com    | invalido |




