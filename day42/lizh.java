// todo next “lizhonghao-2016-10-06”
import java.util.LinkedList;
public class SimplifyPath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=new String("/a//b");
		System.out.println("简化后的路径："+simplifyPath(path));
	}
	
	public static String simplifyPath(String path){
		String result="";
		String[] splits=path.split("/");
		LinkedList<String> stack=new LinkedList<>();
		
		for(String str:splits){
			if(str.length()==0 || str.equals(".")){
				continue;
			}else if(str.equals("..")){
				if(!stack.isEmpty()){
					stack.pop();
				}
			}else{
				stack.push(str);
			}
		}
		
		if(stack.isEmpty()){
			stack.push("");
		}
		
		while(!stack.isEmpty()){
			result+="/"+stack.removeLast();
		}
		
		return result;
	}
}

