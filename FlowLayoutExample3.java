import java.awt.*; import java.awt.event.*; 
public class FlowLayoutExample3 {  
public static void main(String[] args) {  
Frame f=new Frame("FlowLayout Example");  
Button b1=new Button("B1");
Button b2=new Button("B2");
Button b3=new Button("B3");
Button b4=new Button("B4");
Button b5=new Button("B5");
Label label1= new Label("Hi!");
Label label2=new Label("This is awt tutorial");
Label label3=new Label("Welcome to FlowLayout class!");
List list1=new List();
        list1.add("Cricket");  
        list1.add("Football");  
        list1.add("Hockey"); 
        list1.add("Tennis"); 
        list1.add("Chess");
        list1.add("Carroms");
        list1.add("Vollyball");
        f.add(b1);  
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
   f.add(label1);
  f.add(label2);
f.add(label3);
f.add(list1);
    f.setSize(400,200); 
 
    f.setLayout(new FlowLayout(FlowLayout.LEFT));//Setting the layout for the Frame 
    f.setVisible(true);   
f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
}  
}