package edu.sussex.coms223.lab1;

import java.util.Arrays;

//Class implements interface. Sub-class extends
//Rectangles with coordinates 1,2,3,4. When saying if(a == b) you are comparing addresses. Use: if(a.equal(b)) to compare values

public class ArrayList<E> implements List<E>
{
	private Object[] data = new Object[0];
	
	public boolean add(E e) {
		if(e == null)
			throw new IllegalArgumentException("NULL values not allowed");
		
		data = Arrays.copyOf(data, data.length + 1);
		data[data.length - 1] = e;
		
		return true;
	}

	public boolean remove(E e) {
		int removed = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(data[i].equals(e))
				removed++;
		}
		
		if(removed > 0)
		{
			Object[] newData = new Object[data.length - removed];
			for(int i = 0, j = 0; i < data.length; i++)
			{
				if(!data[i].equals(e))
					newData[j++] = data[i];
			}
			data = newData;
		}
		
		return (removed > 0);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) data[index];
	}

	public int size() {
		return data.length;
	}

	public void clear() {
		data = new Object[0];
	}
	
}


