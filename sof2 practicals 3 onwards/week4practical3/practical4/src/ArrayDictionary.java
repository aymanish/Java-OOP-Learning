import java.util.ArrayList;

public class ArrayDictionary {
    //exercise1
    Integer[] keys;
    String[] values;
    int nextFreeSlot, buffer;
    public ArrayDictionary(int size){
        buffer = size;
        nextFreeSlot = 0;
        keys = new Integer[size];
        values = new String[size];
    }
    //constructor overloading
    public ArrayDictionary(){
        this(100);
    }
    //exercise2
    @Override
    public String toString() {
        if(this.keys.length == 0){
            return ("{}");
        }else{
            StringBuffer stringOutput = new StringBuffer("{");
            for(int i = 0; i < this.keys.length - 1; i++){
                stringOutput.append(this.keys[i] + ":" + this.values[i] + ", ");            
            }
            stringOutput.append(this.keys[this.keys.length - 1] + ":" + this.values[this.values.length - 1] + "}");
            return stringOutput.toString();
        }
    }
    //exercise3
    public String put(Integer key, String value) {
        if(key == null || value == null){
            return null;
        }
        for(int i = 0; i < this.keys.length; i++){
            if(key == this.keys[i]){
                String old = this.values[i];
                this.values[i] = value;
                return old;
            }
        }
        //add to array
        if(nextFreeSlot < this.keys.length){
            this.keys[nextFreeSlot] = key;
            this.values[nextFreeSlot] = value;
            nextFreeSlot++;
            return null;
        }else{//else extend array size by 1
            Integer[] newKeys = new Integer[this.keys.length + buffer];
            String[] newValues = new String[this.values.length + buffer];
            for(int i = 0; i < nextFreeSlot; i++){
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            newKeys[nextFreeSlot] = key;
            newValues[nextFreeSlot] = value;
            nextFreeSlot++;
            keys = newKeys;
            values = newValues;
            return null;
        }
    }
    //exercise 4
    public int size() {
        return nextFreeSlot;
    }
    public boolean contains(Integer key) {
        boolean contain = false;
        for(int i = 0; i < nextFreeSlot; i++){
            if(key == keys[i]){
                contain = true;
            }
        }
        return contain;
    }
    public void clear() {
        Integer[] resetKeys = new Integer[buffer];
        String[] resetValues = new String[buffer];
        keys = resetKeys;
        values = resetValues;
    }
    public ArrayList<Integer> keys() {
        ArrayList<Integer> keyList = new ArrayList<Integer>();
        for(int i = 0; i < nextFreeSlot; i++){
            keyList.add(i, keys[i]);
        }
        return keyList;
    }
    public ArrayList<String> values() {
        ArrayList<String> valueList = new ArrayList<String>();
        for(int i = 0; i < nextFreeSlot; i++){
            valueList.add(i, values[i]);
        }
        return valueList;
    }

    public static void main(String[] args) {
        int size = 3;
        ArrayDictionary dict = new ArrayDictionary(size);
        System.out.println(dict);
        dict.put(1, "one");
        System.out.println(dict);
        dict.put(2, "two");
        System.out.println(dict);
        dict.put(3, "three");
        System.out.println(dict);
        dict.put(4, "four");
        System.out.println(dict);
        dict.put(5, "five");
        System.out.println(dict);
        dict.put(6, "six");
        System.out.println(dict);
        System.out.println(dict.size());
        System.out.println(dict.contains(2));
        System.out.println(dict);
        System.out.println(dict.keys());
        System.out.println(dict.values());
    }
}
