-- Criar o banco de dados
CREATE DATABASE IF NOT EXISTS  usuariosdb;

-- Usar o banco de dados
USE usuariosdb;

-- Criar a tabela de usuários
CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);

-- Inserir dados de exemplo
INSERT INTO usuarios (nome, email) VALUES 
('João Silva', 'joao@example.com'),
('Maria Oliveira', 'maria@example.com'),
('Carlos Souza', 'carlos@example.com');
