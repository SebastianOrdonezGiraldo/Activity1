package Package;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.in;

public class Principal {
    public static void main(String[] args) {
      //  byte entero = 1;//
        //byte entero = 2;//
        //byte entero = 9;//

        // short entero= 14000;//
        // short entero= 12456;//
        // short entero= 12200;//

        //int entero =232131231;//
        //int entero =801111231;//
        //int entero =901231231;//

        //long entero= 131231231221;//
        //long entero= 132131212332;//
        //long entero= 123131312123;//

     //float decimal = 2.45f;//
     //float decimal = 4.12f;//
     //float decimal = 4.12f;//

        //double decimal = 2.12312312;//
        //double decimal = 5.12312312;//
        //double decimal = 6.123123121;//

       //char caracter = 'a'//
       //char caracter = '4'//
       //char caracter = 'v'//
        // System.out.println("caracter"+caracter);
        // Operadores punto 4 taller//
        //Scanner entry = new Scanner(System.in);//
        //float number1,number2,suma,resta,mult,div,resto;//
        //System.out.println("Enter 2 numbers: ");//
        //number1 = entry.nextFloat();//
        //number2 = entry.nextFloat();//

   //suma = number1 + number2;
   //resta = number1 - number2;
   //mult= number1 * number2;
   //div = number1/number2;
   //resto = number1%number2;

       // System.out.println("La suma es:" +suma);
       // System.out.println("La resta es:" +resta);
       // System.out.println("La multiplicacion es:" +mult);
       // System.out.println("La division es:" +div);

//operadores de incremento y decremento punto 5
        //int x = 5, y;
        //x++; //x +=1;
        //x--;
        //y= x++; //y=5
        //y = ++x;  //y=6
        //System.out.println(x);
        //System.out.println(y);

//operadores de comparación PUNTO 6
        //int a = 5;
        //int b = 5;
        //if (a == b) {
        //    System.out.println("a es igual a b");
        //}
       // int a = 10;
       // int b = -5;
       // if(a>b){
       //  System.out.println("A es mayor que b");}
        //int a = 5;
        //int b = 10;
        //if (a <= b) {
        //    System.out.println("a es menor o igual que b");
        //}
//PUNTO 7
 //Programa para determinar el número mayor entre dos números:
     // int number1 = 10, number2 =20;
     // int larger = (number1 > number2) ? number1 : number2;
        //System.out.println("The larger number is:" + larger);
 //Programa para verificar si un número es par o impar:
        //int num = 7;
        //String result = (num % 2 == 0) ? "even" : "odd";
        //System.out.println("The number is " + result);
//Programa para determinar si un año es bisiesto o no
      // int year = 2024;
      // String result = (year % 4 == 0) ? "leap year" : "not a leap year";
      // System.out.println("The year " + year + " is a  " + result);
// Programa para determinar si un estudiante aprobó o reprobó basado en su calificación
        //int grade = 85;
        //String result = (grade >= 60) ? "passed" : "failed";
        //System.out.println("The student has " + result);
//Programa para determinar si un número es positivo, negativo o cero
        //int num = 0;
        //String result = (num > 0) ? "positive" : (num < 0) ? "negative" : "zero";
        //System.out.println("The number is " + result);
//Punto 8
     //1 determinar si un numero es positivo o negativo.
     //int num = -10;
     //if (num > 0){
         //System.out.println("The number is positive");
     //} else {
        // System.out.println("The number is negative");
     //}

    //2 Programa para revisar si un numero es par o impar.
    //int num = 7;
    //if (num % 2 == 0){
        //System.out.println("The number is even");
    //}else {
        //System.out.println("The number is odd");
    //}

    //3 Programa para determinar si un estudiante paso o reprobo en base a sus notas.
        //int grade = 50;
        //if(grade >= 60){
            //System.out.println("The student passed");
        //}else{
           // System.out.println("The student failed");
        //}
 //Punto 10: Haga 3 ejemplos prácticos del uso de 3 ciclos en java.

    //int i = 1;

    //while (i<=10){
    //    System.out.println(i);
    //    i++;
    //}
        Scanner lector = new Scanner(in);
        int n;

        System.out.println("Insert a positive number");
        n = lector.nextInt();

        if (n > 0){
            for(int i = 1;i <=10;i++){
                System.out.println(n+" plus "+i+" is equal to: "+n*i);
            }
        }else {
            System.out.println("The number is wrong");
        }
    }
    }

