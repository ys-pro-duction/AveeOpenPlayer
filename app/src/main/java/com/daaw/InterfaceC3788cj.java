package com.daaw;

/* JADX INFO: renamed from: com.daaw.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC3788cj extends InterfaceC1416Ks {

    /* JADX INFO: renamed from: com.daaw.cj$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC3788cj interfaceC3788cj, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC3788cj.L(th);
        }
    }

    void C(AbstractC5801jt abstractC5801jt, Object obj);

    Object G(Object obj, Object obj2, NQ nq);

    void K(Object obj, NQ nq);

    boolean L(Throwable th);

    void M(Object obj);

    boolean o();

    void r(NQ nq);
}
