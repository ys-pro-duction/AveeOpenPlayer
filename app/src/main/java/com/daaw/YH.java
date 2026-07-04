package com.daaw;

import com.daaw.C2101Rc;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes.dex */
public abstract class YH {
    public static final YH a = a().f(10485760).d(RCHTTPStatusCodes.SUCCESS).b(10000).c(604800000).e(81920).a();

    public static abstract class a {
        public abstract YH a();

        public abstract a b(int i);

        public abstract a c(long j);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(long j);
    }

    public static a a() {
        return new C2101Rc.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();
}
