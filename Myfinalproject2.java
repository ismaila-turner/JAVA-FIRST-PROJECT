/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfinalproject2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alieu Secka
 */

public class Myfinalproject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=1;
       // do{
        try{
            JOptionPane.showMessageDialog(null, "WELOCME TO OUR VENDOR MACHINE");
            int g=-1;
            while(g<0){
       String Username= JOptionPane.showInputDialog(" PLEASE FIRST TYPE IN YOUR FULL NAME.(Mandetory) ");
       // String Userphone=  JOptionPane.showInputDialog(" TYPE IN YOUR PHONE NUMBER ");
   //  String  name2= JOptionPane.showInputDialog ("IT'S MANDETORY! PLEASE TYPE IN YOUR FULL NAME");
       
       if(Username.length()>=6 && Username.length()<=40){
       g++;
     JOptionPane.showMessageDialog (null,"THANK YOU "+Username+ ". \n CLICK OK TO CONTNUE");
      // String Userphone=  JOptionPane.showInputDialog(" TYPE IN YOUR PHONE NUMBER ");
            }else{
     System.out.println(" Your Full Name Should Be More Than 6 CHARACTERS"); 
       }
       
            }
            int a=-1;
            while (a<0){
            String Useremail=  JOptionPane.showInputDialog(" TYPE IN YOUR EMAIL ADDRESS (Mandetory) ");
            if(Useremail.length()>12 && Useremail.length()<=35){
                a++;
                 System.out.println("Correct Email! Thank You");
            }else{
                System.out.println("Incorrect Email! charater should be at least 12 words");
                        }
            }
            String Userphone=  JOptionPane.showInputDialog(" TYPE IN YOUR PHONE NUMBER (Option) ");
            int h=-1;
            while(h<0){
     String available=   JOptionPane.showInputDialog(" THESE ARE THE AVALIBLE ITEM WE HAVE.\n PARTS OF A COMPUTER \n  LAPTOPS \n PHONES \n  FOOD \n "
               + " BOOKS \n  CLOTHS \n FOOTBALL VEST \n  SHOES \n "
             + "\n................................................."
             + "\n TYPE  OK AND CLICK OK TO CONTINUE OR  CLICK CANCEL TO QUIT");
      // System.out.println("YOU ARE  WELCOME TO THE VENDOR MACHINE ");
      if (available.length()>0 ){
      h++;
      }
            }
         //   String Userphone=  JOptionPane.showInputDialog(" TYPE IN YOUR PHONE NUMBER ");
          //  System.out.println("YOU ARE  WELCOME TO THE VENDOR MACHINE ");
        Scanner input=new Scanner(System.in);
       //  System.out.println("WELCOME TO OUR VENDOR MACHINE ");
             System.out.println("............................................");               
           
        do{
       System.out.println(" PRESS 1 TO BUY PARTS OF A COMPUTER \n PRESS 2 TO BUY A LAPTOP \n PRESS 3 TO BUY A PHONE \n PRESS 4 TO BUY FOOD \n "
               + "PRESS 5 TO BUY BOOKS \n PRESS 6 TO BUY CLOTHS \n PRESS 7 TO BUY FOOTBALL VEST \n PRESS 8 TO BUY A SHOE");
        
       
       
       
       int itemchoice=input.nextInt();
       
       
       
       switch(itemchoice){
           case 1:
                System.out.println("WHICH COMPUTER PART TO YOU WANT TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR MOUSE \n PRESS 2 FOR KEYBOARD  \n PRESS 3 FOR MONITOR "
                          + "\n PRESS 4 FOR A COMPLETE SET OF COMPUTER \n PRESS 5 FOR CPU");
       
       int computerchoice=input.nextInt();
       if(computerchoice==1){
        System.out.println("PLEASE TYPE HOW MANY MOUSE YOU WANT TO BUY?");
        int mousenumber=input.nextInt();
        int totalmouse=mousenumber*150;
           JOptionPane.showMessageDialog(null,mousenumber+" MOUSE WILL COST GMD "+totalmouse+"\n CLICK OK TO START WITH PAYMENT");
        // String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
         int c=-1;
       //  int p=-1;
       // String pin  ;
        while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmouse+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       
           break;
        
            }
       
       if(computerchoice==2){
        System.out.println("PLEASE TYPE HOW MANY KEYBOARDS YOU WANT TO BUY?");
        int keyboardnumber=input.nextInt();
        int totalkeyboard=keyboardnumber*250;
           JOptionPane.showMessageDialog(null,keyboardnumber+ " WILL COST GMD "+totalkeyboard+"\n CLICK OK TO START PAYMENT");
          int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          //  JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalkeyboard+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
            
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       
         break; 
       }
      
       if(computerchoice==3){
        System.out.println("PLEASE TYPE HOW MANY MONITORS YOU WANT TO BUY?");
        int monitornumber=input.nextInt();
        int totalmonitor=monitornumber*1000;
            JOptionPane.showMessageDialog(null,monitornumber+ " WILL COST GMD "+totalmonitor+"\n CLICK OK TO START PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmonitor+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
       }
       
        if(computerchoice==4){
        System.out.println("PLEASE TYPE HOW MANY COMPLETE SET OF COMPUTER YOU WANT TO BUY?");
        int computernumber=input.nextInt();
        int totalcomputer=computernumber*4000;
            JOptionPane.showMessageDialog(null,computernumber+ " WILL COST GMD "+totalcomputer+"\n CLICK OK TO START WITH PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalcomputer+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           
            break;
       }
         if(computerchoice==5){
        System.out.println("PLEASE TYPE HOW MANY CPU YOU WANT TO BUY?");
        int cpunumber=input.nextInt();
        int totalcpu=cpunumber*2000;
            JOptionPane.showMessageDialog(null,cpunumber+ " WILL COST GMD "+totalcpu+"\n CLICK OK TO START PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalcpu+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
           
       }if(computerchoice>=6){
           JOptionPane.showMessageDialog(null,"ERRO!! PLEASE CHOOSE 1 TO 5 . RELOAD AND TRY AGAIN");
         }break;
         
           case 2:
              System.out.println("WHICH LAPTOP DO YOU WANT TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR DELL LAPTOP \n PRESS 2 FOR TOSHIBA LAPTOP  \n PRESS 3 FOR LENOVO LAPTOP "
                          + "\n PRESS 4 FOR MAC \n PRESS 5 FOR ACER");  
                  
                 int laptopchoice=input.nextInt();
                 if(laptopchoice==1){
                     
                     System.out.println(" PRESS 1 FOR MEDIUM SIZE, STORAGE 500GB AND PROCESSOR 16GB \n PRESS 2 FOR SMALL SIZE, STORAGE 1TB AND PROCESSOR 32GB ");
                int dellchoice=input.nextInt();
                
                if(dellchoice==1){
                     System.out.println("PLEASE TYPE HOW MANY DELL MEDIUM SIZE LAPTOP YOU WANT TO BUY?");
        int mediumsize=input.nextInt();
        int totalmedium=mediumsize*25000;
            JOptionPane.showMessageDialog(null,mediumsize+ " WILL COST GMD "+totalmedium+"\n CLICK OK TO START PAYMENT"); 
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmedium+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
                }
                 if(dellchoice==2){
                     System.out.println("PLEASE TYPE HOW MANY DELL SMALL SIZE LAPTOP YOU WANT TO BUY?");
        int smallsize=input.nextInt();
        int totalsmall=smallsize*30000;
          System.out.println(smallsize+ " WILL COST GMD "+totalsmall); 
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalsmall+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
          
          
                }if(dellchoice>=3)
                {
                   JOptionPane.showMessageDialog(null,"ERRO!! PLEASE CHOOSE 1 OR 2.  TRY AGAIN ");
                 }
                 }
                if(laptopchoice==2) {
                System.out.println("WE HAVE ONLY MEDIUM SIZE TOSHIBA OF STORAGE 300GB AND PROCESSOR 4GB i3 \n PRESS 1 TO BUY OR ANY OTHER NUMBER TO QUIT");
                int toshibachoice=input.nextInt();
                if(toshibachoice==1){

                     System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int mediumsize=input.nextInt();
        int totalmedium=mediumsize*7000;
            JOptionPane.showMessageDialog(null,mediumsize+ " WILL COST GMD "+totalmedium+"\n CLICK OK TO START PAYMENT"); 
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmedium+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
                }
                
                else{
                 JOptionPane.showMessageDialog(null,"THANKS FOR QUITING. PLEASE RELOAD TO BUY ANOTHER ITEM.");
                }
                
                }
                if(laptopchoice==3){
                    System.out.println(" PRESS 1 FOR BIG SIZE, STORAGE 250GB AND PROCESSOR 8GB, i5 \n PRESS 2 FOR MEDIUM SIZE, STORAGE 1TB AND PROCESSOR 16GB, i7\n PRESS "
                            + "3 FOR MEDIUM SIZE 500GB WITH PROCESSOR 32GB i5 ");
                int lenovochoice=input.nextInt();
                if(lenovochoice==1){
                          System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int bigsize=input.nextInt();
        int totalbig=bigsize*9500;
          JOptionPane.showMessageDialog(null,bigsize+ " WILL COST GMD "+totalbig+"\n CLICK OK TO START PAYMENT"); 
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalbig+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
                }
                   if(lenovochoice==2){
                          System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int mediumsize=input.nextInt();
        int totalbig=mediumsize*17000;
            JOptionPane.showMessageDialog(null,mediumsize+ " WILL COST GMD "+totalbig); 
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalbig+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
                }
                      if(lenovochoice==3){
                          System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int bigsize=input.nextInt();
        int totalbig=bigsize*26000;
          System.out.println(bigsize+ " WILL COST GMD "+totalbig); 
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalbig+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       //   JOptionPane.showMessageDialog(null, bigsize);
                }
                      if(lenovochoice>=4){
                     System.out.println("ERRO!! PLEASE CHOOSE 1 TO 3. RELOAD AND TRY AGAIN."); 
                      }else{
                      System.out.println("Erro! choose from the available numbers");
                      }
                       break;
                }
                if(laptopchoice==4){
                  System.out.println("WE HAVE  MEDIUM SIZE MAC OF STORAGE 1TB AND PROCESSOR 32GB\n PRESS 1 TO BUY OR ANY OTHER NUMBER TO QUIT");
                int macchoice=input.nextInt();
                if(macchoice==1){

                     System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int mediumsize=input.nextInt();
        int totalmedium=mediumsize*50000;
           JOptionPane.showMessageDialog(null,mediumsize+ " WILL COST GMD "+totalmedium+"\n CLICK OK TO START PAYMENT"); 
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmedium+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
                }else{
                System.out.println("THANKS FOR QUITING. PLEASE RELOAD TO BUY ANOTHER ITEM.");
                }
                
                }
                 if(laptopchoice==5){
                  System.out.println("WE HAVE  BIG SIZE MAC OF STORAGE 500GB AND PROCESSOR 16GB WITH i5\n PRESS 1 TO BUY OR ANY OTHER NUMBER TO QUIT");
                int acerchoice=input.nextInt();
                if(acerchoice==1){

                     System.out.println("PLEASE TYPE HOW MANY  YOU WANT TO BUY?");
        int mediumsize=input.nextInt();
        int totalmedium=mediumsize*50000;
            JOptionPane.showMessageDialog(null,mediumsize+ " WILL COST GMD "+totalmedium+"\n CLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmedium+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
          
                }else{
                System.out.println("THANKS FOR QUITING. PLEASE RELOAD TO BUY ANOTHER ITEM.");
                }
                 break;
                }
                  break;
              case 3:
                System.out.println("WHICH PHONE TO YOU WANT TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR IPHONE \n PRESS 2 FOR SAMGUNG ");
       
       int phonechoice=input.nextInt();
       if(phonechoice==1){
             System.out.println(" PRESS 1 FOR IPHONE 8 \n PRESS 2 FOR IPNONE X \n PRESS "
                            + "3 FOR IPHONE 11");
          int iphonechoice=input.nextInt();
           if(iphonechoice==1){
            System.out.println("PLEASE TYPE HOW MANY IPHONE 8 YOU WANT TO BUY?");
        int iphone8number=input.nextInt();
        int totalphone=iphone8number*15000;
           JOptionPane.showMessageDialog(null,iphone8number+" IPHONE 8 WILL COST GMD "+totalphone+"\n CLICK OK TO START PAYMENT");
         
             int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalphone+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
           }
       
       if(iphonechoice==2){
        System.out.println("PLEASE TYPE HOW MANY YOU WANT TO BUY?");
        int iphonexnumber=input.nextInt();
        int totaliphonex=iphonexnumber*25000;
           JOptionPane.showMessageDialog(null,iphonexnumber+ " WILL COST GMD "+totaliphonex+"\nCLICK OK TO START PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totaliphonex+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(iphonechoice==3){
        System.out.println("PLEASE TYPE HOW MANY YOU WANT TO BUY?");
        int iphone11number=input.nextInt();
        int total11=iphone11number*33000;
            JOptionPane.showMessageDialog(null,iphone11number+ " WILL COST GMD "+total11+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+total11+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
          
        break;
       }if (iphonechoice>=4){
       System.out.println("ERRO! CHOOSE FROM THE AVAILABLE NUMBER. RELOAD AND TRY AGAIN");
       }
        
          
       }
        if(phonechoice==2){
             System.out.println(" PRESS 1 FOR SAMSUNG 7 \n PRESS 2 FOR SAMSUNG 8 \n PRESS "
                            + "3 FOR SAMSUNG 9");
          int samsungchoice=input.nextInt();
           if(samsungchoice==1){
            System.out.println("PLEASE TYPE HOW MANY SAMSUNG 7 YOU WANT TO BUY?");
        int iphone8number=input.nextInt();
        int totalphone=iphone8number*7000;
           JOptionPane.showMessageDialog(null,iphone8number+"  WILL COST GMD "+totalphone+"\nCLICK OK TO START PAYMENT");
               int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalphone+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
           }
       
       if(samsungchoice==2){
        System.out.println("PLEASE TYPE HOW MANY SAMSUNG 8 YOU WANT TO BUY?");
        int iphonexnumber=input.nextInt();
        int totaliphonex=iphonexnumber*12000;
            JOptionPane.showMessageDialog(null,iphonexnumber+ " WILL COST GMD "+totaliphonex+"\nCLICK OK TO START PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totaliphonex+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       }
       
       if(samsungchoice==3){
        System.out.println("PLEASE TYPE HOW MANY SAMSUNG 9 YOU WANT TO BUY?");
        int iphone11number=input.nextInt();
        int total11=iphone11number*17000;
            JOptionPane.showMessageDialog(null,iphone11number+ " WILL COST GMD "+total11+"\nCLICK OK TO START PAYMENT");
            int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+total11+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       }
       if (samsungchoice>=4){
       System.out.println("ERRO! CHOOSE FROM THE AVAILABLE NUMBER. RELOAD AND TRY AGAIN");
       }break;
        
    }break;
          case 4:
                System.out.println("THIS ARE THE AVAILABLE FOOD WHICH FOOD TO YOU WANT TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR MEAT \n PRESS 2 FOR CHICKEN \n PRESS 3 FOR FISH \n PRESS ANY OTHER NUMBER TO QUIT IF FOOD CHOICE "
                          + "IS NOT AVAILABLE");
       int foodchoice=input.nextInt();
       if(foodchoice==1){
       System.out.println("EACH PACKAGE OF MEANT COST GMD 500");
       
         System.out.println("HOW MANY PACKAGE WOULD YOU WANT TO BUY");
         int meatchoice=input.nextInt();
          int totalmeat=meatchoice*500;
           JOptionPane.showMessageDialog(null,meatchoice+ " WILL COST GMD "+totalmeat+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalmeat+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       }
       
       if(foodchoice==2){
       System.out.println("EACH PACKAGE OF CHICKEN COST GMD 300");
       
         System.out.println("HOW MANY PACKAGE WOULD YOU WANT TO BUY");
         int    chickenchoice=input.nextInt();
          int totalchicken=chickenchoice*300;
           JOptionPane.showMessageDialog(null,chickenchoice+ " WILL COST GMD "+totalchicken+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalchicken+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
          
       }
       if(foodchoice==3){
       System.out.println("EACH PACKAGE OF FISH COST GMD 250");
       
         System.out.println("HOW MANY PACKAGE WOULD YOU WANT TO BUY");
         int fishchoice=input.nextInt();
          int totalfish=fishchoice*250;
            JOptionPane.showMessageDialog(null,fishchoice+ " WILL COST GMD "+totalfish+"\n CLICK OK TO START PAYMENNT ");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalfish+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       }
       if(foodchoice>=4){
       System.out.println("THANKS FOR QUITING. RELOAD TO BUY ANOTHER ITEM.");
       }break;
        
          
          case 5:
                System.out.println("THIS ARE THE AVAILABLE BOOKS WHICH BOOK DO YOU WANT TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR  STORY BOOK FOR KID \n PRESS 2 FOR POEM BOOK \n PRESS 3 FOR HISTORY BOOK \n PRESS ANY OTHER NUMBER TO QUIT IF BOOK CHOICE "
                          + "IS NOT AVAILABLE");
                   int bookchoice=input.nextInt();
       if(bookchoice==1){
       System.out.println("EACH STORY BOOK COST GMD 200");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int storrychoice=input.nextInt();
          int totalstory=storrychoice*200;
           JOptionPane.showMessageDialog(null,storrychoice+ " WILL COST GMD "+totalstory+"\n CLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalstory+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
       }
       
       if(bookchoice==2){
       System.out.println("EACH POEM BOOK COST GMD 250");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int    poemchoice=input.nextInt();
          int totalpoem=poemchoice*250;
           JOptionPane.showMessageDialog(null,poemchoice+ " WILL COST GMD "+totalpoem+"\n CLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalpoem+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(bookchoice==3){
       System.out.println("EACH HISTORY BOOK COST GMD 300");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int historychoice=input.nextInt();
          int totalhistory=historychoice*300;
            JOptionPane.showMessageDialog(null,historychoice+ " WILL COST GMD "+totalhistory+"\n CLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalhistory+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(bookchoice>=4){
       System.out.println("THANKS FOR QUITING. RELOAD TO BUY ANOTHER ITEM.");
       }break;
       
     case 6:
                System.out.println("THIS ARE THE AVAILABLE CLOTHS WHICH TYPE OF CLOTH DO YOU WISH TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR  BLUE JEANS \n PRESS 2 FOR WHITE JEANS \n PRESS 3 FOR WHITE LONG SLIVE \n PRESS 4 FOR WHITE SHORT SLIVE \n PRESS 5 FOR WHITE UNDERWARE SHIRT \n PRESS ANY OTHER NUMBER TO QUIT IF BOOK CHOICE "
                          + "IS NOT AVAILABLE");  
                  
                       int clothchoice=input.nextInt();
       if(clothchoice==1){
       System.out.println("EACH BLUE JEANS COST GMD 500");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int bluechoice=input.nextInt();
          int totalblue=bluechoice*500;
            JOptionPane.showMessageDialog(null,bluechoice+ " WILL COST GMD "+totalblue+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalblue+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           
            break;
       }
       
       if(clothchoice==2){
       System.out.println("EACH WHITE JEANS COST GMD 525");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int    whitechoice=input.nextInt();
          int totalwhite=whitechoice*525;
         JOptionPane.showMessageDialog(null,whitechoice+ " WILL COST GMD "+totalwhite+"\nCLICK OK TO START PAYMENT");
          
             int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalwhite+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING "); 
          
          break; 
       }
       if(clothchoice==3){
       System.out.println("EACH WHITE LONG SLIVE COST GMD 600");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*600;
            JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(clothchoice==4){
       System.out.println("EACH WHITE SHORT SLIVE COST GMD 450");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*450;
           JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(clothchoice==5){
       System.out.println("EACH WHITE UNDERWEAR SHIRT COST GMD 200");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*200;
           JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
       }
       
       if(clothchoice>=6){
       System.out.println("THANKS FOR QUITING. RELOAD TO BUY ANOTHER ITEM.");
       }break;
         
           case 7:
                System.out.println("THESE ARE THE AVAILABLE FOOTBALL VEST WHICH TYPE OF VEST DO YOU WISH TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR  TOTTENHAM HOTSPUR  VEST \n PRESS 2 FOR MAN UNITED VEST \n PRESS 3 FOR MAN CITY VEST \n PRESS 4 FOR LIVERPOOL VEST \n PRESS 5 FOR ARSENAL VEST \n"
                          + " PRESS ANY OTHER NUMBER TO QUIT IF BOOK CHOICE "
                          + "IS NOT AVAILABLE");  
                  
                       int vestchoice=input.nextInt();
       if(vestchoice==1){
       System.out.println("EACH SPURS VEST COST GMD 500");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int spurschoice=input.nextInt();
          int totalspurs=spurschoice*500;
           JOptionPane.showMessageDialog(null,spurschoice+ " WILL COST GMD "+totalspurs+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalspurs+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
          
           break;
       }
       
       if(vestchoice==2){
       System.out.println("EACH MAN UNITED COST GMD 700");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int    whitechoice=input.nextInt();
          int totalwhite=whitechoice*700;
            JOptionPane.showMessageDialog(null,whitechoice+ " WILL COST GMD "+totalwhite+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalwhite+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(vestchoice==3){
       System.out.println("EACH MAN CITY VEST COST GMD 650");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*650;
            JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
           break;
       }
       
       if(vestchoice==4){
       System.out.println("EACH LIVERPOOL VEST COST GMD 500");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*0500;
           JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(vestchoice==5){
       System.out.println("EACH ARSENAL VEST COST GMD 450");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*450;
           JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\nCLICK OK TO START PAYMENT");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(vestchoice>=6){
       System.out.println("THANKS FOR QUITING. RELOAD TO BUY ANOTHER ITEM.");
       }break;
                   
        case 8:
                System.out.println("THESE ARE THE AVAILABLE SHOES WHICH TYPE OF VEST DO YOU WISH TO BUY");
                 System.out.println(".................................");
                  System.out.println(" PRESS 1 FOR  AIRMASS \n PRESS 2 FOR JORDAN \n PRESS 3 FOR CONVASS \n PRESS 4 FOR FULL SHOSE \n PRESS 5 FOR SPORT SHOE \n"
                          + " PRESS ANY OTHER NUMBER TO QUIT IF BOOK CHOICE "
                          + "IS NOT AVAILABLE");  
                  
                       int shoechoice=input.nextInt();
       if(shoechoice==1){
       System.out.println("EACH AIRMASS COST GMD 1000");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int airmasschoice=input.nextInt();
          int totalairmass=airmasschoice*1000;
           JOptionPane.showMessageDialog(null,airmasschoice+ " WILL COST GMD "+totalairmass+"\nCLICK OK TO START PAYMENT ");
          
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalairmass+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(shoechoice==2){
       System.out.println("EACH JORDAN COST GMD 2500");
       
         System.out.println("HOW MANY  WOULD YOU WANT TO BUY");
         int    jordanchoice=input.nextInt();
          int totaljordan=jordanchoice*2500;
            JOptionPane.showMessageDialog(null,jordanchoice+ " WILL COST GMD "+totaljordan+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totaljordan+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(shoechoice==3){
       System.out.println("EACH CONVESS COST GMD 800");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int convesschoice=input.nextInt();
          int totalconvess=convesschoice*800;
           JOptionPane.showMessageDialog(null,convesschoice+ " WILL COST GMD "+totalconvess+"\nCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalconvess+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(shoechoice==4){
       System.out.println("EACH FULL COST GMD 1500");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int fullchoice=input.nextInt();
          int totalfull=fullchoice*1500;
            JOptionPane.showMessageDialog(null,fullchoice+ " WILL COST GMD "+totalfull+"\nCCLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalfull+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       if(shoechoice==5){
       System.out.println("EACH SPORT SHOE COST GMD 750");
       
         System.out.println("HOW MANY WOULD YOU WANT TO BUY");
         int whiteslvchoice=input.nextInt();
          int totalslv=whiteslvchoice*750;
           JOptionPane.showMessageDialog(null,whiteslvchoice+ " WILL COST GMD "+totalslv+"\n CLICK OK TO START PAYMENT");
              int c=-1;
            while(c<0){
     String credit=   JOptionPane.showInputDialog(" ENTER YOUR CREDIT CARD NUMBER");
      if(credit.length()==16 ){
     c++;
      }else{ JOptionPane.showMessageDialog(null,"INCORRECT CARED NUMBER ");}
         }
        int p=-1;
        while(p<0){
     String  pin= JOptionPane.showInputDialog(" ENTER YOUR PIN");
        if(pin.length()==3){
            p++;
        }else{JOptionPane.showMessageDialog(null,"INCORRECT PIN "); }
       }
          JOptionPane.showInputDialog("CARD EXPIRE DATE M/Y");
          
           JOptionPane.showMessageDialog(null,"CLICK OK TO CONFIRM PAYMENT");
          
            JOptionPane.showMessageDialog(null,"GMD "+totalslv+" IS BEEN WITHDRAWN FROM YOUR ACCOUNT");
          
          
           JOptionPane.showMessageDialog(null,"THANKS FOR BUYING ");
            break;
       }
       
       if(shoechoice>=6){
      JOptionPane.showMessageDialog(null,"THANKS FOR QUITING. RELOAD TO BUY ANOTHER ITEM.");
       }break;
    
       default:
               JOptionPane.showMessageDialog(null,"NUMBER NOT ON THE LIST! RELAOD AND CHOOSE ONE NUMBER FROM THE LIST ABOVE");
                                
}
       
      
       
         
   
        }while(x==1);
       // catch(Exception e){
       // System.out.println("ERRO!!  RELOAD AND CHOOSE THE CORRECT OPTION ");
        } catch(Exception e){
        System.out.println("ERRO!!  RELOAD AND CHOOSE THE CORRECT OPTION ");
        }
}
}
