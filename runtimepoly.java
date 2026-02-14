class A {
    int sum(int a, int b) {
        return a + b;
    }
    
}
class B extends A {
    int sum(int a, int b) {
        return a + b;
    }
    this.sum(4,5);
    super.sum(4,5);

}
  