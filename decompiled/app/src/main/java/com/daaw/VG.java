package com.daaw;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.daaw.InterfaceC2054Qq0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class VG implements Runnable {
    public static final String D = AbstractC1772Od0.f("EnqueueRunnable");
    public final C7988ri1 B;
    public final C2158Rq0 C = new C2158Rq0();

    public VG(C7988ri1 c7988ri1) {
        this.B = c7988ri1;
    }

    public static boolean b(C7988ri1 c7988ri1) {
        boolean zC = c(c7988ri1.g(), c7988ri1.f(), (String[]) C7988ri1.l(c7988ri1).toArray(new String[0]), c7988ri1.d(), c7988ri1.b());
        c7988ri1.k();
        return zC;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ef A[LOOP:5: B:124:0x01e9->B:126:0x01ef, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(com.daaw.C0537Ci1 r21, java.util.List r22, java.lang.String[] r23, java.lang.String r24, com.daaw.RI r25) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.VG.c(com.daaw.Ci1, java.util.List, java.lang.String[], java.lang.String, com.daaw.RI):boolean");
    }

    public static boolean e(C7988ri1 c7988ri1) {
        List<C7988ri1> listE = c7988ri1.e();
        boolean z = false;
        if (listE != null) {
            boolean zE = false;
            for (C7988ri1 c7988ri12 : listE) {
                if (c7988ri12.j()) {
                    AbstractC1772Od0.c().h(D, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", c7988ri12.c())), new Throwable[0]);
                } else {
                    zE |= e(c7988ri12);
                }
            }
            z = zE;
        }
        return b(c7988ri1) | z;
    }

    public static void g(C1793Oi1 c1793Oi1) {
        C6358lr c6358lr = c1793Oi1.j;
        String str = c1793Oi1.c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (c6358lr.f() || c6358lr.i()) {
            b.a aVar = new b.a();
            aVar.c(c1793Oi1.e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            c1793Oi1.c = ConstraintTrackingWorker.class.getName();
            c1793Oi1.e = aVar.a();
        }
    }

    public static boolean h(C0537Ci1 c0537Ci1, String str) {
        try {
            Class<?> cls = Class.forName(str);
            Iterator it = c0537Ci1.n().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((InterfaceC8732uN0) it.next()).getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase workDatabaseO = this.B.g().o();
        workDatabaseO.c();
        try {
            boolean zE = e(this.B);
            workDatabaseO.r();
            return zE;
        } finally {
            workDatabaseO.g();
        }
    }

    public InterfaceC2054Qq0 d() {
        return this.C;
    }

    public void f() {
        C0537Ci1 c0537Ci1G = this.B.g();
        AbstractC9855yN0.b(c0537Ci1G.i(), c0537Ci1G.o(), c0537Ci1G.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.B.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.B));
            }
            if (a()) {
                AbstractC3834cs0.a(this.B.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.C.a(InterfaceC2054Qq0.a);
        } catch (Throwable th) {
            this.C.a(new InterfaceC2054Qq0.b.a(th));
        }
    }
}
