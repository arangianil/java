import java.util.*;
public class gradecheck{
public static void GradeCheck (int grade){
if(grade>50) 
{
	System.out.println("pass");
}
else
{
	System.out.println("fail");
}
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int grade=sc.nextInt();
GradeCheck(grade);

}
}





