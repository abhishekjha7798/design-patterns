package org.abhishekjha.behavioral.command.Runnable;

public class Demo {
    public static void main(String[] args) {
        Task task1 = new Task(2, 3);
        Task task2 = new Task(4, 5);
        Task task3 = new Task(6, 7);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Task implements Runnable {
    int num1;
    int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() {
        System.out.println(num1*num2);
    }
}
