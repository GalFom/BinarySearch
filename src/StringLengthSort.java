import java.util.Comparator;

class StringLengthSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            for (int i = 0; i < o1.length() && i < o2.length(); i++)
                return 1;
        } else {
            if (o1.length() < o2.length()) {
                for (int i = 0; i < o1.length() && i < o2.length(); i++)
                    return -1;
            } else {
                return 0;
            }
        } return 0;
    }
}
            /*if (o1.charAt(i) > o2.charAt(i)) {
                return 1;
            } else {
                if (o1.charAt(i) < o2.charAt(i)) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
     return 0;}

    public int compare(String a1, String a2) {
        if(o1.length() > o2.length()){
            return 1;
        }else{
            if(o1.length() < o2.length()){
                return -1;
            }else{
                return 0;
            }
        }
    }

}

*/
