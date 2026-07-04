package com.daaw;

import com.daaw.AbstractC3720cU0;

/* JADX INFO: renamed from: com.daaw.oU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7087oU0 implements InterfaceC10170zW0, InterfaceC6808nU0 {
    public final InterfaceC7645qU0 B;
    public a C;

    /* JADX INFO: renamed from: com.daaw.oU0$a */
    public static final class a extends AW0 {
        public Object c;

        public a(Object obj) {
            this.c = obj;
        }

        @Override // com.daaw.AW0
        public void a(AW0 aw0) {
            G10.g(aw0, "value");
            this.c = ((a) aw0).c;
        }

        @Override // com.daaw.AW0
        public AW0 b() {
            return new a(this.c);
        }

        public final Object g() {
            return this.c;
        }

        public final void h(Object obj) {
            this.c = obj;
        }
    }

    public AbstractC7087oU0(Object obj, InterfaceC7645qU0 interfaceC7645qU0) {
        G10.g(interfaceC7645qU0, "policy");
        this.B = interfaceC7645qU0;
        this.C = new a(obj);
    }

    @Override // com.daaw.InterfaceC10170zW0
    public AW0 e() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC8007rm0, com.daaw.InterfaceC6258lW0
    public Object getValue() {
        return ((a) AbstractC5124hU0.O(this.C, this)).g();
    }

    @Override // com.daaw.InterfaceC6808nU0
    public InterfaceC7645qU0 i() {
        return this.B;
    }

    @Override // com.daaw.InterfaceC10170zW0
    public AW0 m(AW0 aw0, AW0 aw02, AW0 aw03) {
        G10.g(aw0, "previous");
        G10.g(aw02, "current");
        G10.g(aw03, "applied");
        a aVar = (a) aw0;
        a aVar2 = (a) aw02;
        a aVar3 = (a) aw03;
        if (i().a(aVar2.g(), aVar3.g())) {
            return aw02;
        }
        Object objB = i().b(aVar.g(), aVar2.g(), aVar3.g());
        if (objB == null) {
            return null;
        }
        AW0 aw0B = aVar3.b();
        ((a) aw0B).h(objB);
        return aw0B;
    }

    @Override // com.daaw.InterfaceC10170zW0
    public void p(AW0 aw0) {
        G10.g(aw0, "value");
        this.C = (a) aw0;
    }

    @Override // com.daaw.InterfaceC8007rm0
    public void setValue(Object obj) {
        AbstractC3720cU0 abstractC3720cU0B;
        a aVar = this.C;
        AbstractC3720cU0.a aVar2 = AbstractC3720cU0.e;
        a aVar3 = (a) AbstractC5124hU0.A(aVar, aVar2.b());
        if (i().a(aVar3.g(), obj)) {
            return;
        }
        a aVar4 = this.C;
        AbstractC5124hU0.D();
        synchronized (AbstractC5124hU0.C()) {
            abstractC3720cU0B = aVar2.b();
            ((a) AbstractC5124hU0.L(aVar4, this, abstractC3720cU0B, aVar3)).h(obj);
            G91 g91 = G91.a;
        }
        AbstractC5124hU0.J(abstractC3720cU0B, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) AbstractC5124hU0.A(this.C, AbstractC3720cU0.e.b())).g() + ")@" + hashCode();
    }
}
