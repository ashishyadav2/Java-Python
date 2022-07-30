import java.util.Arrays;
public class CustomArrayListGen<T> {
    private Object[] data;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    public CustomArrayListGen(){
        this.data = new Object[DEFAULT_SIZE];
    }
    private boolean isFull() {
        return (data.length==size);
    }
    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }
    public T remove() {
        T removed = (T)data[--size];
        data[size] = 0;
        return removed;
    }
    public void set(int index,int value) {
        data[index] = value;
    }
    public T get(int index) {
        return (T)data[index];
    }
    public int size() {
        return size;
    }
    @Override
    public String toString() {
        return Arrays.toString(data);
    }
    public static void main(String[] args) {
        CustomArrayListGen<Integer> list = new CustomArrayListGen<>();
        list.add(50);
        list.add(51);
        list.add(52);
        list.remove();
        list.add(53);
        list.set(0, 696);
        list.get(0);
        System.out.println(list);
    }
}
