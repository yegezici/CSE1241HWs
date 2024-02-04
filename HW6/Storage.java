//Yunus Emre Gezici 150121066
public class Storage {
	private int capacity;
	private Item[] items = new Item[capacity];
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	

	Storage(int capacity) {
		this.capacity = capacity;

	}

	void addItem(Item item) {

		Item[] temp = items;
		items = new Item[Item.numberOfItems];
		for (int i = 0; i < Item.numberOfItems - 1; i++) {
			items[i] = temp[i];
		}
		items[Item.numberOfItems - 1] = item;
	
	}
	
	
}
