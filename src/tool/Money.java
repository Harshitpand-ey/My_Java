package tool;
class Money{
    private double rupees;
    private double paise;
    public Money(double rupees,double paise){
        if(paise>=0.00&&paise<=0.99){
            this.paise=paise;
        }
        this.rupees=rupees;
    }
    void addition(){
        double total=rupees+paise;
        System.out.println(total);

    }
    void suubtraction(){
        double subT=rupees-paise;
        System.out.println(subT);
    }

    public static void main(String[] args) {
        Money a=new Money(123,.89);
        a.addition();
        a.suubtraction();

    }
}