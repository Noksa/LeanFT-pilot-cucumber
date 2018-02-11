package stepdefs;

import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import com.hp.lft.sdk.*;
import core.AppRepository;
import core.interfaces.IExtensions;
import cucumber.api.java.*;
import cucumber.api.java.ru.*;

import java.net.URI;

public class CommonSteps implements IExtensions {

    public AppRepository appRepository = AppRepository.appRepository;
    private int timing = 60;

    @Before
    public void test() throws Exception {
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        Reporter.init();
    }

    @After
    public void clean() throws Exception {
        Reporter.generateReport();
        SDK.cleanup();
    }


    @Дано("^Запустить приложение XmlGenerator$")
    public void StartApp() throws Throwable {
        Reporter.startTest("Test app XmlGenerator");
        if (WaitUntil(appRepository.MainWindow, w -> w.exists(0))) appRepository.MainWindow.close();
        new ProcessBuilder("C:\\XmlGenerator.exe").start();
        Reporter.setReportTitle("Status Reporting");
    }

    @Когда("^открывается приложение XmlGenerator$")
    public void WaitUntilAppIsOpened() throws Throwable {
        WaitUntil(appRepository.MainWindow, w -> w.exists(timing));
    }

    @Тогда("^пользователь закрывает его$")
    public void CloseApp() throws Throwable {
        appRepository.MainWindow.close();
    }

    @Тогда("^приложение XmlGenerator закрывается$")
    public void WaitUntilAppIsClosed() throws Throwable {
        WaitUntil(appRepository.MainWindow, w -> w.exists(timing));
    }


//    public <T extends TestObject> boolean WaitUntil(T obj, Predicate<T> predicate) throws GeneralLeanFtException
//    {
//        return predicate.test(obj);
//    }
//
//    public <T extends TestObject> boolean WaitUntil(T obj, Predicate<T> predicate, long secs) throws GeneralLeanFtException
//    {
//        for (int i = 0; i <= secs; i++) {
//            if (predicate.test(obj)) return true;
//        }
//        return false;
//    }

}
