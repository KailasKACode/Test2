package InterviewProgram;

public class ArmStrongNo {
public static void main(String[] args) {
	int no=153;
	int sum=0;
	int rem=0;
	int value=no;
	while(value>0) {
		rem=value%10;
		sum=sum+(rem*rem*rem);
		value=value/10;
	}
	System.out.println(sum);
	if(sum==no)
	{
		System.out.println(sum+" is armstrong");
	}
	else
	{
		System.out.println(sum+" not armstrong");
	}
}
}
