public class yieldKeyword {

    public static void main(String[] args) {

        String Month_name="December";//declaring month name
        System.out.println(Month_name+" is in  "+month(Month_name)+" quarter");
        // calling here the method
    }
    public static String month(String Month_name) {
            /*switch (Month_name) {
                case "January":
                case "Feb":
                case "March":
                    return "1st";//here return works as break
                case "April":
                case "May":
                case "June":
                    return "2nd";
            }
            return "bad";//it is basically the default statement;

             */
        return switch (Month_name) {//it is the enhanced switch case of the above code;
            case "January", "Feb", "March" -> "1st";//here return works as break
            case "April", "May", "June" -> "2nd";
            default -> {
                String badResponse = Month_name + " is bad";
                //return badResponse;//this return statement show error instead of return use yield;
                yield badResponse;
            }
        };
    }
}



