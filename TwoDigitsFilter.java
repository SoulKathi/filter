import java.util.ArrayList;


public class TwoDigitsFilter implements Filter {

	public int[] filter(int[] i) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		for(int j:i){
			if(hasTwoDigits(j)){
				ret.add(j);
			}
		}
		int[] r=new int[ret.size()];
		for(int j=0;j<ret.size();j++){
			r[j]=ret.get(j);
		}
		return r;
	}
	private boolean hasTwoDigits(int i){
		if(-100<i&&i<-9){
			return true;
		}
		if(9<i &&i<100){
			return true;
		}
		return false;
	}

}
