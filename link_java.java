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
      Node save = head;
       while(save != null)
       {
         System.out.println("list is:"+ save.data);
         save = save.next;
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

    void insert_middle(int num)
    {
      Node save = head;
      Node pre = head;
      Node node = new Node(num);
      int pos=1;
      if(head == null)
      {
        head = node;
      }
      else
      {
        while(save.next!= null && pos != 2)
        {
          pos++;
          pre = save;
          save = save.next;
        }
        node.next = save;
        pre.next = node;
      }
    }

    void insert_end(int num)
    {
      Node save =head;
      Node node = new Node(num);
      if( head==null)
      {
        head = node;
      }
      else
      {
        while(save.next != null)
        {
          save = save.next;
        }
        save.next = node;
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
    //         save= head
    //         pre= save
    //         pos= int(input("Enter pos\n"))-1
    //         while i<pos and save.next!=None:
    //             pre = save
    //             save= save.next
    //         pre.next = save.next.next
    //         print(save.data," is deleted")
    //         save=None
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
    list.insert_middle(2);
    list.insert_end(4);
    list.show();
    System.out.println("end");
  }

}
