# apirestopovo
Demonstrativo de Api Rest com Spring Boot 


INSTRUÇÕES:

- Fazer o download do projeto, e importar, foi utilizado o Spring Tool Suite Version: 3.9.8.RELEASE
 com Java SDK 1.8
 
- Banco de Dados Mysql versão 5.5

- Criar nova database : dbnoticia e configurar as variaveis de conexao em application.properties para 
sua máquina local

- Caso queira que a aplicação crie a tabela necessária, rodar a class ApiwebApplication e alterar
em application.properties : spring.jpa.hibernate.ddl-auto = create

- Se preferir gerar a tabela o arquivo com dados está em src : tb_noticia.sql e comentar
spring.jpa.hibernate.ddl-auto = update ( caso contrário a aplicacao irá deletar os dados )

- Uma vez os dados e tabelas criados rodar a applicacão como Spring Boot app , 
via Postman , os endpoints são:

OBS > FOI UTITILIZADO A APP SWAGGER para facilitar as respostas em JSON, caso queira acessar, por na url:
http://localhost:8080/swagger-ui.htm uma vez que a aplicação tenha startado. os métodos estão descritos

---------------------------------------------------------------------------------------
GET - Retorna todas as notícias cadastradas.
http://localhost:8080/api/noticias 


GET BY ID
http://localhost:8080/api/noticia/2


POST: Gera uma nova notícia no banco
http://localhost:8080/api/noticia , formato de exemplo :
{
        "titulo": "Ações solidárias incentivam o Dia Internacional do Voluntário, comemorado hoje; saiba como ajudar",
        "autor": "Pedro",
        "corpoNoticia": "Nesta quinta-feira, 5 de dezembro, comemora-se o Dia 			Internacional do Voluntário."
}



PUT : Altera uma notícia no banco  , formato de exemplo :
{
        "id": 3,
        "titulo": "Cesta básica sobe em nove capitais em novembro, diz Dieese",
        "autor": "Ellen",
        "corpoNoticia": "O preço da cesta básica em novembro subiu em nove das 16 capitais pesquisadas pelo 		Departamento Intersindical de Estatística e Estudos Socioeconômicos (Diesse)."
}


DELETE : Apaga uma notícia no banco, formato de exemplo :

{
        "id": 3,
        "titulo": "Cesta básica sobe em nove capitais em novembro, diz Dieese",
        "autor": "Ellen",
        "corpoNoticia": "O preço da cesta básica em novembro subiu em nove das 16 capitais pesquisadas pelo 		Departamento Intersindical de Estatística e Estudos Socioeconômicos (Diesse)."
}





