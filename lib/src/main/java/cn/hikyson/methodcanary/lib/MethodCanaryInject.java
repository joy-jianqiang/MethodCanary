package cn.hikyson.methodcanary.lib;

import android.support.annotation.Keep;

@Keep
public class MethodCanaryInject {

    @Keep
    public static void onMethodEnter(final int accessFlag, final String className, final String methodName, final String desc) {
        MethodCanary.get().methodCanaryMethodRecord.onMethodEnter(accessFlag, className, methodName, desc);
    }

    @Keep
    public static void onMethodExit(final int accessFlag, final String className, final String methodName, final String desc) {
        MethodCanary.get().methodCanaryMethodRecord.onMethodExit(accessFlag, className, methodName, desc);
    }
}
