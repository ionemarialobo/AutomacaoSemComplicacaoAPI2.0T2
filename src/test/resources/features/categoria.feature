#language:pt

  @categoria
  Funcionalidade: Consulta Categoria

    Cenario: Realizar Consulta com Sucesso
      Dado que tenha realizado o login com dados validos
      E que tenha um payload valido da API de Categoria
      Quando realizo uma requisição do tipo GET da Categoria
      Entao valido que recebo status 200 no response
      E valido que no campo "tipo[2]" possui o valor "Terror"

    Cenario: Realizar Consulta Categoria sem o token
      Quando realizo uma requisição do tipo GET da Categoria
      Entao valido que recebo status 403 no response
      E valido que no campo "message" possui o valor "Access Denied"

    Cenario: Realizar Consulta com token invalido
      Quando altero o campo "Authorization" do header de categorias com o valor "invalido"
      E realizo uma requisição do tipo GET da Categoria
      Entao valido que recebo status 403 no response
      E valido que no campo "message" possui o valor "Access Denied"