class Main {
  public static void main(String[] args) {
    for(int a=4; a>=0;a--){
      System.out.println("");

      for(int c = 4; c>a; c--){
        System.out.print(" ");
      }
      
      
      for(int b=0; b<=a; b++){
        
        System.out.print("*");
      }
    }
  }
}
