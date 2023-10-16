CREATE DATABASE Jetiva;

USE Jetiva;

CREATE TABLE Usuarios (
    ID_Usuario INT PRIMARY KEY auto_increment,
    Nome_Usuario VARCHAR(40),
    Email_Usuario VARCHAR(80) UNIQUE,
    Senha_Usuario VARCHAR(20)
);

CREATE TABLE Contatos (
    ID_Contato INT PRIMARY KEY auto_increment,
    Nome_Contato VARCHAR(40),
    Email_Contato VARCHAR(80) UNIQUE,
    Telefone_Contato VARCHAR(15),
    CEP_Contato VARCHAR(9),
    Endereco_Contato VARCHAR(100),
    Numero_Contato INT,
    Complemento_Contato VARCHAR(50),
    Bairro_Contato VARCHAR(50),
    Estado_Contato VARCHAR(2),
    Cidade_Contato VARCHAR(50),
    Mensagem_Contato TEXT,
    ID_Usuario INT,
		FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario)
);

CREATE TABLE Reservas (
    ID_Reserva INT PRIMARY KEY auto_increment,
    Origem_Reserva VARCHAR(100),
    Destino_Reserva VARCHAR(100),
    Empresa_Reserva VARCHAR(20),
    Classe_Reserva VARCHAR(20),
    Assento_Reserva VARCHAR(10),
    Preco_Reserva DECIMAL(10,2),
    Codigo_Reserva VARCHAR(20) UNIQUE,
    ID_Usuario INT,
		FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario)
);

CREATE TABLE Compra (
    ID_Compra INT PRIMARY KEY auto_increment,
    Data_Compra DATE,
    Total_Compra DECIMAL(10,2),
    ID_Usuario INT,
		FOREIGN KEY (ID_Usuario) REFERENCES Usuarios(ID_Usuario),
    ID_Reserva INT,
    FOREIGN KEY (ID_Reserva) REFERENCES Reservas(ID_Reserva)
);

CREATE TABLE Passagens (
    ID_Passagem INT PRIMARY KEY auto_increment,
    Empresa_Passagem VARCHAR(50),
    Destino_Passagem VARCHAR(100),
    Data_Ida_Passagem DATE,
    Data_Volta_Passagem DATE,
    Horario_Ida_Passagem TIME,
    Horario_Volta_Passagem TIME,
    Assento_Passagem VARCHAR(10),
    Codigo_Reserva VARCHAR(20) UNIQUE,
    Portao_Embarque_Passagem VARCHAR(10),
    ID_Reserva INT,
    FOREIGN KEY (ID_Reserva) REFERENCES Reservas(ID_Reserva)
);


INSERT INTO Usuarios VALUES 
(default, 'John', 'john@gmail.com', '157'), 
(default, 'Amanda', 'amanda@gmail.com', '354');

INSERT INTO Contatos VALUES 
(default, 'John', 'john@gmail.com', '1234567890', '12345678', 'Rua 1', 10, 'Apto 101', 'Bairro 1', 'SP', 'São Paulo', 'Olá!', 1),
(default, 'Amanda', 'amanda@gmail.com', '0987654321', '87654321', 'Rua 2', 20, 'Apto 202', 'Bairro 2', 'DF', 'Brasília', 'Oi!', 2);

INSERT INTO Reservas VALUES
(default, 'Brasília', 'São Paulo', 'Empresa A', 'Econômica', '17A', 200.00, 'ABC123', 1),
(default, 'São Paulo', 'Brasília','Empresa B', 'Executiva', '5B', 400.00, 'DEF456', 2);

INSERT INTO Compra VALUES
(default, CURDATE(), 200.00, 1, 1),
(default, CURDATE(), 400.00, 2, 2);

INSERT INTO Passagens VALUES
(default, 'Empresa A', 'São Paulo', CURDATE(), DATE_ADD(CURDATE(), INTERVAL 5 DAY), CURTIME(), ADDTIME(CURTIME(), '7:0:0.000000'), '17A', 'ABC123', 'A1', 1),
(default, 'Empresa B', 'Brasília', CURDATE(), DATE_ADD(CURDATE(), INTERVAL 3 DAY), CURTIME(), ADDTIME(CURTIME(), '7:0:0.000000'), '5B', 'DEF456', 'B2', 2);

-- Consultando os Dados
SELECT * FROM Usuarios;
SELECT * FROM Contatos;
SELECT * FROM Reservas;
SELECT * FROM Passagens;
SELECT P.ID_Passagem, R.Origem_Reserva, P.Destino_Passagem, P.Empresa_Passagem, R.Classe_Reserva, P.Assento_Passagem, R.Preco_Reserva, P.Codigo_Reserva, P.Data_Ida_Passagem, P.Data_Volta_Passagem, P.Horario_Ida_Passagem, P.Horario_Volta_Passagem, P.Portao_Embarque_Passagem, (R.Preco_Reserva + 8.53) as Total_Com_Taxa FROM Reservas AS R INNER JOIN Passagens AS P ON R.ID_Reserva = P.ID_Reserva AND R.Assento_Reserva = P.Assento_Passagem AND R.Codigo_Reserva = P.Codigo_Reserva;
SELECT U.ID_Usuario, U.Nome_Usuario, U.Email_Usuario, C.Telefone_Contato, C.CEP_Contato, C.Endereco_Contato, C.Numero_Contato, C.Complemento_Contato, C.Bairro_Contato, C.Estado_Contato, C.Cidade_Contato, C.Mensagem_Contato FROM Usuarios AS U INNER JOIN Contatos AS C ON U.ID_Usuario = C.ID_Contato AND U.Nome_Usuario = C.Nome_Contato AND U.Email_Usuario = C.Email_Contato;

-- Atualizando os Dados
UPDATE Usuarios SET Nome_Usuario = 'João' WHERE ID_Usuario = 1;
UPDATE Usuarios SET Nome_Usuario = 'Fernanda' WHERE ID_Usuario = 2;
UPDATE Contatos SET Telefone_Contato = '9876543210' WHERE ID_Contato = 2;
UPDATE Reservas SET Preco_Reserva = 300.00 WHERE ID_Reserva = 1;
UPDATE Compra SET Total_Compra = 300.00 WHERE ID_Compra = 1;
UPDATE Passagens SET Empresa_Passagem = 'Empresa C' WHERE ID_Passagem = 1;

-- Deletando os Dados
DELETE FROM Compra WHERE ID_Usuario = 2;
DELETE FROM Usuarios WHERE ID_Usuario = 2;
DELETE FROM Contatos WHERE ID_Contato = 2;
DELETE FROM Reservas WHERE ID_Reserva = 2;
DELETE FROM Passagens WHERE ID_Passagem = 2;