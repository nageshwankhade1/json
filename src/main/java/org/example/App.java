package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Collection;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println("Hello World!");
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("example.json");
        System.out.println(jsonObject);

        /*JSONObject name = (JSONObject) jsonObject.get("child");

        System.out.println(name);

        String value = (String) name.get("something");
        System.out.println(value);*/

        String name = (String) jsonObject.get("name");
        System.out.println(name);

        long age = (Long) jsonObject.get("age");
        System.out.println(age);

        // loop array
        JSONArray msg = (JSONArray) jsonObject.get("messages");
        Iterator<String> iterator = msg.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}
