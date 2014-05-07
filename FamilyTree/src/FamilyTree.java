public class FamilyTree {

	int identifier;

	public class FamilyTreeNode {
		String name;
		FamilyTreeNode partner;
		FamilyTreeNode sibling;
		FamilyTreeNode child;
		int id;
	}

	FamilyTreeNode ancestor;

	public int getIdentifier() {		
		int retval = identifier;
		identifier++;
		return retval;
	}

	public FamilyTree(String name) {
		ancestor = new FamilyTreeNode();
		ancestor.name = name;
		ancestor.id = getIdentifier();

	}

	private FamilyTreeNode getNode(int identifier) {

		FamilyTreeNode current = ancestor;

		while (current != null) {

			if (current.id == identifier) {
				return current;
			}
			if (current.partner != null) {
				if (current.partner.id == identifier) {
					return (current.partner);
				}
			}
			if (current.sibling != null) {
				if (current.sibling.id == identifier) {
					return (current.sibling);
				}
			}
			if (current.child != null) {
				if (current.child.id == identifier) {
					return (current.child);
				}
			}
		}
		System.out.println("No Matches");
		return null;

	}

	public void addPartner() {

		displayFamilyTree();
		Integer option = Input
				.getInteger("Which person would you like to add a partner to");

		if (option != null) {
			if (getNode(option).partner == null) {
				String name = Input.getString("Inpur Partner Name");
				getNode(option).partner = new FamilyTreeNode();
				getNode(option).partner.id = getIdentifier();
				getNode(option).partner.name = name;
				getNode(option).partner.partner = getNode(option);
			} else {
				System.out.println("Error partner existing");
			}
		}
	}

	public void _addPartner(String name) {
		FamilyTreeNode partner = new FamilyTreeNode();
		partner.name = name;
		ancestor.partner = partner;
		partner.partner = ancestor;
		partner.id = getIdentifier();
	}

	public void addchild(String name) {
		FamilyTreeNode current = ancestor;
		FamilyTreeNode newChild = new FamilyTreeNode();
		newChild.name = name;
		FamilyTreeNode unique = ancestor;
		boolean check = true;
		while (unique != null) {
			if (unique.name.equalsIgnoreCase(name)) {
				System.out.println("duplicate family member");
				check = false;
				unique = null;
			} else {
				if (unique.partner != null) {
					if (unique.partner.name.equalsIgnoreCase(name)) {
						System.out.println("duplicate family member");
						check = false;
						unique = null;
					}
				}
				if (unique.child != null) {
					unique = unique.child;
				} else if (unique.sibling != null) {
					unique = unique.sibling;
				} else {
					unique = null;
				}
			}
		}
		if (check) {
			if (current.child == null) {
				current.child = newChild;
				current.child.id = getIdentifier();

			} else {
				FamilyTreeNode next = current.child;
				while (next.sibling != null) {
					next = next.sibling;
				}
				next.sibling = newChild;
				next.sibling.id = getIdentifier();
			}
		}
	}

	public void displayCurrent() {
		FamilyTreeNode current = ancestor;
		System.out.println(current.name);
		if (current.partner != null)
			System.out.println(" " + current.partner.name);
		else
			System.out.print(" is the parent");
	}

	public void displayFamilyTree() {
		System.out.print(this.ancestor.name);
		System.out.print(" is married to ");
		System.out.println(this.ancestor.partner.name);

		FamilyTreeNode child = this.ancestor.child;
		while (child != null) {
			System.out.println("\t" + child.name);
			child = child.sibling;
		}
	}
}
