public class Linky {
    private Node first;
    private Node last;
    //inre klass (inner class)
    private static class Node {
        Person person;
        Node next;

        Node(Person person, Node next){
            this.next = next;
            this.person = person;
        }
        public String getName(){
            return this.person.getName();
        }
    }
    public void add(Person person){
        Node n = new Node(person,null);
        if(first == null) first= n;// om listan ät tom
        if(last != null)last.next = n;//gamla lasts next blir nya noden
        last=n;//nya noden blir last
    }

    public int size(){
        int index = 0;
        Node current = first;
        while (current != null){
            index++;
            current = current.next;
        }
        return index;
    }
@Override
    public String toString(){
        String ret = "Linky: [";
        Node current = first;
        while (current!= null){
            ret += " " + current.getName();
            current = current.next;
        }
        return ret + " ]";
    }
}
