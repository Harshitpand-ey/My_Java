public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;



    public Printer(int tonerLevel, boolean duplex) {
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
