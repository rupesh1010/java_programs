class cmdline {
  public static void main(String[] args) {
    int count;
    String str;
    count=args.length;
    System.out.println("No. of arguments:" +count);

    // loop through all arguments
    int i=0;
    while(i<count){
      str=args[i];
	    i=i+1;
      System.out.println(i +" is "+str);
    }
  }
}
