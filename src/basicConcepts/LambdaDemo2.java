package basicConcepts;

public class LambdaDemo2 {
    public static void main(String[] args) {
        //Wtihout using lambda in functional interface

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //with using lambda in functional interface

        Runnable r2 = () -> {
            System.out.println("Thread2 is running");
        };

        Thread t2 = new Thread(r2);
        t2.start();

        //with short version

        Thread t3 = new Thread(() -> System.out.println("Thread3 is running"));
        t3.start();
    }
}
