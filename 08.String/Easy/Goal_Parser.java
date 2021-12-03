public class Goal_Parser {

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<command.length(); i++) {     
            if(command.charAt(i) == 'G')
                sb.append("G");
            else if(command.charAt(i) == '(') {            
                if(command.charAt(i+1) == ')') 
					sb.append("o");
                else 
					sb.append("al");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String command = "G()al";
        System.out.println(interpret(command));
    }
}
