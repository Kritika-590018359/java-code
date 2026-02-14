class A{
    int sum(int a ,int b){
        return a+b;
    }
    class B extends A{
        int sum(int c ,int b){
            return c+b;
            super.sum(2,3);
        }
    }
    
}
