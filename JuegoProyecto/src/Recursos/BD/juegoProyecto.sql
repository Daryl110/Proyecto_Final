DROP DATABASE IF EXISTS juego; 

CREATE DATABASE juego; 

USE juego;

CREATE TABLE preguntaUsuario(
	idPregunta INT AUTO_INCREMENT,
	enunciado VARCHAR (100),
	PRIMARY KEY (idPregunta)	
);


CREATE TABLE usuario (
	cedula INT(11),
	nombre VARCHAR(45),
	nombreUsu VARCHAR(45),
	contrasena VARCHAR(45),
	correo VARCHAR(45),
	telefono VARCHAR(45),
	semestre INT(11),
	pregunta INT(11),
	respuesta VARCHAR(50),
	PRIMARY KEY (cedula),
	FOREIGN KEY (pregunta) REFERENCES preguntaUsuario(idPregunta) ON DELETE CASCADE
	
);

CREATE TABLE Historial (
	idHistorial INT AUTO_INCREMENT,
	cedula INT(11),
	nombreUsu VARCHAR(45),
	contrasena VARCHAR(45),
	fechaConexion DATE,
	recordar BOOLEAN,
	PRIMARY KEY (idHistorial),
	FOREIGN KEY (cedula) REFERENCES usuario(cedula) ON DELETE CASCADE

);

CREATE TABLE tema (
	idTema INT(11) AUTO_INCREMENT,
	nombre VARCHAR(45),
	PRIMARY KEY(idTema)
);

CREATE TABLE juego(
	idJuego INT(11) AUTO_INCREMENT,
	fechaJuego DATE,
	PRIMARY KEY(idJuego)	
);

CREATE TABLE pregunta(
	idPregunta INT(11) AUTO_INCREMENT,
	enunciado VARCHAR(250),
	idTema INT(11),
	PRIMARY KEY (idPregunta),
	FOREIGN KEY (idTema) REFERENCES tema(idTema) ON DELETE CASCADE
);

CREATE TABLE opcion(
	idOpcion INT(11) AUTO_INCREMENT,
	enunciado VARCHAR(250),
	correcta BOOLEAN,
	idPregunta INT,
	PRIMARY KEY (idOpcion),
	FOREIGN KEY (idPregunta) REFERENCES pregunta(idPregunta) ON DELETE CASCADE
);

CREATE TABLE pregunta_juego(
	idPregunta_juego INT (11)AUTO_INCREMENT,
	idPregunta INT,
	idJuego INT,
	PRIMARY KEY (idPregunta_juego),
	FOREIGN KEY (idPregunta) REFERENCES pregunta(idPregunta) ON DELETE CASCADE,
	FOREIGN KEY (idJuego) REFERENCES juego(idJuego) ON DELETE CASCADE
);

CREATE TABLE resultado (
	idResultado INT (11)AUTO_INCREMENT,
	puntaje DOUBLE,
	cedula INT,
	idJuego INT,
	PRIMARY KEY(idResultado),
	FOREIGN KEY (cedula) REFERENCES  usuario(cedula) ON DELETE CASCADE,
	FOREIGN KEY (idJuego) REFERENCES juego(idJuego) ON DELETE CASCADE	
);

CREATE TABLE resultado_opcion(
	idResultadoOPcion INT(11) AUTO_INCREMENT,
	idResultado INT,
	idOpcion INT,
	PRIMARY KEY(idResultadoOPcion),
	FOREIGN KEY (idResultado) REFERENCES resultado(idResultado) ON DELETE CASCADE,
	FOREIGN KEY (idOpcion) REFERENCES opcion(idOpcion) ON DELETE CASCADE
);



INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su primera mascota?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su de abuela materna?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre del barrio de su infancia?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su mejor amigo?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su primer amor?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su profesor(a) de la primaria?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el nombre de su personaje favorito de un juego,comic o serie?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual fue el nombre de su amigo imaginario?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es el animal favorito de su papa?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es su color favorito?');
INSERT INTO preguntaUsuario VALUES ('','¿Cual es tu comida favorita?');