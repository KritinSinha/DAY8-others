/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentpolymorphism;

class A
{
    public int volume(int x)
    {
        
        return(x*x*x);
    }
    
    public int volume(int l,int b,int h)
    {
        
        return(l*b*h); 
    }
    public double volume(double s)  //clear this
    {
        
        return((4/3)*Math.PI*s*s*s);
    }
}




public class AssignmentPolymorphism {

    
    public static void main(String[] args) 
    {
      A obj=new A();
      
      int n1=obj.volume(3);
      System.out.println("The volume of cube is");
      System.out.println(n1);
      
      int n2=obj.volume(3,5,2);
      System.out.println("The volume of cuboid is");
      System.out.println(n2);
      
      double n3=obj.volume(4.1);
      System.out.println("The volume of sphere is");
      System.out.println(n3);  
        
    }
    
}
