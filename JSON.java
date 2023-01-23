
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;






import java.io.File;
import java.util.Arrays;


public class JSON {


    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Question [] question = mapper.readValue(new File("C:\\Users\\chwie\\IdeaProjects\\untitled\\.idea\\vertopal.com_jsonformatter (3).json"),Question[].class);

        for (int i = 0;i< question.length;i++){
            System.out.println(question[i].getQuestion1());
            System.out.println(question[i].getAnswer1()+"\n");
        }





        }
    }
