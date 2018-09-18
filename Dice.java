import java.util.*;

class Dice{

	static int rand(){
		double rand = Math.random();
	if( rand < 1.0/6.0){
		return 0;
	}
	else if( rand< 2.0/6.0){
		return 1;
	}
	else if(rand < 3.0/6.0){
		return 2;
	}
	else if(rand <4.0/6.0){
		return 3;
	}
	else if(rand <5.0/6.0){
		return 4;
	}else{
		return 5;
	}
	
	}

	

	public static void main(String[] args) {
        // TODO code application logic here
        
       int counter;
       int [] frequency= {0,0,0,0,0,0};
       int random;

       for(counter=1; counter<=1000;counter++){
            random = Dice.rand();
            frequency[random]++;
        }
       int sumFreq=0;
       double sumPerc= 0;
       for (int i=0;i<6 ;i++ ) {
       	sumFreq += frequency[i];
       	double perc= (double)frequency[i]/10;
       	sumPerc+= perc;

       	System.out.printf("%-4d, %-5d, %-6.1f\n", (i+1), frequency[i], perc);
       }
       System.out.printf("%-4s, %-5d, %-6.1f\n","Total", sumFreq,sumPerc);




        
        
    }
}