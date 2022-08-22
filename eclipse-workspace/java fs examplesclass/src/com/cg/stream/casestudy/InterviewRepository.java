package com.cg.stream.casestudy;

import java.util.ArrayList;
import java.util.List;



public class InterviewRepository {



	private static List<Candidate> candidateList;
	static
	{
		prepareCandidateList();
	}

	private static void prepareCandidateList() {
		candidateList=new ArrayList<Candidate>();
		candidateList.add(new Candidate("Ramesh", "Java", "Pune", 5));
		candidateList.add(new Candidate("Raman", "Java", "Bangalore", 4));
		candidateList.add(new Candidate("Soumya", "C#", "Pune", 11));
		candidateList.add(new Candidate("Raghu", "Java", "Chennai", 3));
		candidateList.add(new Candidate("Pramod", "Java", "Mumbai", 1));
		candidateList.add(new Candidate("Trisha", "C#", "Pune", 0));
		candidateList.add(new Candidate("Nandan", "C++", "Chennai", 0));
		candidateList.add(new Candidate("Jeevan", "Java", "Mumabi", 1));
		candidateList.add(new Candidate("Priya", "Java", "Bangalore", 11));
		candidateList.add(new Candidate("Priyanka", "C++", "Chennai", 4));



	}



	public static List<Candidate> getCandidateList() {
		return candidateList;
	}



}