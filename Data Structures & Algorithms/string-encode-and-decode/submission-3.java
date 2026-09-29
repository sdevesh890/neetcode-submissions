class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str:strs)
        {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

   public List<String> decode(String str) {

    List<String> list = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        // Find '#'
        int j = i;

        while (str.charAt(j) != '#') {
            j++;
        }

        // Get length
        int len = Integer.parseInt(str.substring(i, j));

        // Start of actual string
        int start = j + 1;

        // Extract string
        list.add(str.substring(start, start + len));

        // Move to next encoded string
        i = start + len;
    }

    return list;
   }
}
