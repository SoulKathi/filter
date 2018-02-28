import java.util.ArrayList;


public class PrimeFilter implements Filter {

	public int[] filter(int[] i) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		for(int j:i){
			if(isPrime(j)){
				ret.add(j);
			}
		}
		int[] r=new int[ret.size()];
		for(int j=0;j<ret.size();j++){
			r[j]=ret.get(j);
		}
		return r;
	}
	private boolean isPrime(int i){
		if(i<2){
			return false;
		}
		for(int j=2;j*j<=i;j++){
			if(i%j==0){
				return false;
			}
		}
		return true;
	}

}
