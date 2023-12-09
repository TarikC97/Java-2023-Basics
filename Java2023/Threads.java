class T extends Thread {
    public void run() {
        for (int i = 1; i <= 40; i++) {
            System.out.println("Threads");
        }

    }
}

class Q extends Thread {
    public void run() {
        for (int i = 1; i <= 40; i++) {
            System.out.println("Multi Threads ");
        }

    }
}

public class Threads {

    public static void main(String[] args) {
        T obj = new T();
        Q obj2 = new Q();
        obj.start();
        obj2.start();

    }
}
