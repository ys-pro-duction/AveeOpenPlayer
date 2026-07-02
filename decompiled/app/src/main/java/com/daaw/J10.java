package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class J10 {
    public static final a d = new a(null);
    public final E90 a;
    public InterfaceC8007rm0 b;
    public InterfaceC0957Gh0 c;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public J10(E90 e90) {
        G10.g(e90, "layoutNode");
        this.a = e90;
    }

    public final void a(InterfaceC0957Gh0 interfaceC0957Gh0) {
        G10.g(interfaceC0957Gh0, "measurePolicy");
        InterfaceC8007rm0 interfaceC8007rm0 = this.b;
        if (interfaceC8007rm0 == null) {
            this.c = interfaceC0957Gh0;
        } else {
            G10.d(interfaceC8007rm0);
            interfaceC8007rm0.setValue(interfaceC0957Gh0);
        }
    }
}
