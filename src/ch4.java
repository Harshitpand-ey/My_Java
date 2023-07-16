public class ch4 {

    public static void main(String[] args) {
        System.out.println("5ft,8inch = "+convertToCentimeters(5,8)+" cm");

    }
    public static double convertToCentimeters(int inches){
        double centimeter1=inches*2.54;
        return centimeter1;

    }
    public static double convertToCentimeters(int feet,int inches){
        int feetTo_inch=feet*12;
        int totalInches=feetTo_inch+inches;
      double result=convertToCentimeters(totalInches);// this is passed to the method which have argument only in inches then that method statement will be executed which is here the above one;
        return result;
        /*another simple method to do that is
          return(((feet*12)+inches)*2.54);*/



    }



}
