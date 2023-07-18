public class ch5 {
    public static void main(String[] args) {
        System.out.println(getDurationString(35));
        System.out.println(getDurationString(68,54));

    }
    public static String getDurationString(int seconds){
        if(seconds>=0){
        int minutes=seconds/60;
//        int secsRemains=seconds%3600;
//        int minute=secsRemains/60;
//        int secsRemainsFromMinute=secsRemains%60;
//        int remainingSecs=secsRemainsFromMinute;

        return getDurationString(minutes,seconds);}
        else{
            return "nothing";
        }
    }
    public static String getDurationString(int minutes,int seconds){
        if(minutes>=0||(seconds>=0&&seconds<=59)) {
            int hour = minutes / 60;


            int secsRemainsFromMinute = minutes % 60;
            int remainingSecs = seconds%60;

            return hour + "hr" + secsRemainsFromMinute + "min" + remainingSecs+"sec";
        }
        else{
            return "nothing";
        }
    }
}
