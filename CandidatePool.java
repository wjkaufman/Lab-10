
/**
 * Lab 10 Work
 */

import java.util.*;
public class CandidatePool
{
    private ArrayList<Candidate> pool;
    
    public CandidatePool()
    {
        this.pool = new ArrayList<Candidate>();
    }
    
    public void addCandidate(Candidate candidate)
    {
        this.pool.add(candidate);
    }
    
    public ArrayList<Candidate> getCandidatesForPosition(String position)
    {
        ArrayList<Candidate> myList = new ArrayList<Candidate>();
        for (int i = 0; i < this.pool.size(); i++)
        {
            if (this.pool.get(i).getPosition().equals(position))
            {
                myList.add(this.pool.get(i));
            }
        }
        
        return myList;
    }
    
    public Candidate getBestCandidate(String position)
    {
        ArrayList<Candidate> myList = new ArrayList<Candidate>();
        myList = this.getCandidatesForPosition(position);
        double bestScore = 0;
        int bestIndex = -1;
        for (int i = 0; i < myList.size(); i++)
        {
            if (myList.get(i).getInterviewScore() > bestScore)
            {
                bestIndex = i;
                bestScore = myList.get(i).getInterviewScore();
            }
        }
        
        return myList.get(bestIndex);
    }
    
    public int removeCandidatesForPosition(String position)
    {
        int totalRemoved = 0;
        for (int i = 0; i < this.pool.size(); i++)
        {
            if (this.pool.get(i).getPosition().equals(position))
            {
                totalRemoved++;
                this.pool.remove(i);
            }
        }
        
        return totalRemoved;
    }
    
    public String toString()
    {
        return this.pool.toString();
    }
    
    public void goSwimming()
    {
        System.out.println("Going swimming...");
        System.out.println("\n\n\n");
        System.out.println("...getting out of the pool...");
        System.out.println("\n\n\n");
        System.out.println("...drying off...");
        System.out.println("\n\n\n");
    }
    
    public static void main(String[] args)
    {
        Candidate bob = new Candidate(001,"lawyer",78.4);
        Candidate jane = new Candidate(002,"lawyer",80.4);
        Candidate arash = new Candidate(003,"doctor",90.4);
        
        CandidatePool jobList = new CandidatePool();
        
        jobList.addCandidate(bob);
        jobList.addCandidate(jane);
        jobList.addCandidate(arash);
        
        
        System.out.println("-----jobList-----");
        System.out.println(jobList);
        
        Candidate havilah = new Candidate(004,"lawyer",65.3);
        jobList.addCandidate(havilah);
        System.out.println("\n\n-----jobList with new person-----");
        System.out.println(jobList);
        
        System.out.println("\n\n-----jobList for position \"lawyer\"-----");
        System.out.println(jobList.getCandidatesForPosition("lawyer"));
        
        System.out.println("\n\n-----bestCandidate for position \"lawyer\"-----");
        System.out.println(jobList.getBestCandidate("lawyer"));
        
        CandidatePool myPool = new CandidatePool();
        
        myPool.goSwimming();
        
        
    }
}
