package com.daaw;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.daaw.AbstractC4512fJ0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BU {
    public static final AU a;
    private static volatile Choreographer choreographer;

    static {
        Object objA;
        try {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(new C10161zU(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            objA = AbstractC4512fJ0.a(AbstractC4801gJ0.a(th));
        }
        a = (AU) (AbstractC4512fJ0.c(objA) ? null : objA);
    }

    public static final Handler a(Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        G10.e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) objInvoke;
    }

    public static final AU b(Handler handler, String str) {
        return new C10161zU(handler, str);
    }
}
