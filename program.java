public class program {
    public static void main(String[]args){
       /*array program*/
       /* int[] marks={89,45,79,80};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        /* DISPLAYING A ARRAY([for loop]*/ 
        /*
    for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        for(int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }
        
        /* MULTIDIMENTIONAL ARRAY*/ 

        int[] marks;//A 1- array
        int[][] flats;//A 2-D ARRAY
        flats=new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        System.out.println("PRINTING A 2-D ARRAY USING FOR LOOP");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
            System.out.print(flats[i][j]);
            System.out.print("");
            }
            System.out.print("\n");
        }
        


    }
    
}
