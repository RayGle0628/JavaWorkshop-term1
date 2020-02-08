package sample;

/**
 * @Version 1.0
 * @Author:Mingrui Li 2087184 mxl991
 * @Date:2019/11/28
 * @Content:workshop
 * I wrote a graphic for this class.
 *First we declare an array which stores some items and amounts of expenditure.
 *Then we sorted it and displayed it in 100 squares in descending order.
 *For an array of up to maximum elements, display all elements (biggest to
 *smallest).
 *For an array with more than maximum elements, display only the maximum-1
 *biggest ones (biggest to smallest) and accumulate
 *the others summed up as an entry with the description "Other".
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.math.*;
import java.util.Arrays;


public class Waffle extends Application {
	private int maximum = 9;//类别最大数
	private int rectNum = 100; //方格数,这个值要改的话下面方格的大小也要改，x_pos也要改，这个值越大，另外两个值就越小

	private Expenditure [] expenditures =  new Expenditure[] {//这是要展示出来的数据以及名称类实例
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
	 * @param stage Stage is a parameter.
	 *      *      This parameter adds scene first. And also set it as visual.
	 *              I set a lot of different elements through the stage, which is the basis of this gui imaging.
	 * @throws Exception In this method, I throw away the exception.
	 */
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("My Waffle");   //设置画面标题
		
        Group root = new Group();//group是javafx中的容器类
        Scene scene = new Scene(root, 1000, 800, Color.WHITE);//初始化窗口界面，可以设置窗口大小值
        scene.setFill(null);   //是否填充颜色
        
        int expLen = this.expenditures.length;//需要展示的数据的数组长度
    	int total = 0;
    	for(int i=0;i<this.expenditures.length;i++) {//先将所有的值统计出来
    		total += expenditures[i].getValue();
    	}
   
		double x_pos = 0,y_pos = 100;//第一个格子的坐标
		double x_pos_text = 730, y_pos_text = 120;//文本坐标
		int rowNum = 10;//每行最大的格子数
		int curNum = 0;//当前行格子数
		int useNum = 0;//已经画了的格子
		Arrays.sort(this.expenditures, (Expenditure exp1, Expenditure exp2) -> exp2.getValue() - exp1.getValue());
		for(int i=0;i<maximum;i++) {
			if(this.expenditures[i] != null) {//这里是判断会否有空对象
				int tempNum = (int) Math.floor(expenditures[i].getValue()* this.rectNum/total);//根据每个数据的值计算出应该占有多少个格子
				int r =(int)(1+Math.random()*(255-1+1));
				int g =(int)(1+Math.random()*(255-1+1));
				int b =(int)(1+Math.random()*(255-1+1));//随机取值rgb，rgb分别代表rgb色值中的三个值取值0~255，用于每次展现的各自颜色随机
				Text text = new Text(x_pos_text+30,y_pos_text+25,
						this.expenditures[i].getDescription());//实例化文字对象，这是右边类别的文字
				Rectangle rect_1 = new Rectangle(x_pos_text-50,y_pos_text,50,50);//同上，这是右边类别的格子，前两个值是坐标，后面是长宽
				y_pos_text += 50;
				if(maximum - i == 1) {
					tempNum = this.rectNum - useNum;
					useNum = this.rectNum;
					text = new Text(x_pos_text+30,y_pos_text-20,"Other");//当进行到最大类别最后一个时，将剩下的所有格子一并打印并且将文字改为other
				}
				
				rect_1.setStroke(Color.WHITE);//设置格子边框颜色，设置为白色方便看清楚
				rect_1.setFill(Color.rgb(r,g,b));//设置格子的颜色
				root.getChildren().add(rect_1);
				root.getChildren().add(text);
				
				for(int j=0;j<tempNum;j++) {
					Rectangle rect = new Rectangle(x_pos,y_pos,50,50);//这是统计图中的格子

					rect.setStroke(Color.WHITE);
					rect.setFill(Color.rgb(r,g,b));
					root.getChildren().add(rect);
					x_pos += 50;
					curNum ++;
					useNum ++;
					
					if(curNum == rowNum) {//进入下一行，设置了每行最多格子数，当到达了这个数就就进入下一行，X坐标不动，y向下
						y_pos += 50.0;
						x_pos  = 0.0;
						curNum = 0;//下一行后将此值置0
					}
				}
				if(useNum == this.rectNum) {break;}//当格子画完后直接跳出
			}
		}
        
		stage.setScene(scene);
		stage.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		launch(args);
    }
}