<h1 align="center">
<br>
DSMovie
</h1>

<div align="center" >

![Animação](https://user-images.githubusercontent.com/15930456/149685481-f3d5fc8c-2b75-4ee3-b2b3-ceea70c881f0.gif)

## &#128073; [Acessar Aplicação em produção](https://eliseunetto-dsmovie.netlify.app/)

OBS: O backend está hospedado em um servidor gratuíto, portanto, no **1º acesso**, necessário aguardar aproximadamente 20 segundos.

</div>

<hr />

## Projeto

Monorepo, porém o deploy do backend foi feito no Hiroku e o deploy do fontend no Netlify.
O Catálogo de Filmes apresenta uma lista paginada onde o usuário poderá:

- Visualizar os filmes do catálogo
  - Navegar entre as páginas
    - Cada página, trás 12 cards
- Avaliar o Filme:
  - É necessário inserir um e-mail
  - O mesmo usuário **não** pode dar várias notas para o mesmo filme
  - É computado apenas 1 nota por usuário (e-mail)
  - Permitido apenas notas de 1 a 5
  - As estrelas tem preenchimento automático, conforme a média das notas
  - Abaixo das estrelas é exibido a quantidade de avaliações feitas
- Página responsiva, adapta-se a vários tamanhos de telas.

<hr />

## 🚀 Tecnologias

Este projeto foi desenvolvido com as seguintes tecnologias:

- ✔️ Frontent

  - React
  - Router DOM
  - Axios
  - Hooks
    - useState
    - useEffect
    - useParams
    - useNavigate
  - Node
  - Yarn
  - Bootstrap
  - Netlify

- ✔️ Backend
  - Java
  - JPA
  - H2
  - Postgres
  - Spring Security
  - Heroku
