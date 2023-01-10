package src;

import java.util.ArrayList;
import java.util.List;

public class Component {
	public ArrayList<Component> getChildren() {
		return children;
	}

	private ArrayList<Component> children = new ArrayList<>();


	public List<Eleve> getStudents() {
		ArrayList<Eleve> eleves = new ArrayList<>();

		if(this.children.size() == 0){
			ArrayList<Eleve> el = new ArrayList<>();
			el.add((Eleve) this);
			return el;
		}

		for( Component c : this.children ){
			eleves.addAll(c.getStudents());
		}
		return eleves;
	}

	public void addChild(Component component) {
		this.children.add(component) ;
	}
}