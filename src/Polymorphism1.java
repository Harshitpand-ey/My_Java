class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

}
class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),"Pleasant scene","Scary music","Something bad happens");
    }
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"dirty place","funny music","funny things happens");
    }
}
class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),"Universe and planets","deep and low Songs","Intellectual things happens");
    }
}
public class Polymorphism1 {
    //It works on runtime instances;
    public static void main(String[] args) {
        Movie obj=new Adventure("Star Wars");
        obj.watchMovie();
        Movie ob=new Comedy("Kis kisko Pyar karu");
        ob.watchMovie();
        Movie o=new ScienceFiction("Galaxy of Stars");
        o.watchMovie();
    }
}
