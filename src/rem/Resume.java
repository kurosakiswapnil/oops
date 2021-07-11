package rem;

interface res {

    void projects();
    void experience();
}

class Details
{
    private String name,address;
    private int phn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhn() {
        return phn;
    }

    public void setPhn(int phn) {
        this.phn = phn;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    private int dob;
}

abstract class Data implements res{
    public void projects(){
        System.out.println("1.text project");
        System.out.println("2.CV project");

    }
    public void experience(){
        System.out.println("1.tcs");
    }
}
class activity extends Details
{
    public void nptel(){

    }




}
public class Resume {
    public static void main(String args[])
    {

    }


}
