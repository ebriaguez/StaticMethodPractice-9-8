public class StaticMethodPractice {

        //Q1
        public static int getLastIndex(String[] names){
            return names.length - 1;
        }

//    public static void main(String[] args){
//        String[] names = {"Emily", "Kai", "Kamily"};
//        System.out.println(getLastIndex(names));
//    }

        //Q2
        public static int getSecondToLastIndex(String[] names){
            return names.length -2;
        }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//        System.out.println(getSecondToLastIndex(names));
//    }

        //Q3
        public static String getFirstElement(String[] names){
            return null;
        }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//        System.out.println(names[0]);
//    }

        //Q4
        public static String getLastElement(String[] names){
            return null;
        }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//        System.out.println(names[2]);
//    }

        //Q5
        public static String getSecondToLastElement(String[] names){
            return null;
        }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//        System.out.println(names[1]);
//    }

        //Q6
        public static int getSum(int[] numList){
            int sum = 0;
            for (int x = 0; x < numList.length; x++){
                sum += numList[x];
            }
            return sum;
        }

//    public static void main(String[] args) {
//        int[] numList = {1, 2, 3};
//        System.out.println(getSum(numList));
//    }

        //Problem I did separately to get answer above
//    public static void main(String[] args) {
//        int[] numList = {1, 2, 3};
//        int sum = 0;
//        for (int x = 0; x < numList.length; x++){
//            sum += x;
//        }
//        System.out.println(sum);
//    }

        //Q7
        public static int getAverage(int[] numList){
            int sum = 0;
            for (int x = 0; x < numList.length; x++){
                sum += numList[x];
            }
            return sum / numList.length; //you want to return the sum divided by the total number of elements in the array
        }

//    public static void main(String[] args) {
//        int[] numList = {1, 2, 3};
//        System.out.println(getAverage(numList));
//    }

        //Q8
        public static String extractAllOddNumbers(int[] numbers){
            return null;
        }

//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("Odd Numbers: ");
//        for (int x = 0; x < numbers.length; x++){
//            if (numbers[x] % 2 != 0){ //look into this line tomorrow in class
//                System.out.println(numbers[x]);
//            }
//        }
//    }

        //Q9
        public static String extractAllEvenNumbers(int[] numbers){
            return null;
        }

//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println("Even Numbers:");
//        for (int x = 0; x < numbers.length; x++) {
//            if (numbers[x] % 2 == 0) {
//                System.out.println(numbers[x]);
//            }
//        }
//    }


        //Q10
//    public static boolean contains(String[] names, String element){
//        return false;
//    }
//
//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//        String element = "Element";
//
//        System.out.println(contains());
//        for (int x = 0; x < names.length; x++){
//            if (names[x] != element){
//                System.out.println(names[x]);
//            }
//        }
//
//    }


        public static boolean contains(String[] names, String element){
            for (int x = 0; x < names.length; x++){
                if (names[x] == element){
                    return true;
                }
            }
            return true;
        }

//    public static void main(String[] args) {
//        String[] names = {"Emily", "Kai", "Kamily"};
//
//
//    }
}
