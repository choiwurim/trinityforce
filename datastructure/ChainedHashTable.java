package hashTable;
import list.LinkedList;
import list.Node;
import BST.IndexInterface;
public class ChainedHashTable implements IndexInterface<Node>{
	private java.util.LinkedList<E> table;
	int numItems=0;
	public ChainedHashTable(int n) {
		table=(LinkedList<Integer>[]) new LinkedList[n];
		for(int i=0;i<n;i++) {
			table[i]=new LinkedList<>();
		}
		numItems=0;
	}
	private int hash(Integer x) {
		return x%table.length;
	}
	public void insert(Integer x) {
		int slot=hash(x);
		table[slot].add(0,x);
		numItems++;
	}
	public Node search(Integer x) {
		int slot=hash(X);
		if(table[slot].isEmpty())
			return null;
		else {
			int i=table[slot].indexOf(x);
			if(i==LinkedList.NOT_FOUND)
				return null
		}
		return i;
	}
	public void delete(Integer x) {
		if(isEmpty())
			return null;
		else {
			int slot=hash(x);
			table[slot].removeItem(x);
			numItems--;
		}
	}
	public boolean isEmpty() {
		return numItems==0;
	}
	public void clear() {
		numItems=0;
	}
}
