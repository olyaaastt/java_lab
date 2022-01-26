public class zavd2 {
    public static void main(String[] args) {
        int [][] array;
        int max = 0;
        array = new int [10][10];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j]+ "\t");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if(i<j){

                    if(array[i][j]>max){
                        max = array[i][j];

                    }

                }

            }

        }
        System.out.print("\n" + "--------------------------------------");
        System.out.println("\n" + "max =  " + max);




    }
}
