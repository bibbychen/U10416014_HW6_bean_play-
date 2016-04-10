import javafx.animation.*;
import javafx.util.*;
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.input.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*;
import javafx.scene.*;
import java.util.*;
import java.security.SecureRandom;

public class Beanmachine extends Application {
	private int ballNumber = 0;
	private double[] Y = {50,99,129,159,189,219,249,279,290,360};
	private ArrayList<double[]> X = new ArrayList<>();
	private ArrayList<Polyline> ballpath = new ArrayList<>();
    Pane pane = new Pane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    //pane.getChildren().add(new Button("OK")); 
	//Create a Pane


	//Create a Polyline
	Polyline polyline = new Polyline();
	for(int i = 0;i <=500;i++){
		X.add(new double[10]);
		(X.get(i))[0] = 230;
		(X.get(i))[1] = 230;
		
	}
	
	polyline.getPoints().addAll(210d,50d,210d,90d,110d,300d,110d,360d,350d,360d,350d,300d,250d,90d,250d,50d);
	pane.getChildren().add(polyline);
	//Create Line and its location
	Line line1 =new Line(140,300,140,360);
	Line line2 =new Line(170,300,170,360);
	Line line3 =new Line(200,300,200,360);
	Line line4 =new Line(230,300,230,360);
	Line line5 =new Line(260,300,260,360);
	Line line6 =new Line(290,300,290,360);
	Line line7 =new Line(320,300,320,360);
	//put the line in pane
	pane.getChildren().add(line1);
	pane.getChildren().add(line2);
	pane.getChildren().add(line3);
	pane.getChildren().add(line4);
	pane.getChildren().add(line5);
	pane.getChildren().add(line6);
	pane.getChildren().add(line7);
	//Create many circles
	Circle circle1 = new Circle();
	Circle circle2 = new Circle();
	Circle circle3 = new Circle();
	Circle circle4 = new Circle();
	Circle circle5 = new Circle();
	Circle circle6 = new Circle();
	Circle circle7 = new Circle();
	Circle circle8 = new Circle();
	Circle circle9 = new Circle();
	Circle circle10 = new Circle();
	Circle circle11 = new Circle();
	Circle circle12 = new Circle();
	Circle circle13 = new Circle();
	Circle circle14 = new Circle();
	Circle circle15 = new Circle();
	Circle circle16 = new Circle();
	Circle circle17 = new Circle();
	Circle circle18 = new Circle();
	Circle circle19 = new Circle();
	Circle circle20 = new Circle();
	Circle circle21 = new Circle();
	Circle circle22 = new Circle();
	Circle circle23 = new Circle();
	Circle circle24 = new Circle();
	Circle circle25 = new Circle();
	Circle circle26 = new Circle();
	Circle circle27 = new Circle();
	Circle circle28 = new Circle();
	
	//Set circles' radius
	circle1.setRadius(5);
	circle2.setRadius(5);
	circle3.setRadius(5);
	circle4.setRadius(5);
	circle5.setRadius(5);
	circle6.setRadius(5);
	circle7.setRadius(5);
	circle8.setRadius(5);
	circle9.setRadius(5);
	circle10.setRadius(5);
	circle11.setRadius(5);
	circle12.setRadius(5);
	circle13.setRadius(5);
	circle14.setRadius(5);
	circle15.setRadius(5);
	circle16.setRadius(5);
	circle17.setRadius(5);
	circle18.setRadius(5);
	circle19.setRadius(5);
	circle20.setRadius(5);
	circle21.setRadius(5);
	circle22.setRadius(5);
	circle23.setRadius(5);
	circle24.setRadius(5);
	circle25.setRadius(5);
	circle26.setRadius(5);
	circle27.setRadius(5);
	circle28.setRadius(5);
	//set X
	circle1.setLayoutX(140);
	circle2.setLayoutX(170);
	circle3.setLayoutX(200);
	circle4.setLayoutX(230);
	circle5.setLayoutX(260);
	circle6.setLayoutX(290);
	circle7.setLayoutX(320);
	circle8.setLayoutX(155);
	circle9.setLayoutX(185);
	circle10.setLayoutX(215);
	circle11.setLayoutX(245);
	circle12.setLayoutX(275);
	circle13.setLayoutX(305);
	circle14.setLayoutX(170);
	circle15.setLayoutX(200);
	circle16.setLayoutX(230);
	circle17.setLayoutX(260);
	circle18.setLayoutX(290);
	circle19.setLayoutX(185);
	circle20.setLayoutX(215);
	circle21.setLayoutX(245);
	circle22.setLayoutX(275);
	circle23.setLayoutX(200);
	circle24.setLayoutX(230);
	circle25.setLayoutX(260);
	circle26.setLayoutX(215);
	circle27.setLayoutX(245);
	circle28.setLayoutX(230);
	//Set Y
	circle1.setLayoutY(290);
	circle2.setLayoutY(290);
	circle3.setLayoutY(290);
	circle4.setLayoutY(290);
	circle5.setLayoutY(290);
	circle6.setLayoutY(290);
	circle7.setLayoutY(290);
	circle8.setLayoutY(260);
	circle9.setLayoutY(260);
	circle10.setLayoutY(260);
	circle11.setLayoutY(260);
	circle12.setLayoutY(260);
	circle13.setLayoutY(260);
	circle14.setLayoutY(230);
	circle15.setLayoutY(230);
	circle16.setLayoutY(230);
	circle17.setLayoutY(230);
	circle18.setLayoutY(230);
	circle19.setLayoutY(200);
	circle20.setLayoutY(200);
	circle21.setLayoutY(200);
	circle22.setLayoutY(200);
	circle23.setLayoutY(170);
	circle24.setLayoutY(170);
	circle25.setLayoutY(170);
	circle26.setLayoutY(140);
	circle27.setLayoutY(140);
	circle28.setLayoutY(110);
	//put circles into pane
	pane.getChildren().add(circle1);
	pane.getChildren().add(circle2);
	pane.getChildren().add(circle3);
	pane.getChildren().add(circle4);
	pane.getChildren().add(circle5);
	pane.getChildren().add(circle6);
	pane.getChildren().add(circle7);
	pane.getChildren().add(circle8);
	pane.getChildren().add(circle9);
	pane.getChildren().add(circle10);
	pane.getChildren().add(circle11);
	pane.getChildren().add(circle12);
	pane.getChildren().add(circle13);
	pane.getChildren().add(circle14);
	pane.getChildren().add(circle15);
	pane.getChildren().add(circle16);
	pane.getChildren().add(circle17);
	pane.getChildren().add(circle18);
	pane.getChildren().add(circle19);
	pane.getChildren().add(circle20);
	pane.getChildren().add(circle21);
	pane.getChildren().add(circle22);
	pane.getChildren().add(circle23);
	pane.getChildren().add(circle24);
	pane.getChildren().add(circle25);
	pane.getChildren().add(circle26);
	pane.getChildren().add(circle27);
	pane.getChildren().add(circle28);
	//Create scene
	Scene scene = new Scene(pane,460,380);
	
	primaryStage.setTitle("Beanmachine"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
	pane.requestFocus();
	pane.setOnKeyPressed(e -> {
		if((e.getCode() == KeyCode.SPACE)){
			ballPath();
		}
	});
	}

	//Main method
	public static void main(String[] args) {
		launch(args);
    }
	
	public void ballPath(){
		Circle ball =new Circle(155,300,6);
		pane.getChildren().add(ball);
		
		SecureRandom random =new SecureRandom();
		//set balls color in random
		ball.setFill(new Color(random.nextDouble(), random.nextDouble(), random.nextDouble(), 1.0));
		//choose the way which the balls move 
		for(int i = 2;i<9;i++){
			if(random.nextInt(2)==1){
				X.get(ballNumber)[i] += X.get(ballNumber)[i-1] + 15;
			}
			else{
				X.get(ballNumber)[i] += X.get(ballNumber)[i-1] - 15; 
			}
		}
		//Let the ball fall straight into the bottom
		X.get(ballNumber)[9] = X.get(ballNumber)[8];
		ballpath.add(new Polyline());
		for(int i = 0; i <9; i++){
			((ballpath.get(ballNumber)).getPoints()).addAll(X.get(ballNumber)[i], Y[i]);
		}
		((ballpath.get(ballNumber)).getPoints()).addAll(X.get(ballNumber)[9], Y[9]-5.0);
		//controll falling time,routine,ball
		PathTransition pt =new PathTransition(Duration.millis(2000),ballpath.get(ballNumber),ball);
		pt.play();
		ballNumber++;
		
	}
	
	
}