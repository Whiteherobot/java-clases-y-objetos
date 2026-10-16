# tare101 · Clases y objetos en Java

Tarea en grupo de Programación Orientada a Objetos (Grupo 5, abril de 2022). Es
la versión final de [java-primeras-clases](https://github.com/Whiteherobot/java-primeras-clases).

El objetivo era practicar lo básico: definir una clase con atributos, crear
varias instancias con `new` y mostrar sus datos por consola. Cada archivo es una
clase independiente con su propio `main`:

| Clase | Qué crea |
|---|---|
| `Animales` | Un león y una jirafa |
| `Gato` | Dos gatos (Persa y Angora) |
| `Perro` | Dos perros (Pastor Alemán y Pitbull) |
| `estudiante` | Dos estudiantes |
| `motos` | Dos motos con marca, placa, año y modelo |

## Ejecutar

Con JDK 17 y Maven:

```bash
mvn compile
java -cp target/classes Animales   # o Gato, Perro, estudiante, motos
```

## Notas

El código se conserva como se entregó, con atributos públicos, todo como
`String` y sin constructores, porque así se pedía en la primera unidad. En 2026
se corrigieron tres errores que tenía la entrega:

- La jirafa salía con edad y peso en `null`, porque los datos se asignaban al león.
- El segundo perro se creaba como `Gato`.
- El `pom.xml` apuntaba a una clase principal que ya no existía.

La versión trabajada de estos mismos conceptos está en
[poo-fundamentos-java](https://github.com/Whiteherobot/poo-fundamentos-java).

## Autores

- Michael Lata ([@Whiteherobot](https://github.com/Whiteherobot))
- Gabriela Rocano
