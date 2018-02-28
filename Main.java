
public class Main {
	public static void print(int[] liste, Filter filter){
		String s="";
		int n=0;
		for(int i:filter.filter(liste)){
			if(n>0){
				s+=", ";
			}
			s+=i;
			n++;
		}
		System.out.println(s);
	}
	public static void main(String args[]){
		int[] test = {5,9,2,7,2,6,7,12,5,43,4};
		print(test, new PrimeFilter());
		print(test, new TwoDigitsFilter());
		print(test, new UniqueFilter());
	}
}
