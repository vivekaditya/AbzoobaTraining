import java.util.Comparator;
import java.util.PriorityQueue;

public class problem1
{
    public static void main(String[] args)
    {
        Comparator<String> comparator = new com();
        PriorityQueue<String> queue =  new PriorityQueue<String>(comparator);
        queue.add("banana");
        queue.add("apple");
        queue.add("orange");
        while (queue.size() != 0)
        {
            System.out.println(queue.remove());
        }
    }
}
class com implements Comparator<String>
{	
    @Override
    public int compare(String x, String y)
    { 
        if (count(x) < count(y))
        {
            return -1;
        }
        if (count(x) > count(y))
        {
            return 1;
        }
        return 0;
    }
    
    public int count(String s)
    {
    	int cnt=0,j=0;
    	for(j=0;j<s.length();j++)
    	{
    		if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
    		{
    			cnt++;
    		}
    	}
    	return cnt;
    }
}