
/**
 * Lab 10 Work
 */
public class Candidate
{
    private int idnumber;
    private String position;
    private double interviewScore;
    
    public Candidate(int idnumber, String position, double interviewScore)
    {
        this.idnumber = idnumber;
        this.position = position;
        this.interviewScore = interviewScore;
    }
    
    public String getPosition()
    {
        return this.position;
    }
    
    public double getInterviewScore()
    {
        return this.interviewScore;
    }
    
    public String toString()
    {
        return "" + this.idnumber + ":" + this.position + "; score:" + this.interviewScore;
    }
}
