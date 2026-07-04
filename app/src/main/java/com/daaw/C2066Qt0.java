package com.daaw;

import com.daaw.X51;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Qt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2066Qt0 extends N implements InterfaceC5248hu0 {
    public static final a E = new a(null);
    public static final C2066Qt0 F = new C2066Qt0(X51.e.a(), 0);
    public final X51 C;
    public final int D;

    /* JADX INFO: renamed from: com.daaw.Qt0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C2066Qt0 a() {
            return C2066Qt0.F;
        }

        public a() {
        }
    }

    public C2066Qt0(X51 x51, int i) {
        G10.g(x51, "node");
        this.C = x51;
        this.D = i;
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.C.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // com.daaw.N
    public final Set d() {
        return m();
    }

    @Override // com.daaw.N
    public int f() {
        return this.D;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.C.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // com.daaw.InterfaceC5248hu0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C2276St0 builder() {
        return new C2276St0(this);
    }

    public final QY m() {
        return new C3287au0(this);
    }

    @Override // com.daaw.N
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public QY e() {
        return new C3844cu0(this);
    }

    public final X51 o() {
        return this.C;
    }

    @Override // com.daaw.N
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public JY g() {
        return new C4401eu0(this);
    }

    public C2066Qt0 r(Object obj, Object obj2) {
        X51.b bVarP = this.C.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new C2066Qt0(bVarP.a(), size() + bVarP.b());
    }

    public C2066Qt0 s(Object obj) {
        X51 x51Q = this.C.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.C == x51Q ? this : x51Q == null ? E.a() : new C2066Qt0(x51Q, size() - 1);
    }
}
