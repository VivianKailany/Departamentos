# Projeto de Gerenciamento de Departamentos e Usuários

Este repositório contém uma aplicação desenvolvida com Spring Boot destinada ao gerenciamento de departamentos e seus respectivos usuários. A aplicação possibilita a realização de operações de criação, leitura, atualização e exclusão (CRUD) tanto para departamentos quanto para usuários, além de permitir a associação de usuários a departamentos específicos.

# Funcionalidades
 - CRUD de Departamentos
 - CRUD de Usuários
 - Associação de Usuários a Departamentos

# Tecnologias Utilizadas
 - Java 17
 - Spring Boot 3.3.1
 - Spring Data JPA
 - H2 Database (ambiente de desenvolvimento e testes)
 - Maven

# Requisitos
  - JDK 17 ou superior
  - Maven 3.6 ou superior

# Configuração do Projeto
 - Clonando o Repositório
 
  - git clone:https://github.com/VivianKailany/Departamentos.git
  - cd Departamentos


# Configuração do Banco de Dados
O projeto está configurado para utilizar o banco de dados H2 em memória por padrão. Caso deseje utilizar outro banco de dados, ajuste as configurações no arquivo src/main/resources/application.properties.

# Construção e Execução da Aplicação
Para construir o projeto, utilize o Maven:

- mvn clean install
Para executar a aplicação:

 - mvn spring-boot:run

A aplicação estará disponível no endereço http://localhost:8080.

# Endpoints da API
##  Departamentos
- GET : Lista todos os Usuários e seus departamentos
- GET {id}: Retorna um Usuários específico com o seu departamento
- POST : Cria um novo Usuários com departamento
- PUT /{id}: Atualiza um departamentos existente do usuario escolhido
- DELETE {id}: Exclui um Usuário
