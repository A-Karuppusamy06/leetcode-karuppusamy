// Last updated: 8/11/2026, 6:33:04 PM
class MyLinkedList {

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node cur = head;
        for (int i = 0; i < index; i++)
            cur = cur.next;

        return cur.val;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
        } else {
            Node cur = head;
            while (cur.next != null)
                cur = cur.next;
            cur.next = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node cur = head;
        for (int i = 0; i < index - 1; i++)
            cur = cur.next;

        Node node = new Node(val);
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
        } else {
            Node cur = head;
            for (int i = 0; i < index - 1; i++)
                cur = cur.next;

            cur.next = cur.next.next;
        }
        size--;
    }
}