
package Entity;

public class MyList<E extends Comparable<E>> {
    Node<E> head, tail;
    Node<E> sorted;

    public void myList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = tail = null;
    }

    public void addToTail(E x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
        } else {
            tail.setNext(q);
            tail = q;
        }
    }

    public void traverse() {
        Node<E> p = head;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getNext();
        }
        System.out.println();
    }

    public E search(E x) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
        }
        boolean check = false;
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getInfo().equals(x)) {
                check = true;
                break;
            }
            currentNode = currentNode.getNext();
        }
        if (!check) {
            System.out.println("The given list does not have x object.");
            return null;
        }
        return currentNode.getInfo();
    }

    public void sort() {
        sorted = null;
        Node<E> currentNode = head;
        while (currentNode != null) {
            Node<E> next = currentNode.getNext();
            sortInsert(currentNode);
            currentNode = next;
        }
        head = sorted;
    }

    public void sortInsert(Node<E> newNode) {
        if (sorted == null || sorted.getInfo().compareTo(newNode.getInfo()) <= 0) {
            newNode.setNext(sorted);
            sorted = newNode;
        } else {
            Node<E> currentNode = sorted;
            while (currentNode.getNext() != null && currentNode.getNext().getInfo().compareTo(newNode.getInfo()) > 0) {
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
    }

    public void delete(E x) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node<E> currentNode = head;
        Node<E> pre_Node = new Node();

        while (!currentNode.getInfo().equals(x) && currentNode.getNext() != null) {
            pre_Node = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode.getNext() == null) {
            System.out.println("The given list does not have x value.");
            return;
        }
        pre_Node.setNext(currentNode.getNext());
    }

    public void addAfterPosition(int pos, E x) {
        Node<E> currentNode = head;
        Node<E> newNode = new Node(x);
        int d = 0;
        while (currentNode != null && d < pos) {
            currentNode = currentNode.getNext();
            d++;
        }

        if (currentNode == null && d < pos) {
            System.out.println("Position is higher than size of linked list.");
            return;
        }
        Node<E> preNode = currentNode.getNext();
        newNode.setNext(newNode);
    }

    public Node<E> getObject(int index) {
        Node<E> p = head;
        while (index > 0)
            p = p.getNext();
        return p;
    }

}
