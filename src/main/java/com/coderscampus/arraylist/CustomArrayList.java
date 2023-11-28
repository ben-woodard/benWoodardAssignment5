package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];

	// Add method
	@Override
	public boolean add(T item) {
		int itemsIndex = 0;
		for (Object element : items) {
			if (itemsIndex == items.length - 1) {
				items = doubleArrayLength();
			}

			if (items[itemsIndex] == null) {
				items[itemsIndex] = item;
				itemsIndex++;
				return true;
			}
			if (items[itemsIndex] != null) {
				itemsIndex++;
			}

		}
		return false;
	}

	@Override
	public int getSize() {
		return items.length - 1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		return (T) items[index];

	}

	public Object[] doubleArrayLength() {
		Object[] newItems = new Object[items.length * 2];
		for(int i = 0; i < items.length; i++) {
			items[i] = newItems[i];
		}
		return newItems;
	}

}
