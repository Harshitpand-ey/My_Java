public class cl13 {

    private static int objectCount = 0;


    public cl13() {//constructor to access objectCount;
        objectCount++;
    }


    public static int getObjectCount() {
        return objectCount;
    }


    public static void main(String[] args) {

        cl13 obj1=new cl13();

        cl13 obj2=new cl13();

        cl13 obj3=new cl13();

        cl13 obj4=new cl13();

        int count= cl13.getObjectCount();

        System.out.println("object count is "+count);

    }
}

