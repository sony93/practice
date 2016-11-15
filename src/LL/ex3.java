package LL;

/**
 * Created by sony on 16-11-10.
 */
public class ex3 {
    public static void main(String args[]){
        int A[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
                { 6, 8, 11, 15 } };
        System.out.println(find(A, 7));
    }


public static boolean find(int array[][] , int number){
    boolean flag = false;
    int rows = array.length;// hang
    int columns = array[0].length;// lie

    int f_row = 0;
    int f_columns = columns - 1;

    while (f_row < rows && f_columns >= 0){
        if(array[f_row][f_columns] == number){
            flag = true;
            break;
        }
        else if(array[f_row][f_columns] > number){
            f_columns--;
        }
        else {
            f_row++;
        }
    }
    return flag;

}


}