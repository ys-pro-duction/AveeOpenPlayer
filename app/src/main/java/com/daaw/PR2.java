package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class PR2 extends MR2 {
    public /* synthetic */ PR2(OR2 or2) {
        super(null);
    }

    @Override // com.daaw.MR2
    public final int a(QR2 qr2) {
        int i;
        synchronized (qr2) {
            i = qr2.J - 1;
            qr2.J = i;
        }
        return i;
    }

    @Override // com.daaw.MR2
    public final void b(QR2 qr2, Set set, Set set2) {
        synchronized (qr2) {
            try {
                if (qr2.I == null) {
                    qr2.I = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
