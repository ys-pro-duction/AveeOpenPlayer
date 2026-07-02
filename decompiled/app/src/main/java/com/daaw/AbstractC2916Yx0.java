package com.daaw;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: com.daaw.Yx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2916Yx0 {
    public static final C0746Eg1 a = new C0746Eg1();
    public static final C0850Fg1 b = new C0850Fg1();
    public static final C0850Fg1 c = new C0850Fg1();
    public static final C0850Fg1 d = new C0850Fg1();
    public static final C0746Eg1 e = new C0746Eg1();
    public static Drawable f = null;

    public static Drawable a() {
        Context contextI;
        if (((Boolean) a.a(Boolean.FALSE)).booleanValue()) {
            return null;
        }
        if (f == null && (contextI = com.daaw.avee.a.i()) != null) {
            f = AbstractC9438ws.e(contextI, AbstractC3374bD0.g);
        }
        return f;
    }
}
