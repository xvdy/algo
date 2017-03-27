// todo next “lizhonghao-2016-11-20”
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CloneGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static class UndirectedGraphNode{
		int label;
		ArrayList<UndirectedGraphNode> neighbors;
		public UndirectedGraphNode(int label) {
			// TODO Auto-generated constructor stub
			this.label=label;
			neighbors=new ArrayList<UndirectedGraphNode>();
		}
	}
	
	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node ==null){
			return null;
		}
		
		LinkedList<UndirectedGraphNode> queue=new LinkedList<UndirectedGraphNode>();
		HashMap<UndirectedGraphNode, UndirectedGraphNode> map=new HashMap<>();
		
		UndirectedGraphNode newHead=new UndirectedGraphNode(node.label);
		
		queue.add(node);
		map.put(node, newHead);
		
		while(!queue.isEmpty()){
			UndirectedGraphNode cur=queue.pop();
			ArrayList<UndirectedGraphNode> curNeighbors=cur.neighbors;
			
			for(UndirectedGraphNode everyNeighbor:curNeighbors){
				if(!map.containsKey(everyNeighbor)){
					UndirectedGraphNode copy=new UndirectedGraphNode(everyNeighbor.label);
					map.put(everyNeighbor,copy);
					map.get(cur).neighbors.add(copy);
					queue.add(everyNeighbor);
				}else{
					map.get(cur).neighbors.add(map.get(everyNeighbor));
				}
			}
		}
		
		return newHead;
	}
}


