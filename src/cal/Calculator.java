package cal;

import java.util.*;

public class Calculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        double n1,n2;
        char y='Y';
        while(y=='Y' || y=='y') {
            System.out.println("Type of Calculator");
            System.out.println("1 - Simple Calculator");
            System.out.println("2 - Advanced Calculator");

            char ch = sc.nextLine().charAt(0);
            if (ch == '1') {
                System.out.println("1-Addition of 2 numbers");
                System.out.println("2-Subtraction of 2 numbers");
                System.out.println("3- Multiplication of 2 numbers");
                System.out.println("4- division of 2 numbers");
                System.out.println("5- Area of Rectangle");
                System.out.println("6- Area of Circle");
                System.out.println("7- Perimeter of Square");
                System.out.println("8- Perimeter of Circle");
                char op = sc.nextLine().charAt(0);
                Sim_cal cal = new Sim_cal();

                switch (op) {
                    case '1':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        cal = new Sim_cal(num1, num2);
                        System.out.println(cal.add());
                        break;
                    case '2':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        System.out.println(cal.sub(num1,num2));
                        break;
                    case '3':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        cal = new Sim_cal(num1, num2);
                        System.out.println(cal.multi());
                        break;
                    case '4':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        System.out.println(cal.division(num1,num2));
                        break;
                    case '5':
                        System.out.println("Enter Length");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println("Enter Breath");
                        n2 = Integer.parseInt(sc.next());
                        System.out.println(cal.area(n1,n2));
                        break;
                    case '6':
                        System.out.println("Enter Radius");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println(cal.area(n1));
                        break;
                    case '7':
                        System.out.println("Enter Side");
                        n1 = Double.parseDouble(sc.next());
                        Shape c=new Sim_cal(n1);
                        System.out.println(c.rect_param());
                        break;
                    case '8':
                        System.out.println("Enter radius");
                        n1 = Double.parseDouble(sc.next());
                        Shape cg=new Sim_cal(n1);
                        System.out.println(cg.circle_param());
                        break;
                    default:
                        System.out.println("Wrong Option");
                        break;
                }

            }
            else if (ch == '2') {
                System.out.println("A-Addition of numbers");
                System.out.println("B-Subtraction of 2 numbers");
                System.out.println("C- Multiplication of numbers");
                System.out.println("D- division of 2 numbers");
                System.out.println("E- Area of Rectangle");
                System.out.println("F- Area of Circle");
                System.out.println("G- Perimeter of rectangle");
                System.out.println("H- Perimeter of Circle");
                System.out.println("I- Modules of number");
                System.out.println("J- Absolute of a number");
                System.out.println("K- Square root of number");
                System.out.println("L- Exponent of a number");
                char op = Character.toUpperCase(sc.nextLine().charAt(0));
                Adv_cal adv_cal=new Adv_cal();
                switch (op)
                {
                    case 'A':
                        char accept='a';
                        ArrayList<Integer> ad = new ArrayList<>();
                        while(accept=='A' || accept=='a')
                        {
                            System.out.println("Enter numbers ");
                            int k=Integer.parseInt(sc.next());
                            ad.add(k);
                            System.out.println("Want to add more press 'A' else 'X'");
                            accept=sc.next().charAt(0);
                            sc.nextLine();
                        }
                        adv_cal=new Adv_cal(ad);
                        System.out.println(adv_cal.add());
                        break;
                    case 'B':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        System.out.println(adv_cal.sub(num1,num2));
                        break;
                    case 'C':
                        char acc='a';
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        while(acc=='A' || acc=='a')
                        {
                            System.out.println("Enter numbers ");
                            int k=Integer.parseInt(sc.next());
                            arrayList.add(k);
                            System.out.println("Want to add more press 'A' else 'X'");
                            acc=sc.next().charAt(0);
                            sc.nextLine();
                        }
                        adv_cal=new Adv_cal(arrayList);
                        System.out.println(adv_cal.multi());
                        break;
                    case 'D':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        System.out.println(adv_cal.division(num1,num2));
                        break;
                    case 'E':
                        System.out.println("Enter Length");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println("Enter Breath");
                        n2 = Integer.parseInt(sc.next());
                        System.out.println(adv_cal.area(n1,n2));
                        break;
                    case 'F':
                        System.out.println("Enter Radius");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println(adv_cal.area(n1));
                        break;
                    case 'G':
                        System.out.println("Enter Length");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println("Enter Breath");
                        n2 = Integer.parseInt(sc.next());
                        Shape cp=new Adv_cal(n1,n2);
                        System.out.println(cp.rect_param());
                        break;
                    case 'H':
                        System.out.println("Enter radius");
                        n1 = Double.parseDouble(sc.next());
                        Shape cg=new Sim_cal(n1);
                        System.out.println(cg.circle_param());
                        break;
                    case 'I':
                        System.out.println("Enter 1st number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println("Enter 2nd number");
                        num2 = Integer.parseInt(sc.next());
                        System.out.println(adv_cal.mod(num1,num2));
                        break;
                    case 'J':
                        System.out.println("Enter number");
                        num1 = Integer.parseInt(sc.next());
                        System.out.println(adv_cal.abs(num1));
                        break;
                    case 'K':
                        System.out.println("Enter number");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println(adv_cal.sqrt(n1));
                        break;
                    case 'L':
                        System.out.println("Enter number");
                        n1 = Double.parseDouble(sc.next());
                        System.out.println(adv_cal.exp(n1));
                        break;
                    default:
                        System.out.println("Wrong Option");
                        break;
                }
            }
            else {
                System.out.println("Wrong Input");
            }

            System.out.println("Want to continue Press 'y' else 'n'");
            y=sc.next().charAt(0);
            sc.nextLine();
        }


    }
}
















//        Shape x=new Adv_cal(5.9);
//        System.out.println(x.circle_param());
//        x=new Adv_cal(6.3,3.2);
//        System.out.println(x.rect_param());
//
//
//        Adv_cal ad=new Adv_cal(15,45,13);
//        System.out.println(ad.add());
//        Adv_cal as=new Adv_cal(2,3);
//        System.out.println(as.add());
//
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(2);
//        al.add(32);
//        al.add(123);
//        Adv_cal aq=new Adv_cal(al);
//        System.out.println(aq.add());
//        Cali c=new Cali();
//        System.out.println(c.area(21));
//
//        System.out.println(c.area(19,12));
//
//        Cali a=new Cali(2,3);
//        System.out.println(a.add());


//        Try to keep variable names, class names self-explanatory
//        Same Addition func implemented in parent and child class. Can Rethink about this
//        Use case for protected access modifier
