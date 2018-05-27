/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author Pragati Gusain
 */
class A
{
    int a,b,c;
    A()
    {
        a=10;
        b=20;
    }
    void add()
    {
        c=a+b;
    }
    void display()
    {
        System.out.print("Sum is:"+c);
    }
}
public class Inheritance extends A 
{
    Inheritance()
              {
                  super();
              }

    @Override
    void add() 
    {
        super.add(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void display() 
    {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) 
    {
      Inheritance obj=new Inheritance();
      obj.add();
      obj.display();
    }
    
}
