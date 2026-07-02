package com.daaw;

import java.util.ArrayDeque;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.x71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9510x71 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final InterfaceC9515x81 d;
    public final Y0 e;
    public final Z0 f;
    public int g;
    public boolean h;
    public ArrayDeque i;
    public Set j;

    /* JADX INFO: renamed from: com.daaw.x71$a */
    public interface a {

        /* JADX INFO: renamed from: com.daaw.x71$a$a, reason: collision with other inner class name */
        public static final class C0251a implements a {
            public boolean a;

            @Override // com.daaw.C9510x71.a
            public void a(LQ lq) {
                G10.g(lq, "block");
                if (this.a) {
                    return;
                }
                this.a = ((Boolean) lq.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.a;
            }
        }

        void a(LQ lq);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.daaw.x71$b */
    public static final class b {
        public static final b B = new b("CHECK_ONLY_LOWER", 0);
        public static final b C = new b("CHECK_SUBTYPE_AND_LOWER", 1);
        public static final b D = new b("SKIP_LOWER", 2);
        public static final /* synthetic */ b[] E;
        public static final /* synthetic */ YG F;

        static {
            b[] bVarArrA = a();
            E = bVarArrA;
            F = AbstractC3110aH.a(bVarArrA);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{B, C, D};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) E.clone();
        }
    }

    /* JADX INFO: renamed from: com.daaw.x71$c */
    public static abstract class c {

        /* JADX INFO: renamed from: com.daaw.x71$c$a */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.daaw.x71$c$b */
        public static final class b extends c {
            public static final b a = new b();

            public b() {
                super(null);
            }

            @Override // com.daaw.C9510x71.c
            public InterfaceC3159aT0 a(C9510x71 c9510x71, O80 o80) {
                G10.g(c9510x71, "state");
                G10.g(o80, "type");
                return c9510x71.j().A0(o80);
            }
        }

        /* JADX INFO: renamed from: com.daaw.x71$c$c, reason: collision with other inner class name */
        public static final class C0252c extends c {
            public static final C0252c a = new C0252c();

            public C0252c() {
                super(null);
            }

            @Override // com.daaw.C9510x71.c
            public /* bridge */ /* synthetic */ InterfaceC3159aT0 a(C9510x71 c9510x71, O80 o80) {
                return (InterfaceC3159aT0) b(c9510x71, o80);
            }

            public Void b(C9510x71 c9510x71, O80 o80) {
                G10.g(c9510x71, "state");
                G10.g(o80, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: com.daaw.x71$c$d */
        public static final class d extends c {
            public static final d a = new d();

            public d() {
                super(null);
            }

            @Override // com.daaw.C9510x71.c
            public InterfaceC3159aT0 a(C9510x71 c9510x71, O80 o80) {
                G10.g(c9510x71, "state");
                G10.g(o80, "type");
                return c9510x71.j().y(o80);
            }
        }

        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public abstract InterfaceC3159aT0 a(C9510x71 c9510x71, O80 o80);

        public c() {
        }
    }

    public C9510x71(boolean z, boolean z2, boolean z3, InterfaceC9515x81 interfaceC9515x81, Y0 y0, Z0 z0) {
        G10.g(interfaceC9515x81, "typeSystemContext");
        G10.g(y0, "kotlinTypePreparator");
        G10.g(z0, "kotlinTypeRefiner");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = interfaceC9515x81;
        this.e = y0;
        this.f = z0;
    }

    public static /* synthetic */ Boolean d(C9510x71 c9510x71, O80 o80, O80 o802, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return c9510x71.c(o80, o802, z);
    }

    public Boolean c(O80 o80, O80 o802, boolean z) {
        G10.g(o80, "subType");
        G10.g(o802, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.i;
        G10.d(arrayDeque);
        arrayDeque.clear();
        Set set = this.j;
        G10.d(set);
        set.clear();
        this.h = false;
    }

    public boolean f(O80 o80, O80 o802) {
        G10.g(o80, "subType");
        G10.g(o802, "superType");
        return true;
    }

    public b g(InterfaceC3159aT0 interfaceC3159aT0, InterfaceC1068Hj interfaceC1068Hj) {
        G10.g(interfaceC3159aT0, "subType");
        G10.g(interfaceC1068Hj, "superType");
        return b.C;
    }

    public final ArrayDeque h() {
        return this.i;
    }

    public final Set i() {
        return this.j;
    }

    public final InterfaceC9515x81 j() {
        return this.d;
    }

    public final void k() {
        this.h = true;
        if (this.i == null) {
            this.i = new ArrayDeque(4);
        }
        if (this.j == null) {
            this.j = VT0.D.a();
        }
    }

    public final boolean l(O80 o80) {
        G10.g(o80, "type");
        return this.c && this.d.D(o80);
    }

    public final boolean m() {
        return this.a;
    }

    public final boolean n() {
        return this.b;
    }

    public final O80 o(O80 o80) {
        G10.g(o80, "type");
        return this.e.a(o80);
    }

    public final O80 p(O80 o80) {
        G10.g(o80, "type");
        return this.f.a(o80);
    }

    public boolean q(NQ nq) {
        G10.g(nq, "block");
        a.C0251a c0251a = new a.C0251a();
        nq.invoke(c0251a);
        return c0251a.b();
    }
}
