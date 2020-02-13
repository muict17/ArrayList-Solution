public class Demo {
    public static void main(String[] args){
        MyArrayList<String> list = new MyArrayList<>();

        System.out.println("Add A, B, C, D");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.printData();
        System.out.println("\n");
        System.out.println("Remove B");
        list.remove(1);
        list.printData();

        System.out.println("\n");
        System.out.println("Get A");
        System.out.println("Result: "+list.get(0));

        System.out.println("\n");
        System.out.println("Get C");
        System.out.println("Result: "+list.get(1));

        System.out.println("\n");
        System.out.println("Final Result");
        list.printData();
        System.out.println("MyArray Size: " + list.size());
    }
}
