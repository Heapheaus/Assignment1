package assignment3;

import javax.swing.JOptionPane;

public class a3 extends JOptionPane {
	//This is a personal reminder not to mix while loops and for loops
	//This is hard to follow.
	/**
	 *By Teddy 
	 *
	 *SET Variables
	 *LOOP check trys are less then try limit(user has not surpassed limit)
	 *PROMPT user for username
	 *CHECK username
	 *IF username =/= correct, try++, reprompt for username
	 *PROMPT user for password
	 *CHECK password
	 *IF password =/= correct, try++, reprompt for password
	 *PROMPT user to select account type from list
	 *CHECK selected account type = account type index
	 *IF selected account type = account type index, Display switch case message.
	 *ELSE reprompt user for account type
	 * 
	 */
	public static void main(String[] args) {
		String[] username = {"jacobf", "BobbySmith", "Mike"};
		String[] password = {"HelloWorld", "IHateClass", "NeedCoffee"};
		String[] accounttype = {"Admin", "Student", "Staff"};
		int Try = 0;
		int index = 0;
		int trylimit = 3;
		boolean correctuser = false;
		boolean correctpw = false;
		while (Try < trylimit){
			if (correctuser == false){
				String useruninput = JOptionPane.showInputDialog("Enter Username");
				for (index=0; index<3; index++){
					if (useruninput.equals(username[index])){
						correctuser = true;

						break;
					}

				}
			}
			else Try++;
			if (correctuser == true && correctpw==false){
				if(password[index].equals(JOptionPane.showInputDialog("Enter Password"))){
					correctpw = true;
					break;
				}
			}
			else Try++;
		}
		while(correctuser == true && correctpw==true){

			String[] choices = {"Admin" , "Student" , "Staff"};
			String input = (String) JOptionPane.showInputDialog(null, "Choose account type:","Account Type",JOptionPane.QUESTION_MESSAGE, null, choices , choices[1]);
			if (accounttype[index].equals(input)){	
				correctuser=false;   			
				switch(input){
				case "Admin":
					JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read files.");
					break;
				case "Student":
					JOptionPane.showMessageDialog(null, "Welcome Student! You may read only read files");
					break;
				case "Staff":
					JOptionPane.showMessageDialog(null, "Welcome Staff! You may add,delete,read and update files.");
					break;

				}

			}
		}
		if (Try >= trylimit) {
			JOptionPane.showMessageDialog(null,"You have reached the maximum log in attempts. Contact an administrator.");
		}
	}
}	
