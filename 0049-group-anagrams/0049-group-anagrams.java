class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String,List<String>> map = new HashMap<>();

    List<List<String>> ans = new ArrayList<>();

    for(String words : strs)
    {
        char[] ch= words.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);

        if(!map.containsKey(key))
        {
            map.put(key,new ArrayList<String>());
        }
        map.get(key).add(words);
    }
    for(String key : map.keySet())
    {
        ans.add(map.get(key));
    }
    return ans;
    }
}