class reversestring {

    public static void main(String[] args) {
        reversestring();
    }
  
    public static void reversestring() {
      
      String original_string = "ABC";
      String reversedString = "";
      
      for(int i = original_string.length()-1; i>=0; i--){
        reversedString = reversedString + original_string.charAt(i);
      }
      
      System.out.print("The reversed string of the '"+original_string+"' is: " );
      System.out.println(reversedString);
  
    }
  }