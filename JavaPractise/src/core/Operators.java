package core;

/**
 * Created by GV Sharma on 8/7/2016.
 */
public class Operators {
    public static void main(String[] args) {
//        bitwise();

        byte b = (byte) 130;
        System.out.println(b);
        short a = (short) 50000;
        System.out.println(a);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doTask(0);
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                doTask(1);
            }
        });
        thread2.start();
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                doTask(2);
            }
        });
        thread3.start();
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                doTask(3);
            }
        });
        thread4.start();
    }

    private static void doTask(int i) {
        synchronized (Operators.class) {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally{
            System.out.println("core.ReverseArr " + i);
        }
        }
    }

    private static void bitwise() {
        int bitmask = 0X000F;
        int val = 0X2222;

        System.out.println(val & bitmask);
        System.out.println(val | bitmask);
        System.out.println(val ^ bitmask);
    }
}
