class Problem1 extends ConsoleProgram {

  /**
  * Takes first name, last name, student number, and new username. From the input 
  given, it displays a validation status if their username and if is ture or false  and
  their generated password. If their is any arguments are bland, the student 
  or the student number is not seven digets or longer there will be an error as well given.
  * @author: Sierra Rajabali
  */
  
  public void run() {
    String strUsername;
    String strFirstName;
    String strLastName;
    String strStudentNumber;
    boolean blnPassword;


    System.out.println("**** Student Account Registration ****");

    strFirstName = readLine(" Enter your first name: ");
    strLastName = readLine ("Enter your last name");
    strStudentNumber = readLine("Enter your student number: ");

    strUsername = readLine("Enter a new username");

    
    
  }
  /* 
  Takes the username and seees if it follows the criteria by outputting true or false
  * @param strusername sees if the username follows the criteria
  */

  public boolean validateUsername(String strusername) {
    int intNumberCount = 0;
    int intLetterCount = 0;
    int intOtherCount = 0;

    for(int i = 0; i < strusername.length(); i++){
      if(Character.isDigit(strusername.charAt(i))){
        intNumberCount++;
      }else if(Character.isLetter(strusername.charAt(i))){
        intLetterCount++;
      }else{
        intOtherCount++;
      }
    }

    if((intOtherCount == 0) && (intNumberCount > 1) && (strusername.length() > 7)){
      return true;
    }else{
      return false;
    }
  }

  /* 
   * It checkes if everything follows the criteria. After takes first name
   * last name, and student number then breaks it up
   * @param firstName takes the value inputted and sees the length and takes the first letter
   * @param lastName take the value of the the last name takes the 4 characters and prints it out
   * @param studentNumber takes 4 digetst and inputs it it
  */

  public String createPassword(String firstName, String lastName, int studentNumber) {
    String strName = "";
    try{
      if(firstName.length() == 0 || lastName.length() == 0 || Integer.toString(studentNumber).length() != 9){
        throw new IllegalArgumentException();
      }

      if(lastName.length() < 4){
        strName += lastName.substring(0).toLowerCase();
      }else{
        strName += lastName.substring(0,4).toLowerCase();
      }

      strName += firstName.substring(0,1).toUpperCase();
      strName += Integer.toString(studentNumber).substring(3,6);

      return strName;
    }catch(IllegalArgumentException e){
      return "";
    }
  }
}