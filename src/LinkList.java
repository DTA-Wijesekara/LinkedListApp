public class LinkList
{
    private Node head;
    public LinkList()
    {
        this.head=null;
    }
    public boolean isEmpty()
    {
        return (this.head==null);
    }
    public void insertFirst(int i)
    {
        Node newNo = new Node(i);
        newNo.next = head;
        head = newNo;
    }
    public Node deleteFirst()
    {
        if (isEmpty())
        {
            System.out.println("list is empty nothing to delete");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    public void displayList()
    {
        if (isEmpty())
        {
            System.out.println("list is empty nothing to display");
            return;
        }
        Node current = head;
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    public Node find (int key)
    {
        Node current = head;
        int count=1;
        while(current != null)
        {
            if(count == key)
            {
                return current;
            }
            current = current.next;
            count++;
        }
        System.out.println("that is not found");
        return null;
    }
    public void delete(int key)
    {
        if (isEmpty())
        {
            System.out.println("list is empty nothing to delete");
            return;
        }
        Node current = head;
        Node previous = head;
        int count=1;
        while(current != null)
        {
            if(count == key)
            {
                if (count == 1)
                {
                    head = head.next;
                    return;
                }
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
            count++;
        }
        System.out.println("that is not found");
        return;
    }
}
