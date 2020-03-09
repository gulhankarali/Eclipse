package day12_control_flow_statements;

public class QuizAnswers {

	public static void main(String[] args) {
		
		
		int sum=0;
		for (int i=0, j=0; sum>20; ++i,--j) {
			sum= sum+i+j;
		}
		System.out.println(sum);

	}

}
