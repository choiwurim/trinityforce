import java.util.*;
package list;
public class CircularLinkedList<E> implements ListInterface<E> {
	private Node<E> list;
	private int numItems;
	
	public CircularLinkedList() {
		numItems=0;
		tail=new Node(-1);
		tail.next=tail;
	}
	
	public void add(int index, E x) {
		if(index>=0 && index<=numItems) {
			Node<E> prevNode=getNode(index-1);
			Node<E> newNode=new Node(x, prevNode.next);
			prevNode.next=newNode;
			if(index==numItems) {
				tail=newNode;
			}
			numItems++;
		}
	}
	public void append(E x) {
		Node<E> prevNode=tail;
		Node<E> newNode=new Node(x,tail.next);
		tail.next=newNode;
		tail=newNode;
		numItems++;
	}
	public E remove(int index) {
		if(index>=0 && index<=numItems-1) {
			Node<E> prevNode=getNode(index-1);
			E rNode=prevNode.next.item;
			prevNode.next=prevNode.next.next;
			if(index==numItems)
				tail=prevNode;
			numItems--;
			return rNode;
		}
		else
			return null;
	}
	public boolean removeItem(E x) {
		Node<E> curNode=tail.next;
		Node<E> prevNode;
		for(int =0;i<numitems;i++) {
			prevNode=curNode;
			curNode=curNode.next;
			if(((Comparable)(curNode.item)).compareTo(x)==0) {
				prevNode.next=prevNode.next.next;
				numItems--;
				return true;
			}
			else return false;
		}
	}
	public E get(int index) {
		if(index>=0 && index<=numItems-1) {
			return getNode(index).item;
		}
		else return null;
	}
	public void set(int index, E x) {
		if(index>=0 && index<=numItems-1) {
			getNode(index).item;
		}
		else return null;
	}
	private Node<E> getNode(int index){
		if(index>=-1 && index<=numItems) {
			Node<E> curNode=tail.next;
			for(int i=0;i<numItems;i++) {
				curNode=curNode.next;
			}
			return curNode;
		}
		else
			return null;
	}
	public int indexOf(E x) {
		Node<E> curNode=tail.next;
		for(int i=0;i<numItems;i++) {
			curNode=curNode.next;
			if(((Comparable)(curNode.item)).compareTo(x)==0)
				return i;
			else
				return null;
		}
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
