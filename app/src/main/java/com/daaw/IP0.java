package com.daaw;

import com.daaw.C6000kd;

/* JADX INFO: loaded from: classes.dex */
public abstract class IP0 {

    public static abstract class a {
        public abstract IP0 a();

        public abstract a b(EG eg);

        public abstract a c(GH gh);

        public abstract a d(InterfaceC7819r51 interfaceC7819r51);

        public abstract a e(H51 h51);

        public abstract a f(String str);
    }

    public static a a() {
        return new C6000kd.b();
    }

    public abstract EG b();

    public abstract GH c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    public abstract InterfaceC7819r51 e();

    public abstract H51 f();

    public abstract String g();
}
