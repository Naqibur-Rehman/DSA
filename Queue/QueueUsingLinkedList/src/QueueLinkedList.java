public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        this.list = new LinkedList();
        System.out.println("Queue successfully created");
    }

    //isEmpty
    public boolean isEmpty() {
        return list.head == null;
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value);
    }

    //deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            value = list.head.value;
            list.deleteNode(0);
        }
        return value;
    }

    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return list.head.value;
        }
    }


    //deleteQueue
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("Queue deleted successfully");
    }

}
