package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class viewPageObject {


    public class ViewPageObject{

        private WebElement search;

        public void setSearch(String Tees) throws InterruptedException
        {
            search.clear();
             search.sendKeys(Tees);
             search.sendKeys(Keys.RETURN);

            }


}

        }
