package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC0873Fm0 {

    /* JADX INFO: renamed from: com.daaw.Fm0$a */
    public static final class a {
        public static /* synthetic */ Object a(InterfaceC0873Fm0 interfaceC0873Fm0, Object obj, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return interfaceC0873Fm0.a(obj, interfaceC1416Ks);
        }

        public static /* synthetic */ boolean b(InterfaceC0873Fm0 interfaceC0873Fm0, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return interfaceC0873Fm0.b(obj);
        }

        public static /* synthetic */ void c(InterfaceC0873Fm0 interfaceC0873Fm0, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            interfaceC0873Fm0.c(obj);
        }
    }

    Object a(Object obj, InterfaceC1416Ks interfaceC1416Ks);

    boolean b(Object obj);

    void c(Object obj);
}
