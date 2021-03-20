public class BeveragesCompartment<T> implements IBag<T> {
    private T[] bag;
    private int numberOfEntries;
    private int Default_Capacity = 17;
    private int Kg_capacity = 4000;
    private int Kg;

    public BeveragesCompartment() {
        T[] tempBag = (T[]) new Object[Default_Capacity];
        bag = tempBag;
        numberOfEntries = 0;
        Kg=0;

    }


    @Override
    public boolean add(T newItem) {
        String[] x = (String[]) newItem;
        int food_kg = Integer.parseInt(x[2]);
        if (Kg_capacity-Kg > food_kg) {
            bag[numberOfEntries] = newItem;
            numberOfEntries += 1;
            Kg += food_kg;
            System.out.println(Kg);
            return true;

        }else {
            return false;


        }

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public T removeByIndex(int newItem) {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T remove(T newItem) {
        return null;
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getIndexOf(T newItem) {
        return 0;
    }
    public int getRemainingCapacity() {

        return (Kg_capacity-Kg);

    }

    @Override
    public boolean contains(T newItem) {
        return false;
    }

    @Override
    public void displayItems() {

    }

    @Override
    public void dump() {

    }

    @Override
    public boolean transferTo(IBag<T> targetBag, T item) {
        return false;
    }
}