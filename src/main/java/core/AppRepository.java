package core;

import com.hp.lft.sdk.Desktop;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.wpf.Window;
import com.hp.lft.sdk.wpf.WindowDescription;
import com.sun.deploy.xml.GeneralEntity;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "XmlGenerator")
public class AppRepository {

    public static AppRepository appRepository;

    static {
        try {
            appRepository = new AppRepository();
        } catch (GeneralLeanFtException e) {
            e.printStackTrace();
        }
    }

    private AppRepository() throws GeneralLeanFtException {
    }


    @ElementTitle("Главное окно")
    public Window MainWindow = getMainWindow();

    private Window getMainWindow() throws GeneralLeanFtException {
        if (MainWindow == null) {
            MainWindow = Desktop.describe(Window.class, new WindowDescription.Builder()
                    .objectName("Генератор отчётностей")
                    .fullType("window")
                    .windowTitleRegExp("Генератор отчётностей").build());
        }
        return MainWindow;

    }

    // в этом случае поиск элемента будет осуществляться каждый раз.

//    private Window getMainWindow()  throws GeneralLeanFtException
//    {
//            return  Desktop.describe(Window.class, new WindowDescription.Builder()
//                    .objectName("Генератор отчётностей")
//                    .fullType("window")
//                    .windowTitleRegExp("Генератор отчётностей").build());
//
//    }
}
