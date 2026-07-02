package com.daaw;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.daaw.Al1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0341Al1 extends AbstractC7725ql1 {
    public final C7521q11 b;

    public AbstractC0341Al1(int i, C7521q11 c7521q11) {
        super(i);
        this.b = c7521q11;
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void a(Status status) {
        this.b.d(new E8(status));
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void b(Exception exc) {
        this.b.d(exc);
    }

    @Override // com.daaw.AbstractC2349Tl1
    public final void c(C4646fl1 c4646fl1) throws DeadObjectException {
        try {
            h(c4646fl1);
        } catch (DeadObjectException e) {
            a(AbstractC2349Tl1.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(AbstractC2349Tl1.e(e2));
        } catch (RuntimeException e3) {
            this.b.d(e3);
        }
    }

    public abstract void h(C4646fl1 c4646fl1);
}
