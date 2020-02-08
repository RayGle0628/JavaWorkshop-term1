package sample;
/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/27
 * @Content:workshop
 * I wrote a graphic for this class.In this category,
 * I drew a pie chart to show the share of expenditure in different categories.
 * Text descriptions are provided outside each category.
 */


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.Expenditure;

import java.util.Arrays;

public class Pie extends Application {
	private int max = 8;
	private Expenditure[] expenditures =  new Expenditure[] {
			new Expenditure("Salaries", 11000),
			new Expenditure("Paper", 2000),
			new Expenditure("Rent", 5000),
			new Expenditure("Most popular books on Java etc.",10000),
			new Expenditure("Heating", 3000),
			new Expenditure("Coffee/Tea", 7000),
			new Expenditure("Biscuits", 8000),
			new Expenditure("Travel", 18000),
			new Expenditure("Electricity", 1000),
			new Expenditure("Pencils", 3000)
	};

	/**
	 * @param Stage primaryStage is a parameter.
	 *      * This parameter adds scene first. And also set it as visual
	 * @throws Exception In this method, I throw away the exception.
	 */
	@Override
	public void start(Stage Stage) throws Exception {
		Stage.setTitle("My PieChart");

		Group g = new Group();
		Scene scene = new Scene(g, 500, 500,Color.WHITE);
		int x_pos = 350;
		int y_pos = 250;
		int r = 100;
		Circle circle = new Circle(x_pos,y_pos,r);//Initialize the circle, set
		// the center coordinates and radius
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		g.getChildren().add(circle);


		int total = 0;
		for(int i=0;i<this.expenditures.length;i++) {//Count all the values first
			total += expenditures[i].getValue();
		}
		double useAngle = 0;//Calculated Angle
		double init_x = x_pos + r * Math.cos(0);
		double init_y = y_pos + r * Math.sin(0);//Initial line coordinates
		Line line_init = new Line();
		line_init.setStartX(x_pos);
		line_init.setStartY(y_pos);
		line_init.setEndX(init_x);
		line_init.setEndY(init_y);
		g.getChildren().add(line_init);

		Arrays.sort(this.expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());
		for(int i=0;i<max;i++) {
			if(this.expenditures[i] != null) {
				double textAngle = Math.floor(expenditures[i].getValue()*-360/total)/2 + useAngle;
				double angle = Math.floor(expenditures[i].getValue()*-360/total) + useAngle;
				double x1 = x_pos + r * Math.cos(angle*Math.PI/180);
				double y1 = y_pos + r * Math.sin(angle*Math.PI/180);
				String textmsg = expenditures[i].getDescription();
				int add = this.addValue(textmsg.length());
				double text_x = x_pos + (r+textmsg.length()*add) * Math.cos(textAngle*Math.PI/180);
				double text_y = y_pos + (r+textmsg.length()*add) * Math.sin(textAngle*Math.PI/180);
				Text text = new Text(text_x,text_y,textmsg);

				if(max - i == 1)
				{
					angle = 360 - useAngle;
					textAngle = angle/2 + useAngle;
					String lastStr = "Other";
					double text_lastx = x_pos + (r+lastStr.length() * 1) * Math.cos(textAngle*Math.PI/180);
					double text_lasty = y_pos + (r+lastStr.length() * 1) * Math.sin(textAngle*Math.PI/180);
					Text text_last = new Text(text_lastx,text_lasty,lastStr);
					g.getChildren().add(text_last);
				}
				else
				{
					Line line = new Line();
					line.setStartX(x_pos);
					line.setStartY(y_pos);
					line.setEndX(x1);
					line.setEndY(y1);
					g.getChildren().add(line);
					g.getChildren().add(text);
					useAngle = angle;
				}
			}
		}
		Stage.setScene(scene);
		Stage.show();

	}

	/**
	 * @param len the length of the text location
	 * @return the value of the location
	 * This function is mainly used to adjust the position of the text
	 */

	public int addValue (int len) {
		int value = 0;
		if(len > 15) {
			value = 7;
		}else
		{
			value = 4;
		}
		return value;
	}

	/**
	 * @param args The main method. For running
	 */
	public static void main(String[] args) {
		launch(args);
	}
}