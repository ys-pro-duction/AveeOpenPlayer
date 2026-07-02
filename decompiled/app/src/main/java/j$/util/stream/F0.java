package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class F0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[W2.values().length];
        a = iArr;
        try {
            iArr[W2.REFERENCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[W2.INT_VALUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[W2.LONG_VALUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[W2.DOUBLE_VALUE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
