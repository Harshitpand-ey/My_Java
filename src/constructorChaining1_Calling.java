public class constructorChaining1_Calling {
    public static void main(String[] args) {
        constructorChaining1 Adit=new constructorChaining1();//it will help to print the constructor that have no arguments
        System.out.println(Adit.getAccountHolderName()+"-account holder's name and email is  "+Adit.getAccountHolderEmail());
       constructorChaining1 Mani=new constructorChaining1(22.45,"Mani","shjqjwn@gamil.com");//It prints that constructor which have 3 arguments;
        System.out.println(Mani.getAccountBalance());

    }
}
