import java.awt.*;
public class TulisanGabungan extends Panel{
	Font f;
	String text ="HALO KHARISMA";
	TulisanGabungan(){
		setBackground(Color.GRAY);
	}
	 public void paint(Graphics g) {
	 	f = new Font ("Helvetica", Font.BOLD,48);
	 	//KOTAK HIJAU
	 	g.setColor(Color.GREEN);
	 	g.fillRect(8, 8, 450, 105);
	 	//WARNA HITAM PINGGIRAN
	 	g.setColor(Color.BLACK);
	 	g.drawRect(8,8, 450, 105);
	 	g.setColor(Color.PINK);
	 	g.fillOval(10, 10, 450, 100);
	 	//DIBERI PINGGIRAN WARNA MERAH TEBAL (3X)
	 	g.setColor(Color.RED);
	 	g.drawOval(10, 10, 450, 100);
	 	g.drawOval(9, 9, 452, 102);
	 	g.drawOval(8, 8, 454, 104);
	 	//TULISAN WARNA HITAM DENGAN FONT HELVETICA
	 	g.setColor(Color.BLACK);
	 	g.setFont(f);
	 	g.drawString(text, 40, 75);	
	 	}
	 	
	public static void main(String[] args){
		Frame f = new Frame("Testing Graphics Panel");
		TulisanGabungan gp = new TulisanGabungan();
		f.add(gp);
		f.setSize(900, 900);
		f.setVisible(true);
	}
	 
}