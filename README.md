<h1 align="center"> Sprint 01 Java - Conversor</h1>

Proyecto que forma parte del programa de formación ORACLE NEXT EDUCATION, impartido por ALURA LATAM, en el cual se nos solicitó crear 
un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

Requisitos:
- El convertidor de moneda debe:

       - Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sul-coreano
       
Recordando que también debe ser posible convertir inversamente.

Sin embargo como elemento de desarrollo extra implementé la comunicación con una API externa para que me diera el tipo de cambio entre divisas en tiempo real,
esto con la finalidad de que la aplicación sea realmente útil y no tener que actualizar la información cada que la app tenga que ejecutarse.


## :hammer:Funcionalidad del proyecto

- `Seleccionar el Conversor`: Tan pronto la aplicación es desplegada, ésta permite al usuario elegir entre un conversor de moneda y uno de temperatura.
  
  ![Pantalla Principal](https://user-images.githubusercontent.com/112449858/210831257-40c7fbb0-5a59-4342-87e7-c06aa9456dbe.JPG)
              
- `Entrada de Valores`: Se despliega un cuadro en el cual se le permite al usuario ingresar el valor que va a convertir.

  ![entrada](https://user-images.githubusercontent.com/112449858/210832959-877e9dc9-7dbe-4bbc-b759-a529dac002f3.JPG)
  
  Es importante mencionar que la aplicación cuenta con validación del tipo de dato que se está ingresando por medio de RegEX, por lo
  tanto, si el valor ingresado no corresponde a lo esperado por la aplicación, mostrará un msj de error.
  
  ![msjerror](https://user-images.githubusercontent.com/112449858/210834612-479d8bbc-ca40-4e65-b5cb-c0588fafcfb6.JPG)


- `Opciones de Conversión`: La aplicación pregunta al usuario por alguna opción para convertir el valor que ingresó.


  ![opciones](https://user-images.githubusercontent.com/112449858/210834829-b59c85d1-be7c-4f4a-92e1-41cc1e478c24.JPG)
  


- `Mostrando Resultado`: La app después de comunicarse con la API implementada, devuelve el valor de la conversión mostrandolo al usuario.

  ![resultado](https://user-images.githubusercontent.com/112449858/210835293-36c31134-2d54-4fe5-87ee-b7a3e61c8731.JPG)
  
- `Consultando una vez más`: Al terminar la operación, la app pregunta si quiere realizar alguna otra operación, en caso de que
  el usuario degia que "Si", la aplicación se regresa a la pantalla principal.
  
  
  ![msjfinal](https://user-images.githubusercontent.com/112449858/210836022-cadd2eb3-f207-4d7f-9b05-5efdd59dfe9e.JPG)
  
  De lo contrario, nos manda un msj de despedida.
  
  ![despedida](https://user-images.githubusercontent.com/112449858/210836186-59f3af4d-e728-44e1-8de7-0a05ec937630.JPG)
  
  
  ## :open_file_folder: :rocket: Abre y ejecuta el proyecto
  
  Para ejecutar el proyecto necesitamos: 
  
    - Descargarlo de éste repositorio.
    
    - Una vez guardado podemos abrirlo con algún IDE como Eclipse o Netbeans.
    
    - Corremos el proyecto como una aplicación de Java.
    
    - La aplicación ya tiene implementada la librería JSON la cual se ocupa para "parsear" un objeto JSON en un dato que se pueda ocupar en Java. En
      este caso se ocupó para extraer el valor de la conversión obtenido en la petición de la API y poder manipularlo como un valor de tipo double.
      De no ser posible ejecutar la aplicación, descargar la librería disponible en https://mvnrepository.com/artifact/org.json/json/20 y añadirla
      al BuilPath del proyecto.
      
    - Como consideración extra, debemos tener acceso a internet para poder conectarnos con el API y obtener el valor de conversión en tiempo real
      para realizar dicha conversión, esto solo aplica al conversor de monedas, en el de temperetura no es necesario ya que los valores de conversión
      para éste caso son constantes.
      
  ## :heavy_check_mark: Tecnologías aplicadas
    
    - Java 11.
    - Eclipse IDE.
    - Exchangerate.host API.
    
  ## Autores

  | [<img src="https://avatars.githubusercontent.com/u/112449858?s=400&u=6df892a92a87cc656d44f9ecdb9333dc404d5c6e&v=4" width=115><br><sub>Diego Reyes</sub>](https://github.com/DiegoRZ09) |
  | :---: |
  


