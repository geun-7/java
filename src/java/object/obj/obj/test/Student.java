package java.object.obj.obj.test;

public class Student {
    private String name;
    private int age;
    private boolean birth;
    private String gender;
    private String location;
    private String tel;
    private String jid;
    private String ddi;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", gender='" + gender + '\'' +
                ", location='" + location + '\'' +
                ", tel='" + tel + '\'' +
                ", jid='" + jid + '\'' +
                ", ddi='" + ddi + '\'' +
                '}';
    }

    public Student(String name, int age, boolean birth
            , String gender, String location
            , String tel, String jid, String ddi) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.gender = gender;
        this.location = location;
        this.tel = tel;
        this.jid = jid;
        this.ddi = ddi;
    }

}
