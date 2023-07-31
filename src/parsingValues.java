public class parsingValues {
    public static void main(String[] args) {
        String DOB="1990";
        int CurrentYear=2023;
        int DateOfBirth=Integer.parseInt(DOB);//it is used to parse or convert the value of string into integer for double use Double.parseDouble(StringName);
        System.out.println("current age= "+(CurrentYear-DateOfBirth));
        String userAgeWithPartialYear="22.5";
        double cureentYear=2023;
        double userageinDouble=Double.parseDouble(userAgeWithPartialYear);//parsing string into double;
        System.out.println("user's birth year  is:"+(int)(cureentYear-userageinDouble));
    }
}
