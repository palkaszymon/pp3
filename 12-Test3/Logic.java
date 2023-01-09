public class Logic {
    boolean[] arr;
    Logic(boolean[] arr){
        this.arr = arr;
    }
    public int opposite(){
        int count = 0;
        for(int i=1;i<=arr.length-2;i++){
            if(arr[i]==true && arr[i-1]==false && arr[i+1]==false){
                count++;
            }else if(arr[i]==false && arr[i-1]==true && arr[i+1]==true){
                count++;
            }
        }
        return count;
    }
}
