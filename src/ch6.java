public class ch6 {
    public static void main(String[] args) {

        char var='X';
        switch (var){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
            default:
                System.out.println("not found "+var);
        }



    }
}
