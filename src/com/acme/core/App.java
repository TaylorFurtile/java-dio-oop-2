package com.acme.core;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("java course");
        course1.setDescription("description from java course");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("python course");
        course2.setDescription("description from python course");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("java mentoring");
        mentoring.setDescription("description from java mentoring");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("description from Bootcamp Java Developer");
        bootcamp.getContentList().add(course1);
        bootcamp.getContentList().add(course2);
        bootcamp.getContentList().add(mentoring);

        Dev dev1 = new Dev();
        dev1.setName("Amanda");
        dev1.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed Contents Camila:" + dev1.getSubscribedContents());
        dev1.completeContent();
        dev1.completeContent();
        System.out.println("-");
        System.out.println("Subscribed Contents Camila:" + dev1.getSubscribedContents());
        System.out.println("Completed Contents  Camila:" + dev1.getCompletedContents());
        System.out.println("XP:" + dev1.calculateTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setName("Pedro");
        dev2.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed Contents João:" + dev2.getSubscribedContents());
        dev2.completeContent();
        dev2.completeContent();
        dev2.completeContent();
        System.out.println("-");
        System.out.println("Subscribed Contents João:" + dev2.getSubscribedContents());
        System.out.println("Completed Contents João:" + dev2.getCompletedContents());
        System.out.println("XP:" + dev2.calculateTotalXp());
    }
}
