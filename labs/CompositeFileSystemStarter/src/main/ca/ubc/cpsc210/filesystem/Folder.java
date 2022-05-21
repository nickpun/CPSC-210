package ca.ubc.cpsc210.filesystem;

import java.util.ArrayList;
import java.util.List;

// Represents a folder
public class Folder extends FileSystemResource {
    private List<FileSystemResource> listfsr;

    public Folder(String name) {
        listfsr = new ArrayList<>();
        this.name = name;
    }

    public void print() {
        int ind = 0;
        for (int i = ind;i>0; i--) {
            System.out.print("    ");
        }
        System.out.println("Folder: " + getName());
        ind++;
        for (FileSystemResource fsr: listfsr) {
            System.out.print("    ");
            if (fsr instanceof Folder) {
                fsr.print();
            } else {
                fsr.print();
            }
        }
    }

    public void addChild(FileSystemResource fsr) {
        listfsr.add(fsr);
    }
}
