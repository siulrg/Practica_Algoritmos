# Parte #1 Asignación de cursos

La Universidad de Costa Rica desea automatizar su sistema de formulación de horarios.
Utilizando el Modelo Vista Controlador(MVC) en el entorno de desarrollo Netbeans, escriba
un programa en JAVA que permita al usuario tener las siguientes opciones:

* Registro de cursos.
* Modificar cursos
* Eliminar cursos
* Asignar estudiante a curso
* Consultar cursos

**Registro de cursos:** Este proceso permite almacenar la información de los cursos, en un
ArrayList se debe guardar el nombre del curso, las siglas del curso y la cantidad de créditos
que posee. Si el curso ya se encuentra almacenado enviar un mensaje de error, de lo
contrario, proceder a guardar la información.

**Modificar Curso:** Permite modificar el nombre del curso y la cantidad de créditos. Para
realizar este proceso debe solicitar la sigla, se procede a buscar el curso, si este se
encuentra almacenado se procede a mostrar los datos completos del curso y luego se
procede con la modificación, de lo contrario se presenta un mensaje de error.

**Eliminar curso:** Permite eliminar un curso utilizando la sigla. Para realizar este proceso se
debe de realizar la búsqueda mediante la sigla, si el curso se encuentra almacenado procede
a eliminarlo, de lo contrario se presenta un mensaje de error.
Asignar estudiante a curso: Permite matricular un estudiante un curso. Debe pedir la sigla
del curso y el carnet del estudiante, no se debe permitir matricular más de 25 estudiantes enun curso y un estudiante no puede ser matriculado dos veces en un mismo curso. En caso de
existir un error debe presentarlo en pantalla.

**Consultar cursos:** Hace una búsqueda mediante la sigla, se solicita la sigla, se realiza la
búsqueda y luego se muestra la información con todos los datos del curso, así como los
estudiantes matriculados, si no se encuentra la sigla se muestra un mensaje de error.

# Parte #2: Manejo de archivos.

Este sistema debe guardar la información de los estudiantes y los cursos en un archivo de
texto en formato XML o JSON dependiendo de lo que el usuario solicite en la configuración
del sistema.

**Archivo de configuración:** El sistema debe tener una opción para guardar las preferencias
del usuario (en que formato debe guardar el archivo). Al iniciar debe ser capaz cargar los
datos de configuración desde una carpeta de configuración, si es la primera vez y la carpeta
no existe debe crearla, si el archivo no existe y el programa debe cerrarse, debe guardar
primero el archivo.
En caso de no poder crear la carpeta o el archivo de configuración debe mostrar un mensaje
de error.

**Archivos de datos:** Los datos del programa de estudiantes y cursos deben guardarse en un
archivo, ya sea XML o JSON, cada vez que cambie la configuración el sistema debe convertir
los datos al formato solicitado. Cada vez que el programa se cierre, debe guardar el archivo
en el formato correspondiente.

En caso de no poder crear el archivo debe mostrar un mensaje de error.
