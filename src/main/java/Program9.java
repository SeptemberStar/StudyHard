//完数：一个数等于它的因子之和   6=1+2+3
//输出1000以内的所有完数
public class Program9{
    public static void main(String[] args) {
        for(int i=1;i<1000;i++){
            int n=0;                              //将n清零  注意此条语句位置
            for(int j=1;j<=i/2;j++){
              if(i%j==0){
                  n=n+j;
              }
            }
        if(n==i){
            System.out.println(i);
        }
        }
    }
}