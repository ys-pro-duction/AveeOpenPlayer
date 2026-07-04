package com.daaw;

import com.daaw.InterfaceC0543Ck;

/* JADX INFO: renamed from: com.daaw.pJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7322pJ0 implements InterfaceC0543Ck {
    public final String a;
    public final NQ b;
    public final String c;

    /* JADX INFO: renamed from: com.daaw.pJ0$a */
    public static final class a extends AbstractC7322pJ0 {
        public static final a d = new a();

        public a() {
            super("Boolean", C7043oJ0.B, null);
        }

        public static final I80 c(AbstractC8670u80 abstractC8670u80) {
            G10.g(abstractC8670u80, "<this>");
            YS0 ys0N = abstractC8670u80.n();
            G10.f(ys0N, "getBooleanType(...)");
            return ys0N;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pJ0$b */
    public static final class b extends AbstractC7322pJ0 {
        public static final b d = new b();

        public b() {
            super("Int", C7601qJ0.B, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I80 c(AbstractC8670u80 abstractC8670u80) {
            G10.g(abstractC8670u80, "<this>");
            YS0 ys0D = abstractC8670u80.D();
            G10.f(ys0D, "getIntType(...)");
            return ys0D;
        }
    }

    /* JADX INFO: renamed from: com.daaw.pJ0$c */
    public static final class c extends AbstractC7322pJ0 {
        public static final c d = new c();

        public c() {
            super("Unit", C7879rJ0.B, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I80 c(AbstractC8670u80 abstractC8670u80) {
            G10.g(abstractC8670u80, "<this>");
            YS0 ys0Z = abstractC8670u80.Z();
            G10.f(ys0Z, "getUnitType(...)");
            return ys0Z;
        }
    }

    public /* synthetic */ AbstractC7322pJ0(String str, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(str, nq);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String a(InterfaceC8468tR interfaceC8468tR) {
        return InterfaceC0543Ck.a.a(this, interfaceC8468tR);
    }

    @Override // com.daaw.InterfaceC0543Ck
    public boolean b(InterfaceC8468tR interfaceC8468tR) {
        G10.g(interfaceC8468tR, "functionDescriptor");
        return G10.c(interfaceC8468tR.getReturnType(), this.b.invoke(AbstractC8400tA.m(interfaceC8468tR)));
    }

    @Override // com.daaw.InterfaceC0543Ck
    public String getDescription() {
        return this.c;
    }

    public AbstractC7322pJ0(String str, NQ nq) {
        this.a = str;
        this.b = nq;
        this.c = "must return " + str;
    }
}
