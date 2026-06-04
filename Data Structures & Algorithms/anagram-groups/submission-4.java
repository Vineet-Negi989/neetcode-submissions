class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        if(strs==null || strs.length==0)
        return new ArrayList<>();
        for(String str:strs){
             int[] freq=new int[26];
            for(char c:str.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i:freq){
                sb.append('#');
                sb.append(i);
            }
            String key=sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
