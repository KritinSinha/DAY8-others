/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism1;

class A
{
    public void sum(int a,int b)
    {
        System.out.println(a+b);
    }

 public void sum(int a,int b,int c)
 {
     System.out.println(a+b+c);
 }

}

public class Polymorphism1 {

    
    public static void main(String[] args) 
    {
        A obj=new A();  //A()is the constructor and obj is the reference variable
        obj.sum(3, 8);
        obj.sum(10, 3, 67);
    }
    
}
