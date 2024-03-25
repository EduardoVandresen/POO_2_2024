package file;

import java.io.File;

import javax.swing.JOptionPane;

public class ExemploFile {
	public static void main(String[] args) {
		String menu = "1 Listar\n"
				+ "2 - Apagar todos\n\n"
				+ "3 - Sair";
		File[] arqs = null;
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if( op == 1) {
				String dir = JOptionPane.showInputDialog("Path");
				File d = new File(dir);
				if(d.isDirectory()) {
					arqs = d.listFiles();
				for(File f : arqs) {
					System.out.print(f.getName() + " - " + (f.length()/1024) + " KB ");
				}
				}else {
					System.out.print("caminho invalido");
				}
			}
			if(op == 2) {
				for(File f : arqs) {
					f.delete();				}
			}
		}while(op!=3);
	}
}
