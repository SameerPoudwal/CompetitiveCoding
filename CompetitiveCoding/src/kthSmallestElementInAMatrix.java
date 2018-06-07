import java.util.PriorityQueue;

public class kthSmallestElementInAMatrix{
	public int kthSmallest(int[][] matrix, int k) {
		int n = matrix.length;
		PriorityQueue<Obj> pqueue = new PriorityQueue<>();
		
		for(int j=0; j<n; j++) {
			pqueue.offer(new Obj(0, j, matrix[0][j]));
		}
		Obj o;
		
		for(int i=0; i<k-1; i++) {
			o = pqueue.poll();
			
			if(o.x == n-1) {
				continue;
			}
			
			pqueue.offer(new Obj(o.x+1, o.y, matrix[o.x+1][o.y]));
		}
		
		o = pqueue.poll();
		return o.val;
	}
	    
}

class Obj implements Comparable<Obj>{
	int x;
	int y;
	int val;
	
	public Obj(int x, int y, int val) {
		this.x = x;
		this.y = y;
		this.val = val;
	}
	
	@Override
	public int compareTo(Obj that) {
		// TODO Auto-generated method stub
		return this.val - that.val;
	}
	
}
