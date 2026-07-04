package com.daaw;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.Jn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1293Jn0 extends AbstractC4385er {
    public C1293Jn0(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(C4452f51.c(context, interfaceC8357t11).d());
    }

    @Override // com.daaw.AbstractC4385er
    public boolean b(C1793Oi1 c1793Oi1) {
        if (c1793Oi1.j.b() != EnumC1189In0.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && c1793Oi1.j.b() == EnumC1189In0.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // com.daaw.AbstractC4385er
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C0773En0 c0773En0) {
        return !c0773En0.a() || c0773En0.b();
    }
}
