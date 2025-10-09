import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestEntityNhan2So {
	
	@Test
	public void testNghiepvuNhan2So() {
		Nhan2SoEntity n2so = new Nhan2SoEntity();
		
		assertEquals(4, n2so.nhan2So(2, 2));
		assertNotEquals(5, n2so.nhan2So(2, 2));
	}

}
