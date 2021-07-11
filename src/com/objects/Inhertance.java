package com.objects;

public class Inhertance {
    public static void main(String args[])
    {
        Address a=new Address(34,"fdfdhkdfs","fsdhjsdkjewr");
        a.display();
    }
}
class City
{
    String mycity;
    String mylocality;
    public City()
    {
        mycity="kotdwara";
        mylocality="manpur";
    }
    public City(String mycity,String mylocality)
    {
        this.mycity=mycity;
        this.mylocality=mylocality;
    }
    public void display()
    {
        System.out.println("city= "+ mycity +" locality= "+ mylocality);
    }
}
class Address extends City
{
    int housenum;
    public Address(int housenum,String mycity,String mylocality)
    {
        super(mycity,mylocality);
        this.housenum=housenum;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("House number="+housenum);
    }
}