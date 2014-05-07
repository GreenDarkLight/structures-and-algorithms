public class FamilyTreeTest {
public static void main (String [] args){
	String name=Input.getString("Input ancestor name: ");
	FamilyTree familyTree=new FamilyTree(name);
	int option;
	do{
		System.out.println("1: Add child");
		System.out.println("2: Add partner");
		System.out.println("3: Display Family Tree");
		System.out.println("4: Display Family Member");
		System.out.println("0: Quit");
		option=Input.getInteger("Input Option: ");
		switch(option){
		case 1: 
			familyTree.addChild();			
			break;
		case 2:		
			familyTree.addPartner();			
			break;
		case 3: 
			familyTree.displayFamilyTree();			
			break;
		case 4: 
			familyTree.displayFamilyMember();			
			break;
		}
	}while(option!=0);
}
}
