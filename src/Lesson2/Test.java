package Lesson2;

public class Test {

    public static void main(String[] args) {
        MyList<Integer> s = new MyLinkedList<>();

        s.add(4);
        s.add(64);
        s.add(null);
        s.add(41);
        s.add(34);

        System.out.println(s);
        System.out.println(s.get(4));
        s.remove(0);
        System.out.println(s);
        s.remove(Integer.valueOf(64));
        System.out.println(s);
        System.out.println(s.size());
    }
}
