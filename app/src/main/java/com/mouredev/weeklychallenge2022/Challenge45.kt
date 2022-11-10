package com.mouredev.weeklychallenge2022

/*
 * Reto #45
 * CONTENEDOR DE AGUA
 * Fecha publicación enunciado: 07/10/22
 * Fecha publicación resolución: 14/11/22
 * Dificultad: MEDIA
 *
 * Enunciado: Dado un array de números enteros positivos, donde cada uno representa unidades
 * de bloques apilados, debemos calcular cuantas unidades de agua quedarán atrapadas entre ellos.
 *
 * - Ejemplo: Dado el array [4, 0, 3, 6, 1, 3].
 *
 *        ⏹
 *        ⏹
 *   ⏹💧💧⏹
 *   ⏹💧⏹⏹💧⏹
 *   ⏹💧⏹⏹💧⏹
 *   ⏹💧⏹⏹⏹⏹
 *
 *   Representando bloque con ⏹︎ y agua con 💧, quedarán atrapadas 7 unidades de agua.
 *   Suponemos que existe un suelo impermeable en la parte inferior que retiene el agua.
 *
 *
 * Información adicional:
 * - Usa el canal de nuestro Discord (https://mouredev.com/discord) "🔁reto-semanal"
 *   para preguntas, dudas o prestar ayuda a la comunidad.
 * - Tienes toda la información sobre los retos semanales en
 *   https://retosdeprogramacion.com/semanales2022.
 *
 *
 *
 *Llevo solo una semana programando y es mi primer reto, cualquier critica se agradece
 */

array = (4, 0, 3, 6, 1, 3)

n = array[0]
total = 0
valor = len(array)
x = 0

for i in range(valor):
    try:
        indice = array[x]
        resultado= n - indice
        x+=1
        maximo = max(array[x:])
        if maximo >= n > indice:
            resultado
            total = total+resultado
        elif n > maximo > indice:
            resultado_alternativo = maximo - indice
            total = total+resultado_alternativo
        elif n <= indice:
            n = indice
        elif maximo <= indice:
            continue
    except ValueError:
        break      
        
print(f'En total hay {total} gotas de agua')
