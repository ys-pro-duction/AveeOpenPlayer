package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.t21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8362t21 extends Z70 {

    /* JADX INFO: renamed from: com.daaw.t21$a */
    public class a extends C8530tf0 {
        public final /* synthetic */ C5451if0 d;
        public final /* synthetic */ C8530tf0 e;
        public final /* synthetic */ OC f;

        public a(C5451if0 c5451if0, C8530tf0 c8530tf0, OC oc) {
            this.d = c5451if0;
            this.e = c8530tf0;
            this.f = oc;
        }

        @Override // com.daaw.C8530tf0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public OC a(C5451if0 c5451if0) {
            this.d.h(c5451if0.f(), c5451if0.a(), ((OC) c5451if0.g()).a, ((OC) c5451if0.b()).a, c5451if0.d(), c5451if0.c(), c5451if0.e());
            String str = (String) this.e.a(this.d);
            OC oc = (OC) (c5451if0.c() == 1.0f ? c5451if0.b() : c5451if0.g());
            this.f.a(str, oc.b, oc.c, oc.d, oc.e, oc.f, oc.g, oc.h, oc.i, oc.j, oc.k);
            return this.f;
        }
    }

    public C8362t21(List list) {
        super(list);
    }

    @Override // com.daaw.AbstractC9089ve
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public OC i(Y70 y70, float f) {
        Object obj;
        C8530tf0 c8530tf0 = this.e;
        if (c8530tf0 == null) {
            return (f != 1.0f || (obj = y70.c) == null) ? (OC) y70.b : (OC) obj;
        }
        float f2 = y70.g;
        Float f3 = y70.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        Object obj2 = y70.b;
        OC oc = (OC) obj2;
        Object obj3 = y70.c;
        return (OC) c8530tf0.b(f2, fFloatValue, oc, obj3 == null ? (OC) obj2 : (OC) obj3, f, d(), f());
    }

    public void q(C8530tf0 c8530tf0) {
        super.n(new a(new C5451if0(), c8530tf0, new OC()));
    }
}
