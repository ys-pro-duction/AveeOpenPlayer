package com.daaw;

import com.daaw.InterfaceC9624xZ0;
import com.daaw.MA0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CB extends I {
    public final BA L;
    public final MA0 M;
    public final DA N;

    /* JADX WARN: Illegal instructions before constructor call */
    public CB(BA ba, MA0 ma0, int i) {
        G10.g(ba, "c");
        G10.g(ma0, "proto");
        InterfaceC10174zX0 interfaceC10174zX0H = ba.h();
        InterfaceC8612tw interfaceC8612twE = ba.e();
        InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
        C2352Tm0 c2352Tm0B = AbstractC3252an0.b(ba.g(), ma0.R());
        WA0 wa0 = WA0.a;
        MA0.c cVarX = ma0.X();
        G10.f(cVarX, "getVariance(...)");
        super(interfaceC10174zX0H, interfaceC8612twE, interfaceC3072a8B, c2352Tm0B, wa0.d(cVarX), ma0.S(), i, RU0.a, InterfaceC9624xZ0.a.a);
        this.L = ba;
        this.M = ma0;
        this.N = new DA(ba.h(), new BB(this));
    }

    public static final List N0(CB cb) {
        G10.g(cb, "this$0");
        return AbstractC2455Um.M0(cb.L.c().d().l(cb.M, cb.L.g()));
    }

    @Override // com.daaw.X0
    public List L0() {
        List listS = AbstractC3366bB0.s(this.M, this.L.j());
        if (listS.isEmpty()) {
            return AbstractC1496Lm.e(AbstractC8400tA.m(this).y());
        }
        List list = listS;
        K71 k71I = this.L.i();
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k71I.u((KA0) it.next()));
        }
        return arrayList;
    }

    @Override // com.daaw.C7, com.daaw.A7
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public DA getAnnotations() {
        return this.N;
    }

    @Override // com.daaw.X0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Void K0(I80 i80) {
        G10.g(i80, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
