class rfun4{  
    //----fibonic series in recursion----
     static int count=2;                       // x y s
    public static void fun(int x,int y,int z) {//1 1 2
        int s=x+y;
        if(count==z)
        return;
        System.out.println(s);
         x=y;
         y=s;
        count++;
        fun(x,y,z);
    }
    public static void main(String[] args) {
        int a=4,b=1,c=10;
        System.out.println(a);
        System.out.println(b);
        fun(a,b,c);
    }
}