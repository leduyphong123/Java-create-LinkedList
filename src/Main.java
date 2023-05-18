public class Main{
    public static void main(String[] args){
        MyLinkedList myLinkedList=new MyLinkedList<>("1");
        myLinkedList.add(1,"2");
        myLinkedList.add(1,"3");
        myLinkedList.addLast("4");
        myLinkedList.addLast("4");
        myLinkedList.clear();
        System.out.println(myLinkedList.getLast());

        MyLinkedList a=myLinkedList.clone();
        System.out.println(a);
    }
}