package newproject;
import java.util.*;
public class MorseCodeTree  implements LinkedConverterTreeInterface<String>{

	
	private TreeNode<String> root;
	public MorseCodeTree () {
		buildTree();
	}

	public static void main(String[] args) {
		String my = "hello";
		String []arr = my.split("");
		System.out.println(arr);
	}
	@Override
	public TreeNode<String> getRoot() {
		// TODO Auto-generated method stub
		return this.root;
	}

	@Override
	public void setRoot(TreeNode<String> newNode) {
		// TODO Auto-generated method stub
		this.root = newNode;
	}

	@Override
	public void insert(String code, String result) {
		// TODO Auto-generated method stub
//		addNode();
	}

	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {

		if (code.length() == 1) {
			if (code.equals(".")) {
				root.setLeftChild(new TreeNode <String>(letter));
			}
			else
				root.setRightChild(new TreeNode<String> (letter));
		}
		else {
			if (code.charAt(0) == '.')
				addNode(root.getLeftChild(), code.substring(1), letter);
			else
				addNode(root.getRightChild(), code.substring(1), letter);

		}
	}

	@Override
	public String fetch(String code) {
		return fetchNode(root,code );
	}

	
	@Override
	public String fetchNode(TreeNode<String> root, String code) {
//		code.substring(1);
		if (code.length() == 0)
			return root.getDataNode();
		else if(code.charAt(0) == '.') {
			return fetchNode(root.getLeftChild(),code.substring(1));
		}
		else 
			return fetchNode(root.getRightChild(), code.substring(1));
	}

	@Override
	public LinkedConverterTreeInterface<String> delete(String data) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}

	@Override
	public LinkedConverterTreeInterface<String> update() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void buildTree() {
		root = new TreeNode("");
		addNode(root,".", "e");
		addNode(root, "..", "i");
		addNode(root,"...", "s");
		addNode(root,"....", "h");
		addNode(root,"...-", "v");
		addNode(root,"..-", "u");
		addNode(root,"..-.", "f");
		addNode(root,".-","a");
		addNode(root,".-.", "r");
		addNode(root,".-..", "l");
		addNode(root,".--", "w");
		addNode(root,".--.", "p");
		addNode(root,".---", "j");
		addNode(root,"-", "t");
		addNode(root,"-.", "n");
		addNode(root,"-..","d");
		addNode(root,"-...", "b");
		addNode(root,"-..-", "x");
		addNode(root,"-.-","k");
		addNode(root,"-.-.","c");
		addNode(root,"-.--","y");
		addNode(root,"--", "m");
		addNode(root,"--.","g");
		addNode(root,"--..","z");
		addNode(root,"--.-","q");
		addNode(root,"---","o");

		
	}

	@Override
	public ArrayList<String> toArrayList() {
		ArrayList<String> info = new ArrayList<String>();
		LNRoutputTraversal(this.root, info);
	
		
		return info;

	}

	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) {
		if (root == null)
			return;
		LNRoutputTraversal(root.getLeftChild(),list);
		list.add(root.getDataNode());
		LNRoutputTraversal(root.getRightChild(),list);
		// TODO Auto-generated method stub
		
	}
	
}
