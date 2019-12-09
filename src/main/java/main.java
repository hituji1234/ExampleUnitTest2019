public class main {
    public static void main(String[] args){
        String str = null;

        try{
            System.out.println(str.length());
        }catch (NullPointerException s){
            System.out.println("NullPointerExceptionが発生しました");
            System.out.println(s.getMessage());
        }
    }
}
