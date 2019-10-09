public class AThread extends Thread {
    @Override
    public void run(){
        new RunThreads().add(100);
    }
}
