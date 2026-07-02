package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class TM0 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.d(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RM0 invoke() {
            return null;
        }
    }

    public static final RM0 a(Map map, NQ nq) {
        G10.g(nq, "canBeSaved");
        return new SM0(map, nq);
    }

    public static final AbstractC6453mB0 b() {
        return a;
    }
}
