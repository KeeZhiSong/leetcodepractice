class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char e : magazine.toCharArray()) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        for (char f : ransomNote.toCharArray()) {
            int count = map.getOrDefault(f, 0);

            if (count == 0) {
                return false;
            }

            map.put(f, count - 1);
        }

        return true;
    }
}