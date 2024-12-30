```markdown
# Desafío: Gestión de Cuenta Bancaria

Este programa en Java permite a los usuarios interactuar con una cuenta bancaria ficticia mediante un menú de opciones, como consultar saldo, realizar depósitos y retiros.

## Funcionalidades
1. Consultar saldo.
2. Retirar dinero (verifica si el saldo es suficiente).
3. Depositar dinero.
4. Salir del programa.

## Ejecución
1. Al iniciar, el programa muestra los datos iniciales del cliente:
   - Nombre: Tanos
   - Tipo de cuenta: Cuenta Corriente
   - Saldo inicial: $1599.99
2. El usuario puede interactuar con el menú ingresando el número correspondiente a la opción deseada.

## Requisitos
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
- Un entorno de desarrollo Java como [IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org/), o el terminal con soporte para compilación de Java.

## Uso
1. Compila el archivo fuente:
   ```bash
   javac Desafio.java
   ```
2. Ejecuta el programa:
   ```bash
   java Desafio
   ```

## Ejemplo de Salida
```
*******************************************

El nombre del cliente es: Tanos
El tipo de cuenta es: Cuenta Corriente
El saldo es: $ 1599.99

*******************************************

*** Escriba el numero de la opcion deseada ****
1 - Consultar saldo
2 - Retirar
3 - Depositar
9 - Salir
```

## Notas
- El programa verifica que el saldo sea suficiente antes de permitir un retiro.
- El menú se repite hasta que el usuario elija la opción "9 - Salir".

---
```
