
package Local;

public class LifeCycleAnnotations {
	
	
	public int square(int a ) { 
		return(a * a); 
		
	}
	public int cube(int b) { 
		return(b*b*b); 
	}
	
	public int positive(int x, int y) { 
		if(x>0) { 
			return x; 
			
		}
		else { 
			return y; 
			
		}
		
	}

}