public class apnali{
    public static int linearsearch(int number[], int key){
        for(int i=0; i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
                
        }
        return -1;
        }
    
    public static void main(String[] args){
        int number[]={21,23,45,67,89,23,4,5,78};
        int key=21;
       int index =linearsearch(number, key);
       if(index==-1){
        System.out.println("element not found");
       }
       else{
        System.out.println("element found at index:"+index);
       }

    }
}