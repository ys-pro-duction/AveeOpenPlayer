package com.daaw;

import com.daaw.AbstractC3720cU0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10026yz implements InterfaceC10170zW0, InterfaceC10305zz {
    public final LQ B;
    public a C;

    /* JADX INFO: renamed from: com.daaw.yz$a */
    public static final class a extends AW0 {
        public static final C0256a f = new C0256a(null);
        public static final Object g = new Object();
        public HashSet c;
        public Object d = g;
        public int e;

        /* JADX INFO: renamed from: com.daaw.yz$a$a, reason: collision with other inner class name */
        public static final class C0256a {
            public /* synthetic */ C0256a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public C0256a() {
            }
        }

        @Override // com.daaw.AW0
        public void a(AW0 aw0) {
            G10.g(aw0, "value");
            a aVar = (a) aw0;
            this.c = aVar.c;
            this.d = aVar.d;
            this.e = aVar.e;
        }

        @Override // com.daaw.AW0
        public AW0 b() {
            return new a();
        }

        public final HashSet g() {
            return this.c;
        }

        public final Object h() {
            return this.d;
        }

        public final boolean i(InterfaceC10305zz interfaceC10305zz, AbstractC3720cU0 abstractC3720cU0) {
            G10.g(interfaceC10305zz, "derivedState");
            G10.g(abstractC3720cU0, "snapshot");
            return this.d != g && this.e == j(interfaceC10305zz, abstractC3720cU0);
        }

        public final int j(InterfaceC10305zz interfaceC10305zz, AbstractC3720cU0 abstractC3720cU0) {
            HashSet<InterfaceC10170zW0> hashSet;
            G10.g(interfaceC10305zz, "derivedState");
            G10.g(abstractC3720cU0, "snapshot");
            synchronized (AbstractC5124hU0.C()) {
                hashSet = this.c;
            }
            int iA = 7;
            if (hashSet == null) {
                return 7;
            }
            InterfaceC4969gu0 interfaceC4969gu0B = (InterfaceC4969gu0) AbstractC8202sU0.a.a();
            if (interfaceC4969gu0B == null) {
                interfaceC4969gu0B = AbstractC7878rJ.b();
            }
            int size = interfaceC4969gu0B.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i2)).a()).invoke(interfaceC10305zz);
            }
            try {
                for (InterfaceC10170zW0 interfaceC10170zW0 : hashSet) {
                    AW0 aw0E = interfaceC10170zW0.e();
                    G10.f(interfaceC10170zW0, "stateObject");
                    AW0 aw0P = AbstractC5124hU0.P(aw0E, interfaceC10170zW0, abstractC3720cU0);
                    iA = (((iA * 31) + O2.a(aw0P)) * 31) + aw0P.d();
                }
                G91 g91 = G91.a;
                int size2 = interfaceC4969gu0B.size();
                while (i < size2) {
                    ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i)).b()).invoke(interfaceC10305zz);
                    i++;
                }
                return iA;
            } catch (Throwable th) {
                int size3 = interfaceC4969gu0B.size();
                while (i < size3) {
                    ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i)).b()).invoke(interfaceC10305zz);
                    i++;
                }
                throw th;
            }
        }

        public final void k(HashSet hashSet) {
            this.c = hashSet;
        }

        public final void l(Object obj) {
            this.d = obj;
        }

        public final void m(int i) {
            this.e = i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yz$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ HashSet C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HashSet hashSet) {
            super(1);
            this.C = hashSet;
        }

        public final void a(Object obj) {
            G10.g(obj, "it");
            if (obj == C10026yz.this) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof InterfaceC10170zW0) {
                this.C.add(obj);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return G91.a;
        }
    }

    public C10026yz(LQ lq) {
        G10.g(lq, "calculation");
        this.B = lq;
        this.C = new a();
    }

    @Override // com.daaw.InterfaceC10170zW0
    public AW0 e() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC10305zz
    public Object f() {
        a aVar = this.C;
        AbstractC3720cU0.a aVar2 = AbstractC3720cU0.e;
        return o((a) AbstractC5124hU0.A(aVar, aVar2.b()), aVar2.b(), this.B).h();
    }

    @Override // com.daaw.InterfaceC6258lW0
    public Object getValue() {
        NQ nqH = AbstractC3720cU0.e.b().h();
        if (nqH != null) {
            nqH.invoke(this);
        }
        return f();
    }

    @Override // com.daaw.InterfaceC10305zz
    public Set k() {
        a aVar = this.C;
        AbstractC3720cU0.a aVar2 = AbstractC3720cU0.e;
        HashSet hashSetG = o((a) AbstractC5124hU0.A(aVar, aVar2.b()), aVar2.b(), this.B).g();
        return hashSetG != null ? hashSetG : AbstractC9867yQ0.d();
    }

    @Override // com.daaw.InterfaceC10170zW0
    public /* synthetic */ AW0 m(AW0 aw0, AW0 aw02, AW0 aw03) {
        return AbstractC9891yW0.a(this, aw0, aw02, aw03);
    }

    public final a o(a aVar, AbstractC3720cU0 abstractC3720cU0, LQ lq) {
        AbstractC3720cU0.a aVar2;
        a aVar3;
        if (aVar.i(this, abstractC3720cU0)) {
            return aVar;
        }
        Boolean bool = (Boolean) AbstractC8202sU0.b.a();
        int i = 0;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        HashSet hashSet = new HashSet();
        InterfaceC4969gu0 interfaceC4969gu0B = (InterfaceC4969gu0) AbstractC8202sU0.a.a();
        if (interfaceC4969gu0B == null) {
            interfaceC4969gu0B = AbstractC7878rJ.b();
        }
        int size = interfaceC4969gu0B.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i2)).a()).invoke(this);
        }
        if (!zBooleanValue) {
            try {
                AbstractC8202sU0.b.b(Boolean.TRUE);
            } catch (Throwable th) {
                int size2 = interfaceC4969gu0B.size();
                while (i < size2) {
                    ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i)).b()).invoke(this);
                    i++;
                }
                throw th;
            }
        }
        Object objD = AbstractC3720cU0.e.d(new b(hashSet), null, lq);
        if (!zBooleanValue) {
            AbstractC8202sU0.b.b(Boolean.FALSE);
        }
        int size3 = interfaceC4969gu0B.size();
        while (i < size3) {
            ((NQ) ((C0576Cs0) interfaceC4969gu0B.get(i)).b()).invoke(this);
            i++;
        }
        synchronized (AbstractC5124hU0.C()) {
            aVar2 = AbstractC3720cU0.e;
            AbstractC3720cU0 abstractC3720cU0B = aVar2.b();
            aVar3 = (a) AbstractC5124hU0.I(this.C, this, abstractC3720cU0B);
            aVar3.k(hashSet);
            aVar3.m(aVar3.j(this, abstractC3720cU0B));
            aVar3.l(objD);
        }
        if (!zBooleanValue) {
            aVar2.c();
        }
        return aVar3;
    }

    @Override // com.daaw.InterfaceC10170zW0
    public void p(AW0 aw0) {
        G10.g(aw0, "value");
        this.C = (a) aw0;
    }

    public final String q() {
        a aVar = this.C;
        AbstractC3720cU0.a aVar2 = AbstractC3720cU0.e;
        a aVar3 = (a) AbstractC5124hU0.A(aVar, aVar2.b());
        return aVar3.i(this, aVar2.b()) ? String.valueOf(aVar3.h()) : "<Not calculated>";
    }

    public String toString() {
        return "DerivedState(value=" + q() + ")@" + hashCode();
    }
}
