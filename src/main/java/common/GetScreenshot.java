package common;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class GetScreenshot {
	public static String capture(WebDriver driver, String screenshotName) throws IOException {
		File src = ((TakesScreenshot) Constant.driver).getScreenshotAs(OutputType.FILE);
		String destFileLoctn = "./Screenshots/" + System.currentTimeMillis() + ".png";
		try {
			FileUtils.copyFile(src, new File(destFileLoctn));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(destFileLoctn);
		return destFileLoctn;
	}
}
