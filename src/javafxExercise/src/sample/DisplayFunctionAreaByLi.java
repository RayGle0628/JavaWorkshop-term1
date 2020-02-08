package sample;

import java.util.function.Function;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;

/**
 *  This class is to display a non-constant function such as x goes to
 *  x*x and the area between the function graph and the x-axis in a
 *  given interval [a,b].  It is done by drawing the x-axis and the
 *  y-axis as well as defining a polyline from the function, the
 *  end-point (b, f(b)) and the starting point at (a, f(a)) and then
 *  displaying the corresponding polygon filled with colour and
 *  adquately scaled.
 *此类用于显示非恒定函数，例如x转到
 *  *  *   * x * x和函数图中x轴之间的区域
 *  *  *   *给定间隔[a，b]。 通过绘制x轴和
 *  *  *   * y轴，并根据函数定义折线，
 *   *端点（b，f（b））和起点（a，f（a）），然后
 *   *显示用颜色填充的相应多边形，然后
 *   *适当缩放。
 *  @version 2019-11-17
 *  @author Manfred Kerber
 */
public class DisplayFunctionAreaByLi extends Application{

    /** X_SIZE is the width of the panel in pixels. Set to 600.
     * X_SIZE是面板的宽度，以像素为单位。 设置为600。
     */
    public static final int X_SIZE = 600;

    /** Y_SIZE the height of the panel in pixels. Set to 600.
     */
    public static final int Y_SIZE = 600;

    /**
     *  f is the function to be displayed. We introduce it as a global
     *  variable so that it can be used in the start method, but be
     *  defined in the main method.
     *  f是要显示的功能。 我们将其介绍为全球性的
     *       *变量，以便可以在启动方法中使用，但应
     *       *在main方法中定义。
     */
    private static Function<Double,Double> f;

    /**
      * a is the left border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
     * a是函数所在区间的左边界
     *        *显示。 我们将其引入为全局变量，以便
     *        *可以在启动方法中使用，但可以在main中定义
     *        * 方法。
      */
    private static double a;

    /**
      * b is the right border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
     * b是函数所在区间的右边界
     *        *显示。 我们将其引入为全局变量，以便
     *        *可以在启动方法中使用，但可以在main中定义
     *        * 方法。
      */
   private static double b;

    /** min is an approximation of the minimum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     * min是间隔中f的最小值的近似值
     *       * [a，b]。 它是作为全局变量引入的，因此可以
     *       *不必重新计算。
     */
    private static double min=-500;

    /** max is an approximation of the maximum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     * max是区间中f的最大值的近似值
     *       * [a，b]。 它是作为全局变量引入的，因此可以
     *       *不必重新计算。
     */
    private static double max=500;

    /**
     *  n is the granularity. More concretely, the interval [a,b] will
     *  be subdivided in n parts and on each the function will be
     *  approximated by a straight line.
     *  n是粒度。 更具体地说，间隔[a，b]将
     *       *细分为n个部分，每个函数将
     *       *近似为直线。
     */
    private static int n;

    /**
     *  The polyline will be the approximation of the function and be displayed.
     *  折线将与函数近似并显示。
     */
    private static Polyline polyline;

    /**
     *  The polygon will be the area between the function and the
     *  x-axis.
     *  多边形将成为区域在函数和
     *        x轴之间。
     */
    private static Polygon polygon;

    /**
     *  The colour in which the area is displayed.
     */
    public static Color areaColour = Color.YELLOW;


    /**
     *   The method generates a polygon corresponding to the area
     *   between the function f and the x-axis in the interval [a,b].
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval.
     *   @param b The maximal x-value in the interval.
     *   @return The polygon corresponding to the area between the
     *   function f and the x-axis over the interval [a,b] with
     *   granularity n.
     *   该方法生成对应于该区域的多边形
     *       *函数f和x轴之间的间隔为[a，b]。
     *       * @param f要绘制的函数。
     *       * @param n要绘制的等距间隔数。
     *       * @param a间隔中的最小x值。
     *       * @param b间隔中的最大x值。
     *       * @return对应于多边形之间区域的多边形
     *       *函数f和x轴在间隔[a，b]上具有
     *       *粒度
     */
    public static Polygon functionToPolygon(Function<Double,Double> f,//java.util.function.Function
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            double[] points = new double[2*(n+1)+4];
            double x, y;
            /* Loop: Add x and y values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             * The (x_i,y_i) values are added to the points array in pairs.
             * / *循环：将x和y值添加到相应的数组
              *用于a，b和n-1之间的等距值。
              *（x_i，y_i）值成对添加到点数组。
              * /
             */
            for (int i = 0; i <= n ; i++){
                x = a + (b - a) * i / n;
                y = f.apply(x);
                points[2*i]   = x;
                points[2*i+1] = y;
            }
            /* Draw graph */
            return new Polygon(points);
        }
    }

    /**
     *   The method generates a polyline corresponding to the graph of
     *   function f in the interval [a,b]
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval.
     *   @param b The maximal x-value in the interval.
     *   @return The polyline corresponding to the function f over the
     *   interval [a,b] with granularity n.
     *   该方法生成与图的对应的折线
     *       *在区间[a，b]中的函数f
     *       * @param f要绘制的函数。
     *       * @param n要绘制的等距间隔数。
     *       * @param a间隔中的最小x值。
     *       * @param b间隔中的最大x值。
     *       * @return对应于函数f的折线
     *       *间隔[a，b]，粒度为n。
     */
    public static Polyline functionToPolyline(Function<Double,Double> f,
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            double[] points = new double[2*(n+1)];
            double x, y;
            /* Loop: Add x and y values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             * The (x_i,y_i) values are added to the points array in pairs.
             */
            for (int i = 0; i <= n ; i++){
                x = a + (b - a) * i / n;
                y = f.apply(x);
                points[2*i]   = x;
                points[2*i+1] = y;
            }
            /* Draw graph */
            Polyline result = new Polyline(points);
            result.setStrokeWidth(3);
            return result;
        }
    }

    /**
     *   The method draws the x-axis if 0 is in the interval ]min,max[.
     *   It is assumed that the function is not constant.
     *   @param root The group to which the x-axis is to be added.
     *               如果0在间隔[min，max [中]，则该方法绘制x轴。
     *       *假定函数不是常数。
     *       * @param root将x轴添加到的组。
     */
    public static void drawXAxis(Group root){
        if (min < 0 && 0 < max) {
            Line line = new Line(0, (max-0) * Y_SIZE/(max-min),
                                 X_SIZE, (max-0) * Y_SIZE/(max-min));
            line.setStrokeWidth(2);//设置行程宽
            root.getChildren().add(line);
        }
    }

    /**
     *   The method draws the y-axis if 0 is in the interval ]a, b[.
     *   @param root The group to which the y-axis is to be added.
     *               如果0在区间[a]，[b]中，则该方法绘制y轴。
     *       * @param root将y轴添加到的组。
     */
    public static void drawYAxis(Group root){
        if (a < 0 && 0 < b) {
            Line line = new Line((b-0) * X_SIZE/(b-a), 0,
                                 (b-0) * X_SIZE/(b-a), Y_SIZE);
            line.setStrokeWidth(2);
            root.getChildren().add(line);
        }
    }


    /**
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Create a Group (scene graph) with the line as single element.
        Group root = new Group();
        root.getChildren().add(polyline);
        root.getChildren().add(polygon);
        drawXAxis(root);
        drawYAxis(root);

        // The scene consists of just one group.
        Scene scene = new Scene(root, X_SIZE,Y_SIZE);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Function Graph");
        stage.setScene(scene);
        stage.show();
    }


    /**
     *  The method gives values to the static variables a, b, n, and polyline.
     *  @param f The function to be displayed.
     *  @param numberOfValues The number of points on the polyline.
     *  @param left The left border of the interval to be displayed.
     *  @param right The right border of the interval to be displayed.
     *               该方法将值赋给静态变量a，b，n和折线。
     *       * @param f要显示的功能。
     *       * @param numberOfValues折线上的点数。
     *       * @param left要显示的间隔的左边框。
     *       * @param right要显示的间隔的右边框。
     */
    public static void displayFunctionArea(Function<Double, Double> f,
                                           double left, double right, int numberOfValues){
            a = left;
            b = right;
            n = numberOfValues;
            polyline = functionToPolyline(f, numberOfValues, left, right);
            polygon = functionToPolygon(f, numberOfValues, left, right);
            polygon.setFill(areaColour);
        }

    /*
     *  main method to launch the application.
     */
    public static void main(String[] args) {
        displayFunctionArea(x -> x*x*x - 8 * x * x, -2, 9, 500);
        launch(args);
    }
}

