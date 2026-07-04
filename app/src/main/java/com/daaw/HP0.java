package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public interface HP0 {

    public static final class a {
        public static /* synthetic */ boolean a(HP0 hp0, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return hp0.g(th);
        }
    }

    Object e(Object obj, InterfaceC1416Ks interfaceC1416Ks);

    boolean g(Throwable th);

    Object k(Object obj);
}
