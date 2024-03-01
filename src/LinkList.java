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
}
