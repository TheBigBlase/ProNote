package src;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Component {
	public Groupe(String nom) {
		this.nom = nom;
	}
	private String nom;

	public ArrayList<Component> getChildren() {
		return children;
	}

	protected ArrayList<Component> children = new ArrayList<>();

	public void addChild(Component component) {
		this.children.add(component) ;
	}

	@Override
	public List<Eleve> getStudents() {
		ArrayList<Eleve> res = new ArrayList<>();
		for (Component child: this.children) {
			res.addAll(child.getStudents());
		}
		return res;
	}
}