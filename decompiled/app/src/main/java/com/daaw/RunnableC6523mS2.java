package com.daaw;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.daaw.mS2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC6523mS2 implements Runnable {
    public final Future B;
    public final InterfaceC6244lS2 C;

    public RunnableC6523mS2(Future future, InterfaceC6244lS2 interfaceC6244lS2) {
        this.B = future;
        this.C = interfaceC6244lS2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thA;
        Object obj = this.B;
        if ((obj instanceof AbstractC5122hT2) && (thA = AbstractC5401iT2.a((AbstractC5122hT2) obj)) != null) {
            this.C.b(thA);
            return;
        }
        try {
            this.C.a(AbstractC7360pS2.p(this.B));
        } catch (Error e) {
            e = e;
            this.C.b(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.C.b(e);
        } catch (ExecutionException e3) {
            this.C.b(e3.getCause());
        }
    }

    public final String toString() {
        C3420bO2 c3420bO2A = AbstractC3698cO2.a(this);
        c3420bO2A.a(this.C);
        return c3420bO2A.toString();
    }
}
