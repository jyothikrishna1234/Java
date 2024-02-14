class Lamp
{
    boolean isOn;
    void turnOn()
    {
        isOn=true;
        System.out.println("Light on?"+isOn);
    }
    void turnOff()
    {
        isOn=false;
        System.out.println("Light On?"+isOn);
    }
}
class Main{
    public static void Main(String[] args)
    {
        Lamp led=new Lamp();
        Lamp halogen=new Lamp();
        led.turnOn();
        halogen.turnOff();
    }
}