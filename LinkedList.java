import java.util.*;
package list;
public class LinkedList implements ListInterface<E>{
	private Node<E> head;
	private int numItems;
	
	public LinkedList() {
		numItems=0;
		head=new Node<>(null, null);
	}
	
	public void add(int index, E item) {
		if(index>=0 && index<=numItems) {
			Node<E> prevNode=getNode(index-1);
			Node<E> newNode=new Node<>(item,prevNode.next);
			prevNode.next=newNode;
			numItems++;
		}
	}
	public void append(E item) {
		Node<E> prevNode=head;
		while(prevNode.next!=null) {
			prevNode=prevNode.next;
		}
		Node<E> newNode=new Node<>(item, null);
		prevNode.next=newNode;
		numItems++;
	}
	public E remove(int index) {
		if(index>=0 && index <=numItems-1) {
			Node<E> prevNode=getNode(index-1);
			Node<E> curNode=prevNode.next;
			prevNode.next=curNode.next;
			numItems--;
			return curNode.item;
		}
		else return null;
	}
	public boolean removeItem(E x) {
		Node<E> prevNode, curNode=head;
		for(int i=0;i<numItems;i++) {
			prevNode=curNode;
			curNode=curNode.next;
			if(curNode.item.compareTo(x)==0) {
				prevNode.next=curNode.next;
				numItems--;
				return true;
			}
		}
		return false;
	}
	public E get(int index) {
		if(index>=0 && index<=numItem-1) {
			return getNode(index).item;
		}
		else
			return null;
	}
	public Node<E> getNode(int index){
		if(index>=-1 && index<=numItems-1) {
			Node<E> curNode=head;
			for(int i=0;i<=index;i++) {
				curNode=curNode.next;
			}
			return curNode;
		}
		else {
			return false;
		}
	}
	public void set(int index, E x) {
		if(index>=0 && index<=numItems-1) {
			getNode(index).item=x;
		}
	}
	public int indexOf(E x) {
		Node<E> curNode=head;
		int i;
		for(i=0; i<numItems; i++) {
			curNode=curNode.next;
			if((Comparable)curNode[item].compareTo(x)==0)
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
