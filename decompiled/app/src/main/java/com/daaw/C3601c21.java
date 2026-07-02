package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.c21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3601c21 {
    public static final c d = new c(null);
    public static final InterfaceC3692cN0 e = AbstractC3971dN0.a(a.B, b.B);
    public final D7 a;
    public final long b;
    public final G21 c;

    /* JADX INFO: renamed from: com.daaw.c21$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4249eN0 interfaceC4249eN0, C3601c21 c3601c21) {
            G10.g(interfaceC4249eN0, "$this$Saver");
            G10.g(c3601c21, "it");
            return AbstractC1599Mm.g(AbstractC4528fN0.t(c3601c21.a(), AbstractC4528fN0.d(), interfaceC4249eN0), AbstractC4528fN0.t(G21.b(c3601c21.b()), AbstractC4528fN0.p(G21.b), interfaceC4249eN0));
        }
    }

    /* JADX INFO: renamed from: com.daaw.c21$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3601c21 invoke(Object obj) {
            G10.g(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            InterfaceC3692cN0 interfaceC3692cN0D = AbstractC4528fN0.d();
            Boolean bool = Boolean.FALSE;
            G21 g21 = null;
            D7 d7 = (G10.c(obj2, bool) || obj2 == null) ? null : (D7) interfaceC3692cN0D.a(obj2);
            G10.d(d7);
            Object obj3 = list.get(1);
            InterfaceC3692cN0 interfaceC3692cN0P = AbstractC4528fN0.p(G21.b);
            if (!G10.c(obj3, bool) && obj3 != null) {
                g21 = (G21) interfaceC3692cN0P.a(obj3);
            }
            G10.d(g21);
            return new C3601c21(d7, g21.m(), (G21) null, 4, (AbstractC2911Yw) null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.c21$c */
    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public c() {
        }
    }

    public /* synthetic */ C3601c21(D7 d7, long j, G21 g21, AbstractC2911Yw abstractC2911Yw) {
        this(d7, j, g21);
    }

    public final D7 a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.a.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3601c21)) {
            return false;
        }
        C3601c21 c3601c21 = (C3601c21) obj;
        return G21.e(this.b, c3601c21.b) && G10.c(this.c, c3601c21.c) && G10.c(this.a, c3601c21.a);
    }

    public int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) + G21.k(this.b)) * 31;
        G21 g21 = this.c;
        return iHashCode + (g21 != null ? G21.k(g21.m()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) G21.l(this.b)) + ", composition=" + this.c + ')';
    }

    public /* synthetic */ C3601c21(String str, long j, G21 g21, AbstractC2911Yw abstractC2911Yw) {
        this(str, j, g21);
    }

    public C3601c21(D7 d7, long j, G21 g21) {
        this.a = d7;
        this.b = H21.c(j, 0, c().length());
        this.c = g21 != null ? G21.b(H21.c(g21.m(), 0, c().length())) : null;
    }

    public /* synthetic */ C3601c21(D7 d7, long j, G21 g21, int i, AbstractC2911Yw abstractC2911Yw) {
        this(d7, (i & 2) != 0 ? G21.b.a() : j, (i & 4) != 0 ? null : g21, (AbstractC2911Yw) null);
    }

    public /* synthetic */ C3601c21(String str, long j, G21 g21, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? G21.b.a() : j, (i & 4) != 0 ? null : g21, (AbstractC2911Yw) null);
    }

    public C3601c21(String str, long j, G21 g21) {
        this(new D7(str, null, null, 6, null), j, g21, (AbstractC2911Yw) null);
    }
}
