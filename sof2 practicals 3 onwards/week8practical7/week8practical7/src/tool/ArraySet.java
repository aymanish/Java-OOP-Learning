package tool;

public class ArraySet<E> implements ISet<E> {
    
    E[] set;
    int buffer, nextFreeSlot;

    public ArraySet(int size){
        buffer = size;
        set = (E[]) new Object[size];
        nextFreeSlot = 0;
    }
    @Override
    public boolean add(E element){
        if(contains(element)){
            return false;
        }else{
            if(nextFreeSlot < set.length){
                set[nextFreeSlot] = element;
                nextFreeSlot ++;
                return true;
            }
            return false;
        }
    }

    @Override
    public void clear( ){
        set = (E[]) new Object[buffer];
        nextFreeSlot = 0;
    }

    @Override
    public boolean contains(E element){
        for(int i = 0; i < set.length; i++){
            if(set[i] == element){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty( ){
        return nextFreeSlot == 0;   
    }

    @Override
    public boolean remove(E element){
        E removed = null;
        for(int i = 0; i < set.length; i++){
            if(set[i] == element){
                set[i] = removed;
                nextFreeSlot --;
                return true;
            }
        }
        return false;
    }
    @Override
    public int size( ){
        return nextFreeSlot;
    }

    //main
    public static void main(String[] args) {
        ISet<Integer> arrayI = new ArraySet<>(5);
        System.out.println(arrayI.isEmpty());//true
        System.out.println(arrayI.add(1));//true
        System.out.println(arrayI.add(2));//true
        System.out.println(arrayI.size());//2
        System.out.println(arrayI.contains(1));//true
        System.out.println(arrayI.contains(3));//false
        System.out.println(arrayI.isEmpty());//false 
        arrayI.remove(2);//true
        System.out.println(arrayI.size());//1
        arrayI.clear();//true
        System.out.println(arrayI.size()); //0
 
    }
}
