create database TheTrip;

use TheTrip;

CREATE TABLE Clientes(
	Id_Cliente int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Nome_Cliente nvarchar(max) NOT NULL,
	Cidade_Cliente nvarchar(max) NOT NULL,
	Estado_Cliente nvarchar(max) NOT NULL,
	ContatoId_Contato int NULL,
	DestinoId_Destino int NULL, 
	PromocaoId_Promocao int);


CREATE TABLE Contatos(
	Id_Contato int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Email_Contato nvarchar (max) NOT NULL,
	Telefone_Contato nvarchar(max) NOT NULL, );


CREATE TABLE Destinos(
	Id_Destino int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Cidade_Destino nvarchar(max) NOT NULL,
	Estado_Destino nvarchar(max) NOT NULL,)


CREATE TABLE Promocoes(
	Id_Promocao int PRIMARY KEY IDENTITY(1,1) NOT NULL,
	Valor_Promocao float NOT NULL, );
	
	
	alter table Clientes add foreign key (ContatoId_Contato) references Contatos (Id_Contato);
	alter table Clientes add foreign key (DestinoId_Destino) references Destinos (Id_Destino);
	alter table Clientes add foreign key (PromocaoId_Promocao) references Promocoes (Id_Promocao);


SELECT cli.Id_Cliente, cli.Nome_Cliente, cli.Cidade_Cliente, cli.Estado_Cliente,
c.Email_Contato, c.Telefone_Contato, ds.Cidade_Destino, ds.Estado_Destino,
p.Valor_Promocao FROM Clientes as cli
inner join Contatos as c on cli.ContatoId_Contato = c.Id_Contato
inner join Destinos as ds on cli.DestinoId_Destino = ds.Id_Destino
inner join Promocoes as p on cli.PromocaoId_Promocao = p.Id_Promocao