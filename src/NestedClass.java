class K{
    void show(){
        System.out.println("class k");
    }
    class L{
        void show(){
            System.out.println("class L");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        K ob=new K();
        ob.show();
        K.L oj=ob.new L() ;
        oj.show();
    }
}
