package com.objects;
import java.io.IOException;
import java.util.*;


public class Encapsulation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Details[] a=new Details[3];
        //Details aa=new Details(sc.nextLine(),sc.nextLine(),sc.nextInt());
        //Details as=new Details(sc.nextLine(),sc.nextLine(),sc.nextInt());
        for(int i=0;i<3;i++)
        {

            a[i]=new Details(sc.nextLine(),sc.nextLine(),sc.nextInt());
            sc.nextLine();
            System.out.println(a[i].getId());
            System.out.println(a[i].getCompany());
        }

//System.out.println(a.getId());


    }
}
class Details
{
    private String Name,Company;
    private int Id;
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public String getName()
    {
        return Name;
    }
    public void setCompany(String Company)
    {
        this.Company=Company;
    }
    public String getCompany()
    {
        return Company;
    }
    public void setId(int Id)
    {
        this.Id=Id;
    }
    public int getId()
    {
        return Id;
    }
    public Details(String Name,String Company,int Id)
    {
        this.Name=Name;
        this.Company=Company;
        this.Id=Id;
    }
}
