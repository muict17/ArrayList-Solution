public class MyArrayList<T> {
    private T[] data;
    private int length = 0;
    private int capacity = 1;
    MyArrayList(){
        data = (T[]) new Object[this.capacity];
    }

    public T get(int index){
        return this.data[index];
    }
    public boolean add(T element){
        if(this.isFull()){
            T[] temp = (T[]) new Object[this.capacity + 1];
            for(int i = 0; i < this.length; i++){
                temp[i] = this.data[i];
            }
            this.capacity++;
            this.data = temp;
        }
        this.data[this.length++] = element;
        return true;
    }

    public boolean remove(int index){
        if(!isEmpty()){
            T[] temp = (T[]) new Object[this.capacity - 1];
            int currentIndexTemp = 0;
            int currentIndexData = 0;
            while (currentIndexData != this.capacity){
                if(currentIndexData != index){
                    temp[currentIndexTemp] = this.data[currentIndexData];
                    currentIndexTemp++;
                }
                currentIndexData++;
            }
            this.capacity--;
            this.length--;
            this.data = temp;
        }

        return true;
    }

    public boolean isEmpty(){
        return this.capacity == 0;
    }
    public boolean isFull(){
        return this.length == this.capacity;
    }
    public int size(){
        return this.length;
    }

    public void printData(){
        int index = 0;
        for(T element: this.data){
            System.out.println("Index: "+ index + " Value: " + element);
            index++;
        }
    }
}
