interface Motor{
    int  capacity = 10;
    void run();
    void consume();
}
class WahingMachine implements Motor{
    @Override
    public void run() {
        System.out.println("Washing machine is running");
    }

    @Override
    public void consume() {
        System.out.println("it consumes less power");
    }
    public void capacity(){
        System.out.println("Capacity is "+capacity);
    }
}
public class cl26 {
    public static void main(String[] args) {
        WahingMachine o=new WahingMachine();
        o.run();
        o.consume();
        o.capacity();
    }
}
