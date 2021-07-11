package mobile;



abstract class Volume{
    abstract int incVolume();
    abstract int decVolume();

}
class Mobile extends Volume  {

    private int height;
    private int width;
    private int vol;
    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    Mobile(int height,int width)
    {
        this.height=height;
        this.width=width;
    }
    String OS(int os){
        if(os==1)
            return "Android";
        else if (os==2)
            return "IOS";
        else
            return "unknown";

    }
    String OS(String os){
        if(os.equals("Andriod"))
            return "Android";
        else if (os.equals("IOS"))
            return "IOS";
        else
            return "unknown";

    }


    public int incVolume() {
        if(vol<10)
            vol++;
        return vol;
    }


    public int decVolume() {
        if(vol>0)
            vol--;
        return vol;
    }
}
class QwertyMobile extends Mobile{
    public QwertyMobile(int height,int width)
    {
        super(height,width);
    }
    @Override
    public String OS(int os)
    {
        if(os==1){
            return "Symbian";
        }
        else{
            return "unknown";
        }
    }
    @Override
    public String OS(String os)
    {
        if(os.equals("Symbian")){
            return "Symbian";
        }
        else{
            return "unknown";
        }
    }
}
class Mobilelaunch{
    public static void main(String args[])
    {
        Mobile mob=new Mobile(10,5);
        System.out.println(mob.OS(2));
        System.out.println(mob.OS("Andriod"));

        mob.setVol(5);
        mob.incVolume();
        System.out.println(mob.getVol());
        QwertyMobile mob1=new QwertyMobile(10,5);
        System.out.println(mob1.OS(1));

    }
}
