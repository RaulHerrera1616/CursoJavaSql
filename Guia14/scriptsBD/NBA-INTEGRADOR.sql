/*CANDADO A*/
SELECT COUNT(*) AS veces_maximo
FROM estadisticas
WHERE Asistencias_por_partido = (
    SELECT MAX(Asistencias_por_partido) 
    FROM estadisticas
);
SELECT SUM(Peso) AS suma_peso
FROM jugadores
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'East' AND (jugadores.Posicion = 'C' OR jugadores.Posicion LIKE '%C%');

/*CANDADO B*/
/*Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.*/
SELECT COUNT(*) AS cantidad_jugadores
FROM estadisticas est
JOIN jugadores jug ON est.jugador = jug.codigo
WHERE est.Asistencias_por_partido > (
    SELECT COUNT(*)
    FROM jugadores
    WHERE Nombre_equipo = 'Heat'
);
/*conteo de partidos jugados durante las temporadas del año 1999.*/
SELECT count(*) AS CONTEO_PARTIDOS FROM PARTIDOS WHERE TEMPORADA LIKE '%99%';

/*CANDADO C*/
/*La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.*/
SELECT round((COUNT(*) / (
    SELECT COUNT(*)
    FROM jugadores
    WHERE Peso >= 195
  ) + 0.9945)) AS resultado
FROM jugadores
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE jugadores.Procedencia = 'Michigan' AND equipos.Conferencia = 'West';



/*Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/

SELECT floor((AVG(E.Puntos_por_partido) + COUNT(E.Asistencias_por_partido)+ SUM(E.Tapones_por_partido))) AS RESULTADO 
FROM ESTADISTICAS E JOIN JUGADORES J ON E.JUGADOR = J.codigo 
JOIN EQUIPOS EQ ON EQ.NOMBRE = J.NOMBRE_EQUIPO WHERE EQ.DIVISION = 'Central';

/*CANDADO D*/
/*Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado*/
SELECT ROUND(estadisticas.Tapones_por_partido) AS tapones_por_partido_redondeados
FROM estadisticas
JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Nombre = 'Corey Maggette' AND estadisticas.temporada = '00/01';
/*Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/
SELECT FLOOR(SUM(estadisticas.Puntos_por_partido)) AS suma_puntos_argentina
FROM estadisticas
JOIN jugadores ON estadisticas.jugador = jugadores.codigo
WHERE jugadores.Procedencia = 'Argentina';