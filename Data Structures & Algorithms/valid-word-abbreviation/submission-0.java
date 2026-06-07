class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i=0;//i pointer i will use in word string
        int j=0;//j pointer i will use in the abbr string
        while(i<word.length() && j<abbr.length()){
            char w_c=word.charAt(i);
            char a_c=abbr.charAt(j);
            if(Character.isDigit(a_c)){
                if(a_c=='0'){
                    return false;//in the question its written that there should not be any leading zeroes
                }
                
                    int curr=0;
                
                    while(j<abbr.length() && Character.isDigit(abbr.charAt(j))){
                        curr=curr*10+(abbr.charAt(j)-'0');
                        j++;
                    
                }
            i=i+curr;
            }
            else{
                if(w_c!=a_c)
                return false;
                else{
                    i++;
                    j++;
                }
            }
        }
        return i==word.length() && j==abbr.length();
    }
}