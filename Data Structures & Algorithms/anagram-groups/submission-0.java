class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> res = new HashMap<>();

        for(String s : strs){
            char[] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String sorteds = new String(chararray);
            res.putIfAbsent(sorteds,new ArrayList<>());
            res.get(sorteds).add(s);

        }
        return new ArrayList<>(res.values());
    }
}
