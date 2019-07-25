package br.com.ivana.estudo.estrutura.dados.algoritmos.arvore;

public class No {
    private Long data;
    private No left;
    private No right;

    public No getLeft() {
        return left;
    }

    public void setLeft(No left) {
        this.left = left;
    }

    public No getRight() {
        return right;
    }

    public void setRight(No right) {
        this.right = right;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public No(Long data) {
        this.data = data;
    }

    public void insert(Long value){
        if(data <= value){
            if(left == null)this.left = new No(value);
            else this.left.insert(value);
        }else{
            if(right == null) this.right = new No(value);
            else this.right.insert(value);
        }
    }

    public boolean contains(Long value){
        if(value == data) return true;
        else if(data <= value){
            if(this.left == null) return false;
            else return this.left.contains(value);
        }else{
            if(right == null) return false;
            else return this.right.contains(value);
        }
    }
    //left, root and right
    public void printInOrder(){
        if(left != null ) left.printInOrder();
        System.out.println(data);
        if(right != null) right.printInOrder();
    }
    //root,left,righ
    public void printPreOrder(){
        System.out.println(data);
        if(left != null ) left.printPreOrder();
        if(right != null) right.printPreOrder();
    }
    //left,righ,root
    public void printPostOrder(){
        if(left != null ) left.printPostOrder();
        if(right != null) right.printPostOrder();
        System.out.println(data);
    }
}
