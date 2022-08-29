class Solution {
   public boolean isAnagram(String s, String t) {
		
		String [] ss = s.split("");
		String [] tt = t.split("");
		if(ss.length==tt.length) {
			Arrays.sort(ss);
			Arrays.sort(tt);
			if(Arrays.equals(ss, tt)){
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}