package core.interfaces;

import com.hp.lft.sdk.*;

public interface IExtensions {

    default <T extends TestObject> boolean WaitUntil(T obj, ITestObj<T> iTestObj) throws GeneralLeanFtException {
        return iTestObj.test(obj);

    }

    default <T extends TestObject> boolean WaitUntil(T obj, ITestObj<T> iTestObj, int secs) throws GeneralLeanFtException, InterruptedException {
        boolean result;
        for (int i = 0; i <= secs; i++) {
            result = iTestObj.test(obj);
            if (result) return true;
            Thread.sleep(1000);
        }
        return false;
    }

    interface ITestObj<T> {
        boolean test(T obj) throws GeneralLeanFtException;
    }
}



