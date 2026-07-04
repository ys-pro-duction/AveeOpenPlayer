package com.daaw;

import com.daaw.Y11;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class X11 {

    public static final class a extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ Y11 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y11 y11) {
            super(0);
            this.B = y11;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Y11 invoke() {
            return this.B;
        }
    }

    public static Y11 a(Y11 y11, Y11 y112) {
        G10.g(y112, "other");
        return y112.d() != null ? y112 : y11.d() != null ? y11 : y112.c(new a(y11));
    }

    public static Y11 b(Y11 y11, LQ lq) {
        G10.g(lq, "other");
        return !G10.c(y11, Y11.b.b) ? y11 : (Y11) lq.invoke();
    }
}
