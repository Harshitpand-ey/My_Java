public class constructorChaining1_Calling {
    public static void main(String[] args) {
        constructorChaining1 Adit=new constructorChaining1();
        System.out.println(Adit.getAccountHolderName()+"-account holder's name and email is  "+Adit.getAccountHolderEmail());
       constructorChaining1 Mani=new constructorChaining1(22.45,"Mani","shjqjwn@gamil.com");
        System.out.println(Mani.getAccountBalance());
    }
}
