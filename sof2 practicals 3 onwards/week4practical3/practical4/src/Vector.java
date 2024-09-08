public class Vector {
    //exercise 1
    private double[] vector;

    public Vector(double[] data) {
        vector = data.clone();
    }
    //exercise2
    @Override
    public String toString() {
        StringBuffer vectorString = new StringBuffer("<");
        for(int i = 0; i < vector.length - 1; i++){
            vectorString.append(vector[i] + ", ");
        }
        vectorString.append(vector[vector.length - 1] + ">");
        return vectorString.toString();
    }
    //exercise3
    public int size() {
        return vector.length;
    }
    //exercise4
    //accessor
    public Double get(int index) {
        return  vector[index];
    }
    //mutator
    public Double set(int index, double value) {
        double previousValue = vector[index];
        vector[index] = value;
        return previousValue;        
    }
    //exercise5
    public Vector scalarProduct(double scalar) {
        double[] product = vector.clone();
        for(int i = 0; i < product.length; i++){
            product[i] = product[i]*scalar;
        }
        Vector scaledVector = new Vector(product);
        return scaledVector;
    }
    //exercise6
    public Vector add(Vector other) {
        if (this.size() != other.size()){
            return null;
        }else{
            double[] vectorData = vector.clone();
            double[] otherData = new double[other.size()];
            double[] added = new double[other.size()];
            for(int i = 0; i < other.size(); i++){
                otherData[i] = other.get(i);
                added[i] = vectorData[i] + otherData[i];
            }
            Vector addedVector = new Vector(added);
            return addedVector;
        }

    }
    //overriding equals
    @Override
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Vector)){
            return false;
        }
        Vector v = (Vector) other;
        if(this.size() != v.size()){
            return false;
        }
        for (int i = 0; i < vector.length; i++) {
                if(v.get(i) != this.get(i)){
                    return false;
                }
        }
        // if we are here, the two vector have the same dimension and the same 
        // values, therefore they are equals.
        return true;
    }

    public static void main(String[] args) {
        double[] data1 = {1, 2, 3, 4};
        Vector v = new Vector(data1);
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.get(1));
        System.out.println(v.set(2, 5));
        System.out.println(v.scalarProduct(2));
        double[] data2 = {1, 1, 1, 1};
        Vector other = new Vector(data2);
        System.out.println(v.add(other));

    }


    
}
