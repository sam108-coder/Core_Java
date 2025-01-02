package has_A_Relationship;

class Student2 {
    String rollNo;
    String name;
    Language[] lang;

    Student2(String rollNo1, String name1, Language[] lang1) {
        this.rollNo = rollNo1;
        this.name = name1;
        this.lang = lang1;
    }

    void getStudentDetails() {
        System.out.println("Student RollNo : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("-----Language Details-----");

        for (int i = 0; i < lang.length; i++) {
            System.out.println("Language Name : " + lang[i].langName + " and Language Code : " + lang[i].langCode);
        }
    }
}

class Language {
    String langCode;
    String langName;

    Language(String langCode1, String langName1) {
        this.langCode = langCode1;
        this.langName = langName1;
    }
}

public class ManyToManyDemo {
    public static void main(String[] args) {

        Language l1 = new Language("Java01", "Java");
        Language l2 = new Language("Py02", "Python");
        Language l3 = new Language("Cpp03", "C++");
        Language[] lang = {l1, l2, l3};

        Student2 s1 = new Student2("101", "deepak", lang);
        Student2 s2 = new Student2("102", "deepesh", lang);
        Student2 s3 = new Student2("103", "rahul", lang);

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}
