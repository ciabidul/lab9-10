import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }
/*
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

//        /** add tests to check for this unit test *

        System.out.println("Positive data: ");
        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(arr[i]);
        }

        System.out.println("Sorted Positive data: ");

        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(Sortedarr[i]);
        }
    }



    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -7;
        Sortedarr[2] = -8;
        Sortedarr[3] = -9;
        Sortedarr[4] = -10;
//        /** Test data contains negative values only

        System.out.println("Negative data: ");
        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(arr[i]);
        }

        System.out.println("Sorted Negative data: ");

        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(Sortedarr[i]);
        }
    }
 */
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 0;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 0;
//        /** Test data contains with both positive, negative and zeros

        System.out.println("mixed data: ");
        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(arr[i]);
        }

        System.out.println("Sorted mixed data: ");

        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(Sortedarr[i]);
        }
    }

    public void testDuplicates(){

//        /** Test data contains duplicates
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 7;
        arr[3] = 0;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 8;
        Sortedarr[4] = 0;
//        /** Test data contains with both positive, negative and zeros *

        System.out.println("duplicate data: ");
        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(arr[i]);
        }

        System.out.println("Sorted duplicate data: ");

        for (int i = 0; i < arr.length; ++i) {
        	System.out.println(Sortedarr[i]);
        }
    }


}
