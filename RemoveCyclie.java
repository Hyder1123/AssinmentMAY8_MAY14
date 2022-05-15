package ArraysAndString;

public class RemoveCyclie {
    static Node head;
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        Node last = head.next.next.next;

        last.next = head.next;
        findCycle(head);
        display1();
        findCycle(head);
        findLength(head);
        display1();
        removecycle(head);
    }

    private static void removecycle(Node slop) {
        Node slowp = head;
        Node temp=slowp;
       while(temp.next!=slowp.next){


       }
    }

    private static int findLength(Node slowP) {
        int count=1;
        Node temp=slowP;
        Node slowp = head;
        while (temp.next!=slowp){
            count++;
            temp=temp.next;
        }
        return count;
    }

    private static boolean findcyclice(Node head) {
        int count=0;
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next!=null){
            count++;
            System.out.println(count);
        }
        else {
            Node slowp = head;
            Node fastp = head;
            while (fastp!=null && fastp.next.next!=null){
                slowp=slowp.next;
                fastp=fastp.next.next;

                if(slowp==fastp){
                    //slowp=head;
                    return true;

                }
            }
            System.out.println(count);
        }

        return false;
    }

    public static void display1() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node cur = head;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }
    public static void findCycle(Node head){
        if(head==null){
            System.out.println("List is empty");

        }
        else if(head.next==null){
            System.out.println(head);
        }
        else{
            Node slowP=head;
            Node fastp=head;
            while(fastp !=null && fastp.next.next!=null){
                slowP=slowP.next;
               fastp= fastp.next.next;
               if(slowP==fastp){
                   System.out.println("found");
                   break;
               }
            }
        }
    }
}
