package com.daaw;

/* JADX INFO: renamed from: com.daaw.kX2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC5976kX2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnumC6686n13.values().length];
        b = iArr;
        try {
            iArr[EnumC6686n13.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[EnumC6686n13.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[EnumC3603c23.values().length];
        a = iArr2;
        try {
            iArr2[EnumC3603c23.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC3603c23.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EnumC3603c23.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[EnumC3603c23.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
