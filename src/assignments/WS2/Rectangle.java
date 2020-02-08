package assignments.WS2;
/*public class Rectangle {
    private double width;
    private double height;
    private double perimeter;


    /**
     * <pre>
     * width
     * +--------------------------------------+
     * | |
     * | |
     * | | height
     * | |
     * | |
     * +--------------------------------------+
     * </pre>
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @param perimeter The perimeter of the rectangle as 2
     * times the width plus the height.
     */
   /* public Rectangle(double width, double height, double perimeter) {
        this.width = width;
        this.height = height;
        this.perimeter = perimeter;
    }
    /**
     * Getter for the width.
     * @return The width of the rectangle is returned.
     */
    /*public double getWidth() {
        return width;
    }
    /**
     * Getter for the height.
     * @return The height of the rectangle is returned.
     */
    /*public double getHeight() {
        return height;
    }
    /**
     * Getter for the perimeter.
     * @return The perimeter of the rectangle is returned.
     */
   /* public double getPerimeter() {
        return perimeter;
    }
    /**
     * Setter for the width. The width of the rectangle is updated.
     * @param width The new width of the updated rectangle.
     */
    /*public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Setter for the height. The height of the rectangle is updated.
     * @param height The new height of the updated rectangle.
     */
   /* public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Setter for the perimeter. The perimeter of the
     * rectangle is updated.
     * @param perimeter The new perimeter of the updated rectangle.
     */
    /*public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    /**
     * @return A human readable description of the rectangle in form
     * of the three field variables specifying it.
     */
    /*public String toString() {
        return "The rectangle has a width of " + width +
                ", a height of " + height +
                ", and a perimeter of " + perimeter + ".";
    }
    /*
     * main method with a test of the setHeight setter and the
     * toString method.
     */
    /*public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4,12);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }
}*/
/**this class is used to describe a Rectangle.It contains two
 *      attributes:width and height
 *    We distinguish two field variable:
 *
 *     width, the width  of a Rectangle
 *     height, the height  of a Rectangle
 *
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/10/11
 * @Content:workshop
 *  Solution:
 * I decided not to use the perimeter parameter in the constructor,
 * passing in the width and height parameters in the instantiated new object.
 * Then write a way to get the perimeter by width and height,
 * and now the program is correct.
 */
public class Rectangle {
    private double width;
    private double height;


    /**Rectangle is a constructor  for a very simple way to creat a Rectangle
     * @param width  the width  of a Rectangle
     * @param height the height  of a Rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    /**
     * @return the width  of the Rectangle
     */
    public double getWidth() {
        return width;
    }

    /**set the width  of a  Rectangle
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height  of the Rectangle
     */
    public double getHeight() {
        return height;
    }

    /**set the height  of a  Rectangle
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the perimeter  of the Rectangle
     */
    public double getperimeter(){
        double perimeter = 0;
        perimeter = 2*(width + height);
        return  perimeter;
    }


    /** toString defines how to print a Rectangle
     * @return  The object in a human readable form.
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", perimeter=" + getperimeter() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println(r);
        r.setHeight(5);
        System.out.println(r);
    }
}

