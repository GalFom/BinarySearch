import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        System.out.println("Enter strings");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList();
        while (true) {
            String line = scanner.nextLine();
            if (line.equals(".")) {
                break;
            }
            lines.add(line);
        }
        System.out.println("Enter line to compare");
        String lineToCompare = scanner.nextLine(); // считали строку

        Collections.sort(lines, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        if(lines.size()==0){
            System.out.println("list is empty");
            return;
        }
        if(lines.size()==1){
            if(lineToCompare.equals(lines.get(0))) {
                нашли
            } else {
                не нашли
            }

        }
        int begin = 0;
        int end = lines.size() - 1;
        int idx = 0;
        boolean found = false;
        while (end != begin) {
            int middle = (end - begin) / 2;
            int compareResult = lines.get(middle).compareTo(lineToCompare);
            if (compareResult == 0) {
                idx = middle;
                found = true;
                break;
            }
            if (compareResult > 0) {
                end = middle;
            } else {
                begin = middle;
            }
        }
        if (found) {
            System.out.println("FOund at index " + idx);
        } else {
            System.out.println("Not found");
        }

//        String[] str = line.split(" ");
//
//
//        Comparator<String> stringLengthComparator = new StringLengthSort();
//        for (String s : str) {
//            System.out.println(s);
//        }
//        Arrays.sort(str, stringLengthComparator); // применяем сортировку
//        System.out.println("\nотсортировано\n");
//        for (String s : str) {
//            System.out.println(s);
//        }
//        Scanner elemSearch = new Scanner(System.in);
//        String elem = elemSearch.nextLine();
//        // System.out.println(elem);
//        if str.length / 2 == elem {
//            System.out.println(str.length / 2);
//        }
//        if str.length / 2 > elem {
//                if  str.length / 4 == elem{
//                    System.out.println(str.length / 4);
//                }
//                else{
//                }
//                }
//            }
//
//        }
/*

        for (int i : str.lengt) {
           System.out.println(str[i]);
        }
        str[i].compareTo(str[i+1]);
        */
    }
}
// как прочитать строку до enter через scanner
// код помещающий строки, сортировка строк и бинарнй поиск


// реализовать список строк, методы :add, get,