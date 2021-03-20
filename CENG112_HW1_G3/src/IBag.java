public interface IBag<T> {
    public boolean add(T newItem);

    public boolean isEmpty();

    public boolean isFull();

    public T removeByIndex(int newItem);

    public T remove();

    public T remove(T newItem);

    public int getItemCount();

    public int getIndexOf(T newItem);

    public boolean contains(T newItem);

    public void displayItems();

    public void dump();

    public boolean transferTo(IBag<T> targetBag, T item);
}