package com.daaw;

/* JADX INFO: renamed from: com.daaw.y81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9794y81 {

    /* JADX INFO: renamed from: com.daaw.y81$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC1042Hc1.values().length];
            try {
                iArr[EnumC1042Hc1.F.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1042Hc1.G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1042Hc1.H.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final J81 a(EnumC1042Hc1 enumC1042Hc1) {
        G10.g(enumC1042Hc1, "<this>");
        int i = a.a[enumC1042Hc1.ordinal()];
        if (i == 1) {
            return J81.E;
        }
        if (i == 2) {
            return J81.C;
        }
        if (i == 3) {
            return J81.D;
        }
        throw new C6902no0();
    }
}
