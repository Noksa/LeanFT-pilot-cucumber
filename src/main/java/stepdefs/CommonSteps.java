package stepdefs;

import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.wpf.Window;
import core.AppRepository;
import cucumber.api.java.*;
import cucumber.api.java.ru.*;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;

import java.net.URI;

public class CommonSteps {

    public CommonSteps() throws GeneralLeanFtException{}
    AppRepository appRepository = new AppRepository();
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





    @Дано("^Запустить приложение XmlGenerator$")
    public void открытьПриложениеXmlGenerator() throws Throwable {
        Reporter.startTest("Test app XmlGenerator");
        if (appRepository.MainWindow.exists(0)) appRepository.MainWindow.close();
        new ProcessBuilder("C:\\XmlGenerator.exe").start();
        Reporter.setReportTitle("Status Reporting");
    }

    @Когда("^открывается приложение XmlGenerator$")
    public void открываетсяПриложениеXmlGenerator() throws Throwable {
        if (appRepository.MainWindow.exists(60)) Reporter.reportEvent("App is opened", "", Status.Passed);
    }

    @Тогда("^пользователь закрывает его$")
    public void пользовательЗакрываетЕго() throws Throwable {
        appRepository.MainWindow.close();
    }

    @Тогда("^приложение XmlGenerator закрывается$")
    public void приложениеXmlGeneratorЗакрывается() throws Throwable {
        if (notExists(appRepository.MainWindow)) Reporter.reportEvent("App is closed", "", Status.Passed);
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
