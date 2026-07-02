package com.daaw;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SP0 extends RP0 {

    public static final class a implements KP0 {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        @Override // com.daaw.KP0
        public Iterator iterator() {
            return this.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(KP0 kp0) {
            G10.g(kp0, "it");
            return kp0.iterator();
        }
    }

    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ LQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LQ lq) {
            super(1);
            this.B = lq;
        }

        @Override // com.daaw.NQ
        public final Object invoke(Object obj) {
            G10.g(obj, "it");
            return this.B.invoke();
        }
    }

    public static final class e extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ Object B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj) {
            super(0);
            this.B = obj;
        }

        @Override // com.daaw.LQ
        public final Object invoke() {
            return this.B;
        }
    }

    public static KP0 c(Iterator it) {
        G10.g(it, "<this>");
        return d(new a(it));
    }

    public static final KP0 d(KP0 kp0) {
        G10.g(kp0, "<this>");
        return kp0 instanceof C3828cr ? kp0 : new C3828cr(kp0);
    }

    public static KP0 e() {
        return C8424tG.a;
    }

    public static final KP0 f(KP0 kp0) {
        G10.g(kp0, "<this>");
        return g(kp0, b.B);
    }

    public static final KP0 g(KP0 kp0, NQ nq) {
        return kp0 instanceof C8098s51 ? ((C8098s51) kp0).d(nq) : new TM(kp0, c.B, nq);
    }

    public static KP0 h(LQ lq) {
        G10.g(lq, "nextFunction");
        return d(new C5953kS(lq, new d(lq)));
    }

    public static KP0 i(Object obj, NQ nq) {
        G10.g(nq, "nextFunction");
        return obj == null ? C8424tG.a : new C5953kS(new e(obj), nq);
    }

    public static KP0 j(Object... objArr) {
        G10.g(objArr, "elements");
        return AbstractC5431ib.z(objArr);
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        @Override // com.daaw.NQ
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
