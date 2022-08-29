class Solution {
    public int firstUniqChar(String s) {
		
		String ss [] = s.split("");
		for(int i=0;i<ss.length;i++) {
			int count = 0;
			String a = ss[i];
			for(int ii=0;ii<ss.length;ii++) {
				String b = ss[ii];
				if(a.equals(b) && i != ii) {
					count=1;
                    break;
				}
			}
			if(count<1) {
				return i;
			}
		}
		return -1;
	}
}