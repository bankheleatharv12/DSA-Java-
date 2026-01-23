public class StringReverseRecursion {

    String revString(String str){
        if(str==null|| str.length()<=1){
            return str;
        }

        return revString(str.substring(1))+str.charAt(0);
    }

    public static void main(String[] args){
        String str="Core2Web";
        StringReverseRecursion obj=new StringReverseRecursion();
        String reverse=obj.revString(str);
        System.out.println(reverse);
    }
    
}
