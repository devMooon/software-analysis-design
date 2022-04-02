package ch10.practice4;

public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        String[] data2 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
            };
        SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
        sap.execute();
        
        System.out.println("bubble");
        sap.setData(data2);
        sap.setSorter(new BubbleSorter());
        
        sap.execute();
        
        /*String[] data2 = {
                "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
            };
            SortAndPrint sap2 = new SortAndPrint(data2, new BubbleSorter());
            sap2.execute();*/
    }
}
