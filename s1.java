/*1. Basic linked list.
operations
1. insert[ at begning, last and the position]
a. insert
step1. linked list class
step 2. memory alocation on linked list class]
 by  creating object.
step 3. puting data into linked list[ at begning]
step. concept of adding new node.
Step- Traverse
*/
// creating a node class
public class s1
{
	//register
class node
{
	int data;
	node next,prev;
	
	public node(int data)
	{
		this.data=data;
		this.next=null;
		
	}		
}

public node head=null;// creating object of node[ head] and value will be null
public node tail=null;// creating object of node[ tail] and value will be null

public void insert(int data)
{

	node n1=new node(data);
	inputfromuser()
	if(head==null)
	{
		head=n1;
		tail=n1;
	}
	else
	{

		tail.next=n1;
		tail=n1;
		

	}
}

public void show()
{
	tail=head;
	if(tail==null)
	{
		System.out.println("empty");	
	}
	while(tail!=null)
	{
		System.out.println(tail.data);
		tail=tail.next;
	}
}
public static void main(String[] args)
{
	scanner
	s1 list=new s1();
	list.insert(a);
	list.insert(20);
	list.insert(30);
	
	list.show();
}
}	