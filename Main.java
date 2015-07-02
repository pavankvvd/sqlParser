import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final List<String> tokens = Arrays.asList(new String[]{"CREATE",
        "TABLE", "INSERT", "SELECT", "INTO", "FROM", "WHERE", "*", "(", ")",
                 "MDSYS.SPATIAL_INDEX", "INDEXTYPE", "PRIMARY KEY",
                 "REFERENCES", "NULL", "NOT", "LIKE", "IN", "BETWEEN", "OR", "AND",
                 "=", ">", "<", "<=", ">="});
    static final List<String> dataTypes = Arrays.asList(new String[]{
                 "INT","STRING", "VARCHAR", "INTEGER", "DATE", "NVARCHAR", "CHAR",
                 "VARCHAR2", "SDO_GEOMETRY", "CHARACTER", "BOOLEAN", "BINARY", "SMALLINT",
                 "BIGINT", "DECIMAL", "NUMERIC", "FLOAT", "REAL", "TIME", "XML",
                 "SDO_ELEM_INFO_ARRAY", "SDO_ORDINATE_ARRAY" }

    
    
    public enum State {
        CREATE, 
        TABLE, 
        TABLE_NAME,  
        ATTRIBUTE_NAME,
        ATTRIBUTE_TYPE,
        VALUE,
        ENDED
    }

    public enum Event {
        START;
        COMMA(','),
        OPEN_BRACE('('),
        CLOSEBRACE(')'),
        END(';')
    }
        

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = null;
        String[] query;

        while((inputStr = scanner.nextLine()) != null) {
            String input = new String();
            int i = 0;
            
            while(Character.isLetter(inputStr[i]) || Character.isDigit(inputStr[i]){
                input += inputStr[i++];
            }   
            
            switch(inputStr[i]){
                case ' ': 
                case ',': setCurrentState(State.ATTRIBUTE_NAME); 
                        break;
                case '(': setCurrentState(State.ATTRIBUTE_NAME);
                        break;
                case ')': setCurrentState(State.ENDED);
                        break;
                default : System.out.println("Syntax Error at ith positiion");
                        break;
            }   
        }
    }


    private static void select_check(String[] query) {
        switch(state):
            case TABLE:
            break;

    }

    private static void insert_check(String[] query) {
    }

    private static void create_check(String[] query) {
    }
}
