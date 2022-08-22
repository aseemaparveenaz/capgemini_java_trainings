package javafullstackassignmnts;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class timer extends TimerTask 
{
	@Override
	public void run()
	{
		System.out.println("Timer started at:"+new Date());
		completeTask();
		System.out.println("Timer finished at:"+new Date());
	}

	private void completeTask() 
	{
		try 
		{
//assuming it takes 20 secs to complete the task
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
// TODO Auto-generated method stub
		TimerTask timerTask = new timer();
//running timer task as daemon thread
		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
		System.out.println("Timer start");
//cancel after sometime
		try 
		{
			Thread.sleep(120000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("Timer cancelled");
		try 
		{
			Thread.sleep(30000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}

