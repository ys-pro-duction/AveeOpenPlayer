package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.Fx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0917Fx0 {
    public static final int a = AbstractC7577qD0.b;
    public static final int b = AbstractC7577qD0.a;

    public static final void a(View view, InterfaceC1021Gx0 interfaceC1021Gx0) {
        G10.g(view, "<this>");
        G10.g(interfaceC1021Gx0, "listener");
        d(view).a(interfaceC1021Gx0);
    }

    public static final void b(View view) {
        G10.g(view, "<this>");
        Iterator it = AbstractC6007ke1.a(view).iterator();
        while (it.hasNext()) {
            d((View) it.next()).b();
        }
    }

    public static final void c(ViewGroup viewGroup) {
        G10.g(viewGroup, "<this>");
        Iterator it = AbstractC4044de1.a(viewGroup).iterator();
        while (it.hasNext()) {
            d((View) it.next()).b();
        }
    }

    public static final C1125Hx0 d(View view) {
        int i = a;
        C1125Hx0 c1125Hx0 = (C1125Hx0) view.getTag(i);
        if (c1125Hx0 != null) {
            return c1125Hx0;
        }
        C1125Hx0 c1125Hx02 = new C1125Hx0();
        view.setTag(i, c1125Hx02);
        return c1125Hx02;
    }

    public static final boolean e(View view) {
        G10.g(view, "<this>");
        Object tag = view.getTag(b);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(View view) {
        G10.g(view, "<this>");
        for (Object obj : AbstractC6007ke1.b(view)) {
            if ((obj instanceof View) && e((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void g(View view, InterfaceC1021Gx0 interfaceC1021Gx0) {
        G10.g(view, "<this>");
        G10.g(interfaceC1021Gx0, "listener");
        d(view).c(interfaceC1021Gx0);
    }

    public static final void h(View view, boolean z) {
        G10.g(view, "<this>");
        view.setTag(b, Boolean.valueOf(z));
    }
}
