package sample;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/27
 * @Content:workshop
 * I wrote a graphic for this class.
 * Above it is a polygon with three sides, which is a triangle. T
 * he others are four rectangles with different lengths and widths.
 * By setting different x, y coordinate axis positions,
 * this figure is finally realized.
 */


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Upload extends Application {

    /**In this method, I wrote four rectangles and one triangle respectively. Set their different coordinate positions. Let them show the final effect.
     * In addition, I added these graphics to a group and added to this scene.
     * @param Stage primaryStage is a parameter.
     *                     This parameter adds scene first. And also set it as visual
     * @throws Exception In this method, I throw away the exception.
     */
    @Override
    public void start(Stage Stage) throws Exception{
        Polygon polygon = new Polygon( 50,0,0,50,100,50);
        polygon.setFill(Color.BLACK);
        polygon.setLayoutX(235);
        polygon.setLayoutY(77);
        Rectangle rectangle1 = new Rectangle(265.0,127.0,44,140);
        Rectangle rectangle2 = new Rectangle(126.0,177,44,141);
        Rectangle rectangle3 = new Rectangle(408,177.0,44,141);
        Rectangle rectangle4 = new Rectangle(126,304.0,326,40);
        Group root = new Group(polygon,rectangle1,rectangle2,rectangle3,rectangle4);
        Scene scene = new Scene(root,700,400);
        Stage.setScene(scene);
        Stage.show();
    }


    /**
     * @param args The main method. For running
     */
    public static void main(String[] args) {

        launch(args);
    }
}

