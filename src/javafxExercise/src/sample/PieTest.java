package sample;

import static org.junit.jupiter.api.Assertions.*;

import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PieTest {
	@Test
	void test() {
		Pie pie = new Pie();
		System.out.print("output pie Chart.");
		pie.main(null);//run main
	}



}
