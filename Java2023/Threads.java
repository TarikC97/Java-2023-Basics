// class T implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Threads");
//             // Asking our thread to wait
//             try {
//             Thread.sleep(1);
//             } catch (InterruptedException e) {         
//             // e.printStackTrace();
//             }
//         }
//     }
// }

// extends Thread
// class Q implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Multi Threads ");
//         }

//     }
// }
class CounterT {
    int count;

    // synchronized solves output for threads,
    // by making one thread wait for first one to finish the call
    // for method, then other one starts.
    public synchronized void increment() {
        this.count++;
    }
}

public class Threads {

    public static void main(String[] args) throws InterruptedException {
        // Thread priority
        // obj2.setPriority(Thread.MAX_PRIORITY - 1);
        // System.out.println(obj.getPriority());
        // obj.start();
        // // try {
        // // Thread.sleep(4);
        // // } catch (InterruptedException e) {
        // // // e.printStackTrace();
        // // }
        // Runnable vs Threads
        // obj2.start();
        CounterT coun = new CounterT();
        // Race conditions
        Runnable obj = () -> {
            for (int i = 1; i <= 10000; i++) {
                coun.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 10000; i++) {
                coun.increment();
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        // Asking Main Thread to wait for t1 and t2
        t1.join();
        t2.join();
        // Race conditions
        System.out.println(coun.count);
    }
}
