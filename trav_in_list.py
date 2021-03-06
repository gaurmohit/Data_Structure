class node(object):
    def __init__(self,data = None, next= None):
        self.data=data
        self.next = next

    def data(self):
        return self.data

    def next(self):
        return self.next


class linked_list(object):
    def __init__(self):
         self.head= None

    #traverse via loop
    def show_loop(self):
        save = self.head
        while save!=None:
            print(save.data)
            save = save.next

    #traverse via recurssion
    def show_rec(self,save,flag):
        if save==None:
            flag=-1
        elif flag!=-1:
            print(save.data)
            show_rec(save.next,flag)

#insertion
def insert(list):
    new = node()
    new.data=int(input("enter data\n"))
    if list.head is None:
        new.next = list.head
        list.head = new
    else:
        save = list.head
        while save.next != None:
            save = save.next
        new.next=save.next
        save.next = new

#deletion
def del_start(list):
    if list.head!=None:
        save= list.head
        list.head= save.next
        print(save.data," is deleted")
        save=None
    else:
        print("linked list is empty")

def del_middle(list):
    if list.head!=None:
        save= list.head
        pre= save
        pos= int(input("Enter pos\n"))-1
        while i<pos and save.next!=None:
            pre = save
            save= save.next
        pre.next = save.next.next
        print(save.data," is deleted")
        save=None
    else:
        print("linked list is empty")

list = linked_list()
i = 1
while i == 1:
    k =1
    while True:
        k= int(input("Enter 1 to insert more and 0 to exit\n"))
        if k==0:
            break
        insert(list)
    j = int(input("1.start  2.middle    3.show list\n"))
    if j ==1:
        del_start(list)
    elif j ==2:
        del_middle(list)
    else:
        k = int(input("traverse(show) list via\n1.loop  2.recurssion\n"))
        if k ==1:
            list.show_loop()
        else:
            list.show_rec(list.head,1)
    i= int(input("Enter 1 to cont and 0 to exit\n"))
