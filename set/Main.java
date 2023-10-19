public class Main {
    public static class Set {
        private String[] array = new String[10];
        private int length = 0;

        public boolean add(String value) {
            if (isContains(value)) {
                return false;
            }

            ensureCapacity();

            array[length] = value;
            length++;

            return true;
        }

        public boolean isContains(String value) {
            for (String item : array) {
                if (value.equals(item)) {
                    return true;
                }
            }
            return false;
        }

        public boolean remove(String value) {
            for (int i = 0; i < length; i++) {
                if (value.equals(array[i])) {
                    for (int j = i; j < length; j++) {
                        array[j] = array[j + 1];
                    }

                    length -= 1;

                    return true;
                }
            }
            return false;
        }

        public int length() {
            return length;
        }

        public void print() {
            System.out.print("[");
            for (int i = 0; i < length; i++) {
                System.out.print(array[i]);
                if (i == length - 1) {
                    System.out.println("]");
                } else {
                    System.out.print(", ");
                }
            }
        }

        public boolean resize(int size) {
            String[] temp = new String[size + 1];

            for (int i = 0; i < length; i++) {
                temp[i] = array[i];
            }

            array = new String[size + 1];
            array = temp;

            return true;
        }

        public void ensureCapacity() {
            if (length >= array.length) {
                resize(length * 2);
            }
        }
    }

    public static void main(String[] args) {
        Set set = new Set();

        System.out.println(set.length());
        System.out.println(set.add("Satu"));
        System.out.println(set.length());
        set.print();

        System.out.println(set.add("Dua"));
        System.out.println(set.length());
        set.print();

        System.out.println(set.remove("Satu"));
        System.out.println(set.length());
        set.print();

        System.out.println();
    }
}
