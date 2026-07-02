package com.daaw;

/* JADX INFO: renamed from: com.daaw.je0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5727je0 {

    /* JADX INFO: renamed from: com.daaw.je0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ W11 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W11 w11) {
            super(1);
            this.B = w11;
        }

        public final void a(long j) {
            this.B.b(j);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C9982yp0) obj).t());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.je0$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ W11 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(W11 w11) {
            super(0);
            this.B = w11;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m51invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m51invoke() {
            this.B.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.je0$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ W11 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(W11 w11) {
            super(0);
            this.B = w11;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m52invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m52invoke() {
            this.B.c();
        }
    }

    /* JADX INFO: renamed from: com.daaw.je0$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ W11 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(W11 w11) {
            super(2);
            this.B = w11;
        }

        public final void a(C7223ox0 c7223ox0, long j) {
            G10.g(c7223ox0, "<anonymous parameter 0>");
            this.B.d(j);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7223ox0) obj, ((C9982yp0) obj2).t());
            return G91.a;
        }
    }

    public static final Object a(InterfaceC9740xx0 interfaceC9740xx0, W11 w11, InterfaceC1416Ks interfaceC1416Ks) {
        Object objG = AbstractC8133sD.g(interfaceC9740xx0, new a(w11), new b(w11), new c(w11), new d(w11), interfaceC1416Ks);
        return objG == I10.c() ? objG : G91.a;
    }
}
