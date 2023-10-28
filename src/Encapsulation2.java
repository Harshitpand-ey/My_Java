 class arinter {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public arinter(int tonerLevel, boolean duplex) {
        if(tonerLevel>100||tonerLevel<0){
            this.tonerLevel=-1;
        }
        else{
            this.tonerLevel=tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        int tempAmount=tonerAmount+tonerLevel;
        if(tempAmount>100||tempAmount<0){
            return -1;
        }
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages=(duplex)?(pages/2)+(pages%2):pages;
        pagesPrinted+=jobPages;
        return jobPages;//we return jobPages because we want to return how many pages were printed;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

public class Encapsulation2 {//it have featur of Printer class;

    public static void main(String[] args) {
        arinter printer=new arinter(50,true);
        System.out.println("initial page count is "+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(35);
        System.out.printf("Current job pages are %d and Printer total is %d \n",pagesPrinted,printer.getPagesPrinted());
        pagesPrinted=printer.printPages(23);
        System.out.printf("Current job pages are %d and Printer total is %d ",pagesPrinted,printer.getPagesPrinted());


    }
}
