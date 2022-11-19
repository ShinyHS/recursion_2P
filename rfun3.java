class rfun3{
    //factorial number
    public static int fun(int x) {
        int s=0;
        if(x==1)
        return 1;
        s=x*fun(x-1);
        return s;
    }
    public static void main(String[] args) {
        int s=fun(5);
        System.out.println(s);
    }
}