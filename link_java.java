class Linked_list
{
  class Node
  {
    int data;
    Node next;

    Node(int info)
    {
      data = info;
    }
  }

  // Node head;

    void show()
    {
      Node current = head;
       while(current != null)
       {
         System.out.println("list is:"+ current.data);
         current = current.next;
       }
    }

    void insert_start(int num)
    {
      Node node = new Node(num);
      if(head == null)
      {
        head = node;
      }
      else
      {
        node.next = head;
        head = node;
      }
    }

    void insert_middle(int num,int position)
    {
      Node current = head;
      Node pre = head;
      Node node = new Node(num);
      int pos=1;
      if(head == null)
      {
        head = node;
      }
      else
      {
        while(current.next!= null && pos != position)
        {
          pos++;
          pre = current;
          current = current.next;
        }
        node.next = current;
        pre.next = node;
      }
    }

    void insert_end(int num)
    {
      Node current =head;
      Node node = new Node(num);
      if( head==null)
      {
        head = node;
      }
      else
      {
        while(current.next != null)
        {
          current = current.next;
        }
        current.next = node;
      }
    }

    // void del_start(Node head)
    // {
    //     if(head!=None)
    //     {
    //       head = head.next;
    //       print(head.data," is deleted");
    //       head =
    //     }
    //
    //  }
    //
    // void del_middle(Node head)
    // {
    //     if(head!=None)
    //     {
    //         current= head
    //         pre= current
    //         pos= int(input("Enter pos\n"))-1
    //         while i<pos and current.next!=None:
    //             pre = current
    //             current= current.next
    //         pre.next = current.next.next
    //         print(current.data," is deleted")
    //         current=None
    //     }
    //     else:
    //         print("linked list is empty")
    //   }

    Node head;

  public static void main(String[] args)
  {
    Linked_list list = new Linked_list();
    System.out.println("start");
    list.insert_start(3);
    list.insert_start(1);
    list.insert_middle(2,3);
    list.insert_end(4);
    list.show();
    System.out.println("end");
  }

}
