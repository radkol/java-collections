package com.primeholding.collections.common;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Item implements Comparable<Item>{
	private final String name;

	private Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static Item newItem() {
		return new Item(RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(2, 10)));
	}

	@Override
	public String toString() {
		return "Item [" + name + "]";
	}

	@Override
	public int compareTo(Item o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
