package com.daaw;

/* JADX INFO: renamed from: com.daaw.ab0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3192ab0 {

    /* JADX INFO: renamed from: com.daaw.ab0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7395pb0.values().length];
            try {
                iArr[EnumC7395pb0.B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7395pb0.C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7395pb0.D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static O90 a(LQ lq) {
        G10.g(lq, "initializer");
        return new C4148e01(lq, null, 2, null);
    }

    public static O90 b(EnumC7395pb0 enumC7395pb0, LQ lq) {
        G10.g(enumC7395pb0, "mode");
        G10.g(lq, "initializer");
        int i = a.a[enumC7395pb0.ordinal()];
        if (i == 1) {
            return new C4148e01(lq, null, 2, null);
        }
        if (i == 2) {
            return new KM0(lq);
        }
        if (i == 3) {
            return new Z91(lq);
        }
        throw new C6902no0();
    }
}
