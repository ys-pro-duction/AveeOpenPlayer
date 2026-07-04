package com.daaw;

import com.daaw.InterfaceC6002kd1;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.ld1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6290ld1 implements InterfaceC6002kd1 {
    public final InterfaceC9229w7 a;
    public AbstractC8664u7 b;
    public AbstractC8664u7 c;
    public AbstractC8664u7 d;

    /* JADX INFO: renamed from: com.daaw.ld1$a */
    public static final class a implements InterfaceC9229w7 {
        public final /* synthetic */ InterfaceC3413bN a;

        public a(InterfaceC3413bN interfaceC3413bN) {
            this.a = interfaceC3413bN;
        }

        @Override // com.daaw.InterfaceC9229w7
        public InterfaceC3413bN get(int i) {
            return this.a;
        }
    }

    public C6290ld1(InterfaceC9229w7 interfaceC9229w7) {
        G10.g(interfaceC9229w7, "anims");
        this.a = interfaceC9229w7;
    }

    @Override // com.daaw.InterfaceC5164hd1
    public boolean a() {
        return InterfaceC6002kd1.a.b(this);
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 b(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        if (this.b == null) {
            this.b = AbstractC8950v7.c(abstractC8664u7);
        }
        AbstractC8664u7 abstractC8664u74 = this.b;
        if (abstractC8664u74 == null) {
            G10.u("valueVector");
            abstractC8664u74 = null;
        }
        int iB = abstractC8664u74.b();
        int i = 0;
        while (i < iB) {
            int i2 = i + 1;
            AbstractC8664u7 abstractC8664u75 = this.b;
            if (abstractC8664u75 == null) {
                G10.u("valueVector");
                abstractC8664u75 = null;
            }
            abstractC8664u75.e(i, this.a.get(i).d(j, abstractC8664u7.a(i), abstractC8664u72.a(i), abstractC8664u73.a(i)));
            i = i2;
        }
        AbstractC8664u7 abstractC8664u76 = this.b;
        if (abstractC8664u76 != null) {
            return abstractC8664u76;
        }
        G10.u("valueVector");
        return null;
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 c(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        if (this.d == null) {
            this.d = AbstractC8950v7.c(abstractC8664u73);
        }
        AbstractC8664u7 abstractC8664u74 = this.d;
        if (abstractC8664u74 == null) {
            G10.u("endVelocityVector");
            abstractC8664u74 = null;
        }
        int iB = abstractC8664u74.b();
        int i = 0;
        while (i < iB) {
            int i2 = i + 1;
            AbstractC8664u7 abstractC8664u75 = this.d;
            if (abstractC8664u75 == null) {
                G10.u("endVelocityVector");
                abstractC8664u75 = null;
            }
            abstractC8664u75.e(i, this.a.get(i).c(abstractC8664u7.a(i), abstractC8664u72.a(i), abstractC8664u73.a(i)));
            i = i2;
        }
        AbstractC8664u7 abstractC8664u76 = this.d;
        if (abstractC8664u76 != null) {
            return abstractC8664u76;
        }
        G10.u("endVelocityVector");
        return null;
    }

    @Override // com.daaw.InterfaceC5164hd1
    public long d(AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        Iterator it = AbstractC8417tE0.q(0, abstractC8664u7.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iB = ((A00) it).b();
            jMax = Math.max(jMax, this.a.get(iB).b(abstractC8664u7.a(iB), abstractC8664u72.a(iB), abstractC8664u73.a(iB)));
        }
        return jMax;
    }

    @Override // com.daaw.InterfaceC5164hd1
    public AbstractC8664u7 g(long j, AbstractC8664u7 abstractC8664u7, AbstractC8664u7 abstractC8664u72, AbstractC8664u7 abstractC8664u73) {
        G10.g(abstractC8664u7, "initialValue");
        G10.g(abstractC8664u72, "targetValue");
        G10.g(abstractC8664u73, "initialVelocity");
        if (this.c == null) {
            this.c = AbstractC8950v7.c(abstractC8664u73);
        }
        AbstractC8664u7 abstractC8664u74 = this.c;
        if (abstractC8664u74 == null) {
            G10.u("velocityVector");
            abstractC8664u74 = null;
        }
        int iB = abstractC8664u74.b();
        int i = 0;
        while (i < iB) {
            int i2 = i + 1;
            AbstractC8664u7 abstractC8664u75 = this.c;
            if (abstractC8664u75 == null) {
                G10.u("velocityVector");
                abstractC8664u75 = null;
            }
            abstractC8664u75.e(i, this.a.get(i).a(j, abstractC8664u7.a(i), abstractC8664u72.a(i), abstractC8664u73.a(i)));
            i = i2;
        }
        AbstractC8664u7 abstractC8664u76 = this.c;
        if (abstractC8664u76 != null) {
            return abstractC8664u76;
        }
        G10.u("velocityVector");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6290ld1(InterfaceC3413bN interfaceC3413bN) {
        this(new a(interfaceC3413bN));
        G10.g(interfaceC3413bN, "anim");
    }
}
