/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author HP
 */import javax.swing.JOptionPane;

public class JavaApplication6 {
public static void main(String[] arg){ 
	{
            int i;
       String nber1,nber2;
               double answer;
    String choice;
    for (;;)
    {
            choice=JOptionPane.showInputDialog("Enter 1.addition, 2.Division, 3.Multiplication, 4.Subtraction, 5.Square Root, 6.Power, 7.Modulo, 8.Log, 9.coine, 10.sines, 11.tan, 12.Percentage, 13.ln, 14.x2, 15.x3");  
            int n1=Integer.parseInt(choice);
            switch(n1)
            {
            case 1:
             //addition
                JOptionPane.showMessageDialog(null, "Welcome", "Addition", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 2:");
             nber2=JOptionPane.showInputDialog("Enter Nber 2:"); 
             int number1=Integer.parseInt(nber1);
             int number2=Integer.parseInt(nber2);
             answer=number1+number2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer  Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                case 2:
             //division
                    JOptionPane.showMessageDialog(null, "Welcome", "division", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1::");
             nber2=JOptionPane.showInputDialog("Enter Nber 2::"); 
             number1=Integer.parseInt(nber1);
             number2=Integer.parseInt(nber2);
             answer=number1/number2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                    case 3:
             //mult
                        JOptionPane.showMessageDialog(null, "Welcome", "Multiplication", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             nber2=JOptionPane.showInputDialog("Enter Nber 2:"); 
             number1=Integer.parseInt(nber1);
             number2=Integer.parseInt(nber2);
             answer=number1*number2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                         case 4:
             //sub
                             JOptionPane.showMessageDialog(null, "Welcome", "substraction", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             nber2=JOptionPane.showInputDialog("Enter Nber 2:"); 
             number1=Integer.parseInt(nber1);
             number2=Integer.parseInt(nber2);
             answer=number1-number2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
        case 5:
             //squareroot
            JOptionPane.showMessageDialog(null, "Welcome", "square root", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber:");
             number1=Integer.parseInt(nber1);
            answer=Math.sqrt(number1);
            JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
             case 6:
             //power
                 JOptionPane.showMessageDialog(null, "Welcome", "power", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             nber2=JOptionPane.showInputDialog("Enter Nber 2:"); 
             number1=Integer.parseInt(nber1);
             number2=Integer.parseInt(nber2);
             answer=Math.pow(number1, number2);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                  case 7:
             //moludo
                      JOptionPane.showMessageDialog(null, "Welcome", "moludo", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             number1=Integer.parseInt(nber1);
            answer=number1%2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
            case 8:
             //logarithms
                JOptionPane.showMessageDialog(null, "Welcome", "logarthms", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             
             number1=Integer.parseInt(nber1);
             
             answer=Math.log(number1);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Panel:", JOptionPane.PLAIN_MESSAGE);
         break;
            case 9:
             //cosines
                JOptionPane.showMessageDialog(null, "Welcome", "cosines", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             
             number1=Integer.parseInt(nber1);
             
             answer=Math.cos(number1);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
           case 10:
             //sines
               JOptionPane.showMessageDialog(null, "Welcome", "sines", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             
             number1=Integer.parseInt(nber1);
             
             answer=Math.sin(number1);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                case 11:
             //tan
                    JOptionPane.showMessageDialog(null, "Welcome", "tan", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
              
             number1=Integer.parseInt(nber1);
             
             answer=Math.tan(number1);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                     case 12:
             //perce
                         JOptionPane.showMessageDialog(null, "Welcome", "percentage", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             nber2=JOptionPane.showInputDialog("Enter Nber 2:"); 
             number1=Integer.parseInt(nber1);
             number2=Integer.parseInt(nber2);
             answer=number1*100/number2;
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
            case 13:
             //ln
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             
             number1=Integer.parseInt(nber1);
             
             answer=Math.log10(number1);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Panel:", JOptionPane.PLAIN_MESSAGE);
         break;
                 case 14:
             //x2
                     JOptionPane.showMessageDialog(null, "Welcome", "x2", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
              
             number1=Integer.parseInt(nber1);
             
             answer=Math.pow(number1,2);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
                      case 15:
             //x3
                          JOptionPane.showMessageDialog(null, "Welcome", "x3", JOptionPane.PLAIN_MESSAGE);
             nber1=JOptionPane.showInputDialog("Enter Nber 1:");
             
             number1=Integer.parseInt(nber1);
             
             answer=Math.pow(number1, 3);
            
             JOptionPane.showMessageDialog(null, "The Answer::\t" +answer, "Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
         break;
         default:
             JOptionPane.showMessageDialog(null, "\t Choice Not Listed Plz Try Again..." ,"Calculator Answer Box:", JOptionPane.PLAIN_MESSAGE);
            break;
             
            }
        }
}
}
     
     