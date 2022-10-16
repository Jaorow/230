import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;

abstract class Person {
	protected String name;
	protected Person parent = null;
	public Person(String name) { this.name = name; }
	public Person getParent() { return parent; }
	public void setParent(Person parent) {this.parent = parent;}
	public String toString() { return name; }
	public Person[] getPath() {return getPathToRoot(this, 0);}
	protected Person[] getPathToRoot(Person aNode, int depth) {
		Person[] retNodes;
		if (aNode == null) {
			 if(depth == 0) return null;
			 else retNodes = new Person[depth];
		} else {
			depth++;
			retNodes = getPathToRoot(aNode.getParent(), depth);
			retNodes[retNodes.length - depth] = aNode;
		 }
		 return retNodes;
	}
}
class Member extends Person {
	public Member(String name){super(name);}
}
class TeamLeader extends Person {
	private ArrayList<Person> list = new ArrayList<Person>();
	public TeamLeader(String name){super(name);}
	public void add(Person p){
		p.setParent(this);
		list.add(p);
	}
	public void remove(Person p){
		p.setParent(null);
		list.remove(p);
	}
	public Person get(int index) { return list.get(index); }
	public int getSize() { return list.size(); }
	public int indexOf(Person p) { return list.indexOf(p); }
}
class PersonTreeModel implements TreeModel{
	private TeamLeader root;
	private ArrayList<TreeModelListener> treeModelListeners = new ArrayList<TreeModelListener>();

	public PersonTreeModel(TeamLeader root){
		root = new TeamLeader(root.name);
	}

	public Object getRoot() {
		return root;
	}
	
	public void setRoot(TeamLeader r){
		this.root = r;
	}

	public Object getChild(Object parent, int index) {
		try {
			DefaultTreeModel p = (DefaultTreeModel) parent;
			return p.getChild(parent, index);
		} catch (Exception e) {
			return null;
		}
	}

	public int getChildCount(Object parent) {
		try {
			DefaultTreeModel p = (DefaultTreeModel) parent;
			return p.getChildCount(parent);
		} catch (Exception e) {
			return 0;
		}
	}
	
		public int getIndexOfChild(Object parent, Object child) {
			try {
				DefaultTreeModel p = (DefaultTreeModel) parent;
				return p.getIndexOfChild(parent, child);
			} catch (Exception e) {
				return -1;
			}
		}
	

	public boolean isLeaf(Object node) {
		try {
			DefaultTreeModel p = (DefaultTreeModel) node;
			return p.isLeaf(node);
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}
	
}
class TeamLeaderTreeDemo extends JFrame {
	JButton  addButton, removeButton;
	JTextField nameTextField;
	JTree tree;
	PersonTreeModel treeModel;
	TeamLeader root;
	public TeamLeaderTreeDemo() {
		root = new TeamLeader("Dick");
		TeamLeader t2 = new TeamLeader("David");
		t2.add(new Member("Mary"));
		root.add(new Member("Emma"));
		TeamLeader t3 = new TeamLeader("Paul");
		t3.add(new Member("Happy"));
		t3.add(new Member("Anna"));
		t2.add(t3);
		root.add(t2);
		root.add(new Member("Rock"));
	//  treeModel = new PersonTreeModel(root);
	//  tree = new JTree(treeModel);

		addButton = new JButton("Add");
		removeButton = new JButton("Remove");
		nameTextField = new JTextField("Amy", 20);
	//  addButton.addActionListener(new AddListener());
	// removeButton.addActionListener(new RemoveListener());

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.add(nameTextField);
		buttonsPanel.add(addButton);
		buttonsPanel.add(removeButton);
		getContentPane().add(buttonsPanel, BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(tree), BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
	javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() { new TeamLeaderTreeDemo(); }
	});
	}
}