package sample;
//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class waffleTest {
	@Test
	void test() {
		Waffle wa = new Waffle();//实例化
		System.out.print("output waffle!!!");
		wa.main(null);//run main
	}
}
