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
  * @param username sees if the username follows the criteria
  */

  public boolean validateUsername(String strusername) {
    // Check if the username is null or empty
    if (strusername == null || strusername.isEmpty()) {
        return false;
    }

    // Check if the length is greater than 7 characters
    if (strusername.length() <= 7) {
        return false;
    }
    // Check if the username consists of only letters or digits
    for (int i = 0; i < strusername.length(); i++) {
      char character = strusername.charAt(i);
      if (!Character.isLetterOrDigit(character)) {
          return false;
      }

    // Check if the username has at least one digit
    boolean hasDigit = false;
    for (int i = 0; i < strusername.length(); i++) {
        char cha = strusername.charAt(i);
        if (Character.isDigit(cha)) {
            hasDigit = true;
            break;
        }
    }

    return hasDigit;
  }

  public String createPassword(String firstName, String lastName, int studentNumber) {
    String lastNamePrefiex = lastName.substring(0, Math.min(4, lastName.length())).toLowerCase();

    char firstInitial = firstName.toUpperCase().charAt(0);

    String middleNumbers = studentNumber.substring(3, 6);

    return lastNamePrefix + firstInitial + middleNumbers;
  }
}



}