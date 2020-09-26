package test.java.com.aksonenko.sourceit;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.aksonenko.oop.Candy;
import com.aksonenko.oop.NewYearGift;
import com.aksonenko.oop.Sweet;

public class NewYearGiftTest {
	
	private NewYearGift smallGift;
	private NewYearGift bigGift;
	private NewYearGift lollipopGift;
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
		
		lollipopGift = new NewYearGift();
		lollipopGift.setType("Small Gift");
		lollipopGift.addSweet(lollipop);
		
	}
	@Test
    public void testToCompareTheResult()
    {
    	double calculatedGift = smallGift.calculateSweetWeight();
		Assert.assertEquals(0.043, calculatedGift, 0.0);
    }
	
	@Test
	public void testToCompareTheResult2()
	{
		Sweet[] filteredBySugarSweets = smallGift.sugarFilter(0, 0.015);
		Sweet[] filteredBySugarLollipops = lollipopGift.sugarFilter(0, 0.015);
		Assert.assertEquals(Arrays.toString(filteredBySugarLollipops), Arrays.toString(filteredBySugarSweets));
	}
	
	@Test
	public void testArrayLength()
	{
		Sweet[] filteredBySugarSweets = bigGift.sugarFilter(0, 0.015);
		Assert.assertEquals(5, filteredBySugarSweets.length);
	}
}