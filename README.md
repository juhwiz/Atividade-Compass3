# Atividade-Compass3
#### Está é uma API para a adicionar os Estados. 

[![iuricode](https://github-readme-stats.vercel.app/api/top-langs/?username=iuricode&hide=html&layout=compact=true&theme=default)](https://github.com/anuraghazra/github-readme-stats)

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

