package Chapter_12;

public class _02_ThreadB extends Thread{
    public void run(){
        for (int i = 0; i < 2; i++){
            System.out.println(getName() + " is printing.");
        }
    }
}
