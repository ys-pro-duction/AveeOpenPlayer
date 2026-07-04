package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class XG {
    public static final a a = new a(null);
    public static final int b = b.a(0);
    public static final int c = b.a(1);
    public static final int d = b.a(2);
    public static final int e = b.a(3);
    public static final int f = b.a(4);
    public static final int g = b.a(5);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return XG.b;
        }

        public final int b() {
            return XG.f;
        }

        public final int c() {
            return XG.e;
        }

        public final int d() {
            return XG.c;
        }

        public final int e() {
            return XG.g;
        }

        public final int f() {
            return XG.d;
        }

        public a() {
        }
    }

    public static final void g(H90[] h90Arr, H90 h90, int i) {
        h90.i(h90Arr[i]);
        h90Arr[i] = h90;
    }

    public static final void h(H90[] h90Arr, K90 k90, InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(k90, "layoutNodeWrapper");
        G10.g(interfaceC1073Hk0, "modifier");
        if (interfaceC1073Hk0 instanceof InterfaceC9429wq0) {
            g(h90Arr, new GS0(k90, interfaceC1073Hk0), f);
        }
    }

    public static final void i(H90[] h90Arr, K90 k90, InterfaceC1073Hk0 interfaceC1073Hk0) {
        G10.g(k90, "layoutNodeWrapper");
        G10.g(interfaceC1073Hk0, "modifier");
        if (interfaceC1073Hk0 instanceof KD) {
            g(h90Arr, new JD(k90, (KD) interfaceC1073Hk0), b);
        }
        if (interfaceC1073Hk0 instanceof InterfaceC9461wx0) {
            g(h90Arr, new C7781qx0(k90, (InterfaceC9461wx0) interfaceC1073Hk0), c);
        }
        if (interfaceC1073Hk0 instanceof InterfaceC7625qP0) {
            g(h90Arr, new C7346pP0(k90, (InterfaceC7625qP0) interfaceC1073Hk0), d);
        }
        if (interfaceC1073Hk0 instanceof InterfaceC2272Ss0) {
            g(h90Arr, new GS0(k90, interfaceC1073Hk0), e);
        }
    }

    public static final void j(H90[] h90Arr) {
        for (H90 h90D : h90Arr) {
            for (; h90D != null; h90D = h90D.d()) {
                if (h90D.f()) {
                    h90D.h();
                }
            }
        }
        int length = h90Arr.length;
        for (int i = 0; i < length; i++) {
            h90Arr[i] = null;
        }
    }

    public static H90[] k(H90[] h90Arr) {
        G10.g(h90Arr, "entities");
        return h90Arr;
    }

    public static /* synthetic */ H90[] l(H90[] h90Arr, int i, AbstractC2911Yw abstractC2911Yw) {
        if ((i & 1) != 0) {
            h90Arr = new H90[6];
        }
        return k(h90Arr);
    }

    public static final boolean m(H90[] h90Arr, int i) {
        return h90Arr[i] != null;
    }

    public static final H90 n(H90[] h90Arr, int i) {
        return h90Arr[i];
    }

    public static final class b {
        public static int a(int i) {
            return i;
        }
    }
}
