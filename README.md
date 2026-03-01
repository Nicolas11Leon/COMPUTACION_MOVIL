===========================================================
   PROYECTO: RICK AND MORTY NEXUS - EXPLORADOR DINÁMICO
===========================================================

INFORMACIÓN GENERAL
-------------------
Creado por: Nicolás León
Fecha de realización: 27 de febrero de 2026
Materia: Desarrollo Móvil
Taller: Nro. 1 - Consumo de APIs y Navegación en Android

DESCRIPCIÓN TÉCNICA
-------------------
Esta aplicación permite la exploración completa de la API oficial de Rick & Morty. 
Se diseñó bajo una arquitectura moderna utilizando Jetpack Compose, Kotlin 
y Ktor para el consumo de datos asíncronos.

CARACTERÍSTICAS DESTACADAS
--------------------------

1. SELECTOR DINÁMICO DE LIBRERÍAS:
   A diferencia de una carga estática, la aplicación implementa un selector que 
   permite navegar por las 42 páginas de la API original, brindando acceso a 
   más de 800 personajes distribuidos en rangos de 20 por página.

2. DISEÑO NEUMÓRFICO (NEUMORPHISM):
   La interfaz utiliza un estilo visual basado en luces y sombras suaves 
   (sombras proyectadas y reflejos), logrando un acabado moderno y profesional 
   que se aleja de las tarjetas planas tradicionales.

3. MOTOR DE ANIMACIÓN AVANZADO (PRO):
   Se implementaron tres capas independientes de animación en la pantalla de detalle:
   - Fondo fluido (Gradient Flow).
   - Marco de imagen rotativo (Neon Spinner).
   - Nombre del personaje con pulso de brillo.
   
   IMPORTANTE: Estas animaciones fueron desarrolladas utilizando la función 
   'withFrameNanos'. Esto garantiza que las animaciones se ejecuten directamente 
   sobre el reloj de frames del procesador gráfico. De esta manera, si un usuario 
   tiene las "Escalas de animación" desactivadas en las Opciones de Desarrollador 
   de Android, la aplicación seguirá mostrando fluidez y movimiento constante, 
   asegurando una experiencia visual idéntica en todos los dispositivos.

4. OPTIMIZACIÓN DE RECURSOS:
   - Navegación: Se utiliza la serialización de objetos (Kotlin Serialization) 
     para pasar los datos entre pantallas, evitando consultas repetitivas a la 
     red y ahorrando ancho de banda.
   - Recursos: Los textos de la aplicación están centralizados en strings.xml 
     para cumplir con las buenas prácticas de desarrollo.

ESTRUCTURA DE ENTREGA
---------------------
- /Código Fuente: Carpeta comprimida con el proyecto de Android Studio.
- /Ejecutable: Archivo .APK localizado en la ruta:
  app/build/outputs/apk/debug/app-debug.apk

INSTRUCCIONES DE USO
--------------------
1. Inicie la aplicación y seleccione una página (librería) de la lista.
2. Seleccione un personaje para ver su información detallada.
3. En la pantalla de detalle, pulse sobre la imagen del personaje para realizar 
   una simulación de llamada (Intent de Marcado Telefónico).

-----------------------------------------------------------
Nicolás León - 2026
