package com.daaw;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.mj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6599mj1 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static final InterfaceC1196Ip a(E90 e90, AbstractC1300Jp abstractC1300Jp) {
        G10.g(e90, "container");
        G10.g(abstractC1300Jp, "parent");
        return AbstractC1819Op.a(new C7839r91(e90), abstractC1300Jp);
    }

    public static final InterfaceC1196Ip b(C6423m5 c6423m5, AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        if (d(c6423m5)) {
            c6423m5.setTag(AbstractC6740nD0.K, Collections.newSetFromMap(new WeakHashMap()));
            c();
        }
        InterfaceC1196Ip interfaceC1196IpA = AbstractC1819Op.a(new C7839r91(c6423m5.getRoot()), abstractC1300Jp);
        Object tag = c6423m5.getView().getTag(AbstractC6740nD0.L);
        C2961Zi1 c2961Zi1 = tag instanceof C2961Zi1 ? (C2961Zi1) tag : null;
        if (c2961Zi1 == null) {
            c2961Zi1 = new C2961Zi1(c6423m5, interfaceC1196IpA);
            c6423m5.getView().setTag(AbstractC6740nD0.L, c2961Zi1);
        }
        c2961Zi1.o(interfaceC3429bR);
        return c2961Zi1;
    }

    public static final void c() {
        if (AbstractC5550j00.c()) {
            return;
        }
        try {
            Field declaredField = AbstractC5550j00.class.getDeclaredField("isDebugInspectorInfoEnabled");
            declaredField.setAccessible(true);
            declaredField.setBoolean(null, true);
        } catch (Exception unused) {
        }
    }

    public static final boolean d(C6423m5 c6423m5) {
        return Build.VERSION.SDK_INT >= 29 && !C6032kj1.a.a(c6423m5).isEmpty();
    }

    public static final InterfaceC1196Ip e(androidx.compose.ui.platform.a aVar, AbstractC1300Jp abstractC1300Jp, InterfaceC3429bR interfaceC3429bR) {
        G10.g(aVar, "<this>");
        G10.g(abstractC1300Jp, "parent");
        G10.g(interfaceC3429bR, "content");
        C7361pT.a.a();
        C6423m5 c6423m5 = null;
        if (aVar.getChildCount() > 0) {
            View childAt = aVar.getChildAt(0);
            if (childAt instanceof C6423m5) {
                c6423m5 = (C6423m5) childAt;
            }
        } else {
            aVar.removeAllViews();
        }
        if (c6423m5 == null) {
            Context context = aVar.getContext();
            G10.f(context, "context");
            c6423m5 = new C6423m5(context);
            aVar.addView(c6423m5.getView(), a);
        }
        return b(c6423m5, abstractC1300Jp, interfaceC3429bR);
    }
}
