package com.daaw;

/* JADX INFO: renamed from: com.daaw.tR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8471tR2 extends AbstractC6798nR2 {
    public /* synthetic */ C8471tR2(AR2 ar2) {
        super(null);
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C7635qR2 a(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2) {
        C7635qR2 c7635qR22;
        synchronized (abstractC9873yR2) {
            try {
                c7635qR22 = abstractC9873yR2.C;
                if (c7635qR22 != c7635qR2) {
                    abstractC9873yR2.C = c7635qR2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7635qR22;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final C9594xR2 b(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2) {
        C9594xR2 c9594xR22;
        synchronized (abstractC9873yR2) {
            try {
                c9594xR22 = abstractC9873yR2.D;
                if (c9594xR22 != c9594xR2) {
                    abstractC9873yR2.D = c9594xR2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9594xR22;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void c(C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        c9594xR2.b = c9594xR22;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final void d(C9594xR2 c9594xR2, Thread thread) {
        c9594xR2.a = thread;
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean e(AbstractC9873yR2 abstractC9873yR2, C7635qR2 c7635qR2, C7635qR2 c7635qR22) {
        synchronized (abstractC9873yR2) {
            try {
                if (abstractC9873yR2.C != c7635qR2) {
                    return false;
                }
                abstractC9873yR2.C = c7635qR22;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean f(AbstractC9873yR2 abstractC9873yR2, Object obj, Object obj2) {
        synchronized (abstractC9873yR2) {
            try {
                if (abstractC9873yR2.B != obj) {
                    return false;
                }
                abstractC9873yR2.B = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.daaw.AbstractC6798nR2
    public final boolean g(AbstractC9873yR2 abstractC9873yR2, C9594xR2 c9594xR2, C9594xR2 c9594xR22) {
        synchronized (abstractC9873yR2) {
            try {
                if (abstractC9873yR2.D != c9594xR2) {
                    return false;
                }
                abstractC9873yR2.D = c9594xR22;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
