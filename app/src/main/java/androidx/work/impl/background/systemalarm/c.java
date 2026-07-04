package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import com.daaw.AbstractC1772Od0;
import com.daaw.AbstractC4900gg1;
import com.daaw.C1793Oi1;
import com.daaw.C2441Ui1;
import com.daaw.C7431pi1;
import com.daaw.InterfaceC7152oi1;
import com.daaw.InterfaceC8997vI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements InterfaceC7152oi1, InterfaceC8997vI, C2441Ui1.b {
    public static final String K = AbstractC1772Od0.f("DelayMetCommandHandler");
    public final Context B;
    public final int C;
    public final String D;
    public final d E;
    public final C7431pi1 F;
    public PowerManager.WakeLock I;
    public boolean J = false;
    public int H = 0;
    public final Object G = new Object();

    public c(Context context, int i, String str, d dVar) {
        this.B = context;
        this.C = i;
        this.E = dVar;
        this.D = str;
        this.F = new C7431pi1(context, dVar.f(), this);
    }

    @Override // com.daaw.C2441Ui1.b
    public void a(String str) {
        AbstractC1772Od0.c().a(K, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        g();
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void b(List list) {
        g();
    }

    @Override // com.daaw.InterfaceC8997vI
    public void c(String str, boolean z) {
        AbstractC1772Od0.c().a(K, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        d();
        if (z) {
            Intent intentF = a.f(this.B, this.D);
            d dVar = this.E;
            dVar.k(new d.b(dVar, intentF, this.C));
        }
        if (this.J) {
            Intent intentA = a.a(this.B);
            d dVar2 = this.E;
            dVar2.k(new d.b(dVar2, intentA, this.C));
        }
    }

    public final void d() {
        synchronized (this.G) {
            try {
                this.F.e();
                this.E.h().c(this.D);
                PowerManager.WakeLock wakeLock = this.I;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC1772Od0.c().a(K, String.format("Releasing wakelock %s for WorkSpec %s", this.I, this.D), new Throwable[0]);
                    this.I.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        this.I = AbstractC4900gg1.b(this.B, String.format("%s (%s)", this.D, Integer.valueOf(this.C)));
        AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
        String str = K;
        abstractC1772Od0C.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.I, this.D), new Throwable[0]);
        this.I.acquire();
        C1793Oi1 c1793Oi1M = this.E.g().o().B().m(this.D);
        if (c1793Oi1M == null) {
            g();
            return;
        }
        boolean zB = c1793Oi1M.b();
        this.J = zB;
        if (zB) {
            this.F.d(Collections.singletonList(c1793Oi1M));
        } else {
            AbstractC1772Od0.c().a(str, String.format("No constraints for %s", this.D), new Throwable[0]);
            f(Collections.singletonList(this.D));
        }
    }

    @Override // com.daaw.InterfaceC7152oi1
    public void f(List list) {
        if (list.contains(this.D)) {
            synchronized (this.G) {
                try {
                    if (this.H == 0) {
                        this.H = 1;
                        AbstractC1772Od0.c().a(K, String.format("onAllConstraintsMet for %s", this.D), new Throwable[0]);
                        if (this.E.e().j(this.D)) {
                            this.E.h().b(this.D, 600000L, this);
                        } else {
                            d();
                        }
                    } else {
                        AbstractC1772Od0.c().a(K, String.format("Already started work for %s", this.D), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.G) {
            try {
                if (this.H < 2) {
                    this.H = 2;
                    AbstractC1772Od0 abstractC1772Od0C = AbstractC1772Od0.c();
                    String str = K;
                    abstractC1772Od0C.a(str, String.format("Stopping work for WorkSpec %s", this.D), new Throwable[0]);
                    Intent intentG = a.g(this.B, this.D);
                    d dVar = this.E;
                    dVar.k(new d.b(dVar, intentG, this.C));
                    if (this.E.e().g(this.D)) {
                        AbstractC1772Od0.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.D), new Throwable[0]);
                        Intent intentF = a.f(this.B, this.D);
                        d dVar2 = this.E;
                        dVar2.k(new d.b(dVar2, intentF, this.C));
                    } else {
                        AbstractC1772Od0.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.D), new Throwable[0]);
                    }
                } else {
                    AbstractC1772Od0.c().a(K, String.format("Already stopped work for %s", this.D), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
