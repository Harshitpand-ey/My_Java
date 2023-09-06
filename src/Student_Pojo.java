public class Student_Pojo {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            PojoClassStudent hii=new PojoClassStudent("8790"+i,
                    switch (i){
                case 1->"tim";
                case 2->"brook";
                case 3->"Crook";
                case 4->"Mark";
                case 5->"Mery";
                        default -> "Anonymous";
                    },"25-08-2004","2023","Mark Java");
            System.out.println(hii);//it is an another feature of toString() method no need to call it,It implicitly executed;

        }
        PojoClassStudent pojoStudent=new PojoClassStudent("45","kin","23-04-2009","2023","Manihjg");
        StudentLpaByRecordType recordStudent=new StudentLpaByRecordType("87","billu","25-09-56","2023","kamlesh");
        System.out.println(pojoStudent);//output will be in curly braces & and single quote due to POJO
        System.out.println(recordStudent);//output will be in square brackets &not in single quote because it is Record type;
        System.out.println("pojoStudent DOB is "+pojoStudent.getDOB());
        System.out.println("recordStudent DOB is "+recordStudent.DOB());//no get like pojo in record type;

        }
    }




