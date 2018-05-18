/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;


public class JavaApplication72 {

   
    public static void main(String[] args) 
    {
     
      String a[][]={{"A,15,4000","B,45,3000","C,19,7000","D,30,4500","E,46,8000"}};
      int i,j;
      int sum=0;
      for(i=0;i<=a.length-1;i++)
      {
          for(j=0;j<=a[0].length-1;j++)
          {
              System.out.print(a[i][j] +"\n");
      }
              
      System.out.println("  ");
    }
   for(i=0;i<=a.length-1;i++)
   {
     for(j=0;j<=a[0].length-1;j++)
     {
       
     
      String str=a[i][j];   //assign the value of the array to str
      String data[]=str.split(","); //now  split the array a[] to take up each term into the datatype you want in the next step 
      int fee=Integer.parseInt(data[2]);
      sum=sum+fee;
     }
     System.out.println("So the total fees is");
     System.out.println(sum);
   }
   for(i=0;i<=a.length-1;i++)
   {
       for(j=0;j<=a[0].length-1;j++)
       {
           String str1=a[i][j];
           String data1[]=str1.split(",");
           String name=data1[0];
           if(name.equals("B"))
           {
               System.out.println(a[i][j]);
           }
       }
          
           
           
           
       }
   }
   
   
   
   
   
    }

    