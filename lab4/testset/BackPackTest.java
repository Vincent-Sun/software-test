import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
public class testBackPack {
@Test
	public void testBackPack(){
		int m = 34;
		int n = 10;
		int w[] = {2, 8, 4, 4, 8, 7, 8, 5, 16, 16};
		int p[] = {15, 25, 9, 9, 15, 12, 12, 6, 14, 9};
		int c[][] = BackPack.BackPack_Solution(m, n, w, p);
		assertEquals(85, c[n][m]);
	}
	@Test
    public void testBackPack2(){
		BackPack bac = new BackPack();
        int arr1[] = new int[10];    
        int arr2[] = new int[10];
        int arr3[] = new int[10];
        int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = bac.BackPack_Solution(m, n, w, p);
        for (int i = 1; i <=m; i++) {
            arr1[i-1]=c[1][i];
        }
        for (int i = 1; i <=m; i++) {
            arr2[i-1]=c[2][i];
        }
        for (int i = 1; i <=m; i++) {
            arr3[i-1]=c[3][i];
        }
        assertEquals("[0, 0, 4, 4, 4, 4, 4, 4, 4, 4]", Arrays.toString(arr1));
        assertEquals("[0, 0, 4, 5, 5, 5, 9, 9, 9, 9]", Arrays.toString(arr2));
        assertEquals("[0, 0, 4, 5, 6, 6, 9, 10, 11, 11]", Arrays.toString(arr3));
    }
}
