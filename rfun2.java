class rfun2{
    public static void fun(int a,int x) {
       if(a==x+1)
       return;
       else
       {
        System.out.println(a);
        a++;
        fun(a,x);
       }
    }
    public static void main(String[] args) {
        fun(1,20);
    }
}