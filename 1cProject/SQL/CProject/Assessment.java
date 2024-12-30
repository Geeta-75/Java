package CProject;

import java.util.Scanner;
public class Assessment 
{
	private static Scanner sc = new Scanner(System.in);
    public static boolean assessment_DM()
	{
    	System.out.println("Answer all the below questions corectly to pass this assessment :");
   	 System.out.println("-------------------------------------------------------------------");
    	System.out.println("1. Which of the following is NOT a benefit of using social media for digital marketing?"
                            +"\n1) Increased brand awareness"
    	                    +"\n2) Direct communication with customers"
                            +"\n3) Enhanced search engine rankings"
    			            +"\n4) Limited audience reach");
    	System.out.print("Enter the corresponding number of the correct option");
    	 int answer1=sc.nextInt();
    	 System.out.println("-------------------------------------------------------------------");
		System.out.println("2. What is the primary goal of Digital Marketing?"
		                    +"\n1) To increase website traffic"
							+"\n2)To reach target audiences, build brand awareness, generate leads, and drive conversions"
							+"\n3) To create social media profiles"
							+"\n4) To write blog posts");
	    System.out.print("Enter the corresponding number of the correct option : ");
        int answer2=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

	    System.out.println("3.  Which of the following is NOT a type of Digital Marketing format?"
		                    +"\n1) Social Media Profiles"
							+"\n2) Website"
							+"\n3) Television Advertising"
							+"\n4) Images and Video Content");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	int answer3=sc.nextInt();
    	System.out.println("-------------------------------------------------------------------");

		System.out.println("4.  Which of the following is a popular platform for running pay-per-click (PPC) campaigns?"
		                    +"\n1) Facebook Ads"
							+"\n2) Google Ads"
							+"\n3) Twitter Ads"
							+"\n4) LinkedIn Ads");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
	    int answer4=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

		 if(answer1==1&&answer2==2&&answer3==3&&answer4==2) 
		{
			return true;
		}
		else 
		{
			return false;
		}
    }

	public static boolean assessment_IT()
	{
		System.out.println("Answer all the below questions corectly to pass this assessment :");
	   	 System.out.println("-------------------------------------------------------------------");
		System.out.println("1. Which of the following programming languages is known for its platform independence?"
                            +"\n1) Java"
    	                    +"\n2) python"
                            +"\n3) c++"
    			            +"\n4) JavaScript");
    	System.out.print("Enter the corresponding number of the correct option : ");
    	 int answer1=sc.nextInt();
    	    System.out.println("-------------------------------------------------------------------");

		System.out.println("2. What does the acronym \"HTML\" stand for?"
		                    +"\n1) HyperText Markup Language"
							+"\n2) HyperText Machine Language"
							+"\n3) HyperText Meta Language"
							+"\n4) HyperText Media Language");
	    System.out.print("Enter the corresponding number of the correct option : ");
        int answer2=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

	    System.out.println("3.  Which of the following is an example of a database management system? "
		                    +"\n1) Microsoft Word"
							+"\n2) Microsoft Excel"
							+"\n3) MySQL"
							+"\n4) Microsoft PowerPoint");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	int answer3=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

		System.out.println("4. Which of the following is not an operating system?"
		                    +"\n1)  Linux"
		                    +"\n2) Windows"
		                    +"\n3) python"
		                    +"\n4) macOS");
        System.out.print("Enter the corresponding number of the correct option : ");		 
        int answer4=sc.nextInt(); 
   	    System.out.println("-------------------------------------------------------------------");

		if(answer1==1&&answer2==1&&answer3==3&&answer4==3) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static boolean assessment_UI_UX()
	{
		System.out.println("Answer all the below questions corectly to pass this assessment :");
	   	 System.out.println("-------------------------------------------------------------------");
		System.out.println("1. Which of the following is a type of user research method in UI/UX design?"
                            +"\n1) Surveys"
    	                    +"\n2) Heuristic evaluation"
                            +"\n3)  A/B testing"
    			            +"\n4)  All of the above");
    	System.out.print("Enter the corresponding number of the correct option : ");
    	 int answer1=sc.nextInt();
    	    System.out.println("-------------------------------------------------------------------");

		System.out.println("2. Which of the following is NOT a principle of UI design?"
		                    +"\n1) Consistency"
							+"\n2) Responsiveness"
							+"\n3) Simplicity"
							+"\n4) Complexity");
	    System.out.print("Enter the corresponding number of the correct option : ");
        int answer2=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

	    System.out.println("3. What is a wireframe in UI/UX design? "
		                    +"\n1) A high-fidelity design of the final interface"
							+"\n2) A blueprint or skeletal outline of the design layout"
							+"\n3) A tool for user testing"
							+"\n4)  A color palette for the design");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	 int answer3=sc.nextInt();
    	    System.out.println("-------------------------------------------------------------------");

		System.out.println("4. What does UI stand for?"
		                    +"\n1) User Interaction"
							+"\n2) User Interface"
							+"\n3) Unified Interface"
							+"\n4) User Integration");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	int answer4=sc.nextInt();
   	    System.out.println("-------------------------------------------------------------------");

		if(answer1==4&&answer2==4&&answer3==2&&answer4==2) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static boolean assessment_Python()
	{
		System.out.println("Answer all the below questions corectly to pass this assessment :");
	   	 System.out.println("-------------------------------------------------------------------");
		System.out.println("1. What is the correct file extension for Python files?"
                            +"\n1) .pt"
    	                    +"\n2) .pyt"
                            +"\n3) .py"
    			            +"\n4) .python");
    	System.out.print("Enter the corresponding number of the correct option : ");
    	int answer1=sc.nextInt();
    	System.out.println("-------------------------------------------------------------------");

    	 
		System.out.println("2. Which of the following is NOT a valid Python data type?"
		                    +"\n1) List"
							+"\n2) Dictionary"
							+"\n3) Tuple"
							+"\n4) Array");
	    System.out.print("Enter the corresponding number of the correct option : ");
        int answer2=sc.nextInt();
    	System.out.println("-------------------------------------------------------------------");

	    System.out.println("3. How can you start a comment in Python?"
		                    +"\n1) //"
							+"\n2) #"
							+"\n3) /*"
							+"\n4) <!--");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	 int answer3=sc.nextInt();
     	System.out.println("-------------------------------------------------------------------");

		 System.out.println("4.  Which of the following statements is used to terminate a loop in Python?"
		                    +"\n1 exit"
							+"\n2 stop"
							+"\n3 break"
							+"\n4 end");
	    System.out.print("Enter the corresponding number of the correct option : ");		 
    	int answer4=sc.nextInt();
    	System.out.println("-------------------------------------------------------------------");

		if(answer1==3&&answer2==4&&answer3==2&&answer4==3) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}