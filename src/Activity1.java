public class Activity1 extends IntegerManager implements PrintPretty{
    public static void main(String[] args) throws Exception {
        Activity1 thing = new Activity1();
        thing.buildList();
        thing.printPretty();
        thing.shuffle();
        thing.printPretty();
    }

    @Override
    void buildList() {
        nums = new int[20];
        for(int i = 0; i < 20; i++){
            nums[i] = (int)(Math.random() * 100) - 10;
        }
    }

    public void printPretty() {
        System.out.println("\n~~~~ ARRAY ~~~~ (size : " + nums.length + ")");
        for(int num : nums){
            System.out.print(num + " ");

        }
    }

    @Override
    void shuffle() {
        //loop through all numbers, index i

        for(int i = 0; i < nums.length; i++){
            //pick a random spot
            int r = (int)(Math.random() * nums.length);
            //3-part sawap, r->temp->i
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }
        
        
    }

    @Override
    void insertionSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertionSort'");
    }

    @Override
    void selectionSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectionSort'");
    }

    @Override
    void mergeSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
    }

    @Override
    int pickRandom() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickRandom'");
    }
}
