//2005 Question 4 Free Response
public class StudentRecord
{
	private int[] scores;

	public StudentRecord(int[] scores)
	{
		this.scores = scores;
	}
	private double average(int first, int last)
	{
		int sum = 0;
		int numOfScores = last - first + 1;

		for(int i = first; i <= last; i++)
			sum += scores[i];

		return (double)sum / numOfScores;
	}

	private boolean hasImproved()
	{
		for(int i = 1; i < scores.length; i++)
		{
			if(scores[i] < scores[i - 1])
				return false;
		}
		return true;
	}

	public double finalAverage()
	{
		if(hasImproved())
			return average(scores.length/2, scores.length-1);
		else
			return average(0, scores.length-1);

		/* OR:
		 *
		 *int firstIndex = 0;
		 *int lastIndex = scores.length - 1;
		 *
		 *if(hasImproved())
		 *	firstIndex = scores.length/2;
		 *
		 *return average(firstIndex, lastIndex);
		 */
	}

	//returns Double.MIN_VALUE if parameters are invalid
	private double averageNoPreconditions(int first, int last)
	{
		// if scores hasn't been built, or its empty, or if invalid; data validation
		if (scores == null || scores.length == 0 || first < 0 || last < 0 || first > last || first >= scores.length || last >= scores.length)
			return Double.MIN_VALUE;

		int sum = 0;
		int numOfScores = last - first + 1;

		for(int i = first; i <= last; i++)
			sum += scores[i];

		return (double)sum / numOfScores;
	}
}