package pro;

import java.util.*;

interface Calc
{
    void display(int result);
}
abstract class Dis implements Calc
{
    public void display() {
        Bean s=new Bean();
        System.out.println("answer="+s.getResult());
    }
}

class Bean
{
    private int result;
    private int value1;
    private int value2;
    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
    public void setResult(int result)
    {
        this.result=result;
    }
    public int getResult()
    {
        return result;
    }
}
class Calculation
{
    int a,b;
    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }
    public int div(){
        return a/b;
    }
    public int mul(){
        return a*b;
    }
    public int mod(){
        return a%b;
    }
}
class sol extends Calculation
{
    public void adder(int a[])
    {

    }
}


public class Solution {
    public static void main(String args[])
    {
        System.out.println("Operations");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplication");
        System.out.println("5.Modulas");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();






    }


}
