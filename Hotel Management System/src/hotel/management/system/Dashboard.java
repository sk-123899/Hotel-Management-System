/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel HotelManagementSystem = new JLabel("THE TAJ GROUP WELCOMES YOU");
	HotelManagementSystem.setForeground(Color.WHITE);
        HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
	HotelManagementSystem.setBounds(600, 60, 1000, 85);
	NewLabel.add(HotelManagementSystem);


        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);

        JMenu HotelSystem = new JMenu("HOTEL MANAGEMENT");
        HotelSystem.setForeground(Color.BLUE);
	menuBar.add(HotelSystem);

        JMenuItem Hoteldetails = new JMenuItem("RECEPTION");
	HotelSystem.add(Hoteldetails);

	JMenu Hoteladmin = new JMenu("ADMIN");
        Hoteladmin.setForeground(Color.RED);
	menuBar.add(Hoteladmin);

        JMenuItem HotelDetailsemp = new JMenuItem("ADD EMPLOYEE");
        Hoteladmin.add(HotelDetailsemp);

        HotelDetailsemp.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});


        JMenuItem HotelDetailsroom = new JMenuItem("ADD ROOMS");
        Hoteladmin.add(HotelDetailsroom);

        HotelDetailsroom.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});


	Hoteldetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
	});


        JMenuItem HotelDetailsdriver = new JMenuItem("ADD DRIVERS");
        Hoteladmin.add(HotelDetailsdriver);

        HotelDetailsdriver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});

		
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
