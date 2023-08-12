public class Array {
    private Object[] item;
    private int lastInserted;

    public Array(int length) {
        this.item = new Object[length];
        this.lastInserted = 0;
    }

    public void insert(Object item) {
        Object[] newArray;
        if (lastInserted == this.item.length) {
            newArray = new Object[this.item.length + 1];
            for (int i = 0; i < this.item.length; i++)
                newArray[i] = this.item[i];
            newArray[newArray.length - 1] = item;
            this.item = newArray.clone();
            lastInserted++;
            return;
        }
        this.item[lastInserted++] = item;
    }

    public void removeAt(int index) {
        this.item[index] = null;
        Object[] newArray = new Object[this.item.length - 1];
        for (int i = 0; i < newArray.length; i++)
            newArray[i] = this.item[i];
        this.item = newArray.clone();
        lastInserted--;
    }

    public int indexOf(Object item) {
        for (int i = 0; i < this.item.length; i++)
            if (this.item[i] == item)
                return i;
        return -1;
    }

    public void print() {
        for (var i = 0; i < lastInserted; i++)
            System.out.println(item[i]);
    }
}
