# Api-Rest com Spring-boot
#### Está é uma Api desenvolvida para fazer o CRUD com a entidade Estado. 

**Desenvolvido com:**

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" /> 

**Contato com a desenvolvedora**

<a href="https://github.com/juhwiz/"> <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" /> </a> <a href="https://www.linkedin.com/in/julia-sim%C3%A3o-de-almeida-cruz-1a8a46199/"> <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>

## Configurações

**Banco:** H2

**Porta utilizada:** /8080

**JDK utilizada:** v11

**Framework utilizado:** Spring Boot v2.7.1

## Funcionalidades

**Criar estado:** Post - /api/states

**Listar estados (ordenados por Região, maior população e maior área):** </br>
Get - /api/states?sort=populacao,Desc </br>
Get - /api/states?sort=area,Desc </br>
Get - /api/states?region=NORTE

**Listar estado por id:** Get - /api/states/{id}

**Alterar estado:** Put - /api/states/{id}

**Deletar estado:** Delete - /api/states/{id}

