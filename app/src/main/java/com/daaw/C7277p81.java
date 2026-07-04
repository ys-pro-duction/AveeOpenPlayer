package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.p81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7277p81 implements InterfaceC7550q70 {
    public static final a F = new a(null);
    public final InterfaceC5580j60 B;
    public final List C;
    public final InterfaceC7550q70 D;
    public final int E;

    /* JADX INFO: renamed from: com.daaw.p81$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.p81$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[D70.values().length];
            try {
                iArr[D70.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[D70.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[D70.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.daaw.p81$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public c() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(B70 b70) {
            G10.g(b70, "it");
            return C7277p81.this.e(b70);
        }
    }

    public C7277p81(InterfaceC5580j60 interfaceC5580j60, List list, InterfaceC7550q70 interfaceC7550q70, int i) {
        G10.g(interfaceC5580j60, "classifier");
        G10.g(list, "arguments");
        this.B = interfaceC5580j60;
        this.C = list;
        this.D = interfaceC7550q70;
        this.E = i;
    }

    @Override // com.daaw.InterfaceC7550q70
    public List c() {
        return this.C;
    }

    public final String e(B70 b70) {
        String strValueOf;
        if (b70.d() == null) {
            return "*";
        }
        InterfaceC7550q70 interfaceC7550q70C = b70.c();
        C7277p81 c7277p81 = interfaceC7550q70C instanceof C7277p81 ? (C7277p81) interfaceC7550q70C : null;
        if (c7277p81 == null || (strValueOf = c7277p81.m(true)) == null) {
            strValueOf = String.valueOf(b70.c());
        }
        int i = b.a[b70.d().ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in " + strValueOf;
        }
        if (i != 3) {
            throw new C6902no0();
        }
        return "out " + strValueOf;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7277p81)) {
            return false;
        }
        C7277p81 c7277p81 = (C7277p81) obj;
        return G10.c(j(), c7277p81.j()) && G10.c(c(), c7277p81.c()) && G10.c(this.D, c7277p81.D) && this.E == c7277p81.E;
    }

    public int hashCode() {
        return (((j().hashCode() * 31) + c().hashCode()) * 31) + this.E;
    }

    @Override // com.daaw.InterfaceC7550q70
    public InterfaceC5580j60 j() {
        return this.B;
    }

    public final String m(boolean z) {
        String name;
        InterfaceC5580j60 interfaceC5580j60J = j();
        J50 j50 = interfaceC5580j60J instanceof J50 ? (J50) interfaceC5580j60J : null;
        Class clsB = j50 != null ? X40.b(j50) : null;
        if (clsB == null) {
            name = j().toString();
        } else if ((this.E & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = o(clsB);
        } else if (z && clsB.isPrimitive()) {
            InterfaceC5580j60 interfaceC5580j60J2 = j();
            G10.e(interfaceC5580j60J2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = X40.c((J50) interfaceC5580j60J2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (c().isEmpty() ? "" : AbstractC2455Um.n0(c(), ", ", "<", ">", 0, null, new c(), 24, null)) + (p() ? "?" : "");
        InterfaceC7550q70 interfaceC7550q70 = this.D;
        if (!(interfaceC7550q70 instanceof C7277p81)) {
            return str;
        }
        String strM = ((C7277p81) interfaceC7550q70).m(true);
        if (G10.c(strM, str)) {
            return str;
        }
        if (G10.c(strM, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strM + ')';
    }

    public final String o(Class cls) {
        return G10.c(cls, boolean[].class) ? "kotlin.BooleanArray" : G10.c(cls, char[].class) ? "kotlin.CharArray" : G10.c(cls, byte[].class) ? "kotlin.ByteArray" : G10.c(cls, short[].class) ? "kotlin.ShortArray" : G10.c(cls, int[].class) ? "kotlin.IntArray" : G10.c(cls, float[].class) ? "kotlin.FloatArray" : G10.c(cls, long[].class) ? "kotlin.LongArray" : G10.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean p() {
        return (this.E & 1) != 0;
    }

    public String toString() {
        return m(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7277p81(InterfaceC5580j60 interfaceC5580j60, List list, boolean z) {
        this(interfaceC5580j60, list, null, z ? 1 : 0);
        G10.g(interfaceC5580j60, "classifier");
        G10.g(list, "arguments");
    }
}
