public class PojoClassStudent {
    private String id;
    private String name;
    private String DOB;
    private String Year;
    private String Batch;

    public PojoClassStudent(String id, String name, String DOB, String year, String batch) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        Year = year;
        Batch = batch;
    }

    @Override//it is an annotation,It is the most common annotation that tells about that it is an overwritten method;
    public String toString() {//From line 17-25 we used toString() method,which will print out all the attributes in our class in a nicely formatted way;
        //We can implement this method to any class we create,and doing this let us print out the current state of the our object;
        return "PojoClassStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Year='" + Year + '\'' +
                ", Batch='" + Batch + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String batch) {
        Batch = batch;
    }
}
