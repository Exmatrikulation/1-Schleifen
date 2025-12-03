
public class Schleifen {

	public static void main(String[] args) {
		// 1. die schleife
		int a = 7;
		while (a>0) {
			System.out.println(a + " ");
			a/=2;
		}
		System.out.println();
		
		// 2. Schleife 
		  int b = 7; 
		  do { 
		   b /= 2; 
		   System.out.print(b + " "); 
		    
		  } while (b > 0); 
		  System.out.println();
		  
		  // 3. Schleife 
		  for (int c = -3; c < 5; c += 2) { 
		   System.out.print(2 * c + 4 + " ");  
		  } 
		  System.out.println();
		  
		  // 4. Schleife 
		  for (int d = 3; 2 * d > -3; d--) { 
		   System.out.print(d + " "); 
		  } 
		  System.out.println(); 
		  
		  // 5. Schleife 
		  int e = 3; 
		  for (int i1 = 1; i1 <= e; i1++) { 
		   for (int i2 = 1; i2 <= 2 * e; i2++) { 
		    System.out.print("*"); 
		   } 
		   System.out.println(); 
		  } 
		  
		  // 6. Schleife 
		  int f = 5; 
		  for (int i1 = 1; i1 <= f; i1++) { 
		   for (int i2 = 1; i2 <= i1; i2++) { 
		    System.out.print("++"); 
		   } 
		   System.out.println(); 
		  }
		  
		  // Aufgabe 1
		  int z = 0;
		  	do {
		  		++z;
		  		System.out.print(z + " ");
		  		
		  	} while (z < 10);
		  	System.out.println();
		  	
		  // Aufgabe 2
		  int y = 12;
		  do {
			 System.out.println(y + "");
			 y += 3;
		  } while (y<40);
		  
		  
		  
		  int x = 0;
		  
		  do {
			  if (x > 10 && x % 3 == 0) {
				  System.out.println(x + "");
				  x += 3;
			  } else {
				  x += 3;
				  }
		  } while (x < 40);
		 
		// Aufgabe 3
		  // a)
		  int r = -5;
		  do {
			  System.out.print(r + " ");
			  r += 3;
		  } while (r < 20);
		  System.out.println();
		  
		  // b)
		  r = 1;
		  do {
			  System.out.print(r + " ");
			  r *=2;
		  } while (r < 5000);
		  
		  System.out.println();
		  
		  // c)
		  int n = 2;
		  int m = 1;
		  
		  do {
			  int ergebnis = n + m;
			  System.out.print(ergebnis + " ");
			  m *=2;
		  } while (m < 5000);
		  System.out.println();
		  
		  // d)
		  int o = 1;
		  int p = 1;
		  
		  do {
			  System.out.print(o + " ");
			  o += p;
			  ++p;
		  } while (o < 100);
		  System.out.println();
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
