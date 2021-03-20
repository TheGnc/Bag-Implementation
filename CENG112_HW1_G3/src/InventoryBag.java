public class InventoryBag<T> implements IBag<T> {
    private T[] bag;
    private int numberOfEntries;
    private int Default_Capacity = 14;

    public InventoryBag() {
        T[] tempBag = (T[]) new Object[Default_Capacity];
        bag = tempBag;
        numberOfEntries = 0;
    }

    public boolean add(T newItem) {
        if (numberOfEntries < Default_Capacity) {
            bag[numberOfEntries] = newItem;
            ++numberOfEntries;
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return true;
    }

    public T removeByIndex(int index) {
        return null;
    }

    public T remove() {
        return null;
    }

    public T remove(T item) {
        return null;
    }

    public int getItemCount() {
        return 0;
    }

    public T getItem(int choice) {
        return bag[choice - 1];
    }

    public int getIndexOf(T item) {
        return (Integer)item;
    }

    public boolean contains(T item) {
        return true;
    }

    public void displayItems() {
        int ct = 0;

        for(int i = 0; i < this.numberOfEntries; ++i) {
            String[] data = (String[])bag[i];
            ++ct;
            System.out.println("[" + ct + "]" + data[0]);
        }

    }

    public void dump() {
    }

    public boolean transferTo(IBag<T> targetBag, T item) {
        return true;
    }
}