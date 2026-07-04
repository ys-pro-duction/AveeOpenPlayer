package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BY0 extends AY0 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ List B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, boolean z) {
            super(2);
            this.B = list;
            this.C = z;
        }

        public final C0576Cs0 a(CharSequence charSequence, int i) {
            G10.g(charSequence, "$this$$receiver");
            C0576Cs0 c0576Cs0E = BY0.E(charSequence, this.B, i, this.C, false);
            if (c0576Cs0E != null) {
                return D61.a(c0576Cs0E.c(), Integer.valueOf(((String) c0576Cs0E.d()).length()));
            }
            return null;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ CharSequence B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CharSequence charSequence) {
            super(1);
            this.B = charSequence;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(H00 h00) {
            G10.g(h00, "it");
            return BY0.n0(this.B, h00);
        }
    }

    public static final boolean A(CharSequence charSequence, char c, boolean z) {
        G10.g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC10235zk.d(charSequence.charAt(G(charSequence)), c, z);
    }

    public static final String A0(String str, char c, String str2) {
        G10.g(str, "<this>");
        G10.g(str2, "missingDelimiterValue");
        int iR = R(str, c, 0, false, 6, null);
        if (iR == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iR);
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean B(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AY0.m((String) charSequence, (String) charSequence2, false, 2, null) : a0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    public static String B0(String str, String str2, String str3) {
        G10.g(str, "<this>");
        G10.g(str2, "delimiter");
        G10.g(str3, "missingDelimiterValue");
        int iS = S(str, str2, 0, false, 6, null);
        if (iS == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iS);
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean C(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return A(charSequence, c, z);
    }

    public static /* synthetic */ String C0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return A0(str, c, str2);
    }

    public static /* synthetic */ boolean D(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return B(charSequence, charSequence2, z);
    }

    public static CharSequence D0(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zC = AbstractC9956yk.c(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final C0576Cs0 E(CharSequence charSequence, Collection collection, int i, boolean z, boolean z2) {
        CharSequence charSequence2;
        Object next;
        boolean z3;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) AbstractC2455Um.B0(collection);
            int iM = !z2 ? M(charSequence, str, i, false, 4, null) : S(charSequence, str, i, false, 4, null);
            if (iM < 0) {
                return null;
            }
            return D61.a(Integer.valueOf(iM), str);
        }
        CharSequence charSequence3 = charSequence;
        F00 h00 = !z2 ? new H00(AbstractC8417tE0.d(i, 0), charSequence3.length()) : AbstractC8417tE0.n(AbstractC8417tE0.h(i, G(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iP = h00.p();
            int iS = h00.s();
            int iV = h00.v();
            if ((iV > 0 && iP <= iS) || (iV < 0 && iS <= iP)) {
                int i2 = iP;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = z;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z3 = z;
                        if (AY0.n(str2, 0, (String) charSequence3, i2, str2.length(), z3)) {
                            break;
                        }
                        z = z3;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i2 == iS) {
                            break;
                        }
                        i2 += iV;
                        z = z3;
                    } else {
                        return D61.a(Integer.valueOf(i2), str3);
                    }
                }
            }
        } else {
            boolean z4 = z;
            int iP2 = h00.p();
            int iS2 = h00.s();
            int iV2 = h00.v();
            if ((iV2 > 0 && iP2 <= iS2) || (iV2 < 0 && iS2 <= iP2)) {
                int i3 = iP2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z5 = z4;
                        charSequence2 = charSequence3;
                        z4 = z5;
                        if (a0(str4, 0, charSequence2, i3, str4.length(), z5)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i3 == iS2) {
                            break;
                        }
                        i3 += iV2;
                        charSequence3 = charSequence2;
                    } else {
                        return D61.a(Integer.valueOf(i3), str5);
                    }
                }
            }
        }
        return null;
    }

    public static H00 F(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        return new H00(0, charSequence.length() - 1);
    }

    public static int G(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int H(CharSequence charSequence, char c, int i, boolean z) {
        G10.g(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? N(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static final int I(CharSequence charSequence, String str, int i, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(str, "string");
        return (z || !(charSequence instanceof String)) ? K(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static final int J(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        F00 h00 = !z2 ? new H00(AbstractC8417tE0.d(i, 0), AbstractC8417tE0.h(i2, charSequence.length())) : AbstractC8417tE0.n(AbstractC8417tE0.h(i, G(charSequence)), AbstractC8417tE0.d(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iP = h00.p();
            int iS = h00.s();
            int iV = h00.v();
            if ((iV <= 0 || iP > iS) && (iV >= 0 || iS > iP)) {
                return -1;
            }
            int i3 = iP;
            while (true) {
                boolean z3 = z;
                if (AY0.n((String) charSequence2, 0, (String) charSequence, i3, charSequence2.length(), z3)) {
                    return i3;
                }
                if (i3 == iS) {
                    return -1;
                }
                i3 += iV;
                z = z3;
            }
        } else {
            boolean z4 = z;
            int iP2 = h00.p();
            int iS2 = h00.s();
            int iV2 = h00.v();
            if ((iV2 <= 0 || iP2 > iS2) && (iV2 >= 0 || iS2 > iP2)) {
                return -1;
            }
            int i4 = iP2;
            while (true) {
                boolean z5 = z4;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z4 = z5;
                if (a0(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                    return i4;
                }
                if (i4 == iS2) {
                    return -1;
                }
                i4 += iV2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ int K(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return J(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int L(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return H(charSequence, c, i, z);
    }

    public static /* synthetic */ int M(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return I(charSequence, str, i, z);
    }

    public static final int N(CharSequence charSequence, char[] cArr, int i, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC5431ib.U(cArr), i);
        }
        int iD = AbstractC8417tE0.d(i, 0);
        int iG = G(charSequence);
        if (iD > iG) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iD);
            for (char c : cArr) {
                if (AbstractC10235zk.d(c, cCharAt, z)) {
                    return iD;
                }
            }
            if (iD == iG) {
                return -1;
            }
            iD++;
        }
    }

    public static boolean O(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!AbstractC9956yk.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int P(CharSequence charSequence, char c, int i, boolean z) {
        G10.g(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? T(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int Q(CharSequence charSequence, String str, int i, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(str, "string");
        return (z || !(charSequence instanceof String)) ? J(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ int R(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = G(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return P(charSequence, c, i, z);
    }

    public static /* synthetic */ int S(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = G(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Q(charSequence, str, i, z);
    }

    public static final int T(CharSequence charSequence, char[] cArr, int i, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC5431ib.U(cArr), i);
        }
        for (int iH = AbstractC8417tE0.h(i, G(charSequence)); -1 < iH; iH--) {
            char cCharAt = charSequence.charAt(iH);
            for (char c : cArr) {
                if (AbstractC10235zk.d(c, cCharAt, z)) {
                    return iH;
                }
            }
        }
        return -1;
    }

    public static final KP0 U(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        return i0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List V(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        return UP0.A(U(charSequence));
    }

    public static final CharSequence W(CharSequence charSequence, int i, char c) {
        G10.g(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String X(String str, int i, char c) {
        G10.g(str, "<this>");
        return W(str, i, c).toString();
    }

    public static final KP0 Y(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        d0(i2);
        return new C3863cz(charSequence, i, i2, new a(AbstractC5152hb.d(strArr), z));
    }

    public static /* synthetic */ KP0 Z(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return Y(charSequence, strArr, i, z, i2);
    }

    public static final boolean a0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC10235zk.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String b0(String str, CharSequence charSequence) {
        G10.g(str, "<this>");
        G10.g(charSequence, "prefix");
        if (!m0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String c0(String str, CharSequence charSequence) {
        G10.g(str, "<this>");
        G10.g(charSequence, "suffix");
        if (!D(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void d0(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final List e0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        G10.g(charSequence, "<this>");
        G10.g(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return f0(charSequence, str, z, i);
            }
        }
        Iterable iterableK = UP0.k(Z(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(iterableK, 10));
        Iterator it = iterableK.iterator();
        while (it.hasNext()) {
            arrayList.add(n0(charSequence, (H00) it.next()));
        }
        return arrayList;
    }

    public static final List f0(CharSequence charSequence, String str, boolean z, int i) {
        d0(i);
        int length = 0;
        int I = I(charSequence, str, 0, z);
        if (I == -1 || i == 1) {
            return AbstractC1496Lm.e(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? AbstractC8417tE0.h(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, I).toString());
            length = str.length() + I;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            I = I(charSequence, str, length, z);
        } while (I != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List g0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return e0(charSequence, strArr, z, i);
    }

    public static final KP0 h0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        G10.g(charSequence, "<this>");
        G10.g(strArr, "delimiters");
        return UP0.t(Z(charSequence, strArr, 0, z, i, 2, null), new b(charSequence));
    }

    public static /* synthetic */ KP0 i0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return h0(charSequence, strArr, z, i);
    }

    public static final boolean j0(CharSequence charSequence, char c, boolean z) {
        G10.g(charSequence, "<this>");
        return charSequence.length() > 0 && AbstractC10235zk.d(charSequence.charAt(0), c, z);
    }

    public static final boolean k0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? AY0.u((String) charSequence, (String) charSequence2, false, 2, null) : a0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    public static /* synthetic */ boolean l0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return j0(charSequence, c, z);
    }

    public static /* synthetic */ boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k0(charSequence, charSequence2, z);
    }

    public static final String n0(CharSequence charSequence, H00 h00) {
        G10.g(charSequence, "<this>");
        G10.g(h00, "range");
        return charSequence.subSequence(h00.E().intValue(), h00.D().intValue() + 1).toString();
    }

    public static final String o0(String str, char c, String str2) {
        G10.g(str, "<this>");
        G10.g(str2, "missingDelimiterValue");
        int iL = L(str, c, 0, false, 6, null);
        if (iL == -1) {
            return str2;
        }
        String strSubstring = str.substring(iL + 1, str.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String p0(String str, String str2, String str3) {
        G10.g(str, "<this>");
        G10.g(str2, "delimiter");
        G10.g(str3, "missingDelimiterValue");
        int iM = M(str, str2, 0, false, 6, null);
        if (iM == -1) {
            return str3;
        }
        String strSubstring = str.substring(iM + str2.length(), str.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String q0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return o0(str, c, str2);
    }

    public static /* synthetic */ String r0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return p0(str, str2, str3);
    }

    public static final String s0(String str, char c, String str2) {
        G10.g(str, "<this>");
        G10.g(str2, "missingDelimiterValue");
        int iR = R(str, c, 0, false, 6, null);
        if (iR == -1) {
            return str2;
        }
        String strSubstring = str.substring(iR + 1, str.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String t0(String str, String str2, String str3) {
        G10.g(str, "<this>");
        G10.g(str2, "delimiter");
        G10.g(str3, "missingDelimiterValue");
        int iS = S(str, str2, 0, false, 6, null);
        if (iS == -1) {
            return str3;
        }
        String strSubstring = str.substring(iS + str2.length(), str.length());
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String u0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return s0(str, c, str2);
    }

    public static /* synthetic */ String v0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return t0(str, str2, str3);
    }

    public static final boolean w(CharSequence charSequence, char c, boolean z) {
        G10.g(charSequence, "<this>");
        return L(charSequence, c, 0, z, 2, null) >= 0;
    }

    public static final String w0(String str, char c, String str2) {
        G10.g(str, "<this>");
        G10.g(str2, "missingDelimiterValue");
        int iL = L(str, c, 0, false, 6, null);
        if (iL == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iL);
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        G10.g(charSequence, "<this>");
        G10.g(charSequence2, "other");
        return charSequence2 instanceof String ? M(charSequence, (String) charSequence2, 0, z, 2, null) >= 0 : K(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static final String x0(String str, String str2, String str3) {
        G10.g(str, "<this>");
        G10.g(str2, "delimiter");
        G10.g(str3, "missingDelimiterValue");
        int iM = M(str, str2, 0, false, 6, null);
        if (iM == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM);
        G10.f(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean y(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return w(charSequence, c, z);
    }

    public static /* synthetic */ String y0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return w0(str, c, str2);
    }

    public static /* synthetic */ boolean z(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return x(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String z0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return x0(str, str2, str3);
    }
}
