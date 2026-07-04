package com.daaw;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OX implements InterfaceC3516bk0 {
    public static final b b = new a();
    public static final int c = AbstractC6280lb1.v("ID3");
    public final b a;

    public static class a implements b {
        @Override // com.daaw.OX.b
        public boolean a(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    }

    public interface b {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final int c;

        public c(int i, boolean z, int i2) {
            this.a = i;
            this.b = z;
            this.c = i2;
        }
    }

    public OX() {
        this(null);
    }

    public static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? new byte[0] : Arrays.copyOfRange(bArr, i, i2);
    }

    public static ApicFrame d(C2584Vs0 c2584Vs0, int i, int i2) {
        int iV;
        String strA0;
        int iX = c2584Vs0.x();
        String strS = s(iX);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c2584Vs0.g(bArr, 0, i3);
        if (i2 == 2) {
            strA0 = "image/" + AbstractC6280lb1.a0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(strA0)) {
                strA0 = "image/jpeg";
            }
            iV = 2;
        } else {
            iV = v(bArr, 0);
            strA0 = AbstractC6280lb1.a0(new String(bArr, 0, iV, "ISO-8859-1"));
            if (strA0.indexOf(47) == -1) {
                strA0 = "image/" + strA0;
            }
        }
        int i4 = bArr[iV + 1] & 255;
        int i5 = iV + 2;
        int iU = u(bArr, i5, iX);
        return new ApicFrame(strA0, new String(bArr, i5, iU - i5, strS), i4, b(bArr, iU + r(iX), i3));
    }

    public static BinaryFrame e(C2584Vs0 c2584Vs0, int i, String str) {
        byte[] bArr = new byte[i];
        c2584Vs0.g(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterFrame f(C2584Vs0 c2584Vs0, int i, int i2, boolean z, int i3, b bVar) throws Throwable {
        int iC = c2584Vs0.c();
        int iV = v(c2584Vs0.a, iC);
        String str = new String(c2584Vs0.a, iC, iV - iC, "ISO-8859-1");
        c2584Vs0.J(iV + 1);
        int i4 = c2584Vs0.i();
        int i5 = c2584Vs0.i();
        long jZ = c2584Vs0.z();
        if (jZ == 4294967295L) {
            jZ = -1;
        }
        long jZ2 = c2584Vs0.z();
        long j = jZ2 == 4294967295L ? -1L : jZ2;
        ArrayList arrayList = new ArrayList();
        int i6 = iC + i;
        while (c2584Vs0.c() < i6) {
            Id3Frame id3FrameI = i(i2, c2584Vs0, z, i3, bVar);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, i4, i5, jZ, j, id3FrameArr);
    }

    public static ChapterTocFrame g(C2584Vs0 c2584Vs0, int i, int i2, boolean z, int i3, b bVar) throws Throwable {
        int iC = c2584Vs0.c();
        int iV = v(c2584Vs0.a, iC);
        String str = new String(c2584Vs0.a, iC, iV - iC, "ISO-8859-1");
        c2584Vs0.J(iV + 1);
        int iX = c2584Vs0.x();
        boolean z2 = (iX & 2) != 0;
        boolean z3 = (iX & 1) != 0;
        int iX2 = c2584Vs0.x();
        String[] strArr = new String[iX2];
        for (int i4 = 0; i4 < iX2; i4++) {
            int iC2 = c2584Vs0.c();
            int iV2 = v(c2584Vs0.a, iC2);
            strArr[i4] = new String(c2584Vs0.a, iC2, iV2 - iC2, "ISO-8859-1");
            c2584Vs0.J(iV2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iC + i;
        while (c2584Vs0.c() < i5) {
            Id3Frame id3FrameI = i(i2, c2584Vs0, z, i3, bVar);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame h(C2584Vs0 c2584Vs0, int i) {
        if (i < 4) {
            return null;
        }
        int iX = c2584Vs0.x();
        String strS = s(iX);
        byte[] bArr = new byte[3];
        c2584Vs0.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c2584Vs0.g(bArr2, 0, i2);
        int iU = u(bArr2, 0, iX);
        String str2 = new String(bArr2, 0, iU, strS);
        int iR = iU + r(iX);
        return new CommentFrame(str, str2, m(bArr2, iR, u(bArr2, iR, iX), strS));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d6 A[Catch: all -> 0x01d4, UnsupportedEncodingException -> 0x01ef, TryCatch #4 {UnsupportedEncodingException -> 0x01ef, all -> 0x01d4, blocks: (B:164:0x01e4, B:159:0x01cf, B:162:0x01d6), top: B:174:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e4 A[Catch: all -> 0x01d4, UnsupportedEncodingException -> 0x01ef, TRY_LEAVE, TryCatch #4 {UnsupportedEncodingException -> 0x01ef, all -> 0x01d4, blocks: (B:164:0x01e4, B:159:0x01cf, B:162:0x01d6), top: B:174:0x00fd }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.daaw.Vs0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.daaw.Vs0] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.daaw.Vs0] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame i(int r17, com.daaw.C2584Vs0 r18, boolean r19, int r20, com.daaw.OX.b r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.OX.i(int, com.daaw.Vs0, boolean, int, com.daaw.OX$b):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static GeobFrame j(C2584Vs0 c2584Vs0, int i) {
        int iX = c2584Vs0.x();
        String strS = s(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2584Vs0.g(bArr, 0, i2);
        int iV = v(bArr, 0);
        String str = new String(bArr, 0, iV, "ISO-8859-1");
        int i3 = iV + 1;
        int iU = u(bArr, i3, iX);
        String strM = m(bArr, i3, iU, strS);
        int iR = iU + r(iX);
        int iU2 = u(bArr, iR, iX);
        return new GeobFrame(str, strM, m(bArr, iR, iU2, strS), b(bArr, iU2 + r(iX), i2));
    }

    public static c k(C2584Vs0 c2584Vs0) {
        if (c2584Vs0.a() < 10 || c2584Vs0.A() != c) {
            return null;
        }
        int iX = c2584Vs0.x();
        c2584Vs0.K(1);
        int iX2 = c2584Vs0.x();
        int iW = c2584Vs0.w();
        if (iX == 2) {
            if ((iX2 & 64) != 0) {
                return null;
            }
        } else if (iX == 3) {
            if ((iX2 & 64) != 0) {
                int i = c2584Vs0.i();
                c2584Vs0.K(i);
                iW -= i + 4;
            }
        } else {
            if (iX != 4) {
                return null;
            }
            if ((iX2 & 64) != 0) {
                int iW2 = c2584Vs0.w();
                c2584Vs0.K(iW2 - 4);
                iW -= iW2;
            }
            if ((iX2 & 16) != 0) {
                iW -= 10;
            }
        }
        return new c(iX, iX < 4 && (iX2 & 128) != 0, iW);
    }

    public static PrivFrame l(C2584Vs0 c2584Vs0, int i) {
        byte[] bArr = new byte[i];
        c2584Vs0.g(bArr, 0, i);
        int iV = v(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iV, "ISO-8859-1"), b(bArr, iV + 1, i));
    }

    public static String m(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static TextInformationFrame n(C2584Vs0 c2584Vs0, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iX = c2584Vs0.x();
        String strS = s(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2584Vs0.g(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, u(bArr, 0, iX), strS));
    }

    public static TextInformationFrame o(C2584Vs0 c2584Vs0, int i) {
        if (i < 1) {
            return null;
        }
        int iX = c2584Vs0.x();
        String strS = s(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2584Vs0.g(bArr, 0, i2);
        int iU = u(bArr, 0, iX);
        String str = new String(bArr, 0, iU, strS);
        int iR = iU + r(iX);
        return new TextInformationFrame("TXXX", str, m(bArr, iR, u(bArr, iR, iX), strS));
    }

    public static UrlLinkFrame p(C2584Vs0 c2584Vs0, int i, String str) {
        byte[] bArr = new byte[i];
        c2584Vs0.g(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, v(bArr, 0), "ISO-8859-1"));
    }

    public static UrlLinkFrame q(C2584Vs0 c2584Vs0, int i) {
        if (i < 1) {
            return null;
        }
        int iX = c2584Vs0.x();
        String strS = s(iX);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c2584Vs0.g(bArr, 0, i2);
        int iU = u(bArr, 0, iX);
        String str = new String(bArr, 0, iU, strS);
        int iR = iU + r(iX);
        return new UrlLinkFrame("WXXX", str, m(bArr, iR, v(bArr, iR), "ISO-8859-1"));
    }

    public static int r(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String s(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(byte[] bArr, int i, int i2) {
        int iV = v(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iV;
        }
        while (iV < bArr.length - 1) {
            if (iV % 2 == 0 && bArr[iV + 1] == 0) {
                return iV;
            }
            iV = v(bArr, iV + 1);
        }
        return bArr.length;
    }

    public static int v(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(C2584Vs0 c2584Vs0, int i) {
        byte[] bArr = c2584Vs0.a;
        int iC = c2584Vs0.c();
        while (true) {
            int i2 = iC + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[iC] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, iC + 2, bArr, i2, (i - iC) - 2);
                i--;
            }
            iC = i2;
        }
    }

    public static boolean x(C2584Vs0 c2584Vs0, int i, int i2, boolean z) {
        int iA;
        long jA;
        int iD;
        int i3;
        int iC = c2584Vs0.c();
        while (true) {
            try {
                boolean z2 = true;
                if (c2584Vs0.a() < i2) {
                    c2584Vs0.J(iC);
                    return true;
                }
                if (i >= 3) {
                    iA = c2584Vs0.i();
                    jA = c2584Vs0.z();
                    iD = c2584Vs0.D();
                } else {
                    iA = c2584Vs0.A();
                    jA = c2584Vs0.A();
                    iD = 0;
                }
                if (iA == 0 && jA == 0 && iD == 0) {
                    c2584Vs0.J(iC);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & jA) != 0) {
                        c2584Vs0.J(iC);
                        return false;
                    }
                    jA = (((jA >> 24) & 255) << 21) | (jA & 255) | (((jA >> 8) & 255) << 7) | (((jA >> 16) & 255) << 14);
                }
                if (i == 4) {
                    i3 = (iD & 64) != 0 ? 1 : 0;
                    if ((iD & 1) == 0) {
                        z2 = false;
                    }
                } else {
                    if (i == 3) {
                        i3 = (iD & 32) != 0 ? 1 : 0;
                        if ((iD & 128) == 0) {
                        }
                    } else {
                        i3 = 0;
                    }
                    z2 = false;
                }
                if (z2) {
                    i3 += 4;
                }
                if (jA < i3) {
                    c2584Vs0.J(iC);
                    return false;
                }
                if (c2584Vs0.a() < jA) {
                    c2584Vs0.J(iC);
                    return false;
                }
                c2584Vs0.K((int) jA);
            } catch (Throwable th) {
                c2584Vs0.J(iC);
                throw th;
            }
        }
    }

    @Override // com.daaw.InterfaceC3516bk0
    public Metadata a(C4073dk0 c4073dk0) {
        ByteBuffer byteBuffer = c4073dk0.D;
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata c(byte[] bArr, int i) throws Throwable {
        ArrayList arrayList = new ArrayList();
        C2584Vs0 c2584Vs0 = new C2584Vs0(bArr, i);
        c cVarK = k(c2584Vs0);
        if (cVarK == null) {
            return null;
        }
        int iC = c2584Vs0.c();
        int i2 = cVarK.a == 2 ? 6 : 10;
        int iW = cVarK.c;
        if (cVarK.b) {
            iW = w(c2584Vs0, cVarK.c);
        }
        c2584Vs0.I(iC + iW);
        boolean z = false;
        if (!x(c2584Vs0, cVarK.a, i2, false)) {
            if (cVarK.a != 4 || !x(c2584Vs0, 4, i2, true)) {
                int unused = cVarK.a;
                return null;
            }
            z = true;
        }
        while (c2584Vs0.a() >= i2) {
            Id3Frame id3FrameI = i(cVarK.a, c2584Vs0, z, i2, this.a);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        return new Metadata(arrayList);
    }

    public OX(b bVar) {
        this.a = bVar;
    }
}
