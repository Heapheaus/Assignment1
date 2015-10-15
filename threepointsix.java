import javax.swing.JOptionPane;


public class monthChoice extends JOptionPane {
	public enum Monthtype {January, Febuary, March, April, May, June, July, August, September, October, November, December}
	
	public static void main(String[] args) {
		Monthtype[] choices = {Monthtype.January, Monthtype.Febuary, Monthtype.March, Monthtype.April, Monthtype.May, Monthtype.June, 
				Monthtype.July, Monthtype.August, Monthtype.September, Monthtype.October, Monthtype.November, Monthtype.December};
		Monthtype input = (Monthtype) JOptionPane.showInputDialog(null,"Select your account type.", "Account Type", 
				JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]); 
		while (input != null) { 
			String message;
			switch(input)
			{
				case December:
				case January:
				case Febuary:
					message = "Do you want to build a snowman?";
					break;
				case March:
				case April:
				case May:
					message = "Happy Spring days!";
					break;
				case June:
				case July:
				case August:
					message = "It’s a summer time.";
					break;
				default:
					message = "Welcome to the foliage season!";
				
			}
			JOptionPane.showMessageDialog(null, message);
			
		

            input = (Monthtype) JOptionPane.showInputDialog(null,"Select a month.", "Month",JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
		}
		
	}

}
