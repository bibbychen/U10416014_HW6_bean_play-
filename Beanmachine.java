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
    //Create a Pane
	Pane pane = new Pane();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
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
	Circle circle1 = new Circle(140.0,290.0,5.0);
	Circle circle2 = new Circle(170.0,290.0,5.0);
	Circle circle3 = new Circle(200.0,290.0,5.0);
	Circle circle4 = new Circle(230.0,290.0,5.0);
	Circle circle5 = new Circle(260.0,290.0,5.0);
	Circle circle6 = new Circle(290.0,290.0,5.0);
	Circle circle7 = new Circle(320.0,290.0,5.0);
	Circle circle8 = new Circle(155.0,260.0,5.0);
	Circle circle9 = new Circle(185.0,260.0,5.0);
	Circle circle10 = new Circle(215.0,260.0,5.0);
	Circle circle11 = new Circle(245.0,260.0,5.0);
	Circle circle12 = new Circle(275.0,260.0,5.0);
	Circle circle13 = new Circle(305.0,260.0,5.0);
	Circle circle14 = new Circle(170.0,230.0,5.0);
	Circle circle15 = new Circle(200.0,230.0,5.0);
	Circle circle16 = new Circle(230.0,230.0,5.0);
	Circle circle17 = new Circle(260.0,230.0,5.0);
	Circle circle18 = new Circle(290.0,230.0,5.0);
	Circle circle19 = new Circle(185.0,200.0,5.0);
	Circle circle20 = new Circle(215.0,200.0,5.0);
	Circle circle21 = new Circle(245.0,200.0,5.0);
	Circle circle22 = new Circle(275.0,200.0,5.0);
	Circle circle23 = new Circle(200.0,170.0,5.0);
	Circle circle24 = new Circle(230.0,170.0,5.0);
	Circle circle25 = new Circle(260.0,170.0,5.0);
	Circle circle26 = new Circle(215.0,140.0,5.0);
	Circle circle27 = new Circle(245.0,140.0,5.0);
	Circle circle28 = new Circle(230.,110.0,5.0);
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