public class ArrayUtil {
    //intArray field
    private int[] intArray;

    //Default constructor
    public ArrayUtil(){}

    //Constructor with one argument
    public ArrayUtil(int[] arrayUtility){
        intArray = arrayUtility;
    }

    //Accessor (Getter)
    public int[] getIntArray(){
        return intArray;
    }

    //Mutator (Setter)
    public void setIntArray(int[] array) {
        intArray = array;
    }

    //minValue
    public int minValue() {
        if (intArray.length == 0) {
            return 0;
        }
        int temporarySmallest = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (temporarySmallest > intArray[i]) {
                temporarySmallest = intArray[i];
            }
        }
        return temporarySmallest;
    }

    //maxValue
    public int maxValue() {
        if (intArray.length == 0) {
            return 0;
        }
        int temporaryBiggest = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (temporaryBiggest < intArray[i]) {
                temporaryBiggest = intArray[i];
            }
        }
        return temporaryBiggest;
    }

    //countUniqueIntegers
    public int countUniqueIntegers() {
        if (intArray.length == 0) {
            return 0;
        }
        int uniqueCounter = 0;
        boolean uniqueState = true;
        for(int i = 0; i < intArray.length; i++){
            for (int j = i + 1; j < intArray.length; j++) {
                if(intArray[i] != intArray[j]){
                    continue;
                }
                else {
                    uniqueState = false;
                    break;
                }
            }
            if (uniqueState) {
                uniqueCounter++;
            }
            uniqueState = true;
        }
        return uniqueCounter;
    }
}