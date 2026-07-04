package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC6315li1;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.p50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7261p50 {
    public static final AbstractC5674jS.f a;
    public static final AbstractC5674jS.f b;
    public static final AbstractC5674jS.f c;
    public static final AbstractC5674jS.f d;
    public static final AbstractC5674jS.f e;
    public static final AbstractC5674jS.f f;
    public static final AbstractC5674jS.f g;
    public static final AbstractC5674jS.f h;
    public static final AbstractC5674jS.f i;
    public static final AbstractC5674jS.f j;
    public static final AbstractC5674jS.f k;
    public static final AbstractC5674jS.f l;
    public static final AbstractC5674jS.f m;
    public static final AbstractC5674jS.f n;

    /* JADX INFO: renamed from: com.daaw.p50$e */
    public static final class e extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final e I;
        public static InterfaceC2792Xs0 J = new a();
        public final AbstractC4629fi C;
        public List D;
        public List E;
        public int F;
        public byte G;
        public int H;

        /* JADX INFO: renamed from: com.daaw.p50$e$a */
        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public e c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new e(c9687xm, c6763nJ);
            }
        }

        static {
            e eVar = new e(true);
            I = eVar;
            eVar.C();
        }

        private void C() {
            List list = Collections.EMPTY_LIST;
            this.D = list;
            this.E = list;
        }

        public static b D() {
            return b.p();
        }

        public static b E(e eVar) {
            return D().j(eVar);
        }

        public static e G(InputStream inputStream, C6763nJ c6763nJ) {
            return (e) J.a(inputStream, c6763nJ);
        }

        public static e z() {
            return I;
        }

        public List A() {
            return this.E;
        }

        public List B() {
            return this.D;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public b d() {
            return D();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b f() {
            return E(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.H;
            if (i != -1) {
                return i;
            }
            int iR = 0;
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                iR += C0343Am.r(1, (InterfaceC2026Qj0) this.D.get(i2));
            }
            int iP = 0;
            for (int i3 = 0; i3 < this.E.size(); i3++) {
                iP += C0343Am.p(((Integer) this.E.get(i3)).intValue());
            }
            int iP2 = iR + iP;
            if (!A().isEmpty()) {
                iP2 = iP2 + 1 + C0343Am.p(iP);
            }
            this.F = iP;
            int size = iP2 + this.C.size();
            this.H = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b2 = this.G;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.G = (byte) 1;
            return true;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            for (int i = 0; i < this.D.size(); i++) {
                c0343Am.c0(1, (InterfaceC2026Qj0) this.D.get(i));
            }
            if (A().size() > 0) {
                c0343Am.n0(42);
                c0343Am.n0(this.F);
            }
            for (int i2 = 0; i2 < this.E.size(); i2++) {
                c0343Am.a0(((Integer) this.E.get(i2)).intValue());
            }
            c0343Am.h0(this.C);
        }

        /* JADX INFO: renamed from: com.daaw.p50$e$c */
        public static final class c extends AbstractC5674jS implements InterfaceC2130Rj0 {
            public static final c O;
            public static InterfaceC2792Xs0 P = new a();
            public final AbstractC4629fi C;
            public int D;
            public int E;
            public int F;
            public Object G;
            public EnumC0222c H;
            public List I;
            public int J;
            public List K;
            public int L;
            public byte M;
            public int N;

            /* JADX INFO: renamed from: com.daaw.p50$e$c$a */
            public static class a extends Z {
                @Override // com.daaw.InterfaceC2792Xs0
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public c c(C9687xm c9687xm, C6763nJ c6763nJ) {
                    return new c(c9687xm, c6763nJ);
                }
            }

            /* JADX INFO: renamed from: com.daaw.p50$e$c$c, reason: collision with other inner class name */
            public enum EnumC0222c implements AbstractC3595c10.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                public static AbstractC3595c10.b F = new a();
                public final int B;

                /* JADX INFO: renamed from: com.daaw.p50$e$c$c$a */
                public static class a implements AbstractC3595c10.b {
                    @Override // com.daaw.AbstractC3595c10.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC0222c a(int i) {
                        return EnumC0222c.a(i);
                    }
                }

                EnumC0222c(int i, int i2) {
                    this.B = i2;
                }

                public static EnumC0222c a(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // com.daaw.AbstractC3595c10.a
                public final int b() {
                    return this.B;
                }
            }

            static {
                c cVar = new c(true);
                O = cVar;
                cVar.U();
            }

            public static c F() {
                return O;
            }

            private void U() {
                this.E = 1;
                this.F = 0;
                this.G = "";
                this.H = EnumC0222c.NONE;
                List list = Collections.EMPTY_LIST;
                this.I = list;
                this.K = list;
            }

            public static b V() {
                return b.p();
            }

            public static b W(c cVar) {
                return V().j(cVar);
            }

            public EnumC0222c G() {
                return this.H;
            }

            public int H() {
                return this.F;
            }

            public int I() {
                return this.E;
            }

            public int J() {
                return this.K.size();
            }

            public List K() {
                return this.K;
            }

            public String L() {
                Object obj = this.G;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC4629fi abstractC4629fi = (AbstractC4629fi) obj;
                String strM = abstractC4629fi.M();
                if (abstractC4629fi.F()) {
                    this.G = strM;
                }
                return strM;
            }

            public AbstractC4629fi M() {
                Object obj = this.G;
                if (!(obj instanceof String)) {
                    return (AbstractC4629fi) obj;
                }
                AbstractC4629fi abstractC4629fiV = AbstractC4629fi.v((String) obj);
                this.G = abstractC4629fiV;
                return abstractC4629fiV;
            }

            public int O() {
                return this.I.size();
            }

            public List P() {
                return this.I;
            }

            public boolean Q() {
                return (this.D & 8) == 8;
            }

            public boolean R() {
                return (this.D & 2) == 2;
            }

            public boolean S() {
                return (this.D & 1) == 1;
            }

            public boolean T() {
                return (this.D & 4) == 4;
            }

            @Override // com.daaw.InterfaceC2026Qj0
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public b d() {
                return V();
            }

            @Override // com.daaw.InterfaceC2026Qj0
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public b f() {
                return W(this);
            }

            @Override // com.daaw.InterfaceC2026Qj0
            public int c() {
                int i = this.N;
                if (i != -1) {
                    return i;
                }
                int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
                if ((this.D & 2) == 2) {
                    iO += C0343Am.o(2, this.F);
                }
                if ((this.D & 8) == 8) {
                    iO += C0343Am.h(3, this.H.b());
                }
                int iP = 0;
                for (int i2 = 0; i2 < this.I.size(); i2++) {
                    iP += C0343Am.p(((Integer) this.I.get(i2)).intValue());
                }
                int iP2 = iO + iP;
                if (!P().isEmpty()) {
                    iP2 = iP2 + 1 + C0343Am.p(iP);
                }
                this.J = iP;
                int iP3 = 0;
                for (int i3 = 0; i3 < this.K.size(); i3++) {
                    iP3 += C0343Am.p(((Integer) this.K.get(i3)).intValue());
                }
                int iD = iP2 + iP3;
                if (!K().isEmpty()) {
                    iD = iD + 1 + C0343Am.p(iP3);
                }
                this.L = iP3;
                if ((this.D & 4) == 4) {
                    iD += C0343Am.d(6, M());
                }
                int size = iD + this.C.size();
                this.N = size;
                return size;
            }

            @Override // com.daaw.InterfaceC2130Rj0
            public final boolean e() {
                byte b2 = this.M;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.M = (byte) 1;
                return true;
            }

            @Override // com.daaw.InterfaceC2026Qj0
            public void g(C0343Am c0343Am) throws IOException {
                c();
                if ((this.D & 1) == 1) {
                    c0343Am.Z(1, this.E);
                }
                if ((this.D & 2) == 2) {
                    c0343Am.Z(2, this.F);
                }
                if ((this.D & 8) == 8) {
                    c0343Am.R(3, this.H.b());
                }
                if (P().size() > 0) {
                    c0343Am.n0(34);
                    c0343Am.n0(this.J);
                }
                for (int i = 0; i < this.I.size(); i++) {
                    c0343Am.a0(((Integer) this.I.get(i)).intValue());
                }
                if (K().size() > 0) {
                    c0343Am.n0(42);
                    c0343Am.n0(this.L);
                }
                for (int i2 = 0; i2 < this.K.size(); i2++) {
                    c0343Am.a0(((Integer) this.K.get(i2)).intValue());
                }
                if ((this.D & 4) == 4) {
                    c0343Am.N(6, M());
                }
                c0343Am.h0(this.C);
            }

            public c(AbstractC5674jS.b bVar) {
                super(bVar);
                this.J = -1;
                this.L = -1;
                this.M = (byte) -1;
                this.N = -1;
                this.C = bVar.i();
            }

            public c(boolean z) {
                this.J = -1;
                this.L = -1;
                this.M = (byte) -1;
                this.N = -1;
                this.C = AbstractC4629fi.B;
            }

            public c(C9687xm c9687xm, C6763nJ c6763nJ) {
                this.J = -1;
                this.L = -1;
                this.M = (byte) -1;
                this.N = -1;
                U();
                AbstractC4629fi.b bVarG = AbstractC4629fi.G();
                C0343Am c0343AmI = C0343Am.I(bVarG, 1);
                boolean z = false;
                int i = 0;
                while (!z) {
                    try {
                        try {
                            try {
                                int iJ = c9687xm.J();
                                if (iJ != 0) {
                                    if (iJ == 8) {
                                        this.D |= 1;
                                        this.E = c9687xm.r();
                                    } else if (iJ == 16) {
                                        this.D |= 2;
                                        this.F = c9687xm.r();
                                    } else if (iJ == 24) {
                                        int iM = c9687xm.m();
                                        EnumC0222c enumC0222cA = EnumC0222c.a(iM);
                                        if (enumC0222cA == null) {
                                            c0343AmI.n0(iJ);
                                            c0343AmI.n0(iM);
                                        } else {
                                            this.D |= 8;
                                            this.H = enumC0222cA;
                                        }
                                    } else if (iJ == 32) {
                                        if ((i & 16) != 16) {
                                            this.I = new ArrayList();
                                            i |= 16;
                                        }
                                        this.I.add(Integer.valueOf(c9687xm.r()));
                                    } else if (iJ == 34) {
                                        int i2 = c9687xm.i(c9687xm.z());
                                        if ((i & 16) != 16 && c9687xm.e() > 0) {
                                            this.I = new ArrayList();
                                            i |= 16;
                                        }
                                        while (c9687xm.e() > 0) {
                                            this.I.add(Integer.valueOf(c9687xm.r()));
                                        }
                                        c9687xm.h(i2);
                                    } else if (iJ == 40) {
                                        if ((i & 32) != 32) {
                                            this.K = new ArrayList();
                                            i |= 32;
                                        }
                                        this.K.add(Integer.valueOf(c9687xm.r()));
                                    } else if (iJ == 42) {
                                        int i3 = c9687xm.i(c9687xm.z());
                                        if ((i & 32) != 32 && c9687xm.e() > 0) {
                                            this.K = new ArrayList();
                                            i |= 32;
                                        }
                                        while (c9687xm.e() > 0) {
                                            this.K.add(Integer.valueOf(c9687xm.r()));
                                        }
                                        c9687xm.h(i3);
                                    } else if (iJ != 50) {
                                        if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                        }
                                    } else {
                                        AbstractC4629fi abstractC4629fiK = c9687xm.k();
                                        this.D |= 4;
                                        this.G = abstractC4629fiK;
                                    }
                                }
                                z = true;
                            } catch (IOException e) {
                                throw new Q10(e.getMessage()).i(this);
                            }
                        } catch (Q10 e2) {
                            throw e2.i(this);
                        }
                    } catch (Throwable th) {
                        if ((i & 16) == 16) {
                            this.I = DesugarCollections.unmodifiableList(this.I);
                        }
                        if ((i & 32) == 32) {
                            this.K = DesugarCollections.unmodifiableList(this.K);
                        }
                        try {
                            c0343AmI.H();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.C = bVarG.l();
                            throw th2;
                        }
                        this.C = bVarG.l();
                        n();
                        throw th;
                    }
                }
                if ((i & 16) == 16) {
                    this.I = DesugarCollections.unmodifiableList(this.I);
                }
                if ((i & 32) == 32) {
                    this.K = DesugarCollections.unmodifiableList(this.K);
                }
                try {
                    c0343AmI.H();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.C = bVarG.l();
                    throw th3;
                }
                this.C = bVarG.l();
                n();
            }

            /* JADX INFO: renamed from: com.daaw.p50$e$c$b */
            public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
                public int C;
                public int E;
                public List H;
                public List I;
                public int D = 1;
                public Object F = "";
                public EnumC0222c G = EnumC0222c.NONE;

                public b() {
                    List list = Collections.EMPTY_LIST;
                    this.H = list;
                    this.I = list;
                    t();
                }

                public static b p() {
                    return new b();
                }

                @Override // com.daaw.InterfaceC2026Qj0.a
                /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
                public c a() {
                    c cVarN = n();
                    if (cVarN.e()) {
                        return cVarN;
                    }
                    throw S.a.h(cVarN);
                }

                public c n() {
                    c cVar = new c(this);
                    int i = this.C;
                    int i2 = (i & 1) != 1 ? 0 : 1;
                    cVar.E = this.D;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.F = this.E;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.G = this.F;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.H = this.G;
                    if ((this.C & 16) == 16) {
                        this.H = DesugarCollections.unmodifiableList(this.H);
                        this.C &= -17;
                    }
                    cVar.I = this.H;
                    if ((this.C & 32) == 32) {
                        this.I = DesugarCollections.unmodifiableList(this.I);
                        this.C &= -33;
                    }
                    cVar.K = this.I;
                    cVar.D = i2;
                    return cVar;
                }

                /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
                public b clone() {
                    return p().j(n());
                }

                public final void q() {
                    if ((this.C & 32) != 32) {
                        this.I = new ArrayList(this.I);
                        this.C |= 32;
                    }
                }

                public final void r() {
                    if ((this.C & 16) != 16) {
                        this.H = new ArrayList(this.H);
                        this.C |= 16;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // com.daaw.InterfaceC2026Qj0.a
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public com.daaw.AbstractC7261p50.e.c.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        com.daaw.Xs0 r1 = com.daaw.AbstractC7261p50.e.c.P     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                        com.daaw.p50$e$c r3 = (com.daaw.AbstractC7261p50.e.c) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                        if (r3 == 0) goto Le
                        r2.j(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        com.daaw.p50$e$c r4 = (com.daaw.AbstractC7261p50.e.c) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.j(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7261p50.e.c.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.p50$e$c$b");
                }

                @Override // com.daaw.AbstractC5674jS.b
                /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
                public b j(c cVar) {
                    if (cVar == c.F()) {
                        return this;
                    }
                    if (cVar.S()) {
                        y(cVar.I());
                    }
                    if (cVar.R()) {
                        x(cVar.H());
                    }
                    if (cVar.T()) {
                        this.C |= 4;
                        this.F = cVar.G;
                    }
                    if (cVar.Q()) {
                        w(cVar.G());
                    }
                    if (!cVar.I.isEmpty()) {
                        if (this.H.isEmpty()) {
                            this.H = cVar.I;
                            this.C &= -17;
                        } else {
                            r();
                            this.H.addAll(cVar.I);
                        }
                    }
                    if (!cVar.K.isEmpty()) {
                        if (this.I.isEmpty()) {
                            this.I = cVar.K;
                            this.C &= -33;
                        } else {
                            q();
                            this.I.addAll(cVar.K);
                        }
                    }
                    k(i().m(cVar.C));
                    return this;
                }

                public b w(EnumC0222c enumC0222c) {
                    enumC0222c.getClass();
                    this.C |= 8;
                    this.G = enumC0222c;
                    return this;
                }

                public b x(int i) {
                    this.C |= 2;
                    this.E = i;
                    return this;
                }

                public b y(int i) {
                    this.C |= 1;
                    this.D = i;
                    return this;
                }

                private void t() {
                }
            }
        }

        public e(AbstractC5674jS.b bVar) {
            super(bVar);
            this.F = -1;
            this.G = (byte) -1;
            this.H = -1;
            this.C = bVar.i();
        }

        public e(boolean z) {
            this.F = -1;
            this.G = (byte) -1;
            this.H = -1;
            this.C = AbstractC4629fi.B;
        }

        public e(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.F = -1;
            this.G = (byte) -1;
            this.H = -1;
            C();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i & 1) != 1) {
                                    this.D = new ArrayList();
                                    i |= 1;
                                }
                                this.D.add(c9687xm.t(c.P, c6763nJ));
                            } else if (iJ == 40) {
                                if ((i & 2) != 2) {
                                    this.E = new ArrayList();
                                    i |= 2;
                                }
                                this.E.add(Integer.valueOf(c9687xm.r()));
                            } else if (iJ != 42) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                int i2 = c9687xm.i(c9687xm.z());
                                if ((i & 2) != 2 && c9687xm.e() > 0) {
                                    this.E = new ArrayList();
                                    i |= 2;
                                }
                                while (c9687xm.e() > 0) {
                                    this.E.add(Integer.valueOf(c9687xm.r()));
                                }
                                c9687xm.h(i2);
                            }
                        }
                        z = true;
                    } catch (Q10 e) {
                        throw e.i(this);
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.D = DesugarCollections.unmodifiableList(this.D);
                    }
                    if ((i & 2) == 2) {
                        this.E = DesugarCollections.unmodifiableList(this.E);
                    }
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            if ((i & 1) == 1) {
                this.D = DesugarCollections.unmodifiableList(this.D);
            }
            if ((i & 2) == 2) {
                this.E = DesugarCollections.unmodifiableList(this.E);
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        /* JADX INFO: renamed from: com.daaw.p50$e$b */
        public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public List D;
            public List E;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.D = list;
                this.E = list;
                t();
            }

            public static b p() {
                return new b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public e a() {
                e eVarN = n();
                if (eVarN.e()) {
                    return eVarN;
                }
                throw S.a.h(eVarN);
            }

            public e n() {
                e eVar = new e(this);
                if ((this.C & 1) == 1) {
                    this.D = DesugarCollections.unmodifiableList(this.D);
                    this.C &= -2;
                }
                eVar.D = this.D;
                if ((this.C & 2) == 2) {
                    this.E = DesugarCollections.unmodifiableList(this.E);
                    this.C &= -3;
                }
                eVar.E = this.E;
                return eVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            public final void q() {
                if ((this.C & 2) != 2) {
                    this.E = new ArrayList(this.E);
                    this.C |= 2;
                }
            }

            public final void r() {
                if ((this.C & 1) != 1) {
                    this.D = new ArrayList(this.D);
                    this.C |= 1;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.AbstractC7261p50.e.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.AbstractC7261p50.e.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.p50$e r3 = (com.daaw.AbstractC7261p50.e) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.daaw.p50$e r4 = (com.daaw.AbstractC7261p50.e) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7261p50.e.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.p50$e$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b j(e eVar) {
                if (eVar == e.z()) {
                    return this;
                }
                if (!eVar.D.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = eVar.D;
                        this.C &= -2;
                    } else {
                        r();
                        this.D.addAll(eVar.D);
                    }
                }
                if (!eVar.E.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = eVar.E;
                        this.C &= -3;
                    } else {
                        q();
                        this.E.addAll(eVar.E);
                    }
                }
                k(i().m(eVar.C));
                return this;
            }

            private void t() {
            }
        }
    }

    static {
        C9524xA0 c9524xA0K = C9524xA0.K();
        c cVarY = c.y();
        c cVarY2 = c.y();
        AbstractC6315li1.b bVar = AbstractC6315li1.b.N;
        a = AbstractC5674jS.q(c9524xA0K, cVarY, cVarY2, null, 100, bVar, c.class);
        b = AbstractC5674jS.q(CA0.e0(), c.y(), c.y(), null, 100, bVar, c.class);
        CA0 ca0E0 = CA0.e0();
        AbstractC6315li1.b bVar2 = AbstractC6315li1.b.H;
        c = AbstractC5674jS.q(ca0E0, 0, null, null, 101, bVar2, Integer.class);
        d = AbstractC5674jS.q(HA0.c0(), d.B(), d.B(), null, 100, bVar, d.class);
        e = AbstractC5674jS.q(HA0.c0(), 0, null, null, 101, bVar2, Integer.class);
        f = AbstractC5674jS.o(KA0.b0(), C8966vA0.C(), null, 100, bVar, false, C8966vA0.class);
        g = AbstractC5674jS.q(KA0.b0(), Boolean.FALSE, null, null, 101, AbstractC6315li1.b.K, Boolean.class);
        h = AbstractC5674jS.o(MA0.O(), C8966vA0.C(), null, 100, bVar, false, C8966vA0.class);
        i = AbstractC5674jS.q(C9245wA0.C0(), 0, null, null, 101, bVar2, Integer.class);
        j = AbstractC5674jS.o(C9245wA0.C0(), HA0.c0(), null, 102, bVar, false, HA0.class);
        k = AbstractC5674jS.q(C9245wA0.C0(), 0, null, null, 103, bVar2, Integer.class);
        l = AbstractC5674jS.q(C9245wA0.C0(), 0, null, null, 104, bVar2, Integer.class);
        m = AbstractC5674jS.q(FA0.O(), 0, null, null, 101, bVar2, Integer.class);
        n = AbstractC5674jS.o(FA0.O(), HA0.c0(), null, 102, bVar, false, HA0.class);
    }

    public static void a(C6763nJ c6763nJ) {
        c6763nJ.a(a);
        c6763nJ.a(b);
        c6763nJ.a(c);
        c6763nJ.a(d);
        c6763nJ.a(e);
        c6763nJ.a(f);
        c6763nJ.a(g);
        c6763nJ.a(h);
        c6763nJ.a(i);
        c6763nJ.a(j);
        c6763nJ.a(k);
        c6763nJ.a(l);
        c6763nJ.a(m);
        c6763nJ.a(n);
    }

    /* JADX INFO: renamed from: com.daaw.p50$b */
    public static final class b extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final b I;
        public static InterfaceC2792Xs0 J = new a();
        public final AbstractC4629fi C;
        public int D;
        public int E;
        public int F;
        public byte G;
        public int H;

        /* JADX INFO: renamed from: com.daaw.p50$b$a */
        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new b(c9687xm, c6763nJ);
            }
        }

        static {
            b bVar = new b(true);
            I = bVar;
            bVar.D();
        }

        private void D() {
            this.E = 0;
            this.F = 0;
        }

        public static C0221b E() {
            return C0221b.p();
        }

        public static C0221b F(b bVar) {
            return E().j(bVar);
        }

        public static b y() {
            return I;
        }

        public int A() {
            return this.E;
        }

        public boolean B() {
            return (this.D & 2) == 2;
        }

        public boolean C() {
            return (this.D & 1) == 1;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public C0221b d() {
            return E();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public C0221b f() {
            return F(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.H;
            if (i != -1) {
                return i;
            }
            int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
            if ((this.D & 2) == 2) {
                iO += C0343Am.o(2, this.F);
            }
            int size = iO + this.C.size();
            this.H = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b = this.G;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.G = (byte) 1;
            return true;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.Z(1, this.E);
            }
            if ((this.D & 2) == 2) {
                c0343Am.Z(2, this.F);
            }
            c0343Am.h0(this.C);
        }

        public int z() {
            return this.F;
        }

        public b(AbstractC5674jS.b bVar) {
            super(bVar);
            this.G = (byte) -1;
            this.H = -1;
            this.C = bVar.i();
        }

        public b(boolean z) {
            this.G = (byte) -1;
            this.H = -1;
            this.C = AbstractC4629fi.B;
        }

        public b(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.G = (byte) -1;
            this.H = -1;
            D();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.D |= 1;
                                this.E = c9687xm.r();
                            } else if (iJ != 16) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                this.D |= 2;
                                this.F = c9687xm.r();
                            }
                        }
                        z = true;
                    } catch (Q10 e) {
                        throw e.i(this);
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        /* JADX INFO: renamed from: com.daaw.p50$b$b, reason: collision with other inner class name */
        public static final class C0221b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public int D;
            public int E;

            public C0221b() {
                q();
            }

            public static C0221b p() {
                return new C0221b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b a() {
                b bVarN = n();
                if (bVarN.e()) {
                    return bVarN;
                }
                throw S.a.h(bVarN);
            }

            public b n() {
                b bVar = new b(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.F = this.E;
                bVar.D = i2;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0221b clone() {
                return p().j(n());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.AbstractC7261p50.b.C0221b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.AbstractC7261p50.b.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.p50$b r3 = (com.daaw.AbstractC7261p50.b) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.daaw.p50$b r4 = (com.daaw.AbstractC7261p50.b) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7261p50.b.C0221b.N(com.daaw.xm, com.daaw.nJ):com.daaw.p50$b$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0221b j(b bVar) {
                if (bVar == b.y()) {
                    return this;
                }
                if (bVar.C()) {
                    v(bVar.A());
                }
                if (bVar.B()) {
                    u(bVar.z());
                }
                k(i().m(bVar.C));
                return this;
            }

            public C0221b u(int i) {
                this.C |= 2;
                this.E = i;
                return this;
            }

            public C0221b v(int i) {
                this.C |= 1;
                this.D = i;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.p50$c */
    public static final class c extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final c I;
        public static InterfaceC2792Xs0 J = new a();
        public final AbstractC4629fi C;
        public int D;
        public int E;
        public int F;
        public byte G;
        public int H;

        /* JADX INFO: renamed from: com.daaw.p50$c$a */
        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public c c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new c(c9687xm, c6763nJ);
            }
        }

        static {
            c cVar = new c(true);
            I = cVar;
            cVar.D();
        }

        private void D() {
            this.E = 0;
            this.F = 0;
        }

        public static b E() {
            return b.p();
        }

        public static b F(c cVar) {
            return E().j(cVar);
        }

        public static c y() {
            return I;
        }

        public int A() {
            return this.E;
        }

        public boolean B() {
            return (this.D & 2) == 2;
        }

        public boolean C() {
            return (this.D & 1) == 1;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public b d() {
            return E();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public b f() {
            return F(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.H;
            if (i != -1) {
                return i;
            }
            int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
            if ((this.D & 2) == 2) {
                iO += C0343Am.o(2, this.F);
            }
            int size = iO + this.C.size();
            this.H = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b2 = this.G;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.G = (byte) 1;
            return true;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.Z(1, this.E);
            }
            if ((this.D & 2) == 2) {
                c0343Am.Z(2, this.F);
            }
            c0343Am.h0(this.C);
        }

        public int z() {
            return this.F;
        }

        public c(AbstractC5674jS.b bVar) {
            super(bVar);
            this.G = (byte) -1;
            this.H = -1;
            this.C = bVar.i();
        }

        public c(boolean z) {
            this.G = (byte) -1;
            this.H = -1;
            this.C = AbstractC4629fi.B;
        }

        public c(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.G = (byte) -1;
            this.H = -1;
            D();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iJ = c9687xm.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.D |= 1;
                                this.E = c9687xm.r();
                            } else if (iJ != 16) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                this.D |= 2;
                                this.F = c9687xm.r();
                            }
                        }
                        z = true;
                    } catch (Q10 e) {
                        throw e.i(this);
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        /* JADX INFO: renamed from: com.daaw.p50$c$b */
        public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public int D;
            public int E;

            public b() {
                q();
            }

            public static b p() {
                return new b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public c a() {
                c cVarN = n();
                if (cVarN.e()) {
                    return cVarN;
                }
                throw S.a.h(cVarN);
            }

            public c n() {
                c cVar = new c(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                cVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.F = this.E;
                cVar.D = i2;
                return cVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.AbstractC7261p50.c.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.AbstractC7261p50.c.J     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.p50$c r3 = (com.daaw.AbstractC7261p50.c) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.daaw.p50$c r4 = (com.daaw.AbstractC7261p50.c) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7261p50.c.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.p50$c$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public b j(c cVar) {
                if (cVar == c.y()) {
                    return this;
                }
                if (cVar.C()) {
                    v(cVar.A());
                }
                if (cVar.B()) {
                    u(cVar.z());
                }
                k(i().m(cVar.C));
                return this;
            }

            public b u(int i) {
                this.C |= 2;
                this.E = i;
                return this;
            }

            public b v(int i) {
                this.C |= 1;
                this.D = i;
                return this;
            }

            private void q() {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.p50$d */
    public static final class d extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final d L;
        public static InterfaceC2792Xs0 M = new a();
        public final AbstractC4629fi C;
        public int D;
        public b E;
        public c F;
        public c G;
        public c H;
        public c I;
        public byte J;
        public int K;

        /* JADX INFO: renamed from: com.daaw.p50$d$a */
        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public d c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new d(c9687xm, c6763nJ);
            }
        }

        static {
            d dVar = new d(true);
            L = dVar;
            dVar.M();
        }

        public static d B() {
            return L;
        }

        private void M() {
            this.E = b.y();
            this.F = c.y();
            this.G = c.y();
            this.H = c.y();
            this.I = c.y();
        }

        public static b O() {
            return b.p();
        }

        public static b P(d dVar) {
            return O().j(dVar);
        }

        public c C() {
            return this.I;
        }

        public b D() {
            return this.E;
        }

        public c E() {
            return this.G;
        }

        public c F() {
            return this.H;
        }

        public c G() {
            return this.F;
        }

        public boolean H() {
            return (this.D & 16) == 16;
        }

        public boolean I() {
            return (this.D & 1) == 1;
        }

        public boolean J() {
            return (this.D & 4) == 4;
        }

        public boolean K() {
            return (this.D & 8) == 8;
        }

        public boolean L() {
            return (this.D & 2) == 2;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public b d() {
            return O();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public b f() {
            return P(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.K;
            if (i != -1) {
                return i;
            }
            int iR = (this.D & 1) == 1 ? C0343Am.r(1, this.E) : 0;
            if ((this.D & 2) == 2) {
                iR += C0343Am.r(2, this.F);
            }
            if ((this.D & 4) == 4) {
                iR += C0343Am.r(3, this.G);
            }
            if ((this.D & 8) == 8) {
                iR += C0343Am.r(4, this.H);
            }
            if ((this.D & 16) == 16) {
                iR += C0343Am.r(5, this.I);
            }
            int size = iR + this.C.size();
            this.K = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b2 = this.J;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.J = (byte) 1;
            return true;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.c0(1, this.E);
            }
            if ((this.D & 2) == 2) {
                c0343Am.c0(2, this.F);
            }
            if ((this.D & 4) == 4) {
                c0343Am.c0(3, this.G);
            }
            if ((this.D & 8) == 8) {
                c0343Am.c0(4, this.H);
            }
            if ((this.D & 16) == 16) {
                c0343Am.c0(5, this.I);
            }
            c0343Am.h0(this.C);
        }

        public d(AbstractC5674jS.b bVar) {
            super(bVar);
            this.J = (byte) -1;
            this.K = -1;
            this.C = bVar.i();
        }

        public d(boolean z) {
            this.J = (byte) -1;
            this.K = -1;
            this.C = AbstractC4629fi.B;
        }

        public d(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.J = (byte) -1;
            this.K = -1;
            M();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iJ = c9687xm.J();
                            if (iJ != 0) {
                                if (iJ == 10) {
                                    b.C0221b c0221bF = (this.D & 1) == 1 ? this.E.f() : null;
                                    b bVar = (b) c9687xm.t(b.J, c6763nJ);
                                    this.E = bVar;
                                    if (c0221bF != null) {
                                        c0221bF.j(bVar);
                                        this.E = c0221bF.n();
                                    }
                                    this.D |= 1;
                                } else if (iJ == 18) {
                                    c.b bVarF = (this.D & 2) == 2 ? this.F.f() : null;
                                    c cVar = (c) c9687xm.t(c.J, c6763nJ);
                                    this.F = cVar;
                                    if (bVarF != null) {
                                        bVarF.j(cVar);
                                        this.F = bVarF.n();
                                    }
                                    this.D |= 2;
                                } else if (iJ == 26) {
                                    c.b bVarF2 = (this.D & 4) == 4 ? this.G.f() : null;
                                    c cVar2 = (c) c9687xm.t(c.J, c6763nJ);
                                    this.G = cVar2;
                                    if (bVarF2 != null) {
                                        bVarF2.j(cVar2);
                                        this.G = bVarF2.n();
                                    }
                                    this.D |= 4;
                                } else if (iJ == 34) {
                                    c.b bVarF3 = (this.D & 8) == 8 ? this.H.f() : null;
                                    c cVar3 = (c) c9687xm.t(c.J, c6763nJ);
                                    this.H = cVar3;
                                    if (bVarF3 != null) {
                                        bVarF3.j(cVar3);
                                        this.H = bVarF3.n();
                                    }
                                    this.D |= 8;
                                } else if (iJ != 42) {
                                    if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                    }
                                } else {
                                    c.b bVarF4 = (this.D & 16) == 16 ? this.I.f() : null;
                                    c cVar4 = (c) c9687xm.t(c.J, c6763nJ);
                                    this.I = cVar4;
                                    if (bVarF4 != null) {
                                        bVarF4.j(cVar4);
                                        this.I = bVarF4.n();
                                    }
                                    this.D |= 16;
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new Q10(e.getMessage()).i(this);
                        }
                    } catch (Q10 e2) {
                        throw e2.i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        /* JADX INFO: renamed from: com.daaw.p50$d$b */
        public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public b D = b.y();
            public c E = c.y();
            public c F = c.y();
            public c G = c.y();
            public c H = c.y();

            public b() {
                q();
            }

            public static b p() {
                return new b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public d a() {
                d dVarN = n();
                if (dVarN.e()) {
                    return dVarN;
                }
                throw S.a.h(dVarN);
            }

            public d n() {
                d dVar = new d(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                dVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                dVar.F = this.E;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                dVar.G = this.F;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                dVar.H = this.G;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                dVar.I = this.H;
                dVar.D = i2;
                return dVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public b clone() {
                return p().j(n());
            }

            public b r(c cVar) {
                if ((this.C & 16) != 16 || this.H == c.y()) {
                    this.H = cVar;
                } else {
                    this.H = c.F(this.H).j(cVar).n();
                }
                this.C |= 16;
                return this;
            }

            public b t(b bVar) {
                if ((this.C & 1) != 1 || this.D == b.y()) {
                    this.D = bVar;
                } else {
                    this.D = b.F(this.D).j(bVar).n();
                }
                this.C |= 1;
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.AbstractC7261p50.d.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.AbstractC7261p50.d.M     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.p50$d r3 = (com.daaw.AbstractC7261p50.d) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    if (r3 == 0) goto Le
                    r2.j(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    com.daaw.p50$d r4 = (com.daaw.AbstractC7261p50.d) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.j(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7261p50.d.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.p50$d$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public b j(d dVar) {
                if (dVar == d.B()) {
                    return this;
                }
                if (dVar.I()) {
                    t(dVar.D());
                }
                if (dVar.L()) {
                    y(dVar.G());
                }
                if (dVar.J()) {
                    w(dVar.E());
                }
                if (dVar.K()) {
                    x(dVar.F());
                }
                if (dVar.H()) {
                    r(dVar.C());
                }
                k(i().m(dVar.C));
                return this;
            }

            public b w(c cVar) {
                if ((this.C & 4) != 4 || this.F == c.y()) {
                    this.F = cVar;
                } else {
                    this.F = c.F(this.F).j(cVar).n();
                }
                this.C |= 4;
                return this;
            }

            public b x(c cVar) {
                if ((this.C & 8) != 8 || this.G == c.y()) {
                    this.G = cVar;
                } else {
                    this.G = c.F(this.G).j(cVar).n();
                }
                this.C |= 8;
                return this;
            }

            public b y(c cVar) {
                if ((this.C & 2) != 2 || this.E == c.y()) {
                    this.E = cVar;
                } else {
                    this.E = c.F(this.E).j(cVar).n();
                }
                this.C |= 2;
                return this;
            }

            private void q() {
            }
        }
    }
}
