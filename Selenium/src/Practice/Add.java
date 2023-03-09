package Practice;

public class Add {
	public int add(int... a) {
		int sum=0;
		for(int d:a) {
			sum+=d;
		}
		return sum;
	}
}
