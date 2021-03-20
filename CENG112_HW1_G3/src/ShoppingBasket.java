
public class ShoppingBasket<T> implements IBag<T> {
    private T[] bag;
    private int numberOfEntries;
    private int Default_Capacity = 10;
    private int Kg;
    private int Kg_capacity = 2000;

    public ShoppingBasket() {
        T[] tempBag = (T[]) new Object[Default_Capacity];
        bag = tempBag;
        numberOfEntries = 0;
        Kg = 0;
    }

    public boolean add(T newItem) {
        String[] x = (String[])newItem;
        int food_kg = Integer.parseInt(x[2]);
        if (Kg_capacity - Kg >= food_kg) {
            bag[numberOfEntries] = newItem;
            numberOfEntries+=1;
            Kg += food_kg;
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        return Kg >= 1750;
    }

    public boolean isFull() {
        return Kg == Kg_capacity;
    }

    public T removeByIndex(int index) {
        return null;
    }

    public T remove() {
        T item= bag[numberOfEntries-1];
        bag[numberOfEntries-1]=null;
        numberOfEntries-=1;


        return item;
    }

    public T remove(T item) {
        return null;
    }


    public int getItemCount() {
        return numberOfEntries;
    }

    public int getIndexOf(T item) {



        return 0;
    }

    public boolean contains(T item) {
        return true;
    }

    public void displayItems() {
        int ct = 0;
        System.out.print("Basket contains: ");

        for(int i = 0; i < numberOfEntries; ++i) {
            String[] data;
            if (ct + 1 == numberOfEntries) {
                data = (String[])bag[i];
                ct+=1;
                System.out.println(data[0]);
            } else {
                data = (String[])bag[i];
                ct+=1;
                System.out.print(data[0] + ",");
            }
        }

    }

    public void dump() {
        }



    public boolean transferTo(IBag<T> targetBag, T item) {
        return true;
    }
}