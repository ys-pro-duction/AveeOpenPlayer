package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ha1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC1034Ha1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC1450La1.values().length];
        a = iArr;
        try {
            iArr[EnumC1450La1.Set.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC1450La1.MergeSet.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC1450La1.Update.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC1450La1.Argument.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EnumC1450La1.ArrayArgument.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
