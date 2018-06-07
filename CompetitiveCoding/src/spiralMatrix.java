import java.awt.List;
import java.util.ArrayList;

public class spiralMatrix {
	public ArrayList<Integer> spiralOrder(int[][] matrix){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if(matrix == null || matrix.length == 0) {
			return ans;
		}
		
		int top = 0;
		int bottom = matrix.length-1;
		int left = 0;
		int right = matrix[0].length-1;
		
		while(true) {
			for(int i=left; i<=right; i++) {
				ans.add(matrix[top][i]);
			}
			top++;
			if(top > bottom) {
				break;
			}
			
			for(int j=top; j<=bottom; j++) {
				ans.add(matrix[j][right]);
			}
			right--;
			if(left > right) {
				break;
			}
			
			for(int k=right; k>=left; k--) {
				ans.add(matrix[bottom][k]);
			}
			bottom--;
			if(top > bottom) {
				break;
			}
			
			for(int l=bottom; l>=top; l--) {
				ans.add(matrix[l][left]);
			}
			left++;
			if(left > right) {
				break;
			}
		}
		return ans;
	}
}
