package com.daaw;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: com.daaw.tX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC8493tX0 implements Runnable {
    public static final String E = AbstractC1772Od0.f("StopWorkRunnable");
    public final C0537Ci1 B;
    public final String C;
    public final boolean D;

    public RunnableC8493tX0(C0537Ci1 c0537Ci1, String str, boolean z) {
        this.B = c0537Ci1;
        this.C = str;
        this.D = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zO;
        WorkDatabase workDatabaseO = this.B.o();
        C0925Fz0 c0925Fz0M = this.B.m();
        InterfaceC1897Pi1 interfaceC1897Pi1B = workDatabaseO.B();
        workDatabaseO.c();
        try {
            boolean zH = c0925Fz0M.h(this.C);
            if (this.D) {
                zO = this.B.m().n(this.C);
            } else {
                if (!zH && interfaceC1897Pi1B.l(this.C) == EnumC9111vi1.RUNNING) {
                    interfaceC1897Pi1B.k(EnumC9111vi1.ENQUEUED, this.C);
                }
                zO = this.B.m().o(this.C);
            }
            AbstractC1772Od0.c().a(E, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.C, Boolean.valueOf(zO)), new Throwable[0]);
            workDatabaseO.r();
            workDatabaseO.g();
        } catch (Throwable th) {
            workDatabaseO.g();
            throw th;
        }
    }
}
