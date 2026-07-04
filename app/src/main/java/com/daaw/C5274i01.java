package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.i01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5274i01 implements InterfaceC8732uN0 {
    public static final String C = AbstractC1772Od0.f("SystemAlarmScheduler");
    public final Context B;

    public C5274i01(Context context) {
        this.B = context.getApplicationContext();
    }

    @Override // com.daaw.InterfaceC8732uN0
    public boolean a() {
        return true;
    }

    public final void b(C1793Oi1 c1793Oi1) {
        AbstractC1772Od0.c().a(C, String.format("Scheduling work with workSpecId %s", c1793Oi1.a), new Throwable[0]);
        this.B.startService(androidx.work.impl.background.systemalarm.a.f(this.B, c1793Oi1.a));
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void d(String str) {
        this.B.startService(androidx.work.impl.background.systemalarm.a.g(this.B, str));
    }

    @Override // com.daaw.InterfaceC8732uN0
    public void e(C1793Oi1... c1793Oi1Arr) {
        for (C1793Oi1 c1793Oi1 : c1793Oi1Arr) {
            b(c1793Oi1);
        }
    }
}
