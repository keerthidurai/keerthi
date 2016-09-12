import java.io.*;
import java.util.Scanner;
class prefix
{
public String longestCommonPrefix(String[] strs) {
    String longestPrefix = "";
    if(strs.length>0){
        longestPrefix = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longestPrefix.length(), strs[i].length()); j++){
            if(longestPrefix.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPrefix = strs[i].substring(0, j);
    }
    return longestPrefix;
}
public static void main(String st[])
{
Scanner sc=new Scanner(System.in);
String s[]=new String[10];
for(int i=0;i<10;i++)
{
s[i]=sc.nextLine();
}
 String sp=LongestCommonPrefix(s[]);
 System.out.print(sp);
 }
}
