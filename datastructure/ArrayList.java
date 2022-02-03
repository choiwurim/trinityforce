import java.util.*;
import java.lang.*;
package list;
public class ArrayList<E> implements ListInterface<E>{
	private E item[];
	private int numItems;
	private static final int LIMITS=64;
	
	public ArrayList() {
		item=(E[])new Object[LIMITS];
		numItems=0;
	}
	public void add(int index, E x) {
		if(numItems>=item.length || index<0 || index>numItems) {
			// 抗寇 贸府
		}
		else {
			for(int i=numItems-1;i>=index;i--) {
				item[i+1]=item[i];
			}
			item[index]=x;
			numItems++;
		}
	}
	public void append(E x) {
		if(numItems>=item.length) {
			// 抗寇 贸府
		}
		else {
			item[numItems]=x;
			numItems++;
		}
	}
	public E remove(int index) {
		if(isEmpty() || index<0 || index>numItems-1) {
			// 抗寇 贸府
		}
		else {
			E tmp=item[index];
			for(int i=index;i<numItems-1;i++) {
				item[i]=item[i+1];
			}
			numItems--;
			return tmp;
		}
	}
	public boolean removeItem(E x) {
		int k=0;
		while(k<numItems && ((Comparable)item[k]).compareTo(x)!=0) {
			k++;
		}
		if(item[k]==numItems)
			return false;
		else {
			for(int i=k;i<numItems-1;i++) {
				item[i]=item[i+1];
			}
			numItems--;
			return true;
		}
	}
	public E get(int index) {
		if(index>=0 && index<=numItems-1)
			return item[index];
		else
			return null;
	}
	public void set(int index, E x) {
		if(index>=0 && index<=numItems-1)
			item[index]=x;
		else
			// 抗寇贸府
	}
	public int indexOf(E x) {
		int i=0;
		for(i=0;i<numItems;i++) {
			if(((Comparable)item[i]).compareTo(x)==0)
				return i;
		}
		return NOT_FOUND;
	}
	public int len() {
		return numItems;
	}
	public boolean isEmpty() {
		return numItems==0;
	}
	public void clear() {
		numItems=0;
	}
}
