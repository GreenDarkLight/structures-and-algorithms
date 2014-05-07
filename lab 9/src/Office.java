public class Office {
	
	private class WorkerNode{
		private String name;
		private WorkerNode boss;
		private WorkerNode peer;
		private WorkerNode subordinate;
	}
	
	private WorkerNode manager;
	private WorkerNode current;
	
	public Office(String managerName){
		this.manager=new WorkerNode();
		this.manager.name=managerName;
		this.current=this.manager;
	}
	
	public void addSubordinate(String name){
		WorkerNode worker=new WorkerNode();
		worker.name=name;
		worker.boss=this.current;
		if(this.current.subordinate==null)
			this.current.subordinate=worker;
		else{
			WorkerNode next=this.current.subordinate;
			while(next.peer!=null)
				next=next.peer;
			next.peer=worker;
		}
	}
	public boolean findWorker(String name){
		boolean found=false;
		boolean searching;
		WorkerNode worker;
		WorkerNode subordinate;
		if(name.equalsIgnoreCase(this.manager.name)){
			found=true;
			worker=this.manager;
		}
		else{
			worker=this.checkSubordinates(name,this.manager);
			if(worker!=null)
				found=true;
			else{
				subordinate=this.manager.subordinate;
				searching=subordinate!=null;
				while(searching){
					worker=this.checkSubordinates(name,subordinate);
					if(worker!=null){
						searching=false;
						found=true;
					}
					else{
						subordinate=subordinate.peer;
						if(subordinate==null)
							searching=false;
					}	
				}
			}
		}
		if(found){
			this.current=worker;
			this.displayCurrent();
		}
		return found;
	}
		
	private WorkerNode checkSubordinates(String name,WorkerNode worker){
		WorkerNode subordinate=worker.subordinate;
		boolean searching=subordinate!=null;
		while(searching){
			if(name.equalsIgnoreCase(subordinate.name))
				searching=false;
			else{
				subordinate=subordinate.peer;
				if(subordinate==null)
					searching=false;
			}
		}
		return subordinate;
	}
		
	public void displayCurrent(){
		System.out.print(this.current.name);
		if(this.current.boss!=null)
			System.out.println(" reports to: "+this.current.boss.name);
		else
			System.out.println(" is the manager");
		this.displaySubordinates(this.current);
	}
	
	public void displayOffice(){
		System.out.println(this.manager.name);
		WorkerNode worker=this.manager.subordinate;
		while(worker!=null){
			System.out.println("  "+worker.name);
			this.displaySubordinates(worker);
			worker=worker.peer;
		}
	}
		
	private void displaySubordinates(WorkerNode worker){
		worker=worker.subordinate;
		while(worker!=null){
			System.out.println("    "+worker.name);
			worker=worker.peer;
		}
	}
}
