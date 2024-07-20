public class pattern {
    public static void main(String[] args){
        int row,column,numberofRows=8;
        for(row=0;row<numberofRows;row++){
            for(column=0;column<=row;column++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
    
}
