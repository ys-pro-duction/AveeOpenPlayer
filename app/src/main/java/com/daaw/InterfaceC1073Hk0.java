package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1073Hk0 {
    public static final a m = a.B;

    /* JADX INFO: renamed from: com.daaw.Hk0$a */
    public static final class a implements InterfaceC1073Hk0 {
        public static final /* synthetic */ a B = new a();

        @Override // com.daaw.InterfaceC1073Hk0
        public boolean I(NQ nq) {
            G10.g(nq, "predicate");
            return true;
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "operation");
            return obj;
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
            G10.g(interfaceC1073Hk0, "other");
            return interfaceC1073Hk0;
        }

        public String toString() {
            return "Modifier";
        }

        @Override // com.daaw.InterfaceC1073Hk0
        public Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "operation");
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hk0$b */
    public interface b extends InterfaceC1073Hk0 {
    }

    boolean I(NQ nq);

    Object f(Object obj, InterfaceC3429bR interfaceC3429bR);

    InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0);

    Object x(Object obj, InterfaceC3429bR interfaceC3429bR);
}
