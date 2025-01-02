package futureInterface;

import java.util.concurrent.*;

class ThreadTask implements Callable
{

    @Override
    public Object call() throws Exception {
        int a=10,b=20,c;
        c=a+b;
        return c;
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTask tt=new ThreadTask();

        ExecutorService es = Executors.newFixedThreadPool(3);
        Future f = es.submit(tt);
        System.out.println(f.get());
        es.shutdown();
    }
}
