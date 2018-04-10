
public class jibon2 {

	public static void main(String[] args) {
		int k=1;
		int l=2;
		int m=3;
		int count2=0;
		int count=0;
		int count3=0;
		
		String string="k+l+em";
		
	    char[] str=string.toCharArray();
		
		for(int i=0;i<str.length;i++){
			if(str[i]>='a' && str[i]<='z' && count2%2==0){
				count++;
				
			}
			if(str[i]=='+' || str[i]=='-' || str[i]=='*' || str[i]=='/' && count2%2 !=0){
				count++;
			}
			count2++;
			
		}
		
		if(str[str.length-1]== '+' || str[str.length-1]== '-' || str[str.length-1]== '*' || str[str.length-1]== '/' ){
			count3++;
		}
		
		if(count==str.length && count3==0){
			System.out.println("Expression is OK");
			
		}
		else{
			System.out.println("Compilation Error!!!");
		}

	}

}