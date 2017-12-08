package JZ_offer;

/**
 * Created by sony on 17-12-7.
 */
public class no3 {
    public static boolean FindInPartiallySortedMatrix(int[][] array, int target){
        if (array == null)
            return false;

        int hang = array.length;
        int lie = array[0].length;
        int i = 0;
        int j = lie - 1;
        while (i < hang && j >= 0){
            if(array[i][j] == target)
                return true;
            else if (array[i][j] > target)
                j--;
            else if(array[i][j] < target)
                i++;
        }
        return false;
    }
}
