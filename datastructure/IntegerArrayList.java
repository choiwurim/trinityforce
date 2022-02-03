import java.util.*;
import java.lang.*;
package list;
public class IntegerArrayList implements IntegerListInterface{
	private Integer item[];
	private int numItems;
	private static final int DEFAULT_CAPACITY=64;
	
	public IntegerArrayList() {
		item=new Integer[DEFAULT_CAPACITY];
		numItems=0;
	}
	
	public void insert(int index, Integer x) {
		if(numItems>=item.length || index<0 || index>numItems) {
			// 抗寇贸府
		}
		else {
			for(int i=numItems-1;i>=index;i--) {
				item[i+1]=item[i];
			}
			item[index]=x;
			numItems++;
		}
	}
	public void append(Integer x) {
		if(numItems>=item.length) {
			//抗寇贸府
		}
		else {
			item[numItems++]=x;
		}
	}
	public Integer remove(int index) {
		if(isEmpty()|| index<0 || index>numItems-1) {
			// 抗寇贸府
		}
		else {
			Integer tmp=item[index];
			for(int i=index;i<numItems-2;i++) {
				item[i]=item[i+1];
			}
			numItems--;
			return tmp;
		}
	}
	public boolean removeItem(Integer x) {
		int i=0;
		while(i<numItems && item[i]!=x) {
			i++;
		}
		if(i==numItems) return false;
		else {
			for(int j=i;i<numItems-2;j++) {
				item[j]=item[j+1];
			}
			numItems--;
			return true;
		}
	}
	public Integer get(int index) {
		if(index>=0 && index<=numItems-1)
			return item[index];
		else
			return OUT_OF_BOUND;
	}
	public void set(int index, Integer x) {
		if(index>=0 && i<=numItems-1) 
			item[index]=x;
		else
			// 抗寇贸府
	}
	public int indexOf(Integer x) {
		int i;
		while(i<numItems && item[i]!=x) {
			i++;
		}
		if(i==numItems)
			return NOT_FOUND;
		else
			return i;
	}
	public int len() {
		return item.length;
	}
	public boolean isEmpty() {
		if(numItems==0)
			return true;
		else
			return false;
	}
	public void clear() {
		numItems=0;
	}
}
