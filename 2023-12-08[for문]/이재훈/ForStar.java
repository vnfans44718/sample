package example;

public class ForStar{
public static void main(String[] args) {
       /*
★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
   ★★★★★
   ★★★★★
   ★★★★★
   ★★★★★
   ★★★★★
*/
System.out.println("1.---------------------------------------");
for(int a=0; a<5; a++) {
	for(int b=0; b<5; b++) {
		System.out.printf("%s[%d,%d]","★",a,b);	
}
System.out.println("\n");
}		
for(int c=0; c<5; c++) {
	for (int d=0; d<5; d++)
	System.out.printf("%s","★");
System.out.println("  ");
}
System.out.println("  ");


System.out.println("2.--------------------------------------");
/*
☆★★★★
★☆★★★
★★☆★★
★★★☆★
★★★★☆
*/
for(int e=0; e<5; e++) {
	for (int f=0; f<5; f++)
		if(e==f) {
			System.out.printf("★");
}else {
		System.out.printf("☆");
	}
System.out.println(" ");
			
}
System.out.println("\n");	


System.out.println("3.--------------------------------------");
/*
★
★★
★★★
★★★★
★★★★★
*/
 for (int i = 0; i < 5; i++) {
     
       for (int j = 0; j <= i; j++) {
 
           System.out.print("★");        
   }
       System.out.println("");        
   }
 
System.out.println("4.---------------------------------------");
/*
★★★★★
★★★★
★★★
★★
★
*/
for (int i = 5; i > 0; i--) {
    
        for (int j = 0; j < i; j++) {
            System.out.print("★");
        }
        System.out.println();        
    }

System.out.println("5.--------------------------------------");
/*
★★★★★
☆★★★★
☆☆★★★
☆☆☆★★
☆☆☆☆★
 */

for (int g = 0; g < 5; g++) {	
	for (int h = 0; h < 5; h++) {
	 if (g <= h) {
		System.out.printf("★");
	} else {
		System.out.printf("☆");
	}
   }System.out.println(" ");
  }
 }
}