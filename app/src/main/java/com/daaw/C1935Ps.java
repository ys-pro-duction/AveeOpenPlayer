package com.daaw;

import android.os.OutcomeReceiver;
import com.daaw.AbstractC4512fJ0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.Ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1935Ps extends AtomicBoolean implements OutcomeReceiver {
    public final InterfaceC1416Ks B;

    public C1935Ps(InterfaceC1416Ks interfaceC1416Ks) {
        super(false);
        this.B = interfaceC1416Ks;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            InterfaceC1416Ks interfaceC1416Ks = this.B;
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(th)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.B.x(AbstractC4512fJ0.a(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
