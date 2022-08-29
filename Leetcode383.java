class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        String [] rans = ransomNote.split(""), maga = magazine.split("");
        
        LinkedList<String> mag = new LinkedList<String>();
        
        for(int i=0;i<maga.length;i++){
            mag.add(maga[i]);
        }
        for(int i=0;i<rans.length;i++){
            if(!(mag.contains(rans[i]))) return false;
            else mag.remove(mag.indexOf(rans[i]));
        }
        
        return true;
    }
}