import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final List<String> tokens = Arrays.asList(new String[]{"CREATE", "TABLE", "INSERT", "SELECT", "INTO", "FROM", "WHERE", "*", "(", ")", "INT",
            "STRING", "VARCHAR", "INTEGER", "DATE", "NVARCHAR", "CHAR",
            "VARCHAR2", "SDO_GEOMETRY", "CHARACTER", "BOOLEAN", "BINARY", "SMALLINT",
            "BIGINT", "DECIMAL", "NUMERIC", "FLOAT", "REAL", "TIME", "XML",
            "SDO_ELEM_INFO_ARRAY", "SDO_ORDINATE_ARRAY",
            "MDSYS.SPATIAL_INDEX", "INDEXTYPE", "PRIMARY KEY",
            "REFERENCES", "NULL", "NOT", "LIKE", "IN", "BETWEEN", "OR", "AND", "=", ">", "<", "<=", ">="});

    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
            String inputStr = null;
            String[] query;

            while((inputStr = scanner.nextLine()) != null){
                query = inputStr.split(" ");

                if(query[0] == "CREATE"){
                        create_check(query);
                        continue;
                }
                if(query[0] == "INSERT"){
                        insert_check(query);
                        continue;
                }
                if(query[0] == "SELECT"){
                        select_check(query);
                        continue;
                }


            }
    }

    private static void select_check(String[] query) {

    }

    private static void insert_check(String[] query) {
    }

    private static void create_check(String[] query) {

    }
}
