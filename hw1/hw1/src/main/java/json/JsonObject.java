package json;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {

    public JsonObject(JsonPair... jsonPairs) {
        private ArrayList<JsonPair> jsonArray = new ArrayList();
        jsonArray.addAll(Arrays.asList(jsonPairs));
    }

    @Override
    public String toJson() {
        // ToDo
        return null;
    }

    public void add(JsonPair jsonPair) {
        jsonArray.add(jsonPair);
    }

    public Json find(String name) {
        for(JsonPair pair : jsonArray){
            if(name.equals(pair.key)){
                return pair.value
            }


        }
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
