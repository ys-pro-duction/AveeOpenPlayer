package com.daaw;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.Dn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0669Dn0 extends AbstractC4385er {
    public static final String e = AbstractC1772Od0.f("NetworkNotRoamingCtrlr");

    public C0669Dn0(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(C4452f51.c(context, interfaceC8357t11).d());
    }

    @Override // com.daaw.AbstractC4385er
    public boolean b(C1793Oi1 c1793Oi1) {
        return c1793Oi1.j.b() == EnumC1189In0.NOT_ROAMING;
    }

    @Override // com.daaw.AbstractC4385er
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C0773En0 c0773En0) {
        if (Build.VERSION.SDK_INT >= 24) {
            return (c0773En0.a() && c0773En0.c()) ? false : true;
        }
        AbstractC1772Od0.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !c0773En0.a();
    }
}
