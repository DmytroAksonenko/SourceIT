package test.java.com.aksonenko.sourceit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aksonenko.oop.Candy;
import com.aksonenko.oop.NewYearGift;
import com.aksonenko.oop.Sweet;

public class NewYearGiftTest {
	
	private NewYearGift smallGift;
	@Before
	public void setUp() {
		Sweet lollipop = new Candy();
		lollipop.setType("Lollipop");
		lollipop.setWeight(0.018);
		lollipop.setSugarContent(0.015);
		
		Sweet jellyCandy = new Candy();
		jellyCandy.setType("Jelly Candy");
		jellyCandy.setWeight(0.025);
		jellyCandy.setSugarContent(0.017);
		
		NewYearGift smallGift = new NewYearGift();
		smallGift.setType("Small Gift");
		smallGift.addSweet(lollipop);
		smallGift.addSweet(jellyCandy);	
	}
	@Test
    public void TestToCompareTheResult()
    {
    	double calculatedGift = smallGift.calculateSweetWeight();
		Assert.assertEquals(0.043, calculatedGift, 0.0);
    }
}