package lvntu.edu.lib;

import java.awt.*;
 import java.awt.event.*;

public class ads extends Frame implements ItemListener //ke thua interface ItemListener
 {

//Tao doi tuong chua
 CheckboxGroup cbg = new CheckboxGroup();
 //Khoi tao doi tuong checkbox
 Checkbox cb1 = new Checkbox("Do",cbg, true);//Mac dinh chon mau do
 Checkbox cb2 = new Checkbox("Xanh",cbg,false);

private void initSuKienItemRadio()
 {
 this.setLayout(new FlowLayout()); 

this.add(cb1);
 this.add(cb2);

//Doi tuong nao lang nghe su kien, o dau ?
 cb1.addItemListener(this);
 this.setBackground(Color.gray);
 cb2.addItemListener(this);

this.setSize(300,300);
 this.setVisible(true);
 } 
 public ads(String title)
 {
 super(title);
 initSuKienItemRadio();
 }

public void itemStateChanged(ItemEvent e)
 {
 if(e.getStateChange()==ItemEvent.SELECTED)//Kiem tra trang thai chon hay khong chon
 {
 if(String.valueOf(e.getItem())=="Do")//phuong thuc getItem lay ra label cua cb
 {
 this.setBackground(Color.red);
 System.out.println(String.valueOf(e.getItem()));
 }
 else
 {
 this.setBackground(Color.green);
 System.out.println(String.valueOf(e.getItem()));
 }
 }
 }
 public static void main(String[] doiso)
 {
 ads ski = new ads("Frame checkbox event");
 }
 }
