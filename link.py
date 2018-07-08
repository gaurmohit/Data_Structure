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

    def show(self):
        save = self.head
        while save!=None:
            print(save.data)
            save = save.next


def insert_start(list):
        new = node()
        new.data=int(input("enter data\n"))
        if list.head is None:
            new.next = list.head
            list.head = new

def insert_middle(list):
    if list.head!=None:
        new = node()
        save = node()
        new.data=int(input("enter data\n"))
        pos= int(input("Enter pos\n"))
        i = 0
        pre = node()
        save= list.head
        while save.next!=None or i<pos:
            i+=1
            pre = save
            save = save.next
        pre.next = new.next
        new = pre.next
    else:
        print("list is empty can't enter in the middle\n")

def insert_end(list):
    if list.head!=None:
        new = node()
        save = node()
        new.data=int(input("enter data\n"))
        save = list.head
        while save.next != None:
            save = save.next
        new.next=save.next
        save.next = new
    else:
        print("list is empty can't enter in the middle\n")


list = linked_list()
i = 1
while i == 1:
    j = int(input("1.start  2.middle    3.end   4.show list\n"))
    if j ==1:
        insert_start(list)
    elif j ==2:
        insert_middle(list)
    elif j ==3:
        insert_end(list)
    else:
        print("List is:")
        list.show()
    i= int(input("Enter 1 to cont and 0 to exit\n"))
