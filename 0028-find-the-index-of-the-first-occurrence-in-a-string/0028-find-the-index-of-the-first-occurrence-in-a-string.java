class Solution {
    public int strStr(String haystack, String needle) {
    int n = haystack.length();
    int m = needle.length();
    if(n<m) return -1;
    for(int i=0;i<=n-m;i++)
    {
        if(haystack.charAt(i)==needle.charAt(0))
        {
            String subStr =haystack.substring(i,i+m);
            if(subStr.equals(needle))
            {
                return i;
            }
        }

    }
    return -1;
    }
}