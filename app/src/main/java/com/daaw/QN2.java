package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class QN2 extends PN2 {
    public final char B;

    public QN2(char c) {
        this.B = c;
    }

    @Override // com.daaw.TN2
    public final boolean a(char c) {
        return c == this.B;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.B;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }
}
