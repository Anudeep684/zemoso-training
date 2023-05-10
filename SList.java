public class SList<T> {
    private Link<T> head = new Link<T>(null);
    
    public SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }
    
    public String toString() {
        if (head.next == null) {
            return "[]";
        }
        SListIterator<T> iterator = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    private static class Link<T> {
        T data;
        Link<T> next;
        Link(T data) {
            this.data = data;
        }
    }
    
    public static class SListIterator<T> {
        private Link<T> current;
        SListIterator(Link<T> head) {
            current = head;
        }
        
        public boolean hasNext() {
            return current.next != null;
        }
        
        public T next() {
            current = current.next;
            return current.data;
        }
        
        public void insert(T data) {
            current.next = new Link<T>(data);
            current = current.next;
        }
        
        public void remove() {
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }
    
    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> iterator = list.iterator();
        iterator.insert(1);
        iterator.insert(2);
        iterator.insert(3);
        System.out.println(list); // prints [1, 2, 3]
        iterator = list.iterator();
        iterator.next();
        iterator.next();
        iterator.insert(4);
        System.out.println(list); // prints [1, 2, 4, 3]
        iterator.next();
        iterator.remove();
        System.out.println(list); // prints [1, 2, 4]
    }
}
