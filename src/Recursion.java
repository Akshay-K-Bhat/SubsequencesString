public class Recursion {
    public static class SubsequenceString{

        public void subSequence(String str,int idx,String newString){

            if(idx==str.length()){

                System.out.println(newString);
                return;
            }

            char currChar = str.charAt(idx);

            //to be
            subSequence(str,idx+1,newString+currChar);

            //not to be
            subSequence(str,idx+1,newString);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        SubsequenceString s1 = new SubsequenceString();
        s1.subSequence(str,0,"");
    }
}
