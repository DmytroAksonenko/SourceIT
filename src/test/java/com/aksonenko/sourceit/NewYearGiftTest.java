package test.java.com.aksonenko.sourceit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aksonenko.oop.Candy;
import com.aksonenko.oop.NewYearGift;
import com.aksonenko.oop.Sweet;

public class NewYearGiftTest {
	
	private static final int DEFAULT_NEWYEARGIFT_CAPACITY = 10;
	private NewYearGift smallGift;
	private NewYearGift bigGift;
	private double minSugarContent = 0;
	private double maxSugarContent = 0.015;
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
		
		smallGift = new NewYearGift();
		smallGift.setType("Small Gift");
		smallGift.addSweet(lollipop);
		smallGift.addSweet(jellyCandy);	
		
		bigGift = new NewYearGift();
		bigGift.setType("Big Gift");
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(lollipop);
		bigGift.addSweet(jellyCandy);
		
	}
	@Test
    public void testToCompareTheResult()
    {
    	double calculatedGift = smallGift.calculateSweetWeight();
		Assert.assertEquals(0.043, calculatedGift, 0.0);
    }
	
	@Test
	public void testArrayLength()
	{
		Sweet[] filteredBySugarSweets = bigGift.sugarFilter(minSugarContent, maxSugarContent);
		Assert.assertEquals(DEFAULT_NEWYEARGIFT_CAPACITY + 1, filteredBySugarSweets.length);
	}
	
	@Test
	public void testAddSweet() 
	{
		Sweet testCandy = new Candy();
		testCandy.setType("test");
		testCandy.setWeight(0.02);
		testCandy.setSugarContent(0.01);
		NewYearGift testGift = new NewYearGift();
		testGift.addSweet(testCandy);
		Assert.assertEquals(0.02, testGift.calculateSweetWeight(), 0.0);
	}
}