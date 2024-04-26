package BaseCasa;
import java.awt.*;
import javax.swing.*;
public class casa extends JPanel{
	
	public void paint(Graphics g) {
		super.paint(g);
		//Pared con flores rosas
		g.drawLine(703, 364, 932, 365);
		g.drawLine(703, 542, 935, 542);
		g.drawLine(703, 364, 703, 542);
		g.drawLine(932, 365, 935, 542);
		//Pilar a la izquierda de pared con flores rosas
		g.drawLine(686, 363, 703, 364);
		g.drawLine(686, 515, 702, 515);
		g.drawLine(686, 363, 686, 515);
		g.drawLine(684, 515, 704, 515);
		g.drawLine(685, 542, 705, 542);
		g.drawLine(684, 515, 685, 542);
		g.drawLine(703, 364, 705, 542);
		//Fachada sobre marco de puerta principal
		g.drawLine(585, 363, 685, 363);
		g.drawLine(585, 380, 685, 380);
		g.drawLine(585, 363, 585, 380);
		//g.drawLine(685, 363, 685, 380);
		//Pared interna de marco de puerta (sombra)
		g.drawLine(676, 380, 676, 534);
		g.drawLine(676, 534, 686, 542);
		//Pared de la puerta principal
		g.drawLine(585, 380, 585, 534);
		g.drawLine(585, 534, 676, 534);
		//Puerta  principal
		g.drawLine(662, 392 ,662, 534);
		g.drawLine(590, 392 ,590, 534);
		g.drawLine(662, 392 ,590, 392);
		//Pilar izquierdo puerta
		g.drawLine(568, 363 ,568, 399);	
		g.drawLine(568, 363 ,585, 363);
		//Pared segunda planta principal
		g.drawLine(567, 160 ,931, 160);
		g.drawLine(565, 352 ,931, 353);
		g.drawLine(567, 160 ,565, 352);
		g.drawLine(931, 160 ,931, 353);
		//Pared almacen 
		g.drawLine(932, 365 ,1030, 368);
		g.drawLine(935, 542 ,1031, 539);
		g.drawLine(1030,368 ,1031, 538);
		//Marco de puerta de pared almacen
		g.drawLine(567, 160 ,931, 160);
		g.drawLine(565, 352 ,931, 353);
		g.drawLine(567, 160 ,565, 352);
		g.drawLine(931, 160 ,931, 353);
		g.drawLine(936, 394, 936, 542);
		g.drawLine(1008, 394, 1008, 542);
		g.drawLine(936, 394, 1008, 394);
		g.drawLine(944, 401, 1000, 400);
		g.drawLine(1000, 400, 1000, 540);
		g.drawLine(936, 400, 936, 540);
		g.drawLine(944, 401, 944, 542);
	}

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Proyecto de Graficación");
		casa objeto=new casa();
		ventana.add(objeto);
		ventana.setSize(1200,825);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
