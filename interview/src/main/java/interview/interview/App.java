package interview.interview;

/**
 * Hello world!
 *
 */
public class App 
{

	public int findOccurancesOfModNumbers(int[] numbers, int mod) {
		int occurances = 0;
		for(int i = 0;i<numbers.length;i++)
		{
			if(numbers[i]%mod==0)
			{
				occurances++;
			}
		}
		return occurances;
		
	}

	public int findOccurancesOfSpecialNumbers(int[] numbers) {
		int occurances = 0;
		for(int i = 0;i<numbers.length;i++)
		{
			if(numbers[i]%3==0)
			{
				occurances++;
			}
		}
		return occurances;
	}
}
