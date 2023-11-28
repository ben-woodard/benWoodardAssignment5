package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int itemsIndex = 0;

	@Override
	public boolean add(T item) {
		doubleArrayLength();
		items[itemsIndex] = item;
		itemsIndex++;
		return true;
	}

	@Override
	public int getSize() {
		return itemsIndex - 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];
	}

	public Object[] doubleArrayLength() {
		if (itemsIndex == items.length) {
			Object[] newItems = new Object[items.length * 2];
			for (int i = 0; i < items.length; i++) {
				newItems[i] = items[i];
			}
			items = newItems;
		}
		return items;
	}

}
