package hashmap;

import java.util.HashMap;

class UniquNoOfOccuranceOrNOt {
	public static void main(String args[]) {
		
		int x[]= {1,2,2,3,3,3};
		boolean flag=uniqueOccurrences(x);
		System.out.println(flag);
	}
	
    public static boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                Integer value=hm.get(arr[i]);
                value++;
                hm.put(arr[i],value);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
        for(int x:hm.keySet())
        {
            if(hm1.containsKey(hm.get(x))){
                return false;
            }else{
                hm1.put(hm.get(x),1);
            }
        }
        return true;
    }
}

