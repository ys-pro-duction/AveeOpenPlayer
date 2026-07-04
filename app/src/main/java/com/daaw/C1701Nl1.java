package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.Nl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1701Nl1 extends AbstractC7725ql1 {
    public final AbstractC7242p11 b;
    public final C7521q11 c;
    public final InterfaceC6820nX0 d;

    public C1701Nl1(int i, AbstractC7242p11 abstractC7242p11, C7521q11 c7521q11, InterfaceC6820nX0 interfaceC6820nX0) {
        super(i);
        this.c = c7521q11;
        this.b = abstractC7242p11;
        this.d = interfaceC6820nX0;
        if (i == 2 && abstractC7242p11.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void a(Status status) {
        this.c.d(this.d.a(status));
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void b(Exception exc) {
        this.c.d(exc);
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void c(C4646fl1 c4646fl1) throws DeadObjectException {
        try {
            this.b.b(c4646fl1.s(), this.c);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(AbstractC2349Tl1.e(e2));
        } catch (RuntimeException e3) {
            this.c.d(e3);
        }
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void d(C2241Sk1 c2241Sk1, boolean z) {
        c2241Sk1.b(this.c, z);
    }

    @Override // com.daaw.AbstractC7725ql1
    public final boolean f(C4646fl1 c4646fl1) {
        return this.b.c();
    }

    @Override // com.daaw.AbstractC7725ql1
    public final Feature[] g(C4646fl1 c4646fl1) {
        return this.b.e();
    }
}
