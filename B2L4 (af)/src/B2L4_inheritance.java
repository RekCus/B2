

public class B2L4_inheritance {
    public static void main(String[] args){


        Person p1 = new Person();

        //  p1.setYear();

        //p1.name = "henk";
        //System.out.println(p1.name);

        p1.setName("Erwin");
        System.out.println(p1.getName());



        Student s1 = new Student(); // verbind met Student.java
        s1.setName("Henk");

        Parent parent = new Parent(); // verbind met parent.java
        parent.setChild(p1.getName()); //laat weten wie zijn kind is
        parent.setId(5);         //zet zijn id op 5
        parent.setName("Micha"); //noemt de parrent "Micha"


        Brother brother = new Brother(); // verbind met Brother.java
        brother.setName("Jaimy");   // noemt het broertje "child" "jaimy"
        brother.setYoung("Young"); // set de waarde van de variabele young naar "Young"
        brother.setAge(7); // set de waarde van de leeftijd naar 7
        System.out.println(s1.getName()+" has a parent called: "+parent.getName()+", "+parent.getName()+" has a son called: "+ brother.getName()+", " + brother.getName()+" is very "+brother.getYoung()+" and is " + brother.getAge()+" years old.");



/*

     Person[] people = {
                new Teacher(),
                new Student()

        };
        Teacher t = (Teacher)people[0];
        t.setName("Erwin");
        t.setIq(130);
        t.addDiploma("HBO gamedesign & Development (HKU)");

        Student s = (Student)people[1];
        s.setName("Hendrik");
        s.setIq(130);
        s.addCourse("PRO2");
        s.addDiploma("VMBO T");

        for (Person person : people) {
            System.out.println(person.getName() + " has an IQ of " + person.getIq() + " and has the following diplomas " + person.getDiplomas());

        }

 */   }
}
