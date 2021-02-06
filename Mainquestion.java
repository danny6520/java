package my_project;
import java.io.*;
import java.util.*;
public class Mainquestion 
{

	public static void main(String[] args)
	{
		List<Questions> questionslist=new ArrayList<Questions>();
		System.out.println("Enter Number of questions: ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=0; i<n; i++);
		{
			Questions question=new Questions();
			System.out.println("Enter a question: ");
			scn=new Scanner(System.in);
			String qname=scn.nextLine();
			question.setQues(qname);
			questionslist.add(question);
		
		}
		
		for(int i=0; i<questionslist.size(); i++)
		{
			Questions q=questionslist.get(i);
			System.out.println(q.getQues());
			System.out.println(questionslist.size());
			
		}
	}

}
