package LC;

/**
 * Created by sony on 18-1-8.
 */
public class no168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            n--;
            sb.insert(0, (char)('A' +  n % 26));
            n /= 26;
        }
        return sb.toString();
    }
}
