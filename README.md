# Procesadores del Lenguaje

Este repositorio almacena las prácticas realizadas durante el curso 2020/2021 para la asignatura [PROCESADORES DEL LENGUAJE (780018)](https://www.uah.es/es/estudios/estudios-oficiales/grados/asignatura/Procesadores-del-Lenguaje-780018/) del departamento Ciencias de la Computación de la Universidad de Alcalá.

## Contenido

Las carpetas son las siguientes:

- _PL1_: uso y transformación de expresiones regulares cuyo programa extrae y permite evaluarlas. Incluye un ejemplo.
- _PL2_: se implementa un lexer y parser para el lenguaje PSeInt que muestra el árbol en formato de directorios a partir de un programa. Incluye estudio propio del lenguaje PSeInt y ejemplos.
- _PL3_: a partir de la _PL2_ se crea una tabla de símbolos, se gestiona la métrica del lenguaje y se muestra en un fichero HTML con grafos generados. Incluye un ejemplo.

## Uso

Para compilar los programas es necesario tener instalado el [JDK de Java](https://www.java.com/es/download/help/develop.html) y agregar la ruta del directorio al PATH para tener acceso a `javac` desde la línea de comandos. Para compilar desde Windows se puede ejecutar desde la consola los ficheros `build.bat` que se encuentran en las carpetas.

En el caso de la _PL2_ y _PL3_ es necesario también tener instalado [ANTLR](https://www.antlr.org/) y con la ruta al PATH para llamar a `antlr`. Además, para la _PL3_ también necesario tener instalado [Graphviz](https://graphviz.org/) y con acceso al comando `dot` configurando el PATH.

Para ejecutar los programas una vez compilado se necesita el [JRE de Java](https://www.java.com/es/download/) con la ruta en el PATH y desde la consola usar `java Main` para que muestre los argumentos necesarios que hay que pasarle.

Los ficheros _.jff_ se pueden abrir con [JFLAP](https://www.jflap.org/) y los _.psc_ / _.pseint_ con [PSeInt](http://pseint.sourceforge.net/) para su ejecución.

## Licencia

El Real Decreto 1791/2010, de 30 de diciembre, por el que se aprueba el Estatuto del Estudiante Universitario, dedica su artículo 7 a los derechos comunes de los estudiantes universitarios y se establece lo siguiente:

> Al reconocimiento de la autoría de los trabajos elaborados durante sus estudios y a la protección de la propiedad intelectual de los mismos.

Además, en el artículo 27 sobre los trabajos y memorias de evaluación, se indica que:
> La publicación o reproducción total o parcial de los trabajos (...) o la utilización para cualquier otra finalidad distinta de la estrictamente académica, requerirá la autorización expresa del autor o autores, de acuerdo con la legislación de propiedad intelectual.
