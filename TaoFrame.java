import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class Demoframe extends Frame
{
	Label lblHoten;		TextField txtHoTen;Button btnOK;TextField txtIn;Label lblXinchao;
	public Demoframe()
	{
		
		Frame f = new Frame ("Nguy?n Th? M? Linh");
		f.setSize(700,300);
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		f.setLayout(new FlowLayout());
		lblHoten = new Label ("H? và Tên:");
		f.add (lblHoten);
		txtHoTen = new TextField(50);
		f.add(txtHoTen);
		btnOK=new Button("OK");
		btnOK.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(null,"Xin chào Nguy?n Th? M? Linh");
			}
		});
		f.add(btnOK);
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		Demoframe dm = new Demoframe();
	}
	
	}
	
