public class RunThreads {
    public static int var=0;
    public void start1(){
        for(int i=0;i<1000;i++){
            if(i%2==0){
                Thread thread=new AThread();
                thread.start();
            }
            else{
                Thread thread=new MThread();
                thread.start();
            }
            System.out.print(var+"\n");
        }
        System.out.print("done");
    }
    public void start2(){
        for(int i=0;i<10;i++){
            if(i%2==0){
                Thread thread=new AThread();
                thread.start();
            }
            else{
                Thread thread=new MThread();
                thread.start();
            }
            System.out.print(var+"\n");
        }
        System.out.print("done");
    }
    public void add(int x){
        for(int i=0;i<x;i++) var+=1;
    }
    public void subtract(int x){
        for(int i=0;i<x;i++) var-=1;
    }
}
