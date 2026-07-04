package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.daaw.Rz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2194Rz0 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        FG.h(inputStream);
        int iJ = FG.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            FG.j(inputStream);
            for (int iJ2 = FG.j(inputStream); iJ2 > 0; iJ2--) {
                FG.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, JB[] jbArr) throws IOException {
        if (Arrays.equals(bArr, AbstractC2300Sz0.a)) {
            N(outputStream, jbArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2300Sz0.b)) {
            M(outputStream, jbArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2300Sz0.d)) {
            K(outputStream, jbArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC2300Sz0.c)) {
            L(outputStream, jbArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC2300Sz0.e)) {
            return false;
        }
        J(outputStream, jbArr);
        return true;
    }

    public static void C(OutputStream outputStream, JB jb) throws IOException {
        int[] iArr = jb.h;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            FG.p(outputStream, i3 - i2);
            i++;
            i2 = i3;
        }
    }

    public static C7715qj1 D(JB[] jbArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            FG.p(byteArrayOutputStream, jbArr.length);
            int i = 2;
            for (JB jb : jbArr) {
                FG.q(byteArrayOutputStream, jb.c);
                FG.q(byteArrayOutputStream, jb.d);
                FG.q(byteArrayOutputStream, jb.g);
                String strJ = j(jb.a, jb.b, AbstractC2300Sz0.a);
                int iK = FG.k(strJ);
                FG.p(byteArrayOutputStream, iK);
                i = i + 14 + iK;
                FG.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C7715qj1 c7715qj1 = new C7715qj1(PK.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return c7715qj1;
            }
            throw FG.c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, JB jb) throws IOException {
        I(outputStream, jb);
        C(outputStream, jb);
        H(outputStream, jb);
    }

    public static void G(OutputStream outputStream, JB jb, String str) throws IOException {
        FG.p(outputStream, FG.k(str));
        FG.p(outputStream, jb.e);
        FG.q(outputStream, jb.f);
        FG.q(outputStream, jb.c);
        FG.q(outputStream, jb.g);
        FG.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, JB jb) throws IOException {
        byte[] bArr = new byte[k(jb.g)];
        for (Map.Entry entry : jb.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, jb);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, jb);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, JB jb) throws IOException {
        int i = 0;
        for (Map.Entry entry : jb.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                FG.p(outputStream, iIntValue - i);
                FG.p(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, JB[] jbArr) throws IOException {
        FG.p(outputStream, jbArr.length);
        for (JB jb : jbArr) {
            String strJ = j(jb.a, jb.b, AbstractC2300Sz0.e);
            FG.p(outputStream, FG.k(strJ));
            FG.p(outputStream, jb.i.size());
            FG.p(outputStream, jb.h.length);
            FG.q(outputStream, jb.c);
            FG.n(outputStream, strJ);
            Iterator it = jb.i.keySet().iterator();
            while (it.hasNext()) {
                FG.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i : jb.h) {
                FG.p(outputStream, i);
            }
        }
    }

    public static void K(OutputStream outputStream, JB[] jbArr) throws IOException {
        FG.r(outputStream, jbArr.length);
        for (JB jb : jbArr) {
            int size = jb.i.size() * 4;
            String strJ = j(jb.a, jb.b, AbstractC2300Sz0.d);
            FG.p(outputStream, FG.k(strJ));
            FG.p(outputStream, jb.h.length);
            FG.q(outputStream, size);
            FG.q(outputStream, jb.c);
            FG.n(outputStream, strJ);
            Iterator it = jb.i.keySet().iterator();
            while (it.hasNext()) {
                FG.p(outputStream, ((Integer) it.next()).intValue());
                FG.p(outputStream, 0);
            }
            for (int i : jb.h) {
                FG.p(outputStream, i);
            }
        }
    }

    public static void L(OutputStream outputStream, JB[] jbArr) throws IOException {
        byte[] bArrB = b(jbArr, AbstractC2300Sz0.c);
        FG.r(outputStream, jbArr.length);
        FG.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, JB[] jbArr) throws IOException {
        byte[] bArrB = b(jbArr, AbstractC2300Sz0.b);
        FG.r(outputStream, jbArr.length);
        FG.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, JB[] jbArr) throws IOException {
        O(outputStream, jbArr);
    }

    public static void O(OutputStream outputStream, JB[] jbArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(jbArr));
        arrayList.add(c(jbArr));
        arrayList.add(d(jbArr));
        long length2 = ((long) AbstractC2300Sz0.a.length) + ((long) a.length) + 4 + ((long) (arrayList.size() * 16));
        FG.q(outputStream, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            C7715qj1 c7715qj1 = (C7715qj1) arrayList.get(i);
            FG.q(outputStream, c7715qj1.a.c());
            FG.q(outputStream, length2);
            if (c7715qj1.d) {
                byte[] bArr = c7715qj1.c;
                long length3 = bArr.length;
                byte[] bArrB = FG.b(bArr);
                arrayList2.add(bArrB);
                FG.q(outputStream, bArrB.length);
                FG.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(c7715qj1.c);
                FG.q(outputStream, c7715qj1.c.length);
                FG.q(outputStream, 0L);
                length = c7715qj1.c.length;
            }
            length2 += (long) length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static int a(JB jb) {
        Iterator it = jb.i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static byte[] b(JB[] jbArr, byte[] bArr) throws IOException {
        int i = 0;
        int iK = 0;
        for (JB jb : jbArr) {
            iK += FG.k(j(jb.a, jb.b, bArr)) + 16 + (jb.e * 2) + jb.f + k(jb.g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, AbstractC2300Sz0.c)) {
            int length = jbArr.length;
            while (i < length) {
                JB jb2 = jbArr[i];
                G(byteArrayOutputStream, jb2, j(jb2.a, jb2.b, bArr));
                F(byteArrayOutputStream, jb2);
                i++;
            }
        } else {
            for (JB jb3 : jbArr) {
                G(byteArrayOutputStream, jb3, j(jb3.a, jb3.b, bArr));
            }
            int length2 = jbArr.length;
            while (i < length2) {
                F(byteArrayOutputStream, jbArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw FG.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static C7715qj1 c(JB[] jbArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < jbArr.length; i2++) {
            try {
                JB jb = jbArr[i2];
                FG.p(byteArrayOutputStream, i2);
                FG.p(byteArrayOutputStream, jb.e);
                i = i + 4 + (jb.e * 2);
                C(byteArrayOutputStream, jb);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C7715qj1 c7715qj1 = new C7715qj1(PK.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return c7715qj1;
        }
        throw FG.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static C7715qj1 d(JB[] jbArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < jbArr.length; i2++) {
            try {
                JB jb = jbArr[i2];
                int iA = a(jb);
                byte[] bArrE = e(jb);
                byte[] bArrF = f(jb);
                FG.p(byteArrayOutputStream, i2);
                int length = bArrE.length + 2 + bArrF.length;
                FG.q(byteArrayOutputStream, length);
                FG.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i = i + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            C7715qj1 c7715qj1 = new C7715qj1(PK.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return c7715qj1;
        }
        throw FG.c("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(JB jb) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, jb);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(JB jb) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, jb);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "!") : Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(str2) ? str.replace("!", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static JB i(JB[] jbArr, String str) {
        if (jbArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i = 0; i < jbArr.length; i++) {
            if (jbArr[i].b.equals(strH)) {
                return jbArr[i];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = AbstractC2300Sz0.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC2300Sz0.a(bArr) + str2;
    }

    public static int k(int i) {
        return y(i * 2) / 8;
    }

    public static int l(int i, int i2, int i3) {
        if (i == 1) {
            throw FG.c("HOT methods are not stored in the bitmap");
        }
        if (i == 2) {
            return i2;
        }
        if (i == 4) {
            return i2 + i3;
        }
        throw FG.c("Unexpected flag: " + i);
    }

    public static int[] m(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iH = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iH += FG.h(inputStream);
            iArr[i2] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(l(2, i, i2)) ? 2 : 0;
        return bitSet.get(l(4, i, i2)) ? i3 | 4 : i3;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, FG.d(inputStream, bArr.length))) {
            return FG.d(inputStream, AbstractC2300Sz0.b.length);
        }
        throw FG.c("Invalid magic");
    }

    public static void p(InputStream inputStream, JB jb) {
        int iAvailable = inputStream.available() - jb.f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += FG.h(inputStream);
            jb.i.put(Integer.valueOf(iH), 1);
            for (int iH2 = FG.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw FG.c("Read too much data during profile line parse");
        }
    }

    public static JB[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, JB[] jbArr) {
        if (Arrays.equals(bArr, AbstractC2300Sz0.f)) {
            if (Arrays.equals(AbstractC2300Sz0.a, bArr2)) {
                throw FG.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, jbArr);
        }
        if (Arrays.equals(bArr, AbstractC2300Sz0.g)) {
            return t(inputStream, bArr2, jbArr);
        }
        throw FG.c("Unsupported meta version");
    }

    public static JB[] r(InputStream inputStream, byte[] bArr, JB[] jbArr) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2300Sz0.f)) {
            throw FG.c("Unsupported meta version");
        }
        int iJ = FG.j(inputStream);
        byte[] bArrE = FG.e(inputStream, (int) FG.i(inputStream), (int) FG.i(inputStream));
        if (inputStream.read() > 0) {
            throw FG.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            JB[] jbArrS = s(byteArrayInputStream, iJ, jbArr);
            byteArrayInputStream.close();
            return jbArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JB[] s(InputStream inputStream, int i, JB[] jbArr) {
        if (inputStream.available() == 0) {
            return new JB[0];
        }
        if (i != jbArr.length) {
            throw FG.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = FG.h(inputStream);
            iArr[i2] = FG.h(inputStream);
            strArr[i2] = FG.f(inputStream, iH);
        }
        for (int i3 = 0; i3 < i; i3++) {
            JB jb = jbArr[i3];
            if (!jb.b.equals(strArr[i3])) {
                throw FG.c("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            jb.e = i4;
            jb.h = m(inputStream, i4);
        }
        return jbArr;
    }

    public static JB[] t(InputStream inputStream, byte[] bArr, JB[] jbArr) throws IOException {
        int iH = FG.h(inputStream);
        byte[] bArrE = FG.e(inputStream, (int) FG.i(inputStream), (int) FG.i(inputStream));
        if (inputStream.read() > 0) {
            throw FG.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            JB[] jbArrU = u(byteArrayInputStream, bArr, iH, jbArr);
            byteArrayInputStream.close();
            return jbArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JB[] u(InputStream inputStream, byte[] bArr, int i, JB[] jbArr) {
        if (inputStream.available() == 0) {
            return new JB[0];
        }
        if (i != jbArr.length) {
            throw FG.c("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            FG.h(inputStream);
            String strF = FG.f(inputStream, FG.h(inputStream));
            long jI = FG.i(inputStream);
            int iH = FG.h(inputStream);
            JB jbI = i(jbArr, strF);
            if (jbI == null) {
                throw FG.c("Missing profile key: " + strF);
            }
            jbI.d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, AbstractC2300Sz0.e)) {
                jbI.e = iH;
                jbI.h = iArrM;
            }
        }
        return jbArr;
    }

    public static void v(InputStream inputStream, JB jb) {
        BitSet bitSetValueOf = BitSet.valueOf(FG.d(inputStream, FG.a(jb.g * 2)));
        int i = 0;
        while (true) {
            int i2 = jb.g;
            if (i >= i2) {
                return;
            }
            int iN = n(bitSetValueOf, i, i2);
            if (iN != 0) {
                Integer num = (Integer) jb.i.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                jb.i.put(Integer.valueOf(i), Integer.valueOf(iN | num.intValue()));
            }
            i++;
        }
    }

    public static JB[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC2300Sz0.b)) {
            throw FG.c("Unsupported version");
        }
        int iJ = FG.j(inputStream);
        byte[] bArrE = FG.e(inputStream, (int) FG.i(inputStream), (int) FG.i(inputStream));
        if (inputStream.read() > 0) {
            throw FG.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            JB[] jbArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return jbArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static JB[] x(InputStream inputStream, String str, int i) {
        if (inputStream.available() == 0) {
            return new JB[0];
        }
        JB[] jbArr = new JB[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iH = FG.h(inputStream);
            int iH2 = FG.h(inputStream);
            long jI = FG.i(inputStream);
            jbArr[i2] = new JB(str, FG.f(inputStream, iH), FG.i(inputStream), 0L, iH2, (int) jI, (int) FG.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            JB jb = jbArr[i3];
            p(inputStream, jb);
            jb.h = m(inputStream, jb.e);
            v(inputStream, jb);
        }
        return jbArr;
    }

    public static int y(int i) {
        return (i + 7) & (-8);
    }

    public static void z(byte[] bArr, int i, int i2, JB jb) {
        int iL = l(i, i2, jb.g);
        int i3 = iL / 8;
        bArr[i3] = (byte) ((1 << (iL % 8)) | bArr[i3]);
    }
}
