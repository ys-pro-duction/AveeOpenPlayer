package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public interface LJ0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final BJ0 a(long j, boolean z) {
            return z ? ((double) AbstractC3530bn.g(j)) > 0.5d ? MJ0.b : MJ0.c : MJ0.d;
        }

        public final long b(long j, boolean z) {
            return (z || ((double) AbstractC3530bn.g(j)) >= 0.5d) ? j : C2559Vm.b.h();
        }
    }

    BJ0 a(InterfaceC5781jp interfaceC5781jp, int i);

    long b(InterfaceC5781jp interfaceC5781jp, int i);
}
