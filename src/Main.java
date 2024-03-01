public class Main {
    public static void main(String[] args) {
        LinkList x = new LinkList();
        x.insertFirst(5);
        x.insertFirst(9);
        x.insertFirst(3);
        x.insertFirst(7);
        x.insertFirst(1);
        x.displayList();
        x.deleteFirst();
        x.displayList();
        x.delete(3);
        x.displayList();
        Node k=x.find(2);
        k.displayNode();
    }
}