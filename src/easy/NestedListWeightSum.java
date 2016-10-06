package easy;

public class NestedListWeightSum {
	
	/*public int depthSum(List<NestedInteger> nestedList) {
	    return helper(nestedList, 1);
	}

	private int helper(List<NestedInteger> nestedList, int level){
	    if(nestedList==null || nestedList.isEmpty()) return 0;
	    int sum=0, val=0;
	    for(NestedInteger i : nestedList){
	        if(i.isInteger()){
	            val+=i.getInteger();
	        } else{
	            sum+=helper(i.getList(), level+1);
	        }
	    }
	    return sum+level*val;
	}*/
}
