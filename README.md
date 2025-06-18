# Java Course Enrollment with Sets

Este é um pequeno programa em Java que demonstra o uso de coleções do tipo `Set` para armazenar e comparar matrículas 
de estudantes em diferentes cursos. Ele calcula o total de alunos únicos e identifica aqueles que estão matriculados 
em mais de um curso.

## 📋 Funcionalidades

- Receber os IDs dos alunos matriculados nos cursos A, B e C.
- Calcular a quantidade total de alunos distintos.
- Detectar e exibir os alunos que estão matriculados em mais de um curso.

  
## 🧾 Exemplo de Execução

```text
How many students for course A? 3
Enter the ID's:
101
102
103
How many students for course B? 2
Enter the ID's:
102
104
How many students for course C? 3
Enter the ID's:
105
106
101

Total students: 6
Student IDs: [101, 102, 103, 104, 105, 106]
Repeated student IDs (enrolled in more than one course): [101, 102]

🧠 Lógica do Programa

    Utiliza HashSet<Integer> para armazenar os IDs dos alunos, garantindo unicidade automaticamente.

    Usa addAll() para unir os conjuntos dos cursos A, B e C e contar o total de alunos distintos.

    Compara os conjuntos para identificar IDs repetidos (alunos em mais de um curso).

🛠️ Como Executar

    Clone o repositório:

git clone https://github.com/seu-usuario/nome-do-repositorio.git

Compile:

javac app/Program.java

Execute:

    java app.Program

📁 Estrutura

src/
└── app/
    └── Program.java

📚 Conceitos Envolvidos

    Set e HashSet em Java

    Operações de união de conjuntos

    Comparações de conjuntos para identificar duplicatas

    Entrada de dados com Scanner

👩‍💻 Autora

Daniela Alineri
Projeto criado para praticar operações com coleções (Set) em Java.

- 
