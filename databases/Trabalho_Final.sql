DROP DATABASE IF EXISTS buscador_medicamentos;
CREATE DATABASE IF NOT EXISTS buscador_medicamentos;
USE buscador_medicamentos;

CREATE TABLE administradores(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    usuario VARCHAR(255),
    senha VARCHAR(128)
);

CREATE TABLE usuarios(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    usuario VARCHAR(255),
    senha VARCHAR(128)
);

CREATE TABLE paises(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255),
    sigla VARCHAR(2)
   );

CREATE TABLE cidades(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    id_pais INT UNSIGNED NOT NULL, 
    FOREIGN KEY (id_pais) REFERENCES paises(id),
    
	nome VARCHAR(255)
);

CREATE TABLE farmacias(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    id_cidade INT UNSIGNED,
    FOREIGN KEY (id_cidade) REFERENCES cidades(id),
    
    nome VARCHAR(255),
    logradouro TEXT,
	telefone VARCHAR(20),
    site VARCHAR(255)
);

CREATE TABLE medicamentos(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    id_pais INT UNSIGNED,
    FOREIGN KEY (id_pais) REFERENCES paises(id),
    
    nome VARCHAR(255),
    para_que_serve TEXT,
    contraindicacoes TEXT,
    armazenamento TEXT,
    preco FLOAT
);

CREATE TABLE favoritos(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	id_usuario INT UNSIGNED,
    id_medicamento INT UNSIGNED,
    
    FOREIGN KEY (id_medicamento) REFERENCES medicamentos(id),
	FOREIGN KEY (id_usuario) REFERENCES usuarios(id)
);

CREATE TABLE medicamentos_internacionais(
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	id_origem INT UNSIGNED,
    id_destino INT UNSIGNED,
    FOREIGN KEY (id_origem) REFERENCES medicamentos(id),
    FOREIGN KEY (id_destino) REFERENCES medicamentos(id)
);
