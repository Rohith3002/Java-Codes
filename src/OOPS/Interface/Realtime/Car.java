package OOPS.Interface.Realtime;

public class Car implements Engine, Break{
    void start(){
        System.out.println("Starting the Car");
        startEngine();
        breaks();
    }

    @Override
    public void startEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }
}