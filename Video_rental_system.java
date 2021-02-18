package may;
import java.util.*;
public class Video_rental_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		while(check)
		{
			//Netflix n=new Netflix();
			//directors d =new directors();
			ratings r=new ratings();
			System.out.println("0.Exit");
			System.out.println("1.Search (check)");
			System.out.println("2.Details");
			int ch;
			System.out.println("enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 0:
				check=false;
				//System.exit(0);
				System.out.println("................");
				break;
			case 1:
				
				r.get();
				if(r.search())
				{
					System.out.println(r.name+" is available");
				}
				else
				{
					System.out.println(r.name+" is not available");
				}
				break;
			case 2:
				System.out.println("a.Director Name");
				System.out.println("b.Rating");
				System.out.println("c.All Details of Series");
				System.out.println("Enter your choice: ");
				char ch1;
				ch1=sc.next().charAt(0);
				switch(ch1)
				{
				case 'a':
					//directors d=new directors();
					r.get();
					if(r.search())
					{
						//System.out.println(r.name+" is available");
						r.director_print();
						
					}
					else
					{
						System.out.println(r.name+" is not available");
					}
					
					break;
				
				case 'b':
					r.get();
					if(r.search())
					{
						//System.out.println(r.name+" is available");
						r.rate_show();
						
					}
					else
					{
						System.out.println(r.name+" is not available");
					}
					
					break;
				
				case 'c':
					System.out.println("Web Series"+"\t"+"Director"+"\t"+"Ratings");
					for(int i=0;i<r.web_series.length;i++)
					{
						System.out.println(r.web_series[i]+"\t"+r.director[i]+"\t"+r.rate[i]);
					}
					break;
				default:
					System.out.println("Invalid choice");
					break;
				
				}
			}
			
		}
		/*Movie m=new Movie();
		m.search();*/
	}

}
class Netflix 
{
	Scanner sc=new Scanner(System.in);
	String []  web_series= {"family man","bard of blood","hostages","witcher","tandav"};
	String name;
	int count=-1;
	boolean found=false;
	void get()
	{
		System.out.println("enter the series name: ");
		name=sc.nextLine();
		
	}
	boolean search()
	{
		
		//int j=0;
		//String []  web_series= {"family man","bard of blood","hostages","witcher","tandav"};
		for(int  i=0;i<web_series.length;i++)
		{
			if(name.equalsIgnoreCase(web_series[i]))
			{
				found=true;
				//System.out.println(name+" is available");
				count=i;
				return found;
				
			}
			//j++;
			
		}
		//if(!found)
		return found;
			//System.out.println(name+" is not available");
		
		//return found;
	}
	
	
}
class directors extends Netflix
{
	String director[]= {"Raj & D.K.","Ribhu Dasgupta","S.Mishra & S.Krishna","L.S.Hissric","Ali Abbas Zafar"};
	void director_print()
	{
		System.out.println("Director of the "+name+" is "+director[count]);
	}
	
	
}
class ratings extends directors
{
	double rate[]= {4.5,3.5,4.0,3.0,4.0};
	void rate_show()
	{
		System.out.println("Rating of "+name+" is "+rate[count]);
	}
}
