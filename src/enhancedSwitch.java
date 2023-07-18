public class enhancedSwitch {
    public static void main(String[] args) {
        int num=9;
        switch (num) {
            case 1 -> System.out.println("it is num 1");//--> it represents enhanced switch.
//without break statement except that case all other cases will print till break is not applied;
            case 2 -> System.out.println("it is num 2");
            case 3, 4, 5 -> {//case 3:case 4:case 5 is replaced in enhanced switch by case 3,4,5 there is no ':' in enhanced switch case;
                System.out.println("it was 3,a 4,a 5");
                System.out.println("number was " + num);
            }
            default -> System.out.println("neither 1,2,3,4,5");
        }


    }
}


