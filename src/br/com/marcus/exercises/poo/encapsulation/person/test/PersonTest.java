package br.com.marcus.exercises.poo.encapsulation.person.test;

import br.com.marcus.exercises.poo.encapsulation.person.domain.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Raul", 30, "Madrid");
        Person person1 = new Person("Morientes" , 29, "Madrid");
        Person person2 = new Person("Hagi", 33, "Bucharest");

        person.imprime();
        person1.imprime();
        person2.imprime();
    }
}
