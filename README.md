[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)


1 - É uma boa prática, pois ajuda na manutenção e melhora a segurança do código, evitando que ele seja modificado sem limitações, o que pode causar falhas, bugs e mau funcionamento do sistema. Por exemplo, em um sistema que gerencia notas de alunos, se for utilizado um atributo público, qualquer valor pode ser atribuído à nota do aluno até mesmo valores negativos ou acima do limite permitido.
Já utilizando getters e setters, podemos controlar esses aspectos e garantir a integridade dos dados.

2- a) Título; Autor; Código do livro; Editora; Gênero; Disponibilidade (atributo booleano); Quantidade de exemplares do livro.

b) Porque a classe Livro representa, de forma geral e simplificada, as características de todos os livros de uma biblioteca, transformando essas características e detalhes em atributos e métodos que podem ser manipulados pelo sistema.

c) 
emprestar() //altera o status do livro para emprestado;
devolver() // registra a devolução e muda o status de disponivel;
exibirInformacoes() // para exibir as informações geral do livro ao usuário.
