package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface FI0 {

    public static final class a {
        public static /* synthetic */ Collection a(FI0 fi0, C1651Mz c1651Mz, NQ nq, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i & 1) != 0) {
                c1651Mz = C1651Mz.o;
            }
            if ((i & 2) != 0) {
                nq = InterfaceC4346ej0.a.c();
            }
            return fi0.f(c1651Mz, nq);
        }
    }

    Collection f(C1651Mz c1651Mz, NQ nq);

    InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0);
}
