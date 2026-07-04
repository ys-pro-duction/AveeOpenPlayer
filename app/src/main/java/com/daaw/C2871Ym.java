package com.daaw;

import android.graphics.ColorFilter;

/* JADX INFO: renamed from: com.daaw.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2871Ym {
    public static final a b = new a(null);
    public final ColorFilter a;

    /* JADX INFO: renamed from: com.daaw.Ym$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ C2871Ym b(a aVar, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = C2323Tf.b.z();
            }
            return aVar.a(j, i);
        }

        public final C2871Ym a(long j, int i) {
            return AbstractC4739g5.a(j, i);
        }

        public a() {
        }
    }

    public C2871Ym(ColorFilter colorFilter) {
        G10.g(colorFilter, "nativeColorFilter");
        this.a = colorFilter;
    }

    public final ColorFilter a() {
        return this.a;
    }
}
