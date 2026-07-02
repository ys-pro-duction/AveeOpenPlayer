package com.daaw;

/* JADX INFO: renamed from: com.daaw.mX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6541mX0 extends Exception {
    public final C6262lX0 B;
    public final C2756Xj0 C;
    public final boolean D;

    public C6541mX0(C6262lX0 c6262lX0) {
        this(c6262lX0, null);
    }

    public final C6262lX0 a() {
        return this.B;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.D ? super.fillInStackTrace() : this;
    }

    public C6541mX0(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
        this(c6262lX0, c2756Xj0, true);
    }

    public C6541mX0(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0, boolean z) {
        super(C6262lX0.g(c6262lX0), c6262lX0.l());
        this.B = c6262lX0;
        this.C = c2756Xj0;
        this.D = z;
        fillInStackTrace();
    }
}
