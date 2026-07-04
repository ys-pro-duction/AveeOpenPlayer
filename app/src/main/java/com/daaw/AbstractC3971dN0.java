package com.daaw;

/* JADX INFO: renamed from: com.daaw.dN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3971dN0 {
    public static final InterfaceC3692cN0 a = a(a.B, b.B);

    /* JADX INFO: renamed from: com.daaw.dN0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4249eN0 interfaceC4249eN0, Object obj) {
            G10.g(interfaceC4249eN0, "$this$Saver");
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dN0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        public final Object invoke(Object obj) {
            G10.g(obj, "it");
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.dN0$c */
    public static final class c implements InterfaceC3692cN0 {
        public final /* synthetic */ InterfaceC3429bR a;
        public final /* synthetic */ NQ b;

        public c(InterfaceC3429bR interfaceC3429bR, NQ nq) {
            this.a = interfaceC3429bR;
            this.b = nq;
        }

        @Override // com.daaw.InterfaceC3692cN0
        public Object a(Object obj) {
            G10.g(obj, "value");
            return this.b.invoke(obj);
        }

        @Override // com.daaw.InterfaceC3692cN0
        public Object b(InterfaceC4249eN0 interfaceC4249eN0, Object obj) {
            G10.g(interfaceC4249eN0, "<this>");
            return this.a.invoke(interfaceC4249eN0, obj);
        }
    }

    public static final InterfaceC3692cN0 a(InterfaceC3429bR interfaceC3429bR, NQ nq) {
        G10.g(interfaceC3429bR, "save");
        G10.g(nq, "restore");
        return new c(interfaceC3429bR, nq);
    }

    public static final InterfaceC3692cN0 b() {
        return a;
    }
}
