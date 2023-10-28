import java.util.Scanner;

class Kovie {
    private String title;

    public Kovie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static Kovie getMovie(String type,String title){

        return switch (type.toUpperCase().charAt(0)){
            case 'A'->new dventure(title);
            case 'C'->new omedy(title);
            case 'S'->new cienceFiction(title);
            default -> new Kovie(title);
        };
    }

}
class dventure extends Kovie{
    public dventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),"Pleasant scene","Scary music","Something bad happens");
    }
}

class omedy extends Kovie{
    public omedy(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"dirty place","funny music","funny things happens");
    }
}
class cienceFiction extends Kovie{
    public cienceFiction(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Universe and planets","deep and low Songs","Intellectual things happens");
    }
}
public class PolymorphismReturnSwitch {
    //It works on runtime instances;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter type of Movie (A for Adventure ,C for comedy,S for SciFi");
            String type = sc.nextLine();
            if ("Qq".contains(type))
            break;

            System.out.println("Enter movie title");
            String title = sc.nextLine();
            Kovie movie = Kovie.getMovie(type, title);
            movie.watchMovie();

        }
    }
}

