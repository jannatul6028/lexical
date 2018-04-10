import java.util.ArrayList;
import java.util.Scanner;

public class eva {

	public static void main(String[] args) {
	     
		int a=0;
		String []string1=new String[50];
		String []St=new String[30];
		String []stt=new String[30];
		String []stt1=new String[30];
		String strr1[]=new String[20];
		
		Scanner ji= new Scanner(System.in);
		System.out.println("Please enter the string input :"); 
		String string2= ji.nextLine();
		
		String z=" ";
		
		 String[] parts = string2.split(z);

		    for(int i=0;i<parts.length;i++){
		      System.out.println(parts[i]);}
		    
		    int k=0,m=0,l=0,n=0,o=0;
			for(int j=0;j<parts.length;j++) {
				if(parts[j].equals("a") || parts[j].equals("b") || parts[j].equals("c") || parts[j].equals("d") || parts[j].equals("e") || parts[j].equals("f") || parts[j].equals("g") || parts[j].equals("h") || parts[j].equals("i") || parts[j].equals("j") || parts[j].equals("k") || parts[j].equals("l")) {
					strr1[k]=parts[j];
					k++;
				}
				else if(parts[j].equals("int") || parts[j].equals("String") || parts[j].equals("float") || parts[j].equals("if") || parts[j].equals("else")) {
					string1[m]=parts[j];
					m++;
				}
				else if(parts[j].equals("0") || parts[j].equals("1") || parts[j].equals("2") || parts[j].equals("3") ||parts[j].equals("4") || parts[j].equals("5") || parts[j].equals("6") || parts[j].equals("7")
					|| parts[j].equals("8") || parts[j].equals("9") || parts[j].equals("10")) {
					St[l]=parts[j];
					l++;
				}
				else if(parts[j].equals(";")||parts[j].equals("}")||parts[j].equals("{")||parts[j].equals("(")||parts[j].equals(")") ||parts[j].equals("[") ||parts[j].equals("]")) {
					stt[n]=parts[j];
					n++;
				}
				else if(parts[j].equals("+")||parts[j].equals("-")||parts[j].equals("*")||parts[j].equals("/")||parts[j].equals("=")||parts[j].equals("<=")
						||parts[j].equals(">=")||parts[j].equals("==")||parts[j].equals("++")||parts[j].equals("--")||parts[j].equals("%") ||parts[j].equals("_")) {
					stt1[o]=parts[j];
					o++;
				}
			}
			for(int i=0;i<k;i++) {
				System.out.print(strr1[i]+" ");
			}
			System.out.println();
			for(int i=0;i<m;i++) {
				System.out.print(string1[i]+" ");
			}
			System.out.println();
			for(int i=0;i<l;i++) {
				System.out.print(St[i]+" ");
			}
			System.out.println();
			for(int i=0;i<n;i++) {
				System.out.print(stt[i]+" ");
			}
			System.out.println();
			for(int i=0;i<0;i++) {
				System.out.print(stt1[i]+" ");
			}
		    
	}
}