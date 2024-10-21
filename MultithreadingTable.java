class T1 extends Thread {
    public void run() {
        System.out.println("Table of 3:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + (3 * i));
        }
    }
}

class T2 extends Thread {
    public void run() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Table of 6:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("6 * " + i + " = " + (6 * i));
        }
    }
}

class T3 extends Thread {
    public void run() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("Table of 9:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("9 * " + i + " = " + (9 * i));
        }
    }
}

class MultithreadingTable {
    public static void main(String args[]) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Main thread is running.");
    }
}
