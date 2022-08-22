package Multithreading;

public class ThreadMain extends Thread {

public void run() {
for(int i=0; i<5;i++) {
System.out.println(i);
System.out.println(ThreadMain.currentThread());
System.out.println(ThreadMain.currentThread().getState());

}

}

public static void main(String[] args) {
// TODO Auto-generated method stub
ThreadMain thread = new ThreadMain();
System.out.println("current thread" + thread.currentThread());
System.out.println(thread.getState());
thread.setName("Aseema");
thread.start();

}

}