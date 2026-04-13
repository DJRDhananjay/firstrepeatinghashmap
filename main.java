import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,Integer>map=new HashMap();
		int arr[]={1,2,2,4,5,7};
		for(int i=0;i<arr.length;i++){
		    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		    }
		for(int i=0;i<arr.length;i++){
		    if(map.get(arr[i])>1){
		        System.out.print(arr[i]);
		        break;
		    }
		}    
	    
	}
	    
	}
