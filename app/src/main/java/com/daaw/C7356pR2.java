package com.daaw;

/* JADX INFO: renamed from: com.daaw.pR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7356pR2 {
    public static final C7356pR2 b = new C7356pR2(new a("Failure occurred while trying to finish a future."));
    public final Throwable a;

    /* JADX INFO: renamed from: com.daaw.pR2$a */
    public class a extends Throwable {
        public a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public C7356pR2(Throwable th) {
        th.getClass();
        this.a = th;
    }
}
