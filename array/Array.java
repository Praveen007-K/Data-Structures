package pkoder.dsa.array;

public class Array {
    public int[] items;
    public int[] items_new;
    public int count;
    int flag = 0;

    Array(int length) {
        items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) 
            System.out.println(items[i]);
    }

    public void insert(int b) {
        if(items.length==count){
            items_new = new int[2*count];
            for (int i = 0; i < count; i++)
                items_new[i]=items[i];
            items=items_new;
        }
        items[count] = b;
        count++;
    }

    public void removeAt(int b) {
        if (b > items.length || b < 0) 
            throw new IllegalArgumentException();
        else {
            for (int i = b; i < items.length - 1; i++) 
                items[i] = items[i + 1];
            count--;
        }
    }

    /**Return type is best 
    for (int i = 0; i < items.length; i++) 
            if (b == items[i])
                return i;
    return -1;
    **/
    public void Indexof(int b) {
        for (int i = 0; i < items.length; i++) {
            if (b == items[i]) {
                System.out.println(i);
                flag = 1;
                break;
            }
        }
        if (flag == 0) 
            System.out.println(-1);
    }
}
