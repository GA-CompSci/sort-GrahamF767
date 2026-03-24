public class Activity1 extends IntegerManager implements PrintPretty{
    public static void main(String[] args) throws Exception {
        Activity1 thing = new Activity1();
        thing.buildList();
        thing.printPretty();
        thing.shuffle();
        thing.printPretty();
        thing.selectionSort();
        thing.printPretty();
        //thing.selectionSort(true);
        thing.printPretty();
        thing.shuffle();
        thing.insertionSort();
        thing.printPretty();
        thing.insertionSort(true); // high to low results
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
        //outer loop
        for(int j = 1; j < nums.length; j++){
            int temp = nums[j]; // Will steals souls
            //while loop that goes backwards\
            int i = j - 1; // spawns Owen
            while(i > -1 && nums[i] > temp){
                // shift over
                nums[i + 1] = nums[i]; // drag out the swap 
                i--;
            }
            nums[i + 1] = temp; // complete the three-part-swap
        }
    }
    void insertionSort(boolean highToLow){
        if(!highToLow){
            insertionSort();
            return;
        }
        //outer loop
        for(int j = 1; j < nums.length; j++){
            int temp = nums[j]; // Will steals souls
            //while loop that goes backwards
            int i = j - 1; // spawns Owen
            while(i > -1 && nums[i] < temp){
                // shift over
                nums[i + 1] = nums[i]; // drag out the swap 
                i--;
            }
            nums[i + 1] = temp; // complete the three-part-swap
        }
    }

    @Override
    void selectionSort() {
        // outer loop - STOP ONE EARLY DO INNER DOESN'T GO OUT OF BOUNDS
        for(int outer = 0; outer < nums.length - 1; outer++){
            // find the smallest
            int smallest_index = outer;
            // inner loop to search for smallest. Can we find something smaller?
            for(int inner = outer + 1; inner < nums.length; inner++){
                if(nums[inner] < nums[smallest_index]) smallest_index = inner;
            }
            // three part swap [outer] loop with [smallest_index]
            int temp = nums[smallest_index];
            nums[smallest_index] = nums[outer];
            nums[outer] = temp;
        }
    }

    @Override
    void mergeSort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mergeSort'");
    }

    @Override
    int pickRandom() {
        // TODO Auto-generated method stub
        int randomIndex = (int)(Math.random() * nums.length);
        return nums[randomIndex];
    }

    int binarySearch(int something){
        // start in the middle
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int middle = (low + high) / 2;
            if(nums[middle] == something) return middle;
            else if(nums[middle] > something) {

                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        
        // if I didn't find what I'm looking for
        return -1;
    }

}
