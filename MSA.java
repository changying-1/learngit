package Test2;

public class MSA {

    public int sum,start,end,cur,start1,end1;

    public  void Calc(int a[], int n){
        sum=a[0]; start=0; end=0;cur=0;start1=0; end1=0;
        for (int i=0; i<n;i++){
            if(cur<0) {
                cur = a[i];
                start1 = i;
                end1 = i;
            }
            else{
                cur=cur+a[i];
                start1=start;
                end1=i;
            }
            if(cur>=sum){
                sum=cur;
                start=start1;
                end=end1;
            }
        }
    }

    public int getSum() {
        return sum;
    }

    public int getStart() {
        return start+1;
    }

    public int getEnd() {
        return end+1;
    }
}
