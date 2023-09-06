public class Student_Record {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            StudentLpaByRecordType hii=new StudentLpaByRecordType("8790"+i,
                    switch (i){
                        case 1->"tim";
                        case 2->"brook";
                        case 3->"Crook";
                        case 4->"Mark";
                        case 5->"Mery";
                        default -> "Anonymous";
                    },"25-08-2004","2023","Mark Java");
            System.out.println(hii);
    }
}}
