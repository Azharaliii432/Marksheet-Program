import java.util.Scanner;
public class StudentMarksheet{
	public static void main(String args []){
		System.out.print("---------------| Input Student Marksheet |---------------");
		
		//Prints paragraph space
		System.out.println("\n");
		
		//For taking input Scanner class
		Scanner numbers = new Scanner(System.in);
		
		//Takes input for number of students
		System.out.print("Enter the number of students: ");
		int size = numbers.nextInt();
		
		//Prints paragraph space
		System.out.println();
		
		//Array for student name
		String [] studentName = new String[size];
		
		//Array for student marks
		double [] studentMarks = new double[size];
		
		//Loop takes input for student name and student marks
		for(int i = 0; i < size; i++){
		System.out.print("Student Name "+(i+1)+": ");
		studentName[i] = numbers.next();
		
		System.out.print("Student Marks "+(i + 1)+": ");
		studentMarks[i] = numbers.nextDouble();
		}
		
		//Prints paragraph space
		System.out.println();
		
		//Upper border
		System.out.println("---------------| Output Student Marksheet |--------------");
		
		//Prints paragraph space
		System.out.println();
		
		//Loop prints student name and student marks
		for(int i = 0; i < size; i++){
			System.out.println("Student Name: "+studentName[i]+" : "+"Student Marks: "+studentMarks[i]);
		}
		
		//Prints paragraph space
		System.out.println();
		
		//Declares variable
		double totalMarks = 0;
		
		//Loop loops throw the student marks
		for(int i = 0; i < size; i++){
			totalMarks += studentMarks[i];
		}
		
		//Perform operation for finding total average
		double total_average = totalMarks/size;
		
		//Prints total average
		System.out.println("Total Average Marks: "+total_average);
		
		//Prints paragraph space
		System.out.println();
		
		//Loop loops through Arrays
		for(int i = 0; i< size; i++){
			
			//Condition for finding highest marks
			if(studentMarks[i] >= 90){
				
				//Prints student name and his marks and award
			System.out.println(studentName[i]+": "+studentMarks[i]+ " Highest Marks");
		}
		
		//Condition for finding lowest marks
		else if(studentMarks[i] <=60){
			
			//Prints student name, his marks and award
			System.out.println(studentName[i]+": "+studentMarks[i]+" Lowest Marks");
		}
		
		
		}
		
		//Prints lowest border
		System.out.println("---------------------------------------------------------");
	}
}