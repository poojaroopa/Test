package TestNG_Scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class Flipkart_sample extends Generic
{
@Test
public void test() throws AWTException, InterruptedException
{
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_N);
	r.keyRelease(KeyEvent.VK_N);
	driver.manage().window().maximize();
	Point p = new Point(500, 700);
	driver.manage().window().setPosition(p);
	Dimension d = new Dimension(500, 600);
	Thread.sleep(2000);
	driver.manage().window().setSize(d);
}
}
