package core.interfaces;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.TestObject;

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

    interface ITestObj<T extends TestObject> {
        boolean test(T obj) throws GeneralLeanFtException;
    }
}



