import javax.swing.event.*;
import javax.swing.tree.*;
import java.util.*;

class Code {
  protected String value;
  protected Code parent = null;
  public Code(String value) { this.value = value; }
  public Code getParent() { return parent; }
  public void setParent(Code parent) {this.parent = parent;}
  public String toString() { return value; }
  public Code[] getPath() {return getPathToRoot(this, 0);}
  protected Code[] getPathToRoot(Code aNode, int depth) {
    Code[] retNodes;
    if (aNode == null) {
       if(depth == 0) return null;
       else retNodes = new Code[depth];
    } else {
      depth++;
      retNodes = getPathToRoot(aNode.getParent(), depth);
      retNodes[retNodes.length - depth] = aNode;
     }
     return retNodes;
  }

}
class SingleCode extends Code {
  public SingleCode(String value) { super(value); }
}
class CompositeCode extends Code {
  private ArrayList<Code> list = new ArrayList<Code>();
  public CompositeCode(String data){super(data);}
   public void add(Code p){
 		p.setParent(this);
 		list.add(p);
   }
   public void remove(Code p){
 		p.setParent(null);
 		list.remove(p);
   }
   public Code get(int index) { return list.get(index); }
   public int getSize() { return list.size(); }
   public int indexOf(Code p) { return list.indexOf(p); }
}

class CodeTreeModel implements TreeModel {
  private CompositeCode root;
  private ArrayList<TreeModelListener>  treeModelListeners  = new ArrayList<TreeModelListener>();
  public CodeTreeModel(CompositeCode root) { this.root = root; }
  public Object getRoot() { return root; }
  public boolean isLeaf(Object node) { return node instanceof SingleCode;}
  public int getChildCount(Object parent) {
    return (parent instanceof  CompositeCode)?  ((CompositeCode)parent).getSize():  0;
  }
  public Object getChild(Object parent, int index) {
   if (parent instanceof CompositeCode)
   return ((CompositeCode)parent).getSize() > index  && index >=0?
        ((CompositeCode)parent).get(index) : null;
  else return null;
  }
  public int getIndexOfChild(Object parent, Object child) {
  return parent instanceof CompositeCode ?
    ((CompositeCode)parent).indexOf((Code)child) : -1;
  }
  public void insertNodeInto(Code new_node, CompositeCode parent, int index) {
      parent.add(new_node); //getPath() root to parent
      fireTreeNodesInserted(this, parent.getPath(), new int[]{index},new Object[]{new_node});
  }
  protected void fireTreeNodesInserted(Object source, Object[] path, int[] childIndices,Object[] children) {
     System.out.printf("Called fireTreeNodesInserted: path=%s, childIndices=%s, children=%s\n", Arrays.toString(path), Arrays.toString(childIndices), Arrays.toString(children));
      final TreeModelEvent event = new TreeModelEvent(source, path, childIndices, children);
      for (final TreeModelListener tml : treeModelListeners)
      tml.treeNodesInserted(event);
  }
  public void addTreeModelListener(TreeModelListener listener) {treeModelListeners.add(listener);}
  public void removeTreeModelListener(TreeModelListener listener) {treeModelListeners.remove(listener);}
  public void valueForPathChanged(TreePath path, Object newValue) {  }
}