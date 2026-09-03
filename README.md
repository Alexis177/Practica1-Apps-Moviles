# Práctica 1 - Instalación y Funcionamiento de los Entornos Móviles

## Instituto Politécnico Nacional
### Escuela Superior de Cómputo

**Unidad de aprendizaje:** Desarrollo de Aplicaciones Móviles Nativas  
**Práctica:** Práctica 1 - Instalación y Funcionamiento de los Entornos Móviles  
**Alumno:** Hernández González David Alexis  
**Boleta:** 2024630227  
**Grupo:** 7CV4  

---

## 1. Objetivo

El objetivo de esta práctica es instalar, configurar y verificar el funcionamiento del entorno de desarrollo necesario para la construcción de aplicaciones móviles nativas.

Además, se desarrollaron tres versiones de una aplicación básica **"Hola Mundo"**, utilizando diferentes enfoques para la construcción de interfaces:

1. Android nativo utilizando Views con XML.
2. Android nativo utilizando Jetpack Compose.
3. Flutter.

Finalmente, los proyectos fueron almacenados en un repositorio de GitHub utilizando Git como sistema de control de versiones.

---

# 2. Herramientas instaladas

Para realizar la práctica fue necesario instalar y configurar diferentes herramientas de desarrollo.

## 2.1 Android Studio

Android Studio es el entorno de desarrollo integrado utilizado para desarrollar aplicaciones para Android.

Durante esta práctica se utilizó para:

- Crear los proyectos Android.
- Desarrollar interfaces con XML.
- Desarrollar interfaces con Jetpack Compose.
- Administrar el Android SDK.
- Configurar las herramientas necesarias para Flutter.
- Ejecutar las aplicaciones en un dispositivo Android.

---

## 2.2 Java Development Kit (JDK)

El Java Development Kit proporciona las herramientas necesarias para compilar y ejecutar programas desarrollados utilizando tecnologías de Java.

La instalación puede comprobarse utilizando:

```bash
java -version
```

---

## 2.3 Maven

Apache Maven es una herramienta utilizada para la construcción y administración de dependencias de proyectos.

Su instalación se verificó mediante:

```bash
mvn -v
```

---

## 2.4 Git

Git es un sistema de control de versiones distribuido que permite registrar los cambios realizados en los proyectos.

Durante esta práctica se utilizó para crear commits y posteriormente publicar los proyectos en GitHub.

La instalación se verificó mediante:

```bash
git --version
```

---

## 2.5 GitHub

GitHub es una plataforma que permite almacenar repositorios Git de manera remota.

En esta práctica se utilizó un repositorio público para almacenar los tres proyectos desarrollados y conservar el historial de cambios mediante commits.

**Repositorio de la práctica:**


---

## 2.6 Flutter

Flutter es un framework para el desarrollo de aplicaciones multiplataforma.

Durante esta práctica se utilizó para desarrollar la tercera versión de la aplicación "Hola Mundo".

La instalación y configuración del entorno se verificó mediante:

```bash
flutter doctor
```

---

## 2.7 Node.js

Node.js es un entorno de ejecución que permite ejecutar código JavaScript fuera de un navegador.

Su instalación se verificó mediante:

```bash
node -v
```

---

## 2.8 Docker

Docker es una plataforma que permite empaquetar y ejecutar aplicaciones dentro de contenedores aislados y reproducibles.

La instalación de Docker se verificó mediante:

```bash
docker --version
```


---

# 3. Verificación del entorno

Para comprobar que las herramientas fueron instaladas correctamente se utilizaron los siguientes comandos:

```bash
java -version
mvn -v
git --version
flutter doctor
node -v
docker --version
```


---

# 4. Versiones instaladas

| Herramienta | Versión instalada | Sistema operativo |
|---|---|---|
| Android Studio | 6.1.3 | Windows 10 |
| Java JDK | 25.0.4.1 | Windows 10 |
| Maven | 3.9.16 | Windows 10 |
| Git | 2.55.0.windows.5 | Windows 10 |
| Flutter | 3.47.2 Stable | Windows 10 |
| Node.js | 24.15.0 | Windows 10 |
| Docker | 29.7.2 | Windows 10 |

---

# 5. Hello Android

Como parte de la configuración inicial del entorno se verificó el funcionamiento de Android Studio mediante la ejecución de una aplicación básica en Android.

Esto permitió comprobar que el entorno de desarrollo y el dispositivo utilizado para realizar las pruebas podían ejecutar correctamente una aplicación Android.

---

# 6. Estructura del repositorio

Los tres proyectos desarrollados se encuentran organizados en carpetas independientes.

```text
Practica1-Apps-Moviles/
│
├── hola_mundo_xml/
│
├── hola_mundo_compose/
│
├── hola_mundo_flutter/
│
├── capturas/
│
└── README.md
```

Cada carpeta contiene una implementación diferente de la aplicación "Hola Mundo".

---

# 7. Versión 1 - Android nativo con Views (XML)

## Descripción

La primera versión de la aplicación fue desarrollada de forma nativa para Android utilizando **Kotlin y Views con XML**.

La interfaz gráfica fue definida dentro de un archivo XML utilizando un `LinearLayout`.

Dentro del layout se utilizaron diferentes elementos `TextView` para mostrar:

- "Hola Mundo".
- Nombre completo.
- Número de boleta.
- Grupo.

Este enfoque permite mantener separada la definición de la interfaz gráfica del código Kotlin encargado del comportamiento de la aplicación.

## Componentes principales

Los principales componentes utilizados fueron:

- `LinearLayout`
- `TextView`
- `MainActivity`
- Archivo `activity_main.xml`

## Ejecución

Para ejecutar esta versión:

1. Abrir Android Studio.
2. Seleccionar **Open**.
3. Abrir la carpeta:

```text
hola_mundo_xml
```

4. Esperar a que Android Studio termine la sincronización de Gradle.
5. Conectar un dispositivo Android o iniciar un emulador.
6. Seleccionar el dispositivo.
7. Presionar **Run**.
8. Esperar a que la aplicación sea instalada.
9. Verificar que aparezcan correctamente "Hola Mundo", nombre, boleta y grupo.

## Evidencia


---

# 8. Versión 2 - Android nativo con Jetpack Compose

## Descripción

La segunda versión fue desarrollada utilizando **Kotlin y Jetpack Compose**.

A diferencia del proyecto anterior, en esta versión no fue necesario crear la interfaz mediante un archivo XML.

La interfaz se definió directamente desde Kotlin mediante una función marcada con la anotación:

```kotlin
@Composable
```

Para organizar los elementos de la interfaz se utilizó un `Column` y diferentes componentes `Text`.

También se utilizaron modificadores para cambiar propiedades de la interfaz, como:

- Padding.
- Tamaño del texto.
- Separación entre elementos.
- Tipografía.

Además, se utilizó:

```kotlin
@Preview
```

para poder visualizar el composable desde Android Studio.

## Componentes principales

- `@Composable`
- `Column`
- `Text`
- `Modifier`
- `MaterialTheme`
- `Surface`
- `@Preview`

## Ejecución

Para ejecutar esta versión:

1. Abrir Android Studio.
2. Seleccionar **Open**.
3. Abrir:

```text
hola_mundo_compose
```

4. Esperar la sincronización de Gradle.
5. Conectar un dispositivo Android o iniciar un emulador.
6. Seleccionar el dispositivo.
7. Presionar **Run**.
8. Esperar la instalación de la aplicación.
9. Verificar que la información aparezca correctamente.

## Preview

La anotación `@Preview` permite visualizar la interfaz directamente dentro de Android Studio sin necesidad de instalar la aplicación cada vez que se realiza un cambio.


---

# 9. Versión 3 - Flutter

## Descripción

La tercera versión fue desarrollada utilizando **Flutter y Dart**.

El proyecto se creó mediante:

```bash
flutter create hola_mundo_flutter
```

Posteriormente se modificó:

```text
lib/main.dart
```

para construir la interfaz solicitada.

La aplicación utiliza una estructura basada en widgets.

## Widgets utilizados

Entre los principales widgets utilizados se encuentran:

- `MaterialApp`
- `Scaffold`
- `AppBar`
- `Center`
- `Column`
- `Text`
- `SizedBox`

`MaterialApp` proporciona la estructura general de una aplicación basada en Material Design.

`Scaffold` proporciona la estructura visual principal de la pantalla.

`Column` permite organizar los elementos verticalmente.

Finalmente, los widgets `Text` se utilizaron para mostrar "Hola Mundo", nombre, boleta y grupo.

## Ejecución

Para ejecutar esta versión primero se debe comprobar que Flutter reconoce un dispositivo:

```bash
flutter devices
```

Después se debe ingresar al proyecto:

```bash
cd hola_mundo_flutter
```

Obtener las dependencias:

```bash
flutter pub get
```

Y finalmente ejecutar:

```bash
flutter run
```

Flutter compilará la aplicación, la instalará en el dispositivo Android seleccionado y posteriormente iniciará la aplicación.


---

# 10. Dificultades encontradas y soluciones

Durante la instalación y configuración del entorno se presentaron diferentes problemas.

## 10.1 Configuración de Flutter

Al ejecutar:

```bash
flutter doctor
```

se detectaron inicialmente problemas relacionados con las herramientas necesarias para desarrollar aplicaciones Android.

Uno de los problemas encontrados fue la ausencia de los **Android SDK Command-line Tools**.

### Solución

Se abrió Android Studio y se ingresó al administrador del SDK.

Desde **SDK Tools** se instalaron las herramientas de línea de comandos necesarias para Android.

Después se volvió a ejecutar:

```bash
flutter doctor
```

para comprobar la configuración.

---

## 10.2 Licencias del Android SDK

Durante la configuración también apareció una advertencia relacionada con el estado de las licencias del SDK de Android.

Se intentó ejecutar:

```bash
flutter doctor --android-licenses
```

Sin embargo, la versión instalada de las herramientas de Android mostró una advertencia indicando cambios en el manejo de las licencias.

A pesar de esta advertencia, se continuó verificando directamente la capacidad de Flutter para compilar el proyecto Android.

---

## 10.3 Error al ejecutar Flutter

Al intentar ejecutar inicialmente:

```bash
flutter run
```

la aplicación no pudo compilarse correctamente.

Entre los mensajes mostrados se encontraba un problema relacionado con una dependencia del Android NDK.

El sistema indicaba que no se encontraba:

```text
28.2.13676358
```

## Solución

Desde Android Studio se ingresó a:

```text
SDK Manager
→ SDK Tools
→ Show Package Details
→ NDK (Side by side)
```

Se instaló la versión:

```text
28.2.13676358
```

Después se regresó a la terminal y se ejecutaron los comandos:

```bash
flutter clean
flutter pub get
flutter run
```

Después de instalar la dependencia requerida, Flutter pudo compilar y ejecutar correctamente la aplicación.

---

## 10.4 Ejecución en dispositivo físico

Para comprobar el funcionamiento de las aplicaciones se utilizó un dispositivo Android físico.

En el caso de Flutter se verificó que el dispositivo fuera reconocido mediante:

```bash
flutter devices
```

Una vez reconocido, se ejecutó:

```bash
flutter run
```

y la aplicación pudo instalarse y ejecutarse correctamente.

---

# 11. Control de versiones con Git

Para mantener un registro de los cambios realizados se utilizó Git.

El repositorio fue inicializado mediante:

```bash
git init
```

Posteriormente se configuró la rama principal:

```bash
git branch -M main
```

Los proyectos fueron agregados de forma independiente para mantener un historial organizado.

## Proyecto XML

```bash
git add hola_mundo_xml
git commit -m "Agrega aplicacion Hola Mundo con Views XML"
```

## Proyecto Jetpack Compose

```bash
git add hola_mundo_compose
git commit -m "Agrega aplicacion Hola Mundo con Jetpack Compose"
```

## Proyecto Flutter

```bash
git add hola_mundo_flutter
git commit -m "Agrega aplicacion Hola Mundo con Flutter"
```

Posteriormente los cambios fueron enviados al repositorio remoto de GitHub.


---

# 12. Comparación de los tres enfoques

Durante el desarrollo de la aplicación "Hola Mundo" se utilizaron tres enfoques diferentes: Views con XML, Jetpack Compose y Flutter.

En cuanto a la **facilidad de desarrollo**, XML resulta sencillo para comprender inicialmente la separación entre la interfaz y la lógica, aunque requiere trabajar con archivos diferentes. Jetpack Compose facilita la creación de interfaces al permitir definirlas directamente mediante código Kotlin, evitando la necesidad de utilizar archivos XML. Flutter también utiliza un enfoque declarativo, aunque requiere trabajar con Dart y comprender su sistema basado en widgets.

Respecto a la **cantidad de código**, XML necesita definir la interfaz por separado y posteriormente relacionarla con la actividad de Android. Compose permite concentrar gran parte de la interfaz dentro del código Kotlin. Flutter presenta una estructura similar al enfoque declarativo de Compose, pero construye prácticamente toda la interfaz mediante widgets.

En cuanto al **diseño de la interfaz**, XML utiliza componentes tradicionales como `LinearLayout` y `TextView`; Compose utiliza funciones `@Composable`, `Column` y `Text`; mientras que Flutter utiliza widgets como `MaterialApp`, `Scaffold`, `Column` y `Text`.

Aunque los tres enfoques permiten obtener un resultado visual similar, la forma de construir y organizar la interfaz es diferente. XML representa el enfoque tradicional de Android, mientras que Jetpack Compose y Flutter utilizan un modelo declarativo que permite construir las interfaces directamente mediante código.

---

# 13. Conclusiones

La realización de esta práctica permitió instalar, configurar y comprobar las principales herramientas necesarias para comenzar el desarrollo de aplicaciones móviles.

Durante el proceso se aprendió a configurar Android Studio y diferentes herramientas complementarias como Java, Maven, Git, Flutter, Node.js y Docker.

El desarrollo de una misma aplicación mediante tres enfoques diferentes permitió observar de manera práctica las diferencias entre Views con XML, Jetpack Compose y Flutter.

El enfoque basado en XML permite separar claramente la interfaz gráfica del código Kotlin, mientras que Jetpack Compose permite construir la interfaz directamente mediante funciones composables. Por otro lado, Flutter utiliza Dart y un sistema basado en widgets que permite construir interfaces de manera declarativa.

También se presentaron diferentes dificultades durante la configuración, principalmente relacionadas con Flutter, Android SDK y Android NDK. La solución de estos problemas permitió comprender mejor la importancia de las dependencias y de la correcta configuración del entorno de desarrollo.

Finalmente, el uso de Git y GitHub permitió mantener un historial de cambios y organizar los tres proyectos dentro de un repositorio público, facilitando su almacenamiento, consulta y posterior verificación.

---

# 14. Evidencias

Las evidencias de la práctica se encuentran almacenadas dentro de la carpeta:

```text
capturas/
```

Esta carpeta contiene las capturas correspondientes a:

- Configuración del entorno de desarrollo.
- Verificación de versiones.
- Ejecución de Hello Android.
- Aplicación Hola Mundo con Views/XML.
- Aplicación Hola Mundo con Jetpack Compose.
- Preview de Jetpack Compose.
- Aplicación Hola Mundo con Flutter.
- Historial de commits.

---

# Repositorio

**Liga pública del repositorio:**

PENDIENTE - PEGAR AQUÍ LA URL DE GITHUB
