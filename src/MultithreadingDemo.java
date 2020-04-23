public class MultithreadingDemo extends  Thread {
    @Override
    public void run(){
        try{

            System.out.println(Thread.currentThread().getName() + " is running" );
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
