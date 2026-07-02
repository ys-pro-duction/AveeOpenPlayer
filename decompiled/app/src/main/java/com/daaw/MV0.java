package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class MV0 extends US0 {
    public static final Pattern t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    public final boolean o;
    public int p;
    public int q;
    public int r;
    public int s;

    public MV0(List list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.o = false;
            return;
        }
        this.o = true;
        String strP = AbstractC6280lb1.p((byte[]) list.get(0));
        AbstractC7115ob.a(strP.startsWith("Format: "));
        F(strP);
        G(new C2584Vs0((byte[]) list.get(1)));
    }

    public static long H(String str) {
        Matcher matcher = t.matcher(str);
        if (matcher.matches()) {
            return (Long.parseLong(matcher.group(1)) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }

    @Override // com.daaw.US0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public NV0 z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        C4043de0 c4043de0 = new C4043de0();
        C2584Vs0 c2584Vs0 = new C2584Vs0(bArr, i);
        if (!this.o) {
            G(c2584Vs0);
        }
        E(c2584Vs0, arrayList, c4043de0);
        C1631Mu[] c1631MuArr = new C1631Mu[arrayList.size()];
        arrayList.toArray(c1631MuArr);
        return new NV0(c1631MuArr, c4043de0.d());
    }

    public final void D(String str, List list, C4043de0 c4043de0) {
        long jH;
        if (this.p == 0) {
            return;
        }
        String[] strArrSplit = str.substring(10).split(",", this.p);
        if (strArrSplit.length != this.p) {
            return;
        }
        long jH2 = H(strArrSplit[this.q]);
        if (jH2 == -9223372036854775807L) {
            return;
        }
        String str2 = strArrSplit[this.r];
        if (str2.trim().isEmpty()) {
            jH = -9223372036854775807L;
        } else {
            jH = H(str2);
            if (jH == -9223372036854775807L) {
                return;
            }
        }
        list.add(new C1631Mu(strArrSplit[this.s].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        c4043de0.a(jH2);
        if (jH != -9223372036854775807L) {
            list.add(null);
            c4043de0.a(jH);
        }
    }

    public final void E(C2584Vs0 c2584Vs0, List list, C4043de0 c4043de0) {
        while (true) {
            String strK = c2584Vs0.k();
            if (strK == null) {
                return;
            }
            if (!this.o && strK.startsWith("Format: ")) {
                F(strK);
            } else if (strK.startsWith("Dialogue: ")) {
                D(strK, list, c4043de0);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 8
            java.lang.String r7 = r7.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r7 = android.text.TextUtils.split(r7, r1)
            int r1 = r7.length
            r6.p = r1
            r1 = -1
            r6.q = r1
            r6.r = r1
            r6.s = r1
            r2 = 0
            r3 = 0
        L19:
            int r4 = r6.p
            if (r3 >= r4) goto L61
            r4 = r7[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = com.daaw.AbstractC6280lb1.a0(r4)
            r4.getClass()
            int r5 = r4.hashCode()
            switch(r5) {
                case 100571: goto L49;
                case 3556653: goto L3e;
                case 109757538: goto L33;
                default: goto L31;
            }
        L31:
            r4 = -1
            goto L53
        L33:
            java.lang.String r5 = "start"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3c
            goto L31
        L3c:
            r4 = 2
            goto L53
        L3e:
            java.lang.String r5 = "text"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L47
            goto L31
        L47:
            r4 = 1
            goto L53
        L49:
            java.lang.String r5 = "end"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L52
            goto L31
        L52:
            r4 = 0
        L53:
            switch(r4) {
                case 0: goto L5d;
                case 1: goto L5a;
                case 2: goto L57;
                default: goto L56;
            }
        L56:
            goto L5f
        L57:
            r6.q = r3
            goto L5f
        L5a:
            r6.s = r3
            goto L5f
        L5d:
            r6.r = r3
        L5f:
            int r3 = r3 + r0
            goto L19
        L61:
            int r7 = r6.q
            if (r7 == r1) goto L6f
            int r7 = r6.r
            if (r7 == r1) goto L6f
            int r7 = r6.s
            if (r7 != r1) goto L6e
            goto L6f
        L6e:
            return
        L6f:
            r6.p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.MV0.F(java.lang.String):void");
    }

    public final void G(C2584Vs0 c2584Vs0) {
        String strK;
        do {
            strK = c2584Vs0.k();
            if (strK == null) {
                return;
            }
        } while (!strK.startsWith("[Events]"));
    }
}
