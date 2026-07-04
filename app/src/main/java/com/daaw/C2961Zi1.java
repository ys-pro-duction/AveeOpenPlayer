package com.daaw;

import android.view.View;
import androidx.lifecycle.g;
import com.daaw.C6423m5;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Zi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2961Zi1 implements InterfaceC1196Ip, androidx.lifecycle.j {
    public final C6423m5 B;
    public final InterfaceC1196Ip C;
    public boolean D;
    public androidx.lifecycle.g E;
    public InterfaceC3429bR F;

    /* JADX INFO: renamed from: com.daaw.Zi1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC3429bR C;

        /* JADX INFO: renamed from: com.daaw.Zi1$a$a, reason: collision with other inner class name */
        public static final class C0145a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ C2961Zi1 B;
            public final /* synthetic */ InterfaceC3429bR C;

            /* JADX INFO: renamed from: com.daaw.Zi1$a$a$a, reason: collision with other inner class name */
            public static final class C0146a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ C2961Zi1 G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0146a(C2961Zi1 c2961Zi1, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = c2961Zi1;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new C0146a(this.G, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        C6423m5 c6423m5Z = this.G.z();
                        this.F = 1;
                        if (c6423m5Z.W(this) == objC) {
                            return objC;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4801gJ0.b(obj);
                    }
                    return G91.a;
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0146a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.Zi1$a$a$b */
            public static final class b extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ C2961Zi1 G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C2961Zi1 c2961Zi1, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = c2961Zi1;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new b(this.G, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        C6423m5 c6423m5Z = this.G.z();
                        this.F = 1;
                        if (c6423m5Z.F(this) == objC) {
                            return objC;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4801gJ0.b(obj);
                    }
                    return G91.a;
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.Zi1$a$a$c */
            public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
                public final /* synthetic */ C2961Zi1 B;
                public final /* synthetic */ InterfaceC3429bR C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C2961Zi1 c2961Zi1, InterfaceC3429bR interfaceC3429bR) {
                    super(2);
                    this.B = c2961Zi1;
                    this.C = interfaceC3429bR;
                }

                public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                    if ((i & 11) == 2 && interfaceC5781jp.t()) {
                        interfaceC5781jp.B();
                    } else {
                        B5.a(this.B.z(), this.C, interfaceC5781jp, 8);
                    }
                }

                @Override // com.daaw.InterfaceC3429bR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0145a(C2961Zi1 c2961Zi1, InterfaceC3429bR interfaceC3429bR) {
                super(2);
                this.B = c2961Zi1;
                this.C = interfaceC3429bR;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                Object tag = this.B.z().getTag(AbstractC6740nD0.K);
                Set set = V71.m(tag) ? (Set) tag : null;
                if (set == null) {
                    Object parent = this.B.z().getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    Object tag2 = view != null ? view.getTag(AbstractC6740nD0.K) : null;
                    set = V71.m(tag2) ? (Set) tag2 : null;
                }
                if (set != null) {
                    set.add(interfaceC5781jp.m());
                    interfaceC5781jp.a();
                }
                AbstractC8420tF.c(this.B.z(), new C0146a(this.B, null), interfaceC5781jp, 8);
                AbstractC8420tF.c(this.B.z(), new b(this.B, null), interfaceC5781jp, 8);
                AbstractC2153Rp.a(new C7011oB0[]{AbstractC5832k00.a().c(set)}, AbstractC1815Oo.b(interfaceC5781jp, -1193460702, true, new c(this.B, this.C)), interfaceC5781jp, 56);
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.C = interfaceC3429bR;
        }

        public final void a(C6423m5.b bVar) {
            G10.g(bVar, "it");
            if (C2961Zi1.this.D) {
                return;
            }
            androidx.lifecycle.g gVarW = bVar.a().w();
            G10.f(gVarW, "it.lifecycleOwner.lifecycle");
            C2961Zi1.this.F = this.C;
            if (C2961Zi1.this.E == null) {
                C2961Zi1.this.E = gVarW;
                gVarW.a(C2961Zi1.this);
            } else if (gVarW.b().c(g.b.CREATED)) {
                C2961Zi1.this.y().o(AbstractC1815Oo.c(-2000640158, true, new C0145a(C2961Zi1.this, this.C)));
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6423m5.b) obj);
            return G91.a;
        }
    }

    public C2961Zi1(C6423m5 c6423m5, InterfaceC1196Ip interfaceC1196Ip) {
        G10.g(c6423m5, "owner");
        G10.g(interfaceC1196Ip, "original");
        this.B = c6423m5;
        this.C = interfaceC1196Ip;
        this.F = C3261ap.a.a();
    }

    @Override // com.daaw.InterfaceC1196Ip
    public void a() {
        if (!this.D) {
            this.D = true;
            this.B.getView().setTag(AbstractC6740nD0.L, null);
            androidx.lifecycle.g gVar = this.E;
            if (gVar != null) {
                gVar.d(this);
            }
        }
        this.C.a();
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_DESTROY) {
            a();
        } else {
            if (aVar != g.a.ON_CREATE || this.D) {
                return;
            }
            o(this.F);
        }
    }

    @Override // com.daaw.InterfaceC1196Ip
    public boolean f() {
        return this.C.f();
    }

    @Override // com.daaw.InterfaceC1196Ip
    public boolean n() {
        return this.C.n();
    }

    @Override // com.daaw.InterfaceC1196Ip
    public void o(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "content");
        this.B.setOnViewTreeOwnersAvailable(new a(interfaceC3429bR));
    }

    public final InterfaceC1196Ip y() {
        return this.C;
    }

    public final C6423m5 z() {
        return this.B;
    }
}
