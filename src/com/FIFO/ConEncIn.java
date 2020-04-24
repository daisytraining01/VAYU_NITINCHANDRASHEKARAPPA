package com.FIFO;



 class ConEncIn  {
   
   private String name;
   private String email;
   private char gender;   
 
   
  
 
  
  
   public String getName() {
      return name;
   }
 
   public char getGender() {
      return gender;
   }
 
   public String getEmail() {
      return email;
   }
 
   public void setEmail(String email) {
      this.email = email;
   }
 

   public String toString() {
      return name + " (" + gender + ") at " + email;
   }
   
   
}

