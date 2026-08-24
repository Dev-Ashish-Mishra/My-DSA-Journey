class Solution
{
    public boolean isValid(String s)
    {
    boolean found = true;
    while( found )
    {
        found = false;
        if(s.contains("()"))
        {
           s = s.replace("()", "");
           found = true;
        }
        if( s.contains("{}"))
        {
            s = s.replace("{}","");
            found = true;
        }
        if(s.contains("[]"))
        {
            s = s.replace("[]","");
            found = true;
        }
    }
    return s.length() == 0;
    }
}