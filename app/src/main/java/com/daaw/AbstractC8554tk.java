package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.daaw.tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8554tk {
    public static final void a(QE0 qe0, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = AbstractC7317pI.a("Channel was consumed, consumer had failed", th);
            }
        }
        qe0.j(cancellationExceptionA);
    }
}
