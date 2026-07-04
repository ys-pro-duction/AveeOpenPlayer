package com.daaw;

import android.net.Uri;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.er1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4387er1 implements InterfaceC1086Hn1 {
    public static final InterfaceC1813On1 E = new InterfaceC1813On1() { // from class: com.daaw.ar1
        @Override // com.daaw.InterfaceC1813On1
        public final /* synthetic */ InterfaceC1086Hn1[] a(Uri uri, Map map) {
            int i = AbstractC1709Nn1.a;
            return new InterfaceC1086Hn1[]{new C4387er1(0, null)};
        }
    };
    public static final byte[] F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C2485Ut1 G;
    public boolean D;
    public final byte[] f;
    public final C5900kE2 g;
    public int l;
    public int m;
    public long n;
    public int o;
    public C5900kE2 p;
    public long q;
    public int r;
    public C4108dr1 v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public final List a = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST);
    public final C10262zp1 h = new C10262zp1();
    public final C5900kE2 i = new C5900kE2(16);
    public final C5900kE2 c = new C5900kE2(AbstractC4556fR2.a);
    public final C5900kE2 d = new C5900kE2(5);
    public final C5900kE2 e = new C5900kE2();
    public final ArrayDeque j = new ArrayDeque();
    public final ArrayDeque k = new ArrayDeque();
    public final SparseArray b = new SparseArray();
    public long t = -9223372036854775807L;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public InterfaceC1398Kn1 A = InterfaceC1398Kn1.s;
    public InterfaceC8576to1[] B = new InterfaceC8576to1[0];
    public InterfaceC8576to1[] C = new InterfaceC8576to1[0];

    static {
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.u("application/x-emsg");
        G = c1106Hs1.D();
    }

    public C4387er1(int i, C5916kI2 c5916kI2) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        this.g = new C5900kE2(bArr);
    }

    public static int a(int i) throws QT1 {
        if (i >= 0) {
            return i;
        }
        throw QT1.a("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzad b(java.util.List r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lb9
            java.lang.Object r5 = r14.get(r3)
            com.daaw.Hq1 r5 = (com.daaw.C1098Hq1) r5
            int r6 = r5.a
            r7 = 1886614376(0x70737368, float:3.013775E29)
            if (r6 != r7) goto Lb5
            if (r4 != 0) goto L1e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1e:
            com.daaw.kE2 r5 = r5.b
            byte[] r5 = r5.i()
            com.daaw.kE2 r6 = new com.daaw.kE2
            r6.<init>(r5)
            int r8 = r6.m()
            r9 = 32
            if (r8 >= r9) goto L33
        L31:
            r6 = r2
            goto L99
        L33:
            r6.g(r1)
            int r8 = r6.o()
            int r9 = r6.j()
            int r9 = r9 + 4
            if (r8 == r9) goto L43
            goto L31
        L43:
            int r8 = r6.o()
            if (r8 == r7) goto L4a
            goto L31
        L4a:
            int r7 = r6.o()
            int r7 = com.daaw.AbstractC1202Iq1.a(r7)
            r8 = 1
            if (r7 <= r8) goto L6c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            com.daaw.AbstractC3305ay2.f(r7, r6)
            goto L31
        L6c:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.B()
            long r12 = r6.B()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L84
            int r8 = r6.x()
            int r8 = r8 * 16
            r6.h(r8)
        L84:
            int r8 = r6.x()
            int r10 = r6.j()
            if (r8 == r10) goto L8f
            goto L31
        L8f:
            byte[] r10 = new byte[r8]
            r6.c(r10, r1, r8)
            com.daaw.kr1 r6 = new com.daaw.kr1
            r6.<init>(r9, r7, r10)
        L99:
            if (r6 != 0) goto L9d
            r6 = r2
            goto La1
        L9d:
            java.util.UUID r6 = com.daaw.C6081kr1.a(r6)
        La1:
            if (r6 != 0) goto Lab
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            com.daaw.AbstractC3305ay2.f(r5, r6)
            goto Lb5
        Lab:
            com.google.android.gms.internal.ads.zzac r7 = new com.google.android.gms.internal.ads.zzac
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r2, r8, r5)
            r4.add(r7)
        Lb5:
            int r3 = r3 + 1
            goto L8
        Lb9:
            if (r4 != 0) goto Lbc
            return r2
        Lbc:
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4387er1.b(java.util.List):com.google.android.gms.internal.ads.zzad");
    }

    public static void d(C5900kE2 c5900kE2, int i, C7476pr1 c7476pr1) throws QT1 {
        c5900kE2.g(i + 8);
        int iO = c5900kE2.o();
        if ((iO & 1) != 0) {
            throw QT1.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iO & 2) != 0;
        int iX = c5900kE2.x();
        if (iX == 0) {
            Arrays.fill(c7476pr1.l, 0, c7476pr1.e, false);
            return;
        }
        int i2 = c7476pr1.e;
        if (iX != i2) {
            throw QT1.a("Senc sample count " + iX + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(c7476pr1.l, 0, iX, z);
        c7476pr1.a(c5900kE2.j());
        C5900kE2 c5900kE22 = c7476pr1.n;
        c5900kE2.c(c5900kE22.i(), 0, c5900kE22.m());
        c7476pr1.n.g(0);
        c7476pr1.o = false;
    }

    public static final C2993Zq1 f(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C2993Zq1) sparseArray.valueAt(0);
        }
        C2993Zq1 c2993Zq1 = (C2993Zq1) sparseArray.get(i);
        c2993Zq1.getClass();
        return c2993Zq1;
    }

    public final void c() {
        this.l = 0;
        this.o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x0724, code lost:
    
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0727, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r52) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4387er1.e(long):void");
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void k(long j, long j2) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((C4108dr1) this.b.valueAt(i)).i();
        }
        this.k.clear();
        this.r = 0;
        this.s = j2;
        this.j.clear();
        c();
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final boolean l(InterfaceC1190In1 interfaceC1190In1) {
        return AbstractC6639mr1.a(interfaceC1190In1);
    }

    @Override // com.daaw.InterfaceC1086Hn1
    public final void m(InterfaceC1398Kn1 interfaceC1398Kn1) {
        this.A = interfaceC1398Kn1;
        c();
        InterfaceC8576to1[] interfaceC8576to1Arr = new InterfaceC8576to1[2];
        this.B = interfaceC8576to1Arr;
        int i = 0;
        InterfaceC8576to1[] interfaceC8576to1Arr2 = (InterfaceC8576to1[]) AbstractC9004vJ2.j(interfaceC8576to1Arr, 0);
        this.B = interfaceC8576to1Arr2;
        for (InterfaceC8576to1 interfaceC8576to1 : interfaceC8576to1Arr2) {
            interfaceC8576to1.e(G);
        }
        this.C = new InterfaceC8576to1[this.a.size()];
        int i2 = 100;
        while (i < this.C.length) {
            int i3 = i2 + 1;
            InterfaceC8576to1 interfaceC8576to1O = this.A.o(i2, 3);
            interfaceC8576to1O.e((C2485Ut1) this.a.get(i));
            this.C[i] = interfaceC8576to1O;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f2, code lost:
    
        r39.e.d(r13);
        ((com.daaw.C9694xn1) r40).f(r39.e.i(), 0, r39.y, false);
        r6.b(r39.e, r39.y);
        r3 = r39.y;
        r5 = r39.e;
        r5 = com.daaw.AbstractC4556fR2.b(r5.i(), r5.m());
        r39.e.g("video/hevc".equals(r2.f.l) ? 1 : 0);
        r39.e.f(r5);
        com.daaw.AbstractC7177on1.a(r7, r39.e, r39.C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0239, code lost:
    
        r3 = r6.f(r40, r13, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0241, code lost:
    
        r39.x += r3;
        r39.y -= r3;
        r3 = 1;
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x024e, code lost:
    
        r22 = r4.a();
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0256, code lost:
    
        if (r1 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0258, code lost:
    
        r25 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x025d, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x025f, code lost:
    
        r6.c(r7, r22, r39.w, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0272, code lost:
    
        if (r39.k.isEmpty() != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0274, code lost:
    
        r1 = (com.daaw.C3830cr1) r39.k.removeFirst();
        r39.r -= r1.c;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0287, code lost:
    
        if (r1.b == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0289, code lost:
    
        r2 = r2 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x028b, code lost:
    
        r29 = r2;
        r2 = r39.B;
        r3 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0291, code lost:
    
        if (r5 >= r3) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0293, code lost:
    
        r2[r5].c(r29, 1, r1.c, r39.r, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ab, code lost:
    
        if (r4.k() != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ad, code lost:
    
        r39.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02af, code lost:
    
        r39.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r39.l != 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        r2 = r4.b();
        r39.w = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r4.f >= r4.i) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        ((com.daaw.C9694xn1) r40).m(r2, false);
        r1 = r4.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        r2 = r4.b.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r2.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
    
        if (r4.b.b(r4.f) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
    
        r2.h(r2.y() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e9, code lost:
    
        if (r4.k() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        r39.v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ed, code lost:
    
        r39.l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f9, code lost:
    
        if (r4.d.a.g != 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
    
        r39.w = r2 - 8;
        ((com.daaw.C9694xn1) r40).m(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0113, code lost:
    
        if ("audio/ac4".equals(r4.d.a.f.l) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
    
        r39.x = r4.c(r39.w, 7);
        com.daaw.AbstractC4656fn1.b(r39.w, r39.g);
        r4.a.b(r39.g, 7);
        r2 = r39.x + 7;
        r39.x = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
    
        r2 = r4.c(r39.w, 0);
        r39.x = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013a, code lost:
    
        r39.w += r2;
        r39.l = 4;
        r39.y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r2 = r4.d.a;
        r6 = r4.a;
        r7 = r4.e();
        r11 = r2.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        if (r11 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0152, code lost:
    
        r2 = r39.x;
        r5 = r39.w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        if (r2 >= r5) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        r39.x += r6.f(r40, r5 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0167, code lost:
    
        r12 = r39.d.i();
        r12[0] = 0;
        r12[1] = 0;
        r12[r17] = 0;
        r14 = r11 + 1;
        r11 = 4 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017d, code lost:
    
        if (r39.x >= r39.w) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017f, code lost:
    
        r13 = r39.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
    
        if (r13 != 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        ((com.daaw.C9694xn1) r40).f(r12, r11, r14, r10);
        r39.d.g(r10);
        r13 = r39.d.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0196, code lost:
    
        if (r13 <= 0) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
    
        r39.y = r13 - 1;
        r39.c.g(r10);
        r6.b(r39.c, 4);
        r6.b(r39.d, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01af, code lost:
    
        if (r39.C.length <= 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b1, code lost:
    
        r13 = r2.f.l;
        r17 = r12[4];
        r10 = com.daaw.AbstractC4556fR2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if ("video/avc".equals(r13) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
    
        if ((r17 & 31) == r5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c6, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
    
        if ("video/hevc".equals(r13) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
    
        if (((r17 & 126) >> r3) != 39) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d6, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d7, code lost:
    
        r39.z = r10;
        r39.x += 5;
        r39.w += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ed, code lost:
    
        throw com.daaw.QT1.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        if (r39.z == false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.daaw.InterfaceC1086Hn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(com.daaw.InterfaceC1190In1 r40, com.daaw.C6057ko1 r41) throws com.daaw.QT1, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 1875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4387er1.n(com.daaw.In1, com.daaw.ko1):int");
    }
}
