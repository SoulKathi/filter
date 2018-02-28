import java.util.ArrayList;


public class UniqueFilter implements Filter {

	public int[] filter(int[] i) {
		ArrayList<Integer> ret=new ArrayList<Integer>();
		for(int j:i){
			if(isUnique(j,ret)){
				ret.add(j);
			}
		}
		int[] r=new int[ret.size()];
		for(int j=0;j<ret.size();j++){
			r[j]=ret.get(j);
		}
		return r;
	}
	private boolean isUnique(int i,ArrayList<Integer> l){
		if(l.contains(i)){
			return false;
		}
		return true;
	}

}
