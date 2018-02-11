package stepdefs;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.Verify;
import core.AppRepository;
import core.interfaces.IExtensions;
import cucumber.api.java.*;
import cucumber.api.java.ru.*;

import java.net.URI;

public class CommonSteps implements IExtensions {

    protected AppRepository appRepository = AppRepository.appRepository;
    private int timing = 60;

    @Before
    public void test() throws Exception {
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        Reporter.init();
    }

    @After
    public void clean() throws ReportException {
        Reporter.generateReport();
        SDK.cleanup();
    }


    @Дано("^Запустить приложение XmlGenerator$")
    public void StartApp() throws Throwable {
        Reporter.startTest("Test app XmlGenerator");
        if (appRepository.MainWindow.exists(0)) appRepository.MainWindow.close();
        new ProcessBuilder("C:\\XmlGenerator.exe").start();
        Reporter.setReportTitle("Status Reporting");
    }

    @Когда("^открывается приложение XmlGenerator$")
    public void WaitUntilAppIsOpened() throws Throwable {
        boolean result;
        result = WaitUntil(appRepository.MainWindow, w -> w.exists(timing));
        Verify.isTrue(result, "Приложение XmlGenerator открыто.");
    }

    @Тогда("^пользователь закрывает его$")
    public void CloseApp() throws Throwable {
        appRepository.MainWindow.close();
        Verify.isTrue(WaitUntil(appRepository.MainWindow, w -> !w.exists(0), timing), "Приложение XmlGenerator закрыто.");
    }
}
