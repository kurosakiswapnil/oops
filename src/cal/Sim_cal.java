package cal;

public class Sim_cal implements Shape{
    private int a;
    private int b;
    private double len;
    private double breath;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getLen() {
        return len;
    }

    public void setLen(double radius) {
        this.radius = radius;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }
    public Sim_cal()
    {
        this.a=0;
        this.b=0;
        this.len=0;
        this.breath=0;
    }
    public Sim_cal(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public Sim_cal(double len, double breath)
    {
        this.len=len;
        this.breath=breath;
    }
    public Sim_cal(double radius)
    {
        this.radius=radius;
    }

    public void setB(int b) {
        this.b = b;
    }
    int add()
    {
        return a+b;
    }

    int sub(int a,int b)
    {
        return a-b;
    }
    int multi()
    {
        return a*b;
    }
    int division(int a,int b)
    {
        return a/b;
    }

    public double area(double radius)
    {
        double i=3.14*radius*radius;
        return i;
    }
    public double area(double len,double breath) {
        return len*breath;
    }


    @Override
    public double rect_param() {
        return 4*len;
    }

    @Override
    public double circle_param() {
        return 2*3.14*radius;
    }
}