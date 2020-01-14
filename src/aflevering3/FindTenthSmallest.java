package aflevering3;

import java.util.*;


public class FindTenthSmallest {
	
	public static void main (String []args) {
		long[] ts = new long [] {1,2,3,4,5,6,7,8,9,10,11};
			System.out.println(findTenthSmallest(ts));
	}
	public static long findTenthSmallest (long[] ts ) {
		ArrayList<Long> list = new ArrayList<Long>();
		//laver forloop for int k op stopper når værdien når laengden af ts
		for(int k=0; k<ts.length;k++) {
		//arraylisten bliver dannet ud fra ts.
			list.add(ts[k]);
		}
		
		long lavesteTal =list.get(0);
		//forloop der sikrer næste forloop kører 10 gange fra 0-9
		
		for(int i=0;i<=9;i++) {
			lavesteTal=list.get(0);
			
		for(int l=0 ; l < list.size();l++) {
			if( lavesteTal>list.get(l)) {
				lavesteTal=list.get(l);
			}
		}
			list.remove(lavesteTal);
		}
		return lavesteTal;
		
		
}
	
}