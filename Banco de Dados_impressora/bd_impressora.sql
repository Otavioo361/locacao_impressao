
CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    idade INT,
    sexo ENUM('Masculino', 'Feminino', 'Outro'),
    cpf VARCHAR(14) UNIQUE NOT NULL,
    cargo VARCHAR(255),
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

INSERT INTO cliente (nome, idade, sexo, cpf, senha, email)
VALUES ('Jonathas', 26, 'Masculino', '123.456.789-00', 'senha123', 'jonathas@email.com');

INSERT INTO cliente (nome, idade, sexo, cpf, senha, email)
VALUES ('Otavio', 23, 'Masculino', '987.654.321-00', 'senha456', 'otavio@email.com');

SELECT * FROM cliente;

CREATE TABLE funcionario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    sexo ENUM('Masculino', 'Feminino', 'Outro'),
    idade INT,
    cargo VARCHAR(255),
    cpf VARCHAR(14) UNIQUE NOT NULL,
    salario DECIMAL(10, 2)
);

INSERT INTO funcionario (nome, sexo, idade, cargo, cpf, salario)
VALUES ('Jose', 'Masculino', 30, 'Gerente de Vendas', '123.456.789-00', 4500.00);

INSERT INTO funcionario (nome, sexo, idade, cargo, cpf, salario)
VALUES ('João', 'Masculino', 25, 'Desenvolvedor', '987.654.321-00', 3500.00);

SELECT * FROM funcionario;
