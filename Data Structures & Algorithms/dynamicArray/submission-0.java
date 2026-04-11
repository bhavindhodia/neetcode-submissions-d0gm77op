class DynamicArray {

    int[] arr;
    int arrCapacity;
    int arrSize;
    public DynamicArray(int capacity) {
        arrCapacity = capacity;
        arrSize = 0;
        arr = new int[arrCapacity];
    }

    public int get(int i) {
        if(arr.length < i || i < 0){
            return 0;
        }
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if (arrSize==arrCapacity) {
            resize();
        }
        arr[arrSize] = n;
        arrSize+=1;
    }

    public int popback() {
        arrSize-=1;
        return arr[arrSize];
    }

    private void resize() {
        arrCapacity = arrCapacity *2;
        System.out.println("RESIZE to : "+arrCapacity);
        int[] newArr = new int[arrCapacity];
        if (arrSize >= 0) System.arraycopy(arr, 0, newArr, 0, arrSize);
        arr = newArr;
    }

    public int getSize() {
        return arrSize;
    }

    public int getCapacity() {
        return arrCapacity;
    }
}