public class FamilyTreeTest {
public static void main (String [] args){
	String name=Input.getString("Input ancestor name: ");
	FamilyTree familyTree=new FamilyTree(name);
	int option;
	do{
		System.out.println("1: Add child to current");
		System.out.println("2: Input Partner");
		System.out.println("3: Display Family Tree");
		System.out.println("0: Quit");
		option=Input.getInteger("Input Option: ");
		switch(option){
		case 1: 
			name=Input.getString("Input Childs Name: ");
			familyTree.addchild(name);			
			break;
		case 2:		
			name=Input.getString("Input Partners Name: ");
			//familyTree.addPartner(name);			
			break;
		case 3: 
			familyTree.displayFamilyTree();			
			break;
		}
	}while(option!=0);
}
}
