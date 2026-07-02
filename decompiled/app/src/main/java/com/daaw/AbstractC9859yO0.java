package com.daaw;

/* JADX INFO: renamed from: com.daaw.yO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9859yO0 {

    /* JADX INFO: renamed from: com.daaw.yO0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC9580xO0.values().length];
            iArr[EnumC9580xO0.SecureOff.ordinal()] = 1;
            iArr[EnumC9580xO0.SecureOn.ordinal()] = 2;
            iArr[EnumC9580xO0.Inherit.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final boolean a(EnumC9580xO0 enumC9580xO0, boolean z) {
        G10.g(enumC9580xO0, "<this>");
        int i = a.a[enumC9580xO0.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new C6902no0();
    }
}
