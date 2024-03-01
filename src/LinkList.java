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
}
