/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;
 
class A
{
    public int area(int l,int b)
    {
      return(l*b);
    }
    
    public double area(double r)
    {
          return(Math.PI*r*r);
    }
}



public class Polymorphism2 {

    
    public static void main(String[] args) 
    {
     A ar=new A();   //A() si the constructor and ar is the referecne variable
    
     int n= ar.area(4,5);                   //why did we assign it in a new variable????
     System.out.println(n);
    
     double m=ar.area(6);
     System.out.println(m);                  //why did we assign it in a new variable???? if so, then what happens to the retrun statement in the classes aboove. What significance do they have????
        
        
    }
    
}
