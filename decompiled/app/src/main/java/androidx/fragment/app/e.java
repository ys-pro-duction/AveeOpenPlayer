package androidx.fragment.app;

import androidx.fragment.app.c;
import com.daaw.BS0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final BS0 a = new BS0();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return c.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        BS0 bs0 = a;
        BS0 bs02 = (BS0) bs0.get(classLoader);
        if (bs02 == null) {
            bs02 = new BS0();
            bs0.put(classLoader, bs02);
        }
        Class cls = (Class) bs02.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        bs02.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e) {
            throw new c.h("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new c.h("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    public abstract c a(ClassLoader classLoader, String str);
}
