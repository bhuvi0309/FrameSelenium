package co.edurekatraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLogic {

	public static void main(String[] args) {
		
		//Invoke a web Browser
				WebDriver driver = new ChromeDriver();
				
				//Open Rediffmail
				driver.get("https://docs.oracle.com/javase/7/docs/api/");
				driver.manage().window().maximize();
				
				String CurrentUrl=driver.getCurrentUrl();
				System.out.println("CurrentUrl= "+ CurrentUrl );
				
				System.out.println("----------------------------------------------------------");
				System.out.println("----------------------------------------------------------");
				
				//Search for IFrames
				List<WebElement> web_frame = driver.findElements(By.xpath("//frame"));
				int iFrameCount = web_frame.size();
				//Print the total number of IFrames on a given web page
				System.out.println("No. of IFrames: " + iFrameCount);
				for (WebElement frameName : web_frame) {
					String frameNames=frameName.getAttribute ("name");
					System.out.println("The Name of the frame is : " +frameNames);
				}
				
				System.out.println("----------------------------------------------------------");
				System.out.println("----------------------------------------------------------");
				
				//Store the web element
				WebElement iframe1 = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
				//Switch to the frame
				driver.switchTo().frame(iframe1);

				//NO. Of links in "packageListFrame" frame
				List <WebElement> frameLinks1=driver.findElements(By.xpath("//a"));
				int frameLinksLen1 = frameLinks1.size();
					System.out.println("The no. of links in the packageListFrame are : " +frameLinksLen1);
					
					//Iterating for each loop for links names
					//for ( WebElement frame1LinkNames :frameLinks1) {
						//System.out.println("The name of the link in Frame 1 are : " + (frame1LinkNames.getText()));
					//}
				System.out.println("The Name of the links in Frame 1 are as below :");
				for(int i=0;i<frameLinks1.size();i++){
				System.out.println(i +" : "+ frameLinks1.get(i).getText());
				}
					
				System.out.println("----------------------------------------------------------");
				System.out.println("----------------------------------------------------------");
				
				//switching to Main UI
				driver. switchTo(). defaultContent();
			
				//Store the web element
				WebElement iframe2 = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
				//Switch to the frame
				driver.switchTo().frame(iframe2);	
					
				//NO. Of links in "packageFrame" frame
				List <WebElement> frameLinks2=driver.findElements(By.xpath("//a"));
				int frameLinksLen2 = frameLinks2.size();
				System.out.println("The no. of links in the packageFrame are : " +frameLinksLen2);	
				
				//Iterating for each loop for links names
				//for ( WebElement frame2LinkNames :frameLinks2) {
				//	System.out.println("The name of the link in Frame 2 are : " + (frame2LinkNames.getText()));
				//}
				
				System.out.println("The Name of the links in Frame 2 are as below :");
				for(int i=0;i<frameLinks2.size();i++){
				System.out.println(i +" : "+ frameLinks2.get(i).getText());
				}
				
				System.out.println("----------------------------------------------------------");
				System.out.println("----------------------------------------------------------");
				
				//switching to Main UI
				driver. switchTo(). defaultContent();
				
				//Store the web element
				WebElement iframe3 = driver.findElement(By.xpath("//frame[@name='classFrame']"));
				//Switch to the frame
				driver.switchTo().frame(iframe3);
				
				//NO. Of links in "classFrame" frame
				List <WebElement> frameLinks3=driver.findElements(By.xpath("//a"));
				int frameLinksLen3 = frameLinks3.size();
				System.out.println("The no. of links in the classFrame are : " +frameLinksLen3);	
				
				System.out.println("The Name of the links in Frame 3 are as below :");
				for(int i=0;i<frameLinks3.size();i++){
				System.out.println(i +" : "+ frameLinks3.get(i).getText());
				}
				
				//Iterating for each loop for links names
				//for ( WebElement frame3LinkNames :frameLinks3) {
				//	System.out.println("The name of the link in Frame 3 are : " + (frame3LinkNames.getText()));
				//}

	}
	
}

