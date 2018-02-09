package stepdefs;

import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.stdwin.Window;
import com.hp.lft.sdk.stdwin.WindowDescription;
import core.CalcRep;
import cucumber.api.PendingException;
import cucumber.api.java.*;
import cucumber.api.java.ru.*;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;

import java.net.URI;

public class CommonSteps {

    public CalcRep repository;
    Aut calc;
    @Before
    public void test() throws Exception{
        ModifiableSDKConfiguration config = new ModifiableSDKConfiguration();
        config.setServerAddress(new URI("ws://localhost:5095"));
        SDK.init(config);
        //Reporter.init();
        repository = new CalcRep();
    }

    @After
    public void clean() throws Exception{
        //Reporter.generateReport();
        SDK.cleanup();
    }
    @ActionTitle("открывается приложение")
    public void opensApp() throws  Exception {

    }

    @Дано("^Открыть приложение Калькулятор$")
    public void openCalc() throws Exception {
         new ProcessBuilder("c:\\Windows\\System32\\calc.exe").start();
    }

    @Когда("^открывается приложение Калькулятор$")
    public void openingCalc() throws GeneralLeanFtException {
        if (repository.Window().exists()) repository.Window().activate();
    }

    @Тогда("^пользователь складывает \"([^\"]*)\" и \"([^\"]*)\"$")
    public void пользовательСкладываетИ(String arg0, String arg1) throws Throwable {

    }
}
