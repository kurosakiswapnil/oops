package cal;

import java.util.ArrayList;

class Adv_cal extends Sim_cal implements Shape
{
    private int c;
    private ArrayList<Integer> s;

    public ArrayList<Integer> getS() {
        return s;
    }

    public void setS(ArrayList<Integer> s) {
        this.s = s;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public Adv_cal()
    {
        super();
        this.c=0;
    }
    public Adv_cal(int a, int b) {
        super(a, b);
    }
    public Adv_cal(double len,double breath)
    {
        super(len, breath);
    }
    public Adv_cal(double radius)
    {
        super(radius);
    }
    public Adv_cal(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    public Adv_cal(ArrayList<Integer> s)
    {
        this.s=s;
    }

//    @Override
//    int add() {
//        System.out.println("Child class");
//        return this.c +super.getA()+super.getB();
//    }
    @Override
    int add()
    {
        int sum=0;
        for (int i = 0; i < s.size(); i++)
        {
            sum+=s.get(i);
        }
        return sum;
    }

    @Override
    int multi() {
        int mul=1;
        for (int i = 0; i < s.size(); i++)
        {
            mul*=s.get(i);
        }
        return mul;
    }

    int mod(int a, int b)
    {
        return a%b;
    }
    int abs(int a)
    {
        return Math.abs(a);
    }
    double sqrt(double a)
    {
        return Math.sqrt(a);
    }
    double exp(double a)
    {
        return Math.exp(a);
    }
    public void superrect_paramm() {
        super.rect_param();
    }
    @Override
    public double rect_param() {
        return (2*(super.getLen()+super.getBreath()));
    }

    @Override
    public double circle_param() {
        return (2*3.14*super.getRadius());
    }
}
