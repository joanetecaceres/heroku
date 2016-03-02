Instrucciones tarea3
Programa que genera la regresión lineal
Programado por Joanete Carolina Cáceres Suarez


1. Desde la consola de github (Git Bash) ejecutar la siguiente instrucción donde "clone_miTarea3" es el folder creado para clonar el proyecto:
$ cd clone_miTarea3

2. Podrá visualizar un codigo como el siguiente:
$ git clone https://github.com/joanetecaceres/ecos2016.git
Cloning into 'ecos2016'...
remote: Counting objects: 28, done.
remote: Compressing objects: 100% (19/19), done.
remote: Total 28 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (28/28), done.
Checking connectivity... done.

3. Una vez clonado el proyecto, ingresar al folder "ecos2016" con el siguiente comando:
$ cd ecos2016

4. Una vez este ubicado dentro del folder "ecos2016", por favor ejecutar el siguiente comando:
$ mvn package

5. Podrá visualizar un código como el siguiente:
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building miTarea3 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ miTarea3 ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory E:\clone_miTarea3\ecos2016\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ miTarea3 ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 3 source files to E:\clone_miTarea3\ecos2016\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ miTarea3 ---
[WARNING] Using platform encoding (Cp1252 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory E:\clone_miTarea3\ecos2016\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ miTarea3 ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding Cp1252, i.e. build is platform dependent!
[INFO] Compiling 1 source file to E:\clone_miTarea3\ecos2016\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ miTarea3 ---
[INFO] Surefire report directory: E:\clone_miTarea3\ecos2016\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running app3.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ miTarea3 ---
[INFO] Building jar: E:\clone_miTarea3\ecos2016\target\miTarea3-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 8.607 s
[INFO] Finished at: 2016-02-29T20:25:27-05:00
[INFO] Final Memory: 15M/125M
[INFO] ------------------------------------------------------------------------


6. Ingresar al folder "target" con la siguiente instrucción:
$ cd target

7. Ingresar al folder "classes" con la siguiente instrucción:
$ cd classes

8. Copiar en esta ruta el Folder "TestCase" (contiene los archivos .txt para los 4 casos de prueba solicitados)

9. Ejecutar el siguiente comando para mostrar el resultado del programa:
$ java tarea3.TestCase

10. Podrá visualizar un codigo como el siguiente:

Valores Actuales Caso de Prueba 1:
B0=-22.552532752034267
B1=1.727932426206986
Rx,y=0.9544965741046827
R^2=0.911063709977576
Yk=644.4293837638623

Valores Actuales Caso de Prueba 2:
B0=-4.038881574687579
B1=0.168126649881629
Rx,y=0.9333068981405511
R^2=0.871061766116737
Yk=60.858005279621224

Valores Actuales Caso de Prueba 3:
B0=-23.92388825291539
B1=1.430966943551199
Rx,y=0.9631140931490526
R^2=0.927588756422322
Yk=528.4293519578474

Valores Actuales Caso de Prueba 4:
B0=-4.603745423308965
B1=0.1401635263888363
Rx,y=0.9480329874300508
R^2=0.8987665452555469
Yk=49.49937576278185


11. para visualizar con heroku
12.  heroku login
13. git clone https://github.com/joanetecaceres/heroku minuevoproyecto
14. cd minuevoproyecto
15. heroku create
16. git push heroku master
17. heroku ps:scale web=1
18. heroku open
19. mvn clean install
20. heroku local web o heroku local web -f Procfile.windows
21. http://localhost:5000/LinearRegression

