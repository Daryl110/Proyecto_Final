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
	nombreJuego VARCHAR(45),
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

CREATE TABLE resultado(
	idResultado INT (11)AUTO_INCREMENT,
	idPregunta INT,
	puntaje INT,
	idJuego INT,
	cedula INT,
	PRIMARY KEY (idResultado),
	FOREIGN KEY (idPregunta) REFERENCES pregunta(idPregunta) ON DELETE CASCADE,
	FOREIGN KEY (idJuego) REFERENCES juego(idJuego) ON DELETE CASCADE,
	FOREIGN KEY (cedula) REFERENCES  usuario(cedula) ON DELETE CASCADE
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

INSERT INTO pregunta VALUES('','Un ingeniero en desarrollo de software no debe preocuparse por temas técnicos sino también de:','1','2');
INSERT INTO opcion VALUE('','El estudio de otras ciencias que faciliten el desarrollo de un software.',0,'8');
INSERT INTO opcion VALUE('',' La parte ética en donde se desenvuelve. ',1,'8');
INSERT INTO opcion VALUE('','En aprender cómo mejorar los sistemas.',0,'8');
INSERT INTO opcion VALUE('','Los problemas familiares de los empleados.',1,'8');

INSERT INTO pregunta VALUES('','Al momento de crear un software, al no tener claro los requerimientos se corre el riesgo de:','1','2');
INSERT INTO opcion VALUE('','Perder tiempo y dinero en el desarrollo del software.',0,'9');
INSERT INTO opcion VALUE('','Dar una mala reputación de la empresa',0,'9');
INSERT INTO opcion VALUE('','De no desarrollar un buen sistema para el cliente. ',1,'9');
INSERT INTO opcion VALUE('','De no cumplir con las expectativas del proyecto. ',1,'9');

INSERT INTO pregunta VALUES('','Para un caso de estudio en donde se busque simular el comportamiento de un cajero automático, cuáles de los siguientes serían casos de uso:','1','2');
INSERT INTO opcion VALUE('','Revisar saldo.',1,'10');
INSERT INTO opcion VALUE('','Realizar depósito.',1,'10');
INSERT INTO opcion VALUE('','Realizar retiro. ',1,'10');
INSERT INTO opcion VALUE('','Desplegar información del sistema',0,'10');

INSERT INTO pregunta VALUES('','A un patrón arquitectónico se lo puede considerar como:','1','2');
INSERT INTO opcion VALUE('','Un elemento fundamental del diseño arquitectónico..',0,'11');
INSERT INTO opcion VALUE('','Una descripción abstracta del sistema que fue probado con diferentes sistemas y entornos. ',1,'11');
INSERT INTO opcion VALUE('',' Una parte de la arquitectura de aplicaciones.',0,'11');
INSERT INTO opcion VALUE('','soluciones a problemas de arquitectura de software.',1,'11');

INSERT INTO pregunta VALUES('','Para un juego de motocicletas, ¿Cuáles de los siguientes literales pueden ser considerados como clases?','1','2');
INSERT INTO opcion VALUE('','nombre del jugador.',0,'12');
INSERT INTO opcion VALUE('','Jugador.',1,'12');
INSERT INTO opcion VALUE('','Motocicleta.',1,'12');
INSERT INTO opcion VALUE('','Carrera.',1,'12');

INSERT INTO pregunta VALUES('','En los siguientes literales: ¿Cuáles pueden ser actores en un sistema de servicio de chat online para el balcón de servicios de la UTPL?','1','2');
INSERT INTO opcion VALUE('','Usuario/Estudiante. ',1,'13');
INSERT INTO opcion VALUE('','Secretaria. ',1,'13');
INSERT INTO opcion VALUE('','Profesores',0,'13');
INSERT INTO opcion VALUE('','Bases de datos',0,'13');

INSERT INTO pregunta VALUES('','La programación extrema consiste en:','1','2');
INSERT INTO opcion VALUE('','Métodos con la función de maximizar los riesgos desarrollando software en lapsos de plazos largos.',0,'14');
INSERT INTO opcion VALUE('','Un método ágil en donde los requerimientos se expresan como escenarios.',1,'14');
INSERT INTO opcion VALUE('','Métodos que permiten invertir más tiempo en diseñar el sistema.',0,'14');
INSERT INTO opcion VALUE('','Da prioridad a los trabajos que dan un resultado directo y en los cuales se reduce la burocracia que pueda existir en el entorno de trabajo.',1,'14');

INSERT INTO pregunta VALUES('','En el diseño de un sistema telefónico celular, ¿Cuál de los siguientes corresponde a un requerimiento funcional?','1','2');
INSERT INTO opcion VALUE('','Enviar emoticones en un SMS.',0,'15');
INSERT INTO opcion VALUE('','La definición del número de caracteres de un mensaje.',0,'15');
INSERT INTO opcion VALUE('','Recibir llamadas. ',1,'15');
INSERT INTO opcion VALUE('','Contestar llamadas',1,'15');

INSERT INTO pregunta VALUES('','Entre las cualidades más relevantes para un producto de software que provee funcionalidad a un teléfono celular están:','1','2');
INSERT INTO opcion VALUE('','amigabilidad de la interfaz de usuario ',1,'16');
INSERT INTO opcion VALUE('','eficiencia en consumo de recursos ',1,'16');
INSERT INTO opcion VALUE('','visibilidad del proceso de construcción',0,'16');
INSERT INTO opcion VALUE('','tiempos de respuesta',1,'16');

INSERT INTO pregunta VALUES('','¿Cuáles son las actividades fundamentales que cumple la ingeniería de software para desarrollar un software?','1','2');
INSERT INTO opcion VALUE('','Especificación del software ',1,'17');
INSERT INTO opcion VALUE('','diseño e implementación del software ',1,'17');
INSERT INTO opcion VALUE('','validación del software ',1,'17');
INSERT INTO opcion VALUE('','Integrar a los compañeros de trabajo',0,'17');

INSERT INTO pregunta VALUES('','Los requisitos del sistema de software se clasifican como','1','2');
INSERT INTO opcion VALUE('','Requerimientos funcionales ',1,'18');
INSERT INTO opcion VALUE('','Requerimientos no funcionales',1,'18');
INSERT INTO opcion VALUE('','Requerimientos del producto',0,'18');
INSERT INTO opcion VALUE('','Requerimientos proporcionados por el cliente',0,'18');

INSERT INTO pregunta VALUES('','¿Qué ofrece el método Scrum para mejorar el diseño?','1','2');
INSERT INTO opcion VALUE('','Marco de referencia para mejorar la documentación',0,'19');
INSERT INTO opcion VALUE('','Planeación en mejorar el trabajo',0,'19');
INSERT INTO opcion VALUE('','Marco de referencia para la administración del proyecto ',1,'19');
INSERT INTO opcion VALUE('','secuencias para cada una de las etapas en las que se dividen los proyectos. ',1,'19');

INSERT INTO pregunta VALUES('','¿Cuáles son las 3 características de documentar de manera explícita la arquitectura de software?','1','2');
INSERT INTO opcion VALUE('','Comunicación con los participantes',1,'20');
INSERT INTO opcion VALUE('','análisis del sistema. ',1,'20');
INSERT INTO opcion VALUE('','reutilización a gran escala.',1,'20');
INSERT INTO opcion VALUE('','cumplir con los requerimientos.',0,'20');

INSERT INTO pregunta VALUES('','Identifique los principales beneficios que nos puede ofrecer UML:','1','2');
INSERT INTO opcion VALUE('','Modelar Sistemas. ',1,'21');
INSERT INTO opcion VALUE('','Procesos de Desarrollo ',0,'21');
INSERT INTO opcion VALUE('','Secuencia de actividades del sistema',0,'21');
INSERT INTO opcion VALUE('','Establecer conceptos y artefactos ejecutables.',1,'21');

INSERT INTO pregunta VALUES('','La ingeniería de software se encarga de:','1','2');
INSERT INTO opcion VALUE('','Especificación del software',1,'22');
INSERT INTO opcion VALUE('','desarrollo del software ',1,'22');
INSERT INTO opcion VALUE('','validación  del software ',1,'22');
INSERT INTO opcion VALUE('','vigilancia del software',0,'22');

INSERT INTO pregunta VALUES('','Para el diseño y documentación de un sistema, por lo general se necesita presentar vistas arquitectónicas fundamentales tales como:','1','2');
INSERT INTO opcion VALUE('','Vista lógica. ',1,'23');
INSERT INTO opcion VALUE('','Proceso.',1,'23');
INSERT INTO opcion VALUE('','Desarrollo.',1,'23');
INSERT INTO opcion VALUE('','Mantenimiento',0,'23');

INSERT INTO pregunta VALUES('','¿En que se enfocan los métodos ágiles, para que el cliente intervenga en el proceso de desarrollo?','1','2');
INSERT INTO opcion VALUE('','Diseño rápido',1,'24');
INSERT INTO opcion VALUE('','liberaciones frecuentes de software ',1,'24');
INSERT INTO opcion VALUE('','Estructura de la documentación',1,'24');
INSERT INTO opcion VALUE('','Confiabilidad del diseño',0,'24');

INSERT INTO pregunta VALUES('','¿Cual de estos lenguajes de programacion manejan POO?','1','2');
INSERT INTO opcion VALUE('','Python',1,'25');
INSERT INTO opcion VALUE('','Oz',1,'25');
INSERT INTO opcion VALUE('','CSS',1,'25');
INSERT INTO opcion VALUE('','XML',0,'25');

/* Preguntas con unica respuesta y sus opciones*/
/*Recordar cambiar los numeros*/
INSERT INTO pregunta VALUES('','Para el famoso juego del buscaminas, indique cuáles son los posibles casos de uso:','1','1');
INSERT INTO opcion VALUE('','Iniciar partida, Descubrir una casilla, Marcar una casilla.',1,'26');
INSERT INTO opcion VALUE('','Iniciar partida, Jugar partida, Contar minas.',0,'26');
INSERT INTO opcion VALUE('','Jugador, Minas, Anotaciones',0,'26');
INSERT INTO opcion VALUE('','Ninguna es un caso de uso.',0,'26');

INSERT INTO pregunta VALUES('','¿Cuál de las siguientes actividades recomienda el enfoque del RUP?','1','1');
INSERT INTO opcion VALUE('','Desarrollo de software iterativamente, gestión de requisitos, usar arquitectura en componentes, software modelado visualmente, verificar calidad y controlar los cambios del software. ',1,'27');
INSERT INTO opcion VALUE('','Especificación, diseño, implementación, validación y evolución del software.',0,'27');
INSERT INTO opcion VALUE('','Análisis y definición de requerimientos, diseño del sistema y software e implementación.',0,'27');
INSERT INTO opcion VALUE('','Todas las anteriores.',0,'27');

INSERT INTO pregunta VALUES('','Se necesita modelar las interacciones entre los actores y los objetos de un sistema. El diagrama recomendado para dicho fin sería:','1','1');
INSERT INTO opcion VALUE('','Diagrama de clases.',0,'28');
INSERT INTO opcion VALUE('','Diagrama de casos de uso.',0,'28');
INSERT INTO opcion VALUE('','Diagrama de secuencia. ',1,'28');
INSERT INTO opcion VALUE('','Diagrama de sentencias.',0,'28');

INSERT INTO pregunta VALUES('','Según Bass y sus colaboradores analizan 3 ventajas de diseñar y documentar de manera explícita la arquitectura de software. ¿Cuáles son estas 3 características?','1','1');
INSERT INTO opcion VALUE('','Comunicación con los participantes, diseño y programación del sistema e implementación del sistema.',0,'29');
INSERT INTO opcion VALUE('','Análisis del sistema, programar de manera eficiente y cumplir con los requerimientos.',0,'29');
INSERT INTO opcion VALUE('','Comunicación con los participantes, análisis del sistema y reutilización a gran escala.',1,'29');
INSERT INTO opcion VALUE('','Análisis de los requerimientos, análisis del software, programar.',0,'29');

INSERT INTO pregunta VALUES('','En Ingeniería de Requerimientos, al momento de identificar los requerimientos se debe tener claro:','1','1');
INSERT INTO opcion VALUE('','De diferenciar si el requerimiento es funcional o no funcional.',0,'30');
INSERT INTO opcion VALUE('','De conocer muy bien las necesidades que tiene el cliente. ',1,'30');
INSERT INTO opcion VALUE('','De determinar cómo aplicar bien las técnicas de recolección de datos, como entrevistas.',0,'30');
INSERT INTO opcion VALUE('','Ninguna de las anteriores',0,'30');

INSERT INTO pregunta VALUES('','La UTPL crea un sistema para albergar los datos de las pruebas de admisiones de los nuevos aspirantes. Como política de la Universidad, el sistema implementara provisiones para la privacidad de los datos de los aspirantes. Este requerimiento no funcional, puede ser clasificado como: ','1','1');
INSERT INTO opcion VALUE('','Requerimiento del producto.',0,'31');
INSERT INTO opcion VALUE('','Requerimiento de la organización.',0,'31');
INSERT INTO opcion VALUE('','Requerimiento externo. ',1,'31');
INSERT INTO opcion VALUE('','Requerimiento esencial.',0,'31');

INSERT INTO pregunta VALUES('','Se diseña una aplicación destina a la venta y reproducción de música por internet. ¿Cuál de los siguientes patrones arquitectónicos se debería implementar para dicha aplicación?','1','1');
INSERT INTO opcion VALUE('','Programación por capas.',0,'32');
INSERT INTO opcion VALUE('','Pipeline.',0,'32');
INSERT INTO opcion VALUE('','Modelo Cliente/Servidor.',1,'32');
INSERT INTO opcion VALUE('','Ninguna de las anteriores.',0,'32');

INSERT INTO pregunta VALUES('','Si se desarrollara un software profesional basado en la Web, una de las ventajas sería:','1','1');
INSERT INTO opcion VALUE('','Reutilización de varios componentes de software, cómo código, interfaces. ',1,'33');
INSERT INTO opcion VALUE('','El sistema puede ser vulnerable ante ataques de terceros.',0,'33');
INSERT INTO opcion VALUE('','Requieren navegadores web totalmente compatibles para funcionar, incluso muchas veces requieren las extensiones apropiadas y actualizadas para operar.',0,'33');
INSERT INTO opcion VALUE('','Ninguna de las anteriores',0,'33');

INSERT INTO pregunta VALUES('','El diseño arquitectónico consiste en organizar las propiedades de un sistema, Esta propiedad son:','1','1');
INSERT INTO opcion VALUE('','Las funciones y requerimientos que debe cumplir software',1,'34');
INSERT INTO opcion VALUE('','El lenguaje en que se programa para diseñar el sistema.',0,'34');
INSERT INTO opcion VALUE('','La implementación y evolución del software.',0,'34');
INSERT INTO opcion VALUE('','Análisis y mantenimiento.',0,'34');

INSERT INTO pregunta VALUES('','Están diseñados para procesar peticiones del usuario mediante la información de una base de datos.','1','1');
INSERT INTO opcion VALUE('','Sistema de procesamiento de transacciones. ',1,'35');
INSERT INTO opcion VALUE('','Sistema de información.',0,'35');
INSERT INTO opcion VALUE('','Sistema de procesamiento de lenguaje.',0,'35');
INSERT INTO opcion VALUE('','Sistema de intercambio de datos.',0,'35');

INSERT INTO pregunta VALUES('','En la vista arquitectónica de proceso de muestra como los procesos de interacción del sistema el cual nos sirve para:','1','1');
INSERT INTO opcion VALUE('','Hacer juicios de las características no funcionales del sistema, como rendimiento. ',1,'36');
INSERT INTO opcion VALUE('','Comprobar que cumpla con los requerimientos del cliente.',0,'36');
INSERT INTO opcion VALUE('','Identificar los requerimientos no funcionales.',0,'36');
INSERT INTO opcion VALUE('','Analizar los diferentes puntos de vista del diseño del sistema.',0,'36');

INSERT INTO pregunta VALUES('','La metodología que se basa en el desarrollo de un sistema como una serie de versiones, y cada versión añade una funcionalidad a la versión anterior es:','1','1');
INSERT INTO opcion VALUE('','Metodología SCRUM.',0,'37');
INSERT INTO opcion VALUE('','Modelo en cascada. ',1,'37');
INSERT INTO opcion VALUE('','Metodología RUP.',0,'37');
INSERT INTO opcion VALUE('','Modelado UML.',0,'37');

INSERT INTO pregunta VALUES('','Los sistemas de procesamiento en lotes permiten:','1','1');
INSERT INTO opcion VALUE('','Procesar grandes cantidades de datos como los sistemas de pago de salario. ',1,'38');
INSERT INTO opcion VALUE('','Controlar el software como por ejemplo de un teléfono celular móvil.',0,'38');
INSERT INTO opcion VALUE('','Sistemas de entretenimiento personal como juegos.',0,'38');
INSERT INTO opcion VALUE('','Ninguna de las anteriores.',0,'38');

INSERT INTO pregunta VALUES('','En que arquitectura los datos de entrada fluyen por medio de dichos transformadores hasta que se convierten en salida.','1','1');
INSERT INTO opcion VALUE('','Arquitectura cliente-servidor. ',0,'39');
INSERT INTO opcion VALUE('','Arquitectura de tubería y filtro. ',1,'39');
INSERT INTO opcion VALUE('','Arquitectura en capas.',0,'39');
INSERT INTO opcion VALUE('','Arquitectura en procesos.',0,'39');

INSERT INTO pregunta VALUES('','En el siguiente requerimiento: A cada pedido se le permite asignar un identificador único (ID_PEDIDO) Corresponde a un requerimiento:','1','1');
INSERT INTO opcion VALUE('','Requerimiento no funcional.',0,'40');
INSERT INTO opcion VALUE('','Requerimiento funcional. ',1,'40');
INSERT INTO opcion VALUE('','Requerimiento provisional.',0,'40');
INSERT INTO opcion VALUE('','No es un requerimiento.',0,'40');

INSERT INTO pregunta VALUES('','En la etapa de Evolución del Software se realizan las siguientes acciones:','1','1');
INSERT INTO opcion VALUE('','Validación del software, es decir que se cumpla con los requerimientos.',0,'41');
INSERT INTO opcion VALUE('','Modificar el sistema para satisfacer nuevos requerimientos.',1,'41');
INSERT INTO opcion VALUE('','Especificación de los requerimientos y diseño de la interfaz.',0,'41');
INSERT INTO opcion VALUE('','Ninguna de las anteriores',0,'41');

INSERT INTO pregunta VALUES('','Para el juego de ajedrez ¿Cuál de los siguientes ejemplos es un caso de uso?','1','1');
INSERT INTO opcion VALUE('','Partida iniciada.',0,'42');
INSERT INTO opcion VALUE('','Movimiento de una ficha. ',1,'42');
INSERT INTO opcion VALUE('','Usuario y contraseña no válida.',0,'42');
INSERT INTO opcion VALUE('','Mostrar información de la partida.',0,'42');

INSERT INTO pregunta VALUES('','La arquitectura en pequeño se interesa por:','1','1');
INSERT INTO opcion VALUE('','La arquitectura de sistemas empresariales complejos que pueden incluir otros sistemas.',0,'43');
INSERT INTO opcion VALUE('','La arquitectura de sistemas individuales y la forma en que estos se separan en componentes. ',1,'43');
INSERT INTO opcion VALUE('','La arquitectura de sistemas individuales y empresariales.',0,'43');
INSERT INTO opcion VALUE('','Todas las anteriores.',0,'43');

INSERT INTO pregunta VALUES('','Si decimos que resulta difícil el escalamiento de los métodos ágiles para sistemas grandes, esto se debe a que:','1','1');
INSERT INTO opcion VALUE('','Las organizaciones tienen su propio estándar de calidad el cual es obligatorio para todos sus proyectos',0,'44');
INSERT INTO opcion VALUE('','Los grandes sistemas son muy complejos y muy difíciles de desarrollar aplicando métodos ágiles',1,'44');
INSERT INTO opcion VALUE('','La arquitectura de sistemas individuales y empresariales.',0,'44');
INSERT INTO opcion VALUE('','Todas las anteriores.',0,'44');

INSERT INTO pregunta VALUES('','Cuando se usa estructura en capas para la ingeniería, con los activos más críticos resguardados en las capas más internas y con un alto nivel de validación de confianza a dichas capas, corresponde a: ','1','1');
INSERT INTO opcion VALUE('','Protección.',0,'45');
INSERT INTO opcion VALUE('','Rendimiento.',0,'45');
INSERT INTO opcion VALUE('','Seguridad. ',1,'45');
INSERT INTO opcion VALUE('','Calidad',0,'45');

INSERT INTO pregunta VALUES('','Cuál es la forma adecuada para describir la arquitectura del sistema durante el proceso de diseño:','1','1');
INSERT INTO opcion VALUE('','La arquitectura en pequeño.',0,'46');
INSERT INTO opcion VALUE('','Los diagramas de bloque. ',1,'46');
INSERT INTO opcion VALUE('','La arquitectura en grande.',0,'46');
INSERT INTO opcion VALUE('','Modelo en cascada',0,'46');

INSERT INTO pregunta VALUES('','¿Cuál de los siguientes diagramas indicaría la estructura de un software?','1','1');
INSERT INTO opcion VALUE('','Diagrama de Clases.',1,'47');
INSERT INTO opcion VALUE('','Diagrama de Estado.',0,'47');
INSERT INTO opcion VALUE('','Diagrama de Secuencia.',0,'47');
INSERT INTO opcion VALUE('','Ninguna de las anteriores.',0,'47');

INSERT INTO pregunta VALUES('','Si se le pidiera detallar la interacción de los actores y el sistema en un diagrama UML. ¿Cuál de los siguientes diagramas utilizaría?','1','1');
INSERT INTO opcion VALUE('','Diagrama de secuencias',0,'48');
INSERT INTO opcion VALUE('','Diagrama de actividades.',0,'48');
INSERT INTO opcion VALUE('','Diagrama de casos de uso. ',1,'48');
INSERT INTO opcion VALUE('','Ninguna de las anteriores.',0,'48');

INSERT INTO pregunta VALUES('','Al utilizar un modelo de proceso de software para el desarrollo de un sistema lo más difícil que se puede encontrar sería:','1','1');
INSERT INTO opcion VALUE('','La complejidad del sistema a desarrollar',0,'49');
INSERT INTO opcion VALUE('','Implementar el nuevo requerimiento.',1,'49');
INSERT INTO opcion VALUE('','Reutilizar código de sistemas antiguos.',0,'49');
INSERT INTO opcion VALUE('','Modelar los diferentes esquemas.',0,'49');

INSERT INTO pregunta VALUES('','En los productos de software genéricos. ¿Quiénes controlan las especificaciones?','1','1');
INSERT INTO opcion VALUE('','La organización que desarrolla el software.',1,'50');
INSERT INTO opcion VALUE('','La organización que compra el software.',0,'50');
INSERT INTO opcion VALUE('','La organización que desarrolla y compra el software.',0,'50');
INSERT INTO opcion VALUE('','La organización de mantenimiento.',0,'50');