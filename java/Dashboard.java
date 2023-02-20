import java.awt.*;

import javax.swing.*;
import java.awt.event.*;




public class Dashboard extends JFrame implements ActionListener {
    Dashboard(){
        setBounds(0,0,1900,680);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2= i1.getImage().getScaledInstance(1900,680,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1900,680);
        add(image);

        JLabel text = new JLabel("THE TAJ GROUP WELCOMES YOU");     
        text.setBounds(300,80,1900,50);
        text.setFont(new Font("Tahoma",Font.BOLD,46));
        text.setForeground(Color.WHITE);
        image.add(text);

        JMenuBar mb= new JMenuBar();
        mb.setBounds(0,0,1990,30);
        image.add(mb);

        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.BLUE);
        mb.add(hotel);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.red);
        mb.add(admin);
        
        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);
        JMenuItem adddrives = new JMenuItem("ADD DRIVERS");
        adddrives.addActionListener(this);
        admin.add(adddrives);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("ADD EMPLOYEE")){
        new AddEmployee();
        }else if (ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
        }else if (ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDrivers();
        }else if(ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        }
    }
    
    public static void main(String[] args) {
        new Dashboard();
    }
}
