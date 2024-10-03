    class Thread1 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Thread2 implements Runnable {
        public void run() {
            for (int i = 1; i <= 7; i++) {
                System.out.println("Thread 2: " + i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class MultithreadingDemo {
        public static void main(String[] args) {
            Thread1 t1 = new Thread1();
            Thread t2 = new Thread(new Thread2());

            t1.start();
            t2.start();
        }
    }


