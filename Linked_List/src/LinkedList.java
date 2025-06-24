public class LinkedList
{
    public Node head;
    public Node tail;

    void insert(int data)
    {
        Node nn=new Node();
        nn.value=data;
        if (head==null)
        {
            head=nn;
            tail=nn;

        }
        else
        {
            tail.nextadd=nn;
            tail=nn;

        }
    }
    void travers()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.nextadd;
        }
    }
}