package com.daaw;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.r90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7838r90 {
    public final Layout a;
    public final List b;
    public final List c;
    public final boolean[] d;
    public char[] e;
    public final int f;

    /* JADX INFO: renamed from: com.daaw.r90$a */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final boolean c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            boolean z = this.c;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i + r1;
        }

        public String toString() {
            return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
        }
    }

    public C7838r90(Layout layout) {
        G10.g(layout, "layout");
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.a.getText();
            G10.f(text, "layout.text");
            int iL = BY0.L(text, '\n', length, false, 4, null);
            length = iL < 0 ? this.a.getText().length() : iL + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.f = this.b.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r11) {
        /*
            r10 = this;
            boolean[] r0 = r10.d
            boolean r0 = r0[r11]
            if (r0 == 0) goto Lf
            java.util.List r0 = r10.c
            java.lang.Object r11 = r0.get(r11)
            java.text.Bidi r11 = (java.text.Bidi) r11
            return r11
        Lf:
            r0 = 0
            if (r11 != 0) goto L14
            r1 = 0
            goto L22
        L14:
            java.util.List r1 = r10.b
            int r2 = r11 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r10.b
            java.lang.Object r2 = r2.get(r11)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r10.e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r4 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r10.a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r4, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r4, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L60
            boolean r9 = r10.g(r11)
            java.text.Bidi r3 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r0 = r3.getRunCount()
            if (r0 != r2) goto L61
        L60:
            r3 = r1
        L61:
            java.util.List r0 = r10.c
            r0.set(r11, r3)
            boolean[] r0 = r10.d
            r0[r11] = r2
            if (r3 == 0) goto L73
            char[] r11 = r10.e
            if (r4 != r11) goto L72
            r4 = r1
            goto L73
        L72:
            r4 = r11
        L73:
            r10.e = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7838r90.a(int):java.text.Bidi");
    }

    public final float b(int i, boolean z) {
        return z ? this.a.getPrimaryHorizontal(i) : this.a.getSecondaryHorizontal(i);
    }

    public final float c(int i, boolean z, boolean z2) {
        if (!z2) {
            return b(i, z);
        }
        int iA = AbstractC6444m90.a(this.a, i, z2);
        int lineStart = this.a.getLineStart(iA);
        int lineEnd = this.a.getLineEnd(iA);
        if (i != lineStart && i != lineEnd) {
            return b(i, z);
        }
        if (i == 0 || i == this.a.getText().length()) {
            return b(i, z);
        }
        int iD = d(i, z2);
        boolean zG = g(iD);
        int iH = h(lineEnd);
        int iE = e(iD);
        int i2 = lineStart - iE;
        int i3 = iH - iE;
        Bidi bidiA = a(iD);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i2, i3) : null;
        boolean z3 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.a.isRtlCharAt(lineStart);
            if (z || zG == zIsRtlCharAt) {
                zG = !zG;
            }
            if (i == lineStart) {
                z3 = zG;
            } else if (!zG) {
                z3 = true;
            }
            Layout layout = this.a;
            return z3 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i4 = 0; i4 < runCount; i4++) {
            aVarArr[i4] = new a(bidiCreateLineBidi.getRunStart(i4) + lineStart, bidiCreateLineBidi.getRunLimit(i4) + lineStart, bidiCreateLineBidi.getRunLevel(i4) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i5 = 0; i5 < runCount2; i5++) {
            bArr[i5] = (byte) bidiCreateLineBidi.getRunLevel(i5);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i6 = -1;
        if (i == lineStart) {
            int i7 = 0;
            while (true) {
                if (i7 >= runCount) {
                    break;
                }
                if (aVarArr[i7].b() == i) {
                    i6 = i7;
                    break;
                }
                i7++;
            }
            a aVar = aVarArr[i6];
            if (z || zG == aVar.c()) {
                zG = !zG;
            }
            return (i6 == 0 && zG) ? this.a.getLineLeft(iA) : (i6 != AbstractC5431ib.H(aVarArr) || zG) ? zG ? this.a.getPrimaryHorizontal(aVarArr[i6 - 1].b()) : this.a.getPrimaryHorizontal(aVarArr[i6 + 1].b()) : this.a.getLineRight(iA);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= runCount) {
                break;
            }
            if (aVarArr[i8].a() == i) {
                i6 = i8;
                break;
            }
            i8++;
        }
        a aVar2 = aVarArr[i6];
        if (!z && zG != aVar2.c()) {
            zG = !zG;
        }
        return (i6 == 0 && zG) ? this.a.getLineLeft(iA) : (i6 != AbstractC5431ib.H(aVarArr) || zG) ? zG ? this.a.getPrimaryHorizontal(aVarArr[i6 - 1].a()) : this.a.getPrimaryHorizontal(aVarArr[i6 + 1].a()) : this.a.getLineRight(iA);
    }

    public final int d(int i, boolean z) {
        int iJ = AbstractC1599Mm.j(this.b, Integer.valueOf(i), 0, 0, 6, null);
        int i2 = iJ < 0 ? -(iJ + 1) : iJ + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) this.b.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final boolean f(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return (8192 <= c && c < 8203 && c != 8199) || c == 8287 || c == 12288;
    }

    public final boolean g(int i) {
        return this.a.getParagraphDirection(this.a.getLineForOffset(e(i))) == -1;
    }

    public final int h(int i) {
        while (i > 0 && f(this.a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }
}
