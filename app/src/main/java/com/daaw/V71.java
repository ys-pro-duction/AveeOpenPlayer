package com.daaw;

import com.daaw.B60;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class V71 {
    public static Collection a(Object obj) {
        if ((obj instanceof InterfaceC9783y60) && !(obj instanceof InterfaceC10062z60)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof InterfaceC9783y60) && !(obj instanceof A60)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof InterfaceC9783y60) && !(obj instanceof B60)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return h(obj);
    }

    public static Set d(Object obj) {
        if ((obj instanceof InterfaceC9783y60) && !(obj instanceof K60)) {
            p(obj, "kotlin.collections.MutableSet");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i) {
        if (obj != null && !k(obj, i)) {
            p(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static Map h(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static Set i(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw o(e);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof InterfaceC7353pR) {
            return ((InterfaceC7353pR) obj).getArity();
        }
        if (obj instanceof LQ) {
            return 0;
        }
        if (obj instanceof NQ) {
            return 1;
        }
        if (obj instanceof InterfaceC3429bR) {
            return 2;
        }
        if (obj instanceof InterfaceC3986dR) {
            return 3;
        }
        if (obj instanceof InterfaceC4553fR) {
            return 4;
        }
        if (obj instanceof InterfaceC5111hR) {
            return 5;
        }
        if (obj instanceof InterfaceC5670jR) {
            return 6;
        }
        if (obj instanceof InterfaceC5949kR) {
            return 7;
        }
        if (obj instanceof InterfaceC6237lR) {
            return 8;
        }
        if (obj instanceof InterfaceC6516mR) {
            return 9;
        }
        if (obj instanceof MQ) {
            return 10;
        }
        if (obj instanceof OQ) {
            return 11;
        }
        if (obj instanceof PQ) {
            return 12;
        }
        if (obj instanceof QQ) {
            return 13;
        }
        if (obj instanceof RQ) {
            return 14;
        }
        if (obj instanceof SQ) {
            return 15;
        }
        if (obj instanceof TQ) {
            return 16;
        }
        if (obj instanceof UQ) {
            return 17;
        }
        if (obj instanceof VQ) {
            return 18;
        }
        if (obj instanceof WQ) {
            return 19;
        }
        if (obj instanceof YQ) {
            return 20;
        }
        if (obj instanceof ZQ) {
            return 21;
        }
        return obj instanceof InterfaceC3150aR ? 22 : -1;
    }

    public static boolean k(Object obj, int i) {
        return (obj instanceof InterfaceC5390iR) && j(obj) == i;
    }

    public static boolean l(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC9783y60) || (obj instanceof B60.a);
        }
        return false;
    }

    public static boolean m(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof InterfaceC9783y60) || (obj instanceof K60);
        }
        return false;
    }

    public static Throwable n(Throwable th) {
        return G10.m(th, V71.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        q((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
