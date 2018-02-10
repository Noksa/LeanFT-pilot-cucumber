package stepdefs;

import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.stdwin.*;
import com.hp.lft.sdk.wpf.Window;
import core.CalcRep;
import core.Repository;
import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.ru.*;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;

import java.net.URI;
import java.util.EnumSet;
import java.util.Objects;

public class CommonSteps {

    public CommonSteps() throws GeneralLeanFtException
    {
    }

    Repository rep = new Repository();

    @Before
    public void test() throws Exception{
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        Reporter.init();
    }

    @After
    public void clean() throws Exception{
        Reporter.generateReport();
        SDK.cleanup();
    }



    @ElementTitle("Окно")
    public Window MainWindow = rep.Window();




    @Дано("^Запустить приложение XmlGenerator$")
    public void открытьПриложениеXmlGenerator() throws Throwable {
        Reporter.startTest("Test app XmlGenerator");
        if (MainWindow.exists(1)) MainWindow.close();
        new ProcessBuilder("C:\\XmlGenerator.exe").start();
        Reporter.setReportTitle("Status Reporting");

    }

    @Когда("^открывается приложение XmlGenerator$")
    public void открываетсяПриложениеXmlGenerator() throws Throwable {
        if (MainWindow.exists(60))
        {
            Reporter.reportEvent(MainWindow.getDisplayName() + " is opened.", "", Status.Passed);
        }
    }

    @Тогда("^пользователь закрывает его$")
    public void пользовательЗакрываетЕго() throws Throwable {
        MainWindow.close();
    }

    @Тогда("^приложение XmlGenerator закрывается$")
    public void приложениеXmlGeneratorЗакрывается() throws Throwable {
        notExists(MainWindow);
    }


    private boolean notExists(Window object) throws Exception {
        for (int i = 0; i < 10; i++) {
            if (!object.exists(0))
            {
                Reporter.reportEvent( object.getDisplayName() + " not exists.", "", Status.Passed);
                return true;
            }
            Thread.sleep(1000);
        }
        return false;
    }
}
