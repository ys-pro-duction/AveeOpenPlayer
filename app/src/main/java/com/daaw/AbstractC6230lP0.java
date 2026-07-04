package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6230lP0 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.c(null, a.B, 1, null);

    /* JADX INFO: renamed from: com.daaw.lP0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        public final InterfaceC5942kP0 a() {
            return null;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return null;
        }
    }

    public static final AbstractC6453mB0 a() {
        return a;
    }

    public static final boolean b(InterfaceC5942kP0 interfaceC5942kP0, long j) {
        Map mapA;
        if (interfaceC5942kP0 == null || (mapA = interfaceC5942kP0.a()) == null) {
            return false;
        }
        return mapA.containsKey(Long.valueOf(j));
    }
}
