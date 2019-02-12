import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}

}
class LinkedList
{
	Node head;
	public void insertEnd(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node current;
			current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=node;
		}
	}
	public void insertBeg(int data)
	{
		Node node=new Node(data);

		if(head==null){
			head=node;
		}
		else{
			node.next=head;
			head=node;
		}	
	}
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current;
			current=head;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
		}
	}
	public void traverse2(Node head)
	{
		if(head.next==null)
		{
			return;
		}
		traverse2(head.next);
		System.out.println(head.data);
	}
	public void printAlternate()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node current;
			current=head;
			while(current!=null)
			{
				System.out.println(current.data);
				current=current.next;
				if(current!=null)
				{
				current=current.next;
				}
			}
		}
	}
	public void printMiddle()
	{
		Node current;
			current=head;
		Node fast=head;
			Node slow=head;
		while (current!=null) {
			
			while(fast!=null){
				fast=fast.next;
			}
			if(fast!=null)
			{
				fast=fast.next;
				slow=slow.next;
			}
		}
		System.out.println(slow.data);
	}
	public void insertSpecific(int data)
	{
		Node node=new Node(data);
		int pos;
		System.out.println("Enter the position");
		Scanner sc=new Scanner(System.in);
		pos=sc.nextInt();
		int count=0;
		Node temp2=head;
		while(temp2!=null)
		{
			count++;
			temp2=temp2.next;
		}
		Node temp=head;
		if(pos==1)
		{
		node.next=head;
		head=node;
		}
		else if(pos<count&& pos>=1)
		{
			for(int i=0;i<pos-2;i++)
			{
				temp=temp.next;
			}
			Node temp1=temp.next;
			temp.next=node;
			node.next=temp1;
		}
		else
		{
			System.out.println("Index Out of Bound");
		}
	}
}
public class LinkList
{
 	public static void main(String[] args)
 	{
		LinkedList list=new LinkedList();
		list.insertEnd(10);
		list.insertEnd(20);
		list.insertEnd(30);
		list.insertEnd(40);
		list.insertEnd(50);
		list.insertSpecific(60);
		list.traverse();
	}
}