class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();//we are converting it into stringbuilder because we want to use functions like append
        for(String str:strs){
            sb.append(str.length()).append('#').append(str);//this is basically the main concept on encoding

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+len);
            result.add(word);
            i=j+1+len;
        }
        return result;
    }
}
