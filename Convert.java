/*
  Name/Autor: Vishal Upendra Chavda
  Student ID: A00242303
  Course:     Mobile Application Development (MAPD)
  Created on: 24/09/2021 (DD/MM/YYYY)
  Description: This program will perform following functions/operations.
    A. Collect a numeric value from the user and store it in an appropriate variable
    B. Collect the current unit of measurement
    C. Determine the appropriate conversion (in either direction, ie the user can enter km or mi)
    D. Display the new result

  Note/Assumtions:
    A. User can only convert from C to F, F to C, KG to LB, LB to KG, CM to IN, and IN to CM.
    B. Unit of measure is case insensitive i.e. km, KM, kM, Km will work.
    C. Unit of measure should be singular i.e. kms, KMS, KMs, KmS will not work.
    D. Values are not rounded off to 2 or 3 decimal places.
*/

import java.util.Scanner;  // Import the Scanner class

class Convert {
    public static void main(String[] args) {

      //Declaring required variables
      double convertValue, result;
      String unitOfMeasure;

      Scanner keyboard = new Scanner(System.in);    // Create a Scanner object

      System.out.print("Enter a value to convert with its unit (Ex: 10.33 km):");
      convertValue = keyboard.nextDouble();        //Store the user entered numeric value in the variable
      unitOfMeasure = keyboard.next();             //Store the user entered unit value in the variable

      /*
        Following switch case will first convert the unitOfMeasure into lower case
        and then go into appropriate case based on it .
        Calculate the value and store it into the variable called as result.
        Display the converted value on screen.
        If no case matches, it will display "Invalid choice!!" text on screen.
      */
      switch(unitOfMeasure.toLowerCase())
      {
        case "c":
          result = (convertValue * 9/5) + 32;
          System.out.println(convertValue +unitOfMeasure.toLowerCase() + " is equal to " + result + "f");
          break;
        case "f":
          result = (convertValue - 32) * 5/9;
          System.out.println(convertValue + unitOfMeasure.toLowerCase() + " is equal to " + result + "c");
          break;
        case "kg":
          result = convertValue * 2.2;
          System.out.println(convertValue + unitOfMeasure.toLowerCase() + " is equal to " + result + "lb");
          break;
        case "lb":
          result = convertValue * 0.45;
          System.out.println(convertValue + unitOfMeasure.toLowerCase() + " is equal to " + result + "kg");
          break;
        case "cm":
          result = convertValue * 0.39;
          System.out.println(convertValue + unitOfMeasure.toLowerCase() + " is equal to " + result + "in");
          break;
        case "in":
          result = convertValue * 2.54;
          System.out.println(convertValue + unitOfMeasure.toLowerCase() + " is equal to " + result + "cm");
          break;
        default:
          System.out.println("Invalid choice!!");
      }

        keyboard.close();                          //Safely destryoing the Scanner instace.
    }
}
