package Game.src;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Move {
    private int index = 0;
    private String name = "";
    private int type = 0;
    private int power = 0;

    public Move(int i){
        index = i;
        type = setType(i);
        power = setPower(i);
        name = setName(i);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("Game/moves.json")){

            Object obj = jsonParser.parse(reader);

            JSONObject moveList = (JSONObject) obj;
            //System.out.println(moveList.get("index"));

            JSONArray x = (JSONArray) moveList.get("index");
            x.get(0);
            System.out.println(x.get(0));
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ParseException e){
            e.printStackTrace();
        }
    }

    // index refers to a library of all known moves.
    public String setName(int index){
        return "hwah";
    }
    public int setType(int index){
        return 0;
    }
    public int setPower(int index){
        return 0;
    }

    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }
    public int getPower(){
        return power;
    }    
}
