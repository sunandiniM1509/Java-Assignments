/**
*Creating node through a generic Node class, a singly linked list class SList without implementing the List interface.
*and a SListIterator to iterate over the list and to insert and remove elements from an SList is through SListIterator 
using deleteData and insertData methods.
*/
class Node<T>
{
    T data;
    Node<T> next;

    Node(T data)
    {
        this.data = data;
        this.next = null;
    }
    Node()
    {
        this.data = null;
        this.next = null;
    }
}
class SList<T>
{
    Node<T> head;
    SList()
    {
        head = null;
    }
    public SListIterator iterator()
    {
        return new SListIterator<T>(head);
    }
}


class SListIterator<T>
{
    Node<T> head;
    Node<T> tail;

    SListIterator(Node<T> t)
    {
        head = t;
    }
    //Intersting node
    public void insertData(T data)
    {
        if(head==null)
        {
            head = new Node<T>(data);
            tail = head;
        }
        else
        {
            tail.next = new Node<T>(data);
            tail = tail.next;
        }
    }
   // Deleting node
    public void deleteData(T data)
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(String.valueOf(head.data).equals(String.valueOf(data)))
        {
            head = head.next;
            return;
        }

        Node<T> temp = head;
        while(temp!=tail && !String.valueOf(temp.next.data).equals(String.valueOf(data)))
            temp = temp.next;

        if(temp==tail)
        {
            System.out.println("List does not contain such element");
            return;
        }

        if(temp.next==tail)
        {
            tail = temp;
            tail.next = null;
        }

        else
            temp.next = temp.next.next;
    }

    public void displaySList()
    {
        if(head==null)
        {
            System.out.println("Empty List, Nothing to Display");
            return;
        }
        Node<T> temp = head;
        System.out.println("The list contains :");
        while(temp.next!=null)
        {
            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}

class GenericList
{
    public static void main(String args[])
    {
        SList<String> myList = new SList<String>();
        SListIterator it = myList.iterator();
        it.insertData("Java");
        it.insertData("Assignment");
        it.insertData(10);
        it.insertData("This is a string");
        it.displaySList();
        it.deleteData("Java");
        it.deleteData("This is string");
        it.displaySList();
        it.deleteData("This is a string");
        it.displaySList();
    }
}
