public class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
    public void displayNode()
    {
        System.out.print(this.data + " ");
    }
}
