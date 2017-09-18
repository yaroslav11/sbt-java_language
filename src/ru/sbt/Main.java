package ru.sbt;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person(true, "Jack");
        people[1] = new Person(true, "Jim");
        people[2] = new Person(false, "Jale");
        people[3] = new Person(false, "Jill");

        System.out.println("Divorce Jack:\t"+ people[0].divorce());
        checkStatusAll(people);

        System.out.println("Marry Jack and Jill:\t"+ people[0].marry(people[3]));
        checkStatusAll(people);

        System.out.println("Marry Jack and Jim:\t"+ people[0].marry(people[1]));
        checkStatusAll(people);

        System.out.println("Marry Jale and Jim:\t"+ people[2].marry(people[1]));
        checkStatusAll(people);

        System.out.println("Marry Jale and  Jack:\t"+ people[2].marry(people[0]));
        checkStatusAll(people);

    }

    public static void checkStatusAll(Person[] people){
        for (int i = 0; i < people.length; i++){
            people[i].checkStatus();
        }
        System.out.println("\n");
    }

}
