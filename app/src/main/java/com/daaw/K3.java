package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class K3 {
    public static final C6536mW a = new C6536mW(a.B);
    public static final C6536mW b = new C6536mW(b.B);

    public /* synthetic */ class a extends AbstractC9591xR implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2, AbstractC7704qh0.class, "min", "min(II)I", 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer o(int i, int i2) {
            return Integer.valueOf(Math.min(i, i2));
        }
    }

    public /* synthetic */ class b extends AbstractC9591xR implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2, AbstractC7704qh0.class, "max", "max(II)I", 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return o(((Number) obj).intValue(), ((Number) obj2).intValue());
        }

        public final Integer o(int i, int i2) {
            return Integer.valueOf(Math.max(i, i2));
        }
    }

    public static final C6536mW a() {
        return a;
    }

    public static final C6536mW b() {
        return b;
    }

    public static final int c(I3 i3, int i, int i2) {
        G10.g(i3, "<this>");
        return ((Number) i3.a().invoke(Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }
}
