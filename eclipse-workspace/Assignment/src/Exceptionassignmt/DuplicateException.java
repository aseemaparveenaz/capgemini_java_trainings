package Exceptionassignmt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DuplicateException
{
	public static void main(String[] args) throws IOException,DuplicationIdException
	{
		int numOfPlayers ;
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the team name:");
		@SuppressWarnings("unused")
		String teamname = buffer.readLine();
		System.out.println("Enter the number of players suggested");
		numOfPlayers = Integer.parseInt(buffer.readLine());
		String playerid[] = new String[numOfPlayers];
		String playername[] = new String[numOfPlayers];
		for(int i=0;i<numOfPlayers;i++)
		{
			System.out.println("enter the player "+(i+1)+" details");
			playerid[i] = buffer.readLine();
			playername[i] = buffer.readLine();
		}
		for(int i=0;i<numOfPlayers;i++)
		{
			for(int j1=i+1;j1<numOfPlayers;j1++)
			{
				if(playerid[i].equals(playerid[j1]))
				{ 
					try
					{
						throw new DuplicationIdException();
					}
					catch(DuplicationIdException e)
					{ 
						System.out.println(e);
					}
					//break;
				}
				else
					for(int l=0;l<numOfPlayers;l++)
					{
						System.out.println(playerid[l]+" "+playername[l]);
					}
			}
		}
	}
}
class DuplicationIdException extends Exception
{
	private static final long serialVersionUID = 1L;
	DuplicationIdException()
	{
		super("player ID must be unique");
	}
}	



