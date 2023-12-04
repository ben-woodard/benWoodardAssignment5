package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item) {
		doubleArrayLength();  //items = Arrays.copyOf(items, items.length *2)   **Another solution but current is good
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	public Object[] doubleArrayLength() {
		if (size == items.length) {
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		return items;
	}

}
