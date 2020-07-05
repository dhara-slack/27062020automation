package array;

public class Array1 {

	public static void main(String[] args) {
		
		String[] std= new String[10];
		std[0]="dhara";
		std[1]="bhavya";
		std[2]="jugal";
		std[3]="sonam";
		std[4]="peehu";
		std[5]="prathya";
		std[6]="priya";
		std[7]="nisha";
		std[8]="neha";
		std[9]="peehaan";
		
		System.out.println(std.length);
		
        for(int i=0;i<std.length;i++)
        //for(int i=0;i<10;i++)
        {
        	System.out.println(std[i]);
        }

	}

}
