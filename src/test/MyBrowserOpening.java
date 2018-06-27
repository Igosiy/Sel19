<<<<<<< HEAD
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyBrowserOpening {
    private WebDriver driver ;

    @Before

    public void start ()
    { driver= new ChromeDriver();
    }


    @Test
    public void MyFirst()
    { driver.get("http://www.ya.ru/");
    }

    @After
    public void close()
    {driver.quit();
        driver=null;}

}


=======
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MyBrowserOpening {
    private WebDriver driver ;

    @Before

    public void start ()
    { driver= new ChromeDriver();
    }


    @Test
    public void MyFirst()
    { driver.get("http://www.ya.ru/");
    }

    @After
    public void close()
    {driver.quit();
        driver=null;}

}


>>>>>>> 60b06283cbbb91d9e0a569036fedd8fc36cf84c2
