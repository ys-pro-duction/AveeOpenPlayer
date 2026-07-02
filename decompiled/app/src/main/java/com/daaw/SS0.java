package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class SS0 implements MZ0 {
    public final String B;
    public final Object[] C;

    public SS0(String str, Object[] objArr) {
        this.B = str;
        this.C = objArr;
    }

    public static void b(LZ0 lz0, int i, Object obj) {
        if (obj == null) {
            lz0.z0(i);
            return;
        }
        if (obj instanceof byte[]) {
            lz0.Z(i, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            lz0.H(i, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            lz0.H(i, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            lz0.S(i, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            lz0.S(i, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            lz0.S(i, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            lz0.S(i, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            lz0.w(i, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            lz0.S(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void d(LZ0 lz0, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            b(lz0, i, obj);
        }
    }

    @Override // com.daaw.MZ0
    public void a(LZ0 lz0) {
        d(lz0, this.C);
    }

    @Override // com.daaw.MZ0
    public String c() {
        return this.B;
    }

    public SS0(String str) {
        this(str, null);
    }
}
