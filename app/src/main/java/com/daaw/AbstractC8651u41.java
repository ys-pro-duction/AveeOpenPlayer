package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.u41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8651u41 {
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.daaw.u41$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC8651u41 a(Context context) {
            G10.g(context, "context");
            T2 t2 = T2.a;
            if (t2.a() >= 5) {
                return new C41(context);
            }
            if (t2.a() == 4) {
                return new C9495x41(context);
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(C9595xS c9595xS, InterfaceC1416Ks interfaceC1416Ks);
}
