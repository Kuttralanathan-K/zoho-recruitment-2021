import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String txt = s.nextLine();
		int len = txt.length();
		int mid = len/2;
		String new_txt = Character.toString(txt.charAt(mid));
		for(int i=0;i<len;i++){
		    for(int j=len-i-1;j>0;j--){
		        System.out.print(" ");
		    }
		    mid++;
		    if(mid>=len){
		        mid=0;
		    }
		    System.out.println(new_txt);
		    new_txt+=Character.toString(txt.charAt(mid));
		    
		}
	}
}
