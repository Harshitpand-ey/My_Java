 public class forTm {
     public static void main(String[] args) {

     }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{ int megabyteConversion=(kiloBytes/1024);
            int leftkilo=(kiloBytes%1024);
            System.out.println(kiloBytes+" KB = "+megabyteConversion+" MB and "+leftkilo+" KB");
        }

    }

}

