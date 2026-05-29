class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c:s.toCharArray()){
            //note that ki when using hashmap for storing key value pairs u have to put both the key-value pairs at the same time
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            int count=map.get(c);//this basically gives us the value of the key
            map.put(c,count-1);
            if(map.get(c)==0)
            map.remove(c);

        }
        if(map.isEmpty())
        return true;
             
             return false;

    }
}
