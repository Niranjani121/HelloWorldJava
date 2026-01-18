public class StringExam{
    public static void main(String[] args){
        String str1="Hello World";
        String str2="hello world";
        String str3="Java";
        
        // length()
        System.out.println("Length of str1 is :"+str1.length());

        //charAt()
        System.out.println("Character of Index :"+str2.charAt(1));

        //concat()
        System.out.println("Concat result :"+str3.concat("Programming"));

        //equals()
        System.out.println("Equals check :"+str1.equals(str2));

        //equalsIgnoreCase()
        System.out.println("Equals Ignore Case :"+str1.trim().equalsIgnoreCase(str2));

        //indexOf()
        System.out.println("Index of 'o' :"+str1.indexOf('o'));

        //lastindexOf()
        System.out.println("Last index of 'o' :"+str1.lastIndexOf('o'));

        //substring(begin)
        System.out.println("Substring from index 6: "+str1.substring(6));

        //substring(begin,end)
        System.out.println("Substring(0,5) :"+str1.substring(0,5));

        //toUppercase()
        System.out.println("Uppercase :"+str2.toUpperCase());

        //toLowercase()
        System.out.println("Lowercase :"+str1.toLowerCase());

        //trim()
        System.out.println("Trimmed string :"+str1.trim()+"java");

        //replace()
        System.out.println("Replaaced string :"+str1.replace("World","java"));
    }
}
