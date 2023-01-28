package de.dhbw.course4.threads.ex2;

public class CreateThreadWay1 extends Thread {
    public static final String clazz = CreateThreadWay1.class.getSimpleName();

    @Override
    public void run() {
        System.out.println(clazz + " running");
        System.out.println(clazz + " finished");
    }

}