
public class BinaryGap {
	
	// O(n) solution 
	public static int solution_1(int value) {

		String binaryRep = Integer.toBinaryString(value);
		int gap=0;
		int currentGap=0;
		boolean start=false;
		
		for(int i=0; i<binaryRep.length(); i++) {
			
			if(start==false && binaryRep.charAt(i)=='1') {
				start=true;
			}else if(start==true) {
				
				if(binaryRep.charAt(i)=='0') {
					currentGap++;
				}else {
					gap = Math.max(gap, currentGap);
					currentGap=0;
				}
				
			}
		}
		return gap;
	}
	
	public static void main(String args[]) {
		System.out.println(BinaryGap.solution_1(328));
	}
	
}
