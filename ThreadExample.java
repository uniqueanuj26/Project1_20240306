import org.w3c.dom.css.Counter;

class task1 extends Thread{
    //public void task1Print(){
    public void run(){   
        int i = 0;
        while (i<5) {
            System.out.println("** Task1 excution count:"+i);
            i++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}

class task2 extends Thread{
    //public void task2Print(){
    public void run(){
        int j = 0;
        while (j<5) {
            System.out.println("## Task2 excution count:"+j);
            j++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}

class task3 implements Runnable{
    public void run(){
        int k=0;
        while (k<5) {
            System.out.println("$$$ Task3 excution count:"+k);
            k++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class task4 implements Runnable{
    public void run(){
        int l=0;
        while (l<5) {
            System.out.println("$$$ Task3 excution count:"+l);
            l++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        task1 t1 = new task1();
        task2 t2 = new task2();
        

        //t1.task1Print();
        //t2.task2Print();

        t1.start();
        t2.start();

        Runnable t3 = new task3();
        Thread th3 = new Thread(t3);
        th3.start();

        Runnable t4 = () -> 
        {
                int l=0;
                while (l<5) {
                    System.out.println("@@@@@ Task3 excution count:"+l);
                    l++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        
        };

        Thread th4 = new Thread(t4);
        th4.start();

        // task3 t3 = () -> {
        //         int k=0;
        //         while (k<5) {
        //             System.out.println("%%%% Task3 excution count:"+k);
        //             k++;
        //             try {
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        
        //     }
        // t3.run();

        
    }
}
