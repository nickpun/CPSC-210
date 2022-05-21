package startFromScratch;//package composite;

public class Main {
    public static void main(String[] args) {
        Branch tree = new Branch("tree");
        Branch branch1 = new Branch("b1");
        Branch branch2 = new Branch("b2");
        Branch branch3 = new Branch("b3");
        branch1.grow(new Leaf());
        branch1.grow(new Leaf());
        branch2.grow(new Leaf());
        branch3.grow(branch2);
        branch3.grow(new Leaf());
        tree.grow(branch3);
        tree.grow(branch1);
        tree.changeColor("RED", "");
    }
}
