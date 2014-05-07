
public class OfficeTest {
	public static void main(String[] args) {
		String name=Input.getString("input the manager's name: ");
		Office office=new Office(name);
		int option;
		boolean found;
		do{
			System.out.println("0: quit");
			System.out.println("1: add subordinate to current");
			System.out.println("2: find worker");
			System.out.println("3: display current");
			System.out.println("4: display office");
			option=Input.getInteger("input option: ");
			switch(option){
				case 1:	name=Input.getString("input the subordinate's name: ");
						office.addSubordinate(name);
						break;
				case 2:	name=Input.getString("input the worker's name: ");
						found=office.findWorker(name);
						if(!found)
							System.out.println("not found");
						break;
				case 3:	office.displayCurrent();
						break;
				case 4:	office.displayOffice();
						break;
			}
		}while(option!=0);
	}

}
