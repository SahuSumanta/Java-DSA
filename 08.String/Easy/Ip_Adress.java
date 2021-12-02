public class Ip_Adress {


    public static String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
          for(int i = 0; i < address.length(); i++){
              if(address.charAt(i) == '.'){
                  builder.append("[.]");
              }
              else{
                  builder.append(address.charAt(i));
              }
          }
          return builder.toString();
          
      }
    public static void main(String[] args) {
        String s = "1.1.1.1";
        defangIPaddr(s);
        System.out.println(defangIPaddr(s));
    }
}
