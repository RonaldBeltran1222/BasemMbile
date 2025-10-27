# 🧪 Proyecto de Automatización Móvil con Serenity BDD y Appium

Este proyecto implementa un framework de **automatización de pruebas móviles** utilizando **Serenity BDD**, **Appium**, y **Cucumber**, siguiendo el patrón **Screenplay**.

![Java](https://img.shields.io/badge/Java-11%2B-red?logo=java)
![Gradle](https://img.shields.io/badge/Gradle-Build-brightgreen?logo=gradle)
![SerenityBDD](https://img.shields.io/badge/Serenity-BDD-blue?logo=serenity)
![Appium](https://img.shields.io/badge/Appium-Mobile%20Testing-purple?logo=appium)
![License](https://img.shields.io/badge/License-MIT-yellow)

## 📁 Estructura del Proyecto

    src
    ├── main
    │ └── java
    │ └── org.example
    │ ├── driver # Clase AppiumAndroidDriver para inicializar el driver
    │ ├── interaccions # Acciones o interacciones personalizadas
    │ ├── models # Modelos de datos
    │ ├── questions # Validaciones o preguntas
    │ ├── tasks # Tareas que representan acciones del usuario
    │ ├── UI # Mapeo de elementos de interfaz (Page Objects)
    │ └── utils # Utilidades generales
    │
    └── test
    ├── java
    │ ├── runners # Clases runner de ejecución de los escenarios
    │ └── stepsDefinitions # Definición de pasos de los features
    └── resources
    └── feature # Archivos .feature con los escenarios de prueba (Cucumber)


## ⚙️ Configuración del Driver (AppiumAndroidDriver)

El driver se encuentra en `src/main/java/org/example/driver/AppiumAndroidDriver.java`.

```java
capabilities.setCapability("deviceName", "Nombre_Del_Dispositivo");
capabilities.setCapability("platformName", "Sistema_Operativo");
capabilities.setCapability("platformVersion", "Numero_De_Versión");
capabilities.setCapability("appPackage", "Package de la app");
capabilities.setCapability("appActivity", "Activity de la app");
capabilities.setCapability("autoGrantPermissions", true);
capabilities.setCapability("noReset", true);

driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

```
⚠️ Importante: Personaliza los valores según tu dispositivo/emulador antes de ejecutar las pruebas.
---
### 🧩 Dependencias principales (`build.gradle`) - estas dependencias son las del proyecto base se pueden modificar su version a gusto
| Librería               | Versión   | Descripción                         |
|------------------------|-----------|-------------------------------------|
| Serenity BDD JUnit     | 2.0.80   | Framework de reportes y ejecución    |
| Serenity BDD Cucumber  | 1.9.45   | Integración con Cucumber             |
| Serenity Core          | 2.0.80   | Núcleo de Serenity                   |
| Appium Java Client     | 7.5.1    | Controlador Appium                   |
| AssertJ                | 3.24.2   | Librería para aserciones             |
| JUnit 5                | 5.8.1    | Framework de pruebas                 |


---
## 🧰 Requisitos Previos

Antes de ejecutar las pruebas asegúrate de tener instalado:

☕ Java 11+

🧱 Gradle

🤖 Appium Server (Version 1.21.0)

📱 Android SDK (recomendable Android Studio)

🔌 Un emulador Android o dispositivo físico conectado

---

## 🚀 Para poder optener el Package y el Activity de la app a probar
📱 Si se tiene instalado Andorid Studio - Se abre la terminal(Alt + F12):
  1. se verifica que el emulador esta conectado:
     ```
     adb devices
     
  2. Ejecutar el comenando para optener los capabilitis necesarios
     Para Windows
      ```
      adb shell dumpsys window | findstr "mCurrentFocus"

      ```
      Para MacOS/Linux
      ```
      adb shell dumpsys window | grep "mCurrentFocus"






