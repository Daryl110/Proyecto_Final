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
	numeroJugadores INT,
	fechaJuego DATE,
	PRIMARY KEY(idJuego)	
);
CREATE TABLE tipoPregunta(
	idTipoPregunta INT(11) AUTO_INCREMENT,
	enunciado VARCHAR(45),
	PRIMARY KEY(idTipoPregunta)
);

CREATE TABLE pregunta(
	idPregunta INT(11) AUTO_INCREMENT,
	enunciado VARCHAR(250),
	idTema INT(11),
	idTipoPregunta INT(11),
	PRIMARY KEY (idPregunta),
	FOREIGN KEY (idTema) REFERENCES tema(idTema) ON DELETE CASCADE,
	FOREIGN KEY (idTipoPregunta) REFERENCES tipoPregunta(idTipoPregunta) ON DELETE CASCADE
);

CREATE TABLE opcion(
	idOpcion INT(11) AUTO_INCREMENT,
	enunciado VARCHAR(250),
	correcta INT(11),
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

INSERT INTO tipopregunta VALUES ('1','Unica respuesta');
INSERT INTO tipopregunta VALUES ('2','Multiple respuesta');


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


INSERT INTO tema VALUES('','Ingenieria de software');


/* Preguntas con multiple respuesta y sus opciones*/
INSERT INTO pregunta VALUES('','Los diagramas de caso de uso son:','1','2');
INSERT INTO opcion VALUE('','Describen una interacción típica entre un actor y el sistema.',1,'1');
INSERT INTO opcion VALUE('','Muestra la forma en que los objetos se comunican entre sí al transcurrir el tiempo.',0,'1');
INSERT INTO opcion VALUE('','Permite visualizar las relaciones entre las clases que involucran el sistema.',0,'1');
INSERT INTO opcion VALUE('','representa la forma en como un Cliente (Actor) opera con el sistema en desarrollo, además de la forma, tipo y orden en como los elementos interactúan. ',1,'1');

INSERT INTO pregunta VALUES('','Se utiliza un modelado del sistema con el fin de:','1','2');
INSERT INTO opcion VALUE('','Hacer una representación gráfica del software. ',1,'2');
INSERT INTO opcion VALUE('','Comenzar a desarrollar el software',1,'2');
INSERT INTO opcion VALUE('','Cumplir un proceso de la Ingeniería de Software.',0,'2');
INSERT INTO opcion VALUE('','Mejorar el análisis de los requerimientos',0,'2');

INSERT INTO pregunta VALUES('','Los administradores del proyecto de software se encargan de:','1','2');
INSERT INTO opcion VALUE('','Programar el software con todos sus componentes.',0,'3');
INSERT INTO opcion VALUE('','Dirigir el proceso de desarrollo de software para que se entregue a tiempo y con el presupuesto acordado. ',1,'3');
INSERT INTO opcion VALUE('','Diseñar, programar e implementar el software. ',0,'3');
INSERT INTO opcion VALUE('','abraca la planeación, calendarización, administración de riegos, manejo del personal, estimación de los costos de software y la administración de calidad',1,'3');

INSERT INTO pregunta VALUES('','En un procesador de textos, ¿cuáles de los siguientes serían requerimientos funcionales?','1','2');
INSERT INTO opcion VALUE('','Copiar, pegar.',1,'4');
INSERT INTO opcion VALUE('','Guardar documento.',1,'4');
INSERT INTO opcion VALUE('','Verificar el tipo de archivo.',0,'4');
INSERT INTO opcion VALUE('','Realizar un informe del número de caracteres, palabras, párrafos y páginas que contiene el documento.',0,'4');

INSERT INTO pregunta VALUES('','La creación de prototipos ayuda a:','1','2');
INSERT INTO opcion VALUE('','Diseñar y programar el sistema que se implementará.',0,'5');
INSERT INTO opcion VALUE('','La implementación del sistema y a comprobar su operación.',0,'5');
INSERT INTO opcion VALUE('','Probar las opciones de diseño y entender mejor el problema y su solución. ',1,'5');
INSERT INTO opcion VALUE('','proporcionar una gran cantidad de información sobre la interacción del usuario en varios niveles. ',1,'5');

INSERT INTO pregunta VALUES('','¿En que lenguajes de programación se pueden encontrar excepciones?','1','2');
INSERT INTO opcion VALUE('','Ada',1,'6');
INSERT INTO opcion VALUE('','C++',1,'6');
INSERT INTO opcion VALUE('','Ruby.',1,'6');
INSERT INTO opcion VALUE('','Shell Script.',0,'6');

INSERT INTO pregunta VALUES('','Al estudiar Ingeniería de Software, uno de los objetivos principales de la misma es:','1','2');
INSERT INTO opcion VALUE('','Hacer un sistema de calidad, eficiente y mínimos errores.',1,'7');
INSERT INTO opcion VALUE('','Obtener las mayores ganancias a partir de los sistemas desarrollados.',0,'7');
INSERT INTO opcion VALUE('','Desarrollar e implementar el sistema sin preocuparse del mantenimiento de la misma.',0,'7');
INSERT INTO opcion VALUE('','Dirigir y asesorar a los programadores durante el desarrollo de aplicaciones. ',1,'7');


/* Preguntas con unica respuesta y sus opciones*/
/*Recordar cambiar los numeros*/
INSERT INTO pregunta VALUES('','Para el famoso juego del buscaminas, indique cuáles son los posibles casos de uso:','1','1');
INSERT INTO opcion VALUE('','Iniciar partida, Descubrir una casilla, Marcar una casilla.',1,'8');
INSERT INTO opcion VALUE('','Iniciar partida, Jugar partida, Contar minas.',0,'8');
INSERT INTO opcion VALUE('','Jugador, Minas, Anotaciones',0,'8');
INSERT INTO opcion VALUE('','Ninguna es un caso de uso.',0,'8');

INSERT INTO pregunta VALUES('','¿Cuáles de las siguientes actividades recomienda el enfoque del RUP?','1','1');
INSERT INTO opcion VALUE('','Desarrollo de software iterativamente, gestión de requisitos, usar arquitectura en componentes, software modelado visualmente, verificar calidad y controlar los cambios del software. ',1,'9');
INSERT INTO opcion VALUE('','Especificación, diseño, implementación, validación y evolución del software.',0,'9');
INSERT INTO opcion VALUE('','Análisis y definición de requerimientos, diseño del sistema y software e implementación.',0,'9');
INSERT INTO opcion VALUE('','Todas las anteriores.',0,'9');

INSERT INTO pregunta VALUES('','Se necesita modelar las interacciones entre los actores y los objetos de un sistema. El diagrama recomendado para dicho fin sería:','1','1');
INSERT INTO opcion VALUE('','Diagrama de clases.',0,'10');
INSERT INTO opcion VALUE('','Diagrama de casos de uso.',0,'10');
INSERT INTO opcion VALUE('','Diagrama de secuencia. ',1,'10');
INSERT INTO opcion VALUE('','Diagrama de sentencias.',0,'10');

INSERT INTO pregunta VALUES('','Según Bass y sus colaboradores analizan 3 ventajas de diseñar y documentar de manera explícita la arquitectura de software. ¿Cuáles son estas 3 características?','1','1');
INSERT INTO opcion VALUE('','Comunicación con los participantes, diseño y programación del sistema e implementación del sistema.',0,'11');
INSERT INTO opcion VALUE('','Análisis del sistema, programar de manera eficiente y cumplir con los requerimientos.',0,'11');
INSERT INTO opcion VALUE('','Comunicación con los participantes, análisis del sistema y reutilización a gran escala.',1,'11');
INSERT INTO opcion VALUE('','Análisis de los requerimientos, análisis del software, programar.',0,'11');

INSERT INTO pregunta VALUES('','En Ingeniería de Requerimientos, al momento de identificar los requerimientos se debe tener claro:','1','1');
INSERT INTO opcion VALUE('','De diferenciar si el requerimiento es funcional o no funcional.',0,'12');
INSERT INTO opcion VALUE('','De conocer muy bien las necesidades que tiene el cliente. ',1,'12');
INSERT INTO opcion VALUE('','De determinar cómo aplicar bien las técnicas de recolección de datos, como entrevistas.',0,'12');
INSERT INTO opcion VALUE('','Ninguna de las anteriores',0,'12');

INSERT INTO pregunta VALUES('','La UTPL crea un sistema para albergar los datos de las pruebas de admisiones de los nuevos aspirantes. Como política de la Universidad, el sistema implementara provisiones para la privacidad de los datos de los aspirantes. Este requerimiento no funcional, puede ser clasificado como: ','1','1');
INSERT INTO opcion VALUE('','Requerimiento del producto.',0,'13');
INSERT INTO opcion VALUE('','Requerimiento de la organización.',0,'13');
INSERT INTO opcion VALUE('','Requerimiento externo. ',1,'13');
INSERT INTO opcion VALUE('','Requerimiento esencial.',0,'13');

INSERT INTO pregunta VALUES('','Se diseña una aplicación destina a la venta y reproducción de música por internet. ¿Cuál de los siguientes patrones arquitectónicos se debería implementar para dicha aplicación?','1','1');
INSERT INTO opcion VALUE('','Programación por capas.',0,'14');
INSERT INTO opcion VALUE('','Pipeline.',0,'14');
INSERT INTO opcion VALUE('','Modelo Cliente/Servidor.',1,'14');
INSERT INTO opcion VALUE('','Ninguna de las anteriores.',0,'14');


