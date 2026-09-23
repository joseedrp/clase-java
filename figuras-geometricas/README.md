# Figuras geométricas en Java

Programa de consola para calcular el área y el perímetro de un círculo, un cuadrado, un trapecio o un triángulo.

## Requisitos

JDK 11 o superior instalado y el comando `java` disponible en la terminal.

## Ejecución

Abre una terminal en la carpeta del proyecto y ejecuta:

```sh
java MenuFiguras.java
```

También puedes compilarlo y ejecutarlo:

```sh
javac -encoding UTF-8 MenuFiguras.java
java MenuFiguras
```

## Uso

1. Elige una figura en el menú: 1 círculo, 2 cuadrado, 3 trapecio o 4 triángulo. La opción 0 permite salir.
2. Introduce cada medida cuando se solicite y pulsa Enter.
3. El programa muestra el área y el perímetro y termina.

El círculo necesita el radio y el cuadrado su lado. El trapecio necesita sus dos bases, altura y lados no paralelos. El triángulo necesita base, altura correspondiente y los otros dos lados.

Introduce medidas positivas y coherentes, todas en la misma unidad. El programa supone que los datos son válidos. El separador decimal depende de la configuración regional de Java.

## Fórmulas

| Figura | Área | Perímetro |
| --- | --- | --- |
| Círculo | π × radio² | 2 × π × radio |
| Cuadrado | lado² | 4 × lado |
| Trapecio | (base mayor + base menor) × altura / 2 | Suma de sus cuatro lados |
| Triángulo | base × altura / 2 | Suma de sus tres lados |
