public class MThread extends Thread {
    @Override
    public void run(){
        new RunThreads().subtract(100);
    }
}
