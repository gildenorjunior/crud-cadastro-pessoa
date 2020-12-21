# CRUD para cadastro de pessoa

API REST utilizando Spring Boot, JPA, MYSQL, Maven e Swagger

CRUD para cadastro de pessoas com 4 classes modeladoras PessoaModel, EnderecoModel, TelefoneModel e DependenteModel. Por consequente também temos os controladores de cada entidade onde estão os métodos CRUD e os Repository's de cada um também.

Configuração do banco de dados localizado no application properties onde está configurado para rodar no localhost.

Foi utilizado o Swagger para fazer os testes de métodos da api http://localhost:8080/swagger-ui.html#/

Cada Pessoa tem um id que é incrementado e criado automaticamente assim como também Dependente, Telefone e Endereco. Para realizar os métodos PUT e DELETE é necessário passar esse ID.

Por enquanto ainda sem muitas validações, porém seram implementadas. 
