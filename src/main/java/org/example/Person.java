package org.example;

public class Person {
        String firstName;
        String lastName;
        int age;
        String job;
        boolean isMarried;
        boolean isGraduated;

        public Person(String firstname, String lastname, int age){
            this.firstName = firstname;
            this.lastName = lastname;
            this.age = age;
        }
    public Person(String firstName, String lastName, int age, String job, boolean isMarried,  boolean isGraduated){
        this(firstName, lastName, age);
        this.job = job;
        this.isMarried = isMarried;
        this.isGraduated = isGraduated;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getJobName() {
        return job;
    }
    public boolean getMarriage() {
        return true;
    }
    public boolean getGraduate() {
        return true;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        if (age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person(person1.firstName, person1.lastName, person1.age, "Doctor", true, true );


        System.out.println("Firstname: "+ person1.getFirstName() );
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Teen: " + person1.isTeen());
        System.out.println("Job: " + person2.getJobName());
        System.out.println("Marriage Status: " + person2.getMarriage());
        System.out.println("Graduation Status: " + person2.getGraduate());
    }

}
