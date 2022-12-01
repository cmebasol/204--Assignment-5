package newproject;

public class TreeNode<T> {

	private T dataNode;
	private TreeNode <T> rightChild, leftChild;
	
	public TreeNode (T dataNode) {
		this.dataNode = dataNode;
		this.rightChild = null;
		this.leftChild = null;
		
	}
	public T getDataNode() {
		return dataNode;
	}
	public void setDataNode(T dataNode) {
		this.dataNode = dataNode;
	}
	public TreeNode <T> getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode <T> rightChild) {
		this.rightChild = rightChild;
	}
	public TreeNode <T> getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode <T> leftChild) {
		this.leftChild = leftChild;
	}
	
	public TreeNode (TreeNode <T> copied) {
		// make sure the copy is a deep one
		this.dataNode = copied.dataNode;
		this.rightChild = copied.rightChild;
		this.leftChild = copied.leftChild;
		
	}
}
