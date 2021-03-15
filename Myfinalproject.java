/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfinalproject;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alieu Secka
 */
public class Myfinalproject {
    // i will love the exam i will love the game i want to the. i love to do the game in the design i will love to the problem 
    // i will want to the the game . i want to get fit so i have to work extremly hard at the jim. its not been esay thou i have the passion and the believe to be fit in the future.
    // mr jallow is a talkative i dont love someone who love talking. The truth is that i  hate people who talk too much . i just cant take it. its make me fell angry.
    // the main trick to master java is to work extrmly hard. 
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // load calculator
        Scanner input=new Scanner(System.in);
        int x=1;
        do{
        try{
      System.out.println("ENTER 1 FOR LOAN CALCULATOR 2 FOR CURRENCY CONVERTER AND 3 FOR UNIT CONVERTER");
      int option=input.nextInt();
      switch(option){
          case 1:
              
           System.out.println("WELCOME TO LOAD AND INTERST CALCULATOR");
      
        System.out.println("....................................................");
        System.out.println("ENTER THE AMOUNT OF MONEY YOU WANT TO LOAN AND "
                + "WE WILL CHARGE 10% INCREASE IN RETURN\n NOTE THE LOAN START FROM 30000 TO 2000000");
        double money=input.nextDouble();
      
        
        
        if(money>=30000 && money<=2000000 ){
            
            
             System.out.println("ENTER THE AMOUNT YOU WANT TO PAY MONTLY. NOTE IT SHOULD BE AT LEAST GMD 1"
                     + "000");
            
            int pay=input.nextInt();
         if(pay>=1000){
          double   finalMoney= money *1.10;
            int total =-1;
     double montly=0;
     while(montly<=finalMoney){

  montly=montly+pay;
      total++; 
      
     
     
         //else{System.out.println("SORRY YOU WILL HAVE TO PAY 1000 EVERY MONTH");}
          
     }
     double  years=total/12.0;
      System.out.println("You will be paying "+ finalMoney+""
               + "\n And it will take " +total+ " months to complete the loan which is " +years+ " years");
        
         }else{System.out.println("SORRY YOU WILL HAVE TO PAY 1000 EVERY MONTH");}
        }else{
        System.out.println("SORRY THE AMOUNT OF LOAD YOU ARE "
                + "TRYING TO BORROW IS NOT ACEPTABLE. OUR LOAN START FROM 30000 TO 2000000");
        }
     x=2;
       // int pay=input.nextInt();
        
     //double   finalMoney= money *1.10;
     
   //  int total =-1;
  //   double montly=0;
  //   while(montly<=finalMoney){

  //montly=montly+pay;
    //  total++; 
     
        // double  years=total/12.0;
     //  System.out.println("You will be paying "+ finalMoney);
     // System.out.println("And it will take " +total+ " months to complete the loan which is " +years+ " years");
       break;
       //currency converter
          case 2:
              double dalasis, dollars,euros,pounds,CFA;
              System.out.println("WELCOME TO CURRENCY CONVERTER");
              System.out.println("WHICH CURRENCY DO YOU WANT TO CONVERT TO? \n PRESS 1 TO DALASIS \n PRESS 2 TO DOLLARS \n PRESS 3 TO EUROS "
                      + "\n PRESS 4 TO POUNDS \n PRESS 5 TO CFA ");
              int currencyChoose=input.nextInt();
              switch(currencyChoose){
                  case 1:
                     System.out.println("WHICH CURRENCY ARE YOU HAVING?\n PRESS 1 FOR DALASIS \n PRESS 2 FOR DOLLARS \n PRESS 3 FOR EUROS "
                      + "\n PRESS 4 FOR POUNDS \n PRESS 5 FOR TO CFA " );
                     int choose=input.nextInt();
                     switch(choose){
                         case 1:
                             System.out.println("enter the amount of money in dalaisis");
                             double sameamount=input.nextDouble();
                            System.out.println("your amount from dalasis to dalasis is GMD "+sameamount);
                            break;
                         case 2:
                             System.out.println("enter the amount of money in dollar");
                             double dollaramount=input.nextDouble();
                             double finaldollar=dollaramount*50;
                             System.out.println("your amount from dollar to dalasis is GMD "+finaldollar);
                             break;
                            case 3:
                             System.out.println("enter the amount of money in euros");
                             double euroamount=input.nextDouble();
                             double finaleuro=euroamount*55;
                             System.out.println("your amount from euros to dalasis is  "+finaleuro) ;
                             break;
                               case 4:
                             System.out.println("enter the amount of money in pounds");
                             double poundamount=input.nextDouble();
                             double finalpound=poundamount*65;
                             System.out.println("your amount from pounds to dalasis is  "+finalpound);
                             break;
                               case 5:
                             System.out.println("enter the amount of money in CFA");
                             double cfaamount=input.nextDouble();
                             double finalcfa=cfaamount/11.5;
                             System.out.println("your amount from CFA to dalasis is CFA "+finalcfa);
                             break;
                             
                                 
                     }
                       break;  
                  case 2:
                       System.out.println("WHICH CURRENCY ARE YOU HAVING?\n PRESS 1 FOR DALASIS \n PRESS 2 FOR DOLLARS \n PRESS 3 FOR EUROS "
                      + "\n PRESS 4 FOR POUNDS \n PRESS 5 FOR TO CFA " );
                     int choose2=input.nextInt();
        {
            switch(choose2)
            {
                case 1:
                    System.out.println("enter the amount of money in dalaisis");
                    double dalasisamount=input.nextDouble();
                    double dalasistodollar=dalasisamount/50;
                    System.out.println("your amount from dalais to dollars is $ "+dalasistodollar);
                    
                    break;
                     case 2:
                    System.out.println("enter the amount of money in dollars");
                    double dollartodollar=input.nextDouble();
                    System.out.println("your amount from dollars to dollars is $ "+dollartodollar); 
                    break;
                     case 3:
                    System.out.println("enter the amount of money in euros");
                    double euroamount=input.nextDouble();
                    double eurotodollar=euroamount*1.23;
                    System.out.println("your amount from euros to dollars is $ "+eurotodollar);
                    break;
                    
                     case 4:
                    System.out.println("enter the amount of money in POUNDS");
                    double poundamount=input.nextDouble();
                    double poundtodollar=poundamount/1.5;
                    System.out.println("your amount from ponds to dollars is $ "+poundtodollar);
                    break;
                    
                     case 5:
                    System.out.println("enter the amount of money in CFA");
                    double CFAamount=input.nextDouble();
                    double CFAtodollar=(CFAamount/50)/11.5;
                    System.out.println("your amount from CFA to dollars is $ "+CFAtodollar);
                    
                    break;
                    
                          
            }
            
        }
                  case 3:
                      System.out.println("WHICH CURRENCY ARE YOU HAVING?\n PRESS 1 FOR DALASIS \n PRESS 2 FOR DOLLARS \n PRESS 3 FOR EUROS "
                      + "\n PRESS 4 FOR POUNDS \n PRESS 5 FOR TO CFA " );
                     int choose3=input.nextInt(); 
                     switch (choose3)
                     {
                         case 1:
                             
                       System.out.println("enter the amount of money in dalaisis");
                    double dalasisamount=input.nextDouble();
                    double dalasistoeuros=dalasisamount/55;
                    System.out.println("your amount from dalais to euros is  "+dalasistoeuros +" euros");
                    break;
                         case 2:
                      System.out.println("enter the amount of money in dollars");
                    double dollaramount=input.nextDouble();
                    double dollartoeuro=dollaramount/1.23;
                    System.out.println("your amount from dollars to euros is  "+dollartoeuro+" euros");
                    break;
                         case 3:
                      System.out.println("enter the amount of money in euros");
                    double euroamount=input.nextDouble();
                 
                    System.out.println("your amount from euro to euros is  "+euroamount+" euros");
                    break;
                         case 4:
                    
                      System.out.println("enter the amount of money in pounds");
                    double poundamount=input.nextDouble();
                    double poundtoeuro=poundamount*1.3;
                    System.out.println("your amount from pound to euros is $ "+poundtoeuro+" euros");
                    break;
                         case 5:
                    
                      System.out.println("enter the amount of money in CFA");
                    double CFAamount=input.nextDouble();
                    double cfatoeuro=(CFAamount/55)/11.3;
                    System.out.println("your amount from CFA to euros is  "+cfatoeuro+ " euros");
                    
                    
                    break;
                     }
                 
                     case 4:
                      System.out.println("WHICH CURRENCY ARE YOU HAVING?\n PRESS 1 FOR DALASIS \n PRESS 2 FOR DOLLARS \n PRESS 3 FOR EUROS "
                      + "\n PRESS 4 FOR POUNDS \n PRESS 5 FOR TO CFA " );
                     int choose4=input.nextInt(); 
                     switch (choose4)
                     {
                         case 1:
                             
                       System.out.println("enter the amount of money in dalaisis");
                    double dalasisamount=input.nextDouble();
                    double dalasistopound=dalasisamount/65;
                    System.out.println("your amount from dalais to pounds is  "+dalasistopound +" pounds");
                    break;
                         case 2:
                      System.out.println("enter the amount of money in dollars");
                    double dollaramount=input.nextDouble();
                    double dollartopound=dollaramount/1.6;
                    System.out.println("your amount from dollars to pounds is  "+dollartopound+" pounds");
                    break;
                         case 3:
                      System.out.println("enter the amount of money in euros");
                    double euroamount=input.nextDouble();
                 double poundtoeuro=euroamount/1.3;
                    System.out.println("your amount from euros to pounds is  "+euroamount+" pounds");
                    break;
                         case 4:
                    
                      System.out.println("enter the amount of money in pounds");
                    double poundamount=input.nextDouble();
                   
                    System.out.println("your amount from pound to pound is $ "+poundamount);
                    break;
                         case 5:
                    
                      System.out.println("enter the amount of money in CFA");
                    double CFAamount=input.nextDouble();
                    double cfatopound=(CFAamount/65)/11.3;
                    System.out.println("your amount from CFA to pounds is $ "+cfatopound);
                    
                      break;
                     
    }   
                       case 5:
                      System.out.println("WHICH CURRENCY ARE YOU HAVING?\n PRESS 1 FOR DALASIS \n PRESS 2 FOR DOLLARS \n PRESS 3 FOR EUROS "
                      + "\n PRESS 4 FOR POUNDS \n PRESS 5 FOR TO CFA " );
                     int choose5=input.nextInt(); 
                     switch (choose5)
                     {
                         case 1:
                             
                       System.out.println("enter the amount of money in dalaisis");
                    double dalasisamount=input.nextDouble();
                    double dalasistocfa=dalasisamount/11.5;
                    System.out.println("your amount from dalais to CFA is  "+dalasistocfa +" CFA");
                    break;
                         case 2:
                      System.out.println("enter the amount of money in dollars");
                    double dollaramount=input.nextDouble();
                    double dollartocfa=dollaramount*50*11.4;
                    System.out.println("your amount from dollars to CFA is  "+dollartocfa+" CFA");
                    break;
                         case 3:
                      System.out.println("enter the amount of money in euros");
                    double euroamount=input.nextDouble();
                 double eurotocfa=euroamount*55*11.4;
                    System.out.println("your amount from euro to CFA is  "+eurotocfa+" CFA");
                    break;
                         case 4:
                    
                      System.out.println("enter the amount of money in pounds");
                    double poundamount=input.nextDouble();
                    double poundtocfa=poundamount*65*11.4;
                    System.out.println("your amount from pound to CFA is  "+poundtocfa +" CFA");
                    break;
                         case 5:
                    
                      System.out.println("enter the amount of money in CFA");
                    double CFAamount=input.nextDouble();
                   
                    System.out.println("your amount from CFA to CFA is  "+CFAamount);
                    
        break;
      
        
      }
                   
                     break;
                        default:
                                 System.out.println("NUMBER NOT ON THE LIST! RELAOD AND CHOOSE ONE NUMBER FROM THE LIST ABOVE");
                             
 
                     
       
      }
              break;
              // unit converter
          case 3:
              
              System.out.println("WELCOME TO UNIT CONVERTER");
              System.out.println("PRESS 1 FROM CENTIMETER TO METER \n PRESS 2 FROM CENTMETER TO KILOMETER \n PRESS 3 FROM METER TO CENTIMENTER"
                      + "\n PRESS 4 FROM KILOMETER TO CENTIMETER \n PRESS 5 FROM METER TO KILOMETER \n PRESS 6 FROM KILOMETER TO METER");
              
              double chooseUnit=input.nextDouble();
              
              if(chooseUnit==1){
              System.out.println("How many centimeters to you want to convert in meters");
              double centimetertometer=input.nextDouble();
              double cen=centimetertometer/100;
              System.out.println("Answers "+cen+" meters");
                  
              }
              
               if(chooseUnit==2){
              System.out.println("How many centimeters to you want to convert in kilometer");
              double centimetertokilometer=input.nextDouble();
              double cent=centimetertokilometer/100000;
              System.out.println("Answers "+cent+" kilometers");
                  
              }
              
               if(chooseUnit==3){
              System.out.println("How many meters to you want to convert in centimeter");
              double centimetertometer=input.nextDouble();
              double cen=centimetertometer*100;
              System.out.println("Answers "+cen+" centimeters");
                  
              }
              
                if(chooseUnit==4){
              System.out.println("How many Kilometers to you want to convert in centimeters");
              double centimetertometer=input.nextDouble();
              double cen=centimetertometer/100000;
              System.out.println("Answers "+cen+" centimeters");
                  
              }
                if(chooseUnit==5){
              System.out.println("How many meters to you want to convert in kilometers");
              double centimetertometer=input.nextDouble();
              double cen=centimetertometer*1000;
              System.out.println("Answers "+cen+" meters");
                  
              }
                if(chooseUnit==6){
              System.out.println("How many kilometers to you want to convert in meters");
              double centimetertometer=input.nextDouble();
              double cen=centimetertometer/1000;
              System.out.println("Answers "+cen+" meters");
                  
              }if(chooseUnit>=7){
                System.out.println("Erro! choose one number from the list above ");
                }
               
               x=2;
              
              break;
           default:
                           System.out.println(" choose number 1-3 to access this application");
                                 
    }
      
        } 
        catch(Exception e){
        System.out.println("ERRO!!!!  NOT ACCEPTED. PLEASE CHOOSE THE AVAILABLE NUMBERS ABOVE");
        input.reset();
        input.next();
        }
        }while(x==2);
}
}