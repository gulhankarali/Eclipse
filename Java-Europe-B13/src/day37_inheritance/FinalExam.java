package day37_inheritance;

public class FinalExam extends GradeActivity{

	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numQuestions, int numMissed) {
		double numericScore = 0;
		
		this.numMissed=numMissed;
		this.numQuestions=numQuestions;
		
		pointsEach= 100.0/numQuestions;
		
		
	    setScore(numericScore);
		
	}
    public double getPointsEach() {
    	return pointsEach;
    }


}
