package com.daaw;

/* JADX INFO: renamed from: com.daaw.tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8599tt {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* JADX INFO: renamed from: com.daaw.tt$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC8599tt.values().length];
            try {
                iArr[EnumC8599tt.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8599tt.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8599tt.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8599tt.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final void c(InterfaceC3429bR interfaceC3429bR, Object obj, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        int i = a.a[ordinal()];
        if (i == 1) {
            AbstractC4913gj.d(interfaceC3429bR, obj, interfaceC1416Ks, null, 4, null);
            return;
        }
        if (i == 2) {
            AbstractC1831Os.b(interfaceC3429bR, obj, interfaceC1416Ks);
        } else if (i == 3) {
            A91.a(interfaceC3429bR, obj, interfaceC1416Ks);
        } else if (i != 4) {
            throw new C6902no0();
        }
    }

    public final boolean g() {
        return this == LAZY;
    }
}
