/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxdeneme;

import java.util.Calendar;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author sedat
 */
public class JavaFXdeneme extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        // Analog arka planın ayarlanması *****************
        
        AnchorPane root=new AnchorPane();// pane olusturuldu
        ImageView image=new ImageView();// image objesi olusturuldu
        Image img=new Image(getClass().getResourceAsStream("clockframe.png")); //img kaynak yolu göstterildi
        image.setImage(img);//image objesine resim eklendi
        
        Scene scene=new Scene(root, 250, 250);//scene olusturuldu
        
        AnchorPane.setLeftAnchor(image, 10.0);//resimin konum ayarları
        AnchorPane.setTopAnchor(image,10.0);
        root.getChildren().add(image);// scene resim eklendi
        
        // Saat alınma işlemleri  *****************
       Calendar simdi=Calendar.getInstance();
       int saat=simdi.get(Calendar.HOUR);//saat bilgisi int olarak alındı
       int dakika =simdi.get(Calendar.MINUTE);//dakika alındı
       String saatmetin=saat+" : "+dakika;//dakika ve saat string olarak birleştirildi yazdırma işlemi için
        
        //TEXT işlemleri   *****************
        Text text1 = new Text(20, 20,saatmetin);// saat biligisi line olarak yazdırıldı
    text1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));
    root.getChildren().add(text1);  
    
    
    
    //Hourhand işlemleri   *****************
    //merkez nokta
    int centerX=120;
    int centerY=120;
    //12.00 ı göstermesi için başlangıç noktası
    int point2x=120;
    int point2y=50;
    
  double x=Math.toRadians(saat*30);//kaç derece döneceği 
  
    double newX = centerX + (point2x-centerX)*Math.cos(x) - (point2y-centerY)*Math.sin(x);//yeni x noktasını bulmak için

   double newY = centerY + (point2x-centerX)*Math.sin(x) + (point2y-centerY)*Math.cos(x);//yeni x noktasını bulmak için
   
   Line hourHand=new Line(centerX,centerY,newX,newY);//yeni noktalar ile line olusturuluyor
   hourHand.setStyle("-fx-stroke: black;");//line style ayarı
     root.getChildren().add(hourHand);//line  eklendi
    //Minute Hand işlemleri    **************
     
     //hourdaki aynı işlemler
     
     double x2=Math.toRadians(dakika*6);
    double newX2 = centerX + (point2x-centerX)*Math.cos(x2) - (point2y-centerY)*Math.sin(x2);

   double newY2 = centerY + (point2x-centerX)*Math.sin(x2) + (point2y-centerY)*Math.cos(x2);
   
   Line minHand=new Line(centerX,centerY,newX2,newY2);
   hourHand.setStyle("-fx-stroke: red;");
     root.getChildren().add(minHand);
     
     
     
        primaryStage.setScene(scene);// scene pencereye eklendi
        primaryStage.show();//pencere gösterildi
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
