package StringExamples;

import org.apache.commons.lang3.StringUtils;

public class SwapTwoStringWithoutTemp {


    public static void main(String[] args)
    {
        String str="best";
        String str2="stories";
        
        str = str+str2;
        str2=str.substring(0, str.length()-str2.length());
        str=str.substring(str2.length());
        
        System.out.println(str.trim() + "          "+ str2);
        System.out.println("//test/me//".replaceAll("/+$", ""));
        System.out.println("//test/me".replaceAll("^/+", ""));
        System.out.println(StringUtils.stripStart("//test/me//", "/"));
        System.out.println(StringUtils.stripEnd("//test/me//", "/"));
    }
    
}
