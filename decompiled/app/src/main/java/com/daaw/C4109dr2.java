package com.daaw;

import com.google.ads.AdSize;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.daaw.dr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4109dr2 implements InterfaceC7500pw2 {
    public static final int[] o = new int[0];
    public static final Unsafe p = AbstractC4247eM2.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final InterfaceC7467pp2 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final AbstractC5468ii2 j;
    public final AbstractC9550xG2 k;
    public final AbstractC4850gV1 l;
    public final C2064Qs2 m;
    public final C5488im2 n;

    public C4109dr2(int[] iArr, Object[] objArr, int i, int i2, InterfaceC7467pp2 interfaceC7467pp2, int i3, boolean z, int[] iArr2, int i4, int i5, C2064Qs2 c2064Qs2, AbstractC5468ii2 abstractC5468ii2, AbstractC9550xG2 abstractC9550xG2, AbstractC4850gV1 abstractC4850gV1, C5488im2 c5488im2) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z2 = false;
        if (abstractC4850gV1 != null && abstractC4850gV1.f(interfaceC7467pp2)) {
            z2 = true;
        }
        this.f = z2;
        this.g = iArr2;
        this.h = i4;
        this.i = i5;
        this.m = c2064Qs2;
        this.j = abstractC5468ii2;
        this.k = abstractC9550xG2;
        this.l = abstractC4850gV1;
        this.e = interfaceC7467pp2;
        this.n = c5488im2;
    }

    public static float A(Object obj, long j) {
        return ((Float) AbstractC4247eM2.k(obj, j)).floatValue();
    }

    public static int B(Object obj, long j) {
        return ((Integer) AbstractC4247eM2.k(obj, j)).intValue();
    }

    public static int E(int i) {
        return (i >>> 20) & 255;
    }

    public static long G(Object obj, long j) {
        return ((Long) AbstractC4247eM2.k(obj, j)).longValue();
    }

    public static Field M(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void h(Object obj) {
        if (!s(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    public static boolean r(Object obj, int i, InterfaceC7500pw2 interfaceC7500pw2) {
        return interfaceC7500pw2.c(AbstractC4247eM2.k(obj, i & 1048575));
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof F32) {
            return ((F32) obj).t();
        }
        return true;
    }

    public static boolean u(Object obj, long j) {
        return ((Boolean) AbstractC4247eM2.k(obj, j)).booleanValue();
    }

    public static final void v(int i, Object obj, InterfaceC10148zQ2 interfaceC10148zQ2) {
        if (obj instanceof String) {
            interfaceC10148zQ2.t(i, (String) obj);
        } else {
            interfaceC10148zQ2.E(i, (BM1) obj);
        }
    }

    public static C3113aH2 x(Object obj) {
        F32 f32 = (F32) obj;
        C3113aH2 c3113aH2 = f32.zzc;
        if (c3113aH2 != C3113aH2.c()) {
            return c3113aH2;
        }
        C3113aH2 c3113aH2F = C3113aH2.f();
        f32.zzc = c3113aH2F;
        return c3113aH2F;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C4109dr2 y(java.lang.Class r32, com.daaw.InterfaceC8014rn2 r33, com.daaw.C2064Qs2 r34, com.daaw.AbstractC5468ii2 r35, com.daaw.AbstractC9550xG2 r36, com.daaw.AbstractC4850gV1 r37, com.daaw.C5488im2 r38) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.y(java.lang.Class, com.daaw.rn2, com.daaw.Qs2, com.daaw.ii2, com.daaw.xG2, com.daaw.gV1, com.daaw.im2):com.daaw.dr2");
    }

    public static double z(Object obj, long j) {
        return ((Double) AbstractC4247eM2.k(obj, j)).doubleValue();
    }

    public final int C(int i) {
        return this.a[i + 2];
    }

    public final int D(int i, int i2) {
        int length = (this.a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int F(int i) {
        return this.a[i + 1];
    }

    public final X52 H(int i) {
        int i2 = i / 3;
        return (X52) this.b[i2 + i2 + 1];
    }

    public final InterfaceC7500pw2 I(int i) {
        Object[] objArr = this.b;
        int i2 = i / 3;
        int i3 = i2 + i2;
        InterfaceC7500pw2 interfaceC7500pw2 = (InterfaceC7500pw2) objArr[i3];
        if (interfaceC7500pw2 != null) {
            return interfaceC7500pw2;
        }
        InterfaceC7500pw2 interfaceC7500pw2B = C0586Cu2.a().b((Class) objArr[i3 + 1]);
        this.b[i3] = interfaceC7500pw2B;
        return interfaceC7500pw2B;
    }

    public final Object J(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final Object K(Object obj, int i) {
        InterfaceC7500pw2 interfaceC7500pw2I = I(i);
        int iF = F(i) & 1048575;
        if (!p(obj, i)) {
            return interfaceC7500pw2I.zze();
        }
        Object object = p.getObject(obj, iF);
        if (s(object)) {
            return object;
        }
        Object objZze = interfaceC7500pw2I.zze();
        if (object != null) {
            interfaceC7500pw2I.d(objZze, object);
        }
        return objZze;
    }

    public final Object L(Object obj, int i, int i2) {
        InterfaceC7500pw2 interfaceC7500pw2I = I(i2);
        if (!t(obj, i, i2)) {
            return interfaceC7500pw2I.zze();
        }
        Object object = p.getObject(obj, F(i2) & 1048575);
        if (s(object)) {
            return object;
        }
        Object objZze = interfaceC7500pw2I.zze();
        if (object != null) {
            interfaceC7500pw2I.d(objZze, object);
        }
        return objZze;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final int a(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.a.length; i5 += 3) {
            int iF = F(i5);
            int[] iArr = this.a;
            int i6 = 1048575 & iF;
            int iE = E(iF);
            int i7 = iArr[i5];
            long j = i6;
            int iHashCode = 37;
            switch (iE) {
                case 0:
                    i = i4 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC4247eM2.f(obj, j));
                    Charset charset = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i4 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC4247eM2.g(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 2:
                    i = i4 * 53;
                    jDoubleToLongBits = AbstractC4247eM2.i(obj, j);
                    Charset charset2 = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i4 * 53;
                    jDoubleToLongBits = AbstractC4247eM2.i(obj, j);
                    Charset charset3 = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 5:
                    i = i4 * 53;
                    jDoubleToLongBits = AbstractC4247eM2.i(obj, j);
                    Charset charset4 = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 7:
                    i2 = i4 * 53;
                    iFloatToIntBits = J82.a(AbstractC4247eM2.B(obj, j));
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 8:
                    i2 = i4 * 53;
                    iFloatToIntBits = ((String) AbstractC4247eM2.k(obj, j)).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object objK = AbstractC4247eM2.k(obj, j);
                    if (objK != null) {
                        iHashCode = objK.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case 10:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 11:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 12:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 13:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 14:
                    i = i4 * 53;
                    jDoubleToLongBits = AbstractC4247eM2.i(obj, j);
                    Charset charset5 = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.h(obj, j);
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 16:
                    i = i4 * 53;
                    jDoubleToLongBits = AbstractC4247eM2.i(obj, j);
                    Charset charset6 = J82.a;
                    i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i3 = i4 * 53;
                    Object objK2 = AbstractC4247eM2.k(obj, j);
                    if (objK2 != null) {
                        iHashCode = objK2.hashCode();
                    }
                    i4 = i3 + iHashCode;
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    i2 = i4 * 53;
                    iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                    i4 = i2 + iFloatToIntBits;
                    break;
                case 51:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(z(obj, j));
                        Charset charset7 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = Float.floatToIntBits(A(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = G(obj, j);
                        Charset charset8 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = G(obj, j);
                        Charset charset9 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = G(obj, j);
                        Charset charset10 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = J82.a(u(obj, j));
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = ((String) AbstractC4247eM2.k(obj, j)).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = G(obj, j);
                        Charset charset11 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = B(obj, j);
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (t(obj, i7, i5)) {
                        i = i4 * 53;
                        jDoubleToLongBits = G(obj, j);
                        Charset charset12 = J82.a;
                        i4 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (t(obj, i7, i5)) {
                        i2 = i4 * 53;
                        iFloatToIntBits = AbstractC4247eM2.k(obj, j).hashCode();
                        i4 = i2 + iFloatToIntBits;
                    }
                    break;
            }
        }
        int iHashCode2 = (i4 * 53) + this.k.d(obj).hashCode();
        return this.f ? (iHashCode2 * 53) + this.l.b(obj).a.hashCode() : iHashCode2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    @Override // com.daaw.InterfaceC7500pw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.b(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    @Override // com.daaw.InterfaceC7500pw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.c(java.lang.Object):boolean");
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void d(Object obj, Object obj2) {
        h(obj);
        obj2.getClass();
        for (int i = 0; i < this.a.length; i += 3) {
            int iF = F(i);
            int i2 = 1048575 & iF;
            int[] iArr = this.a;
            int iE = E(iF);
            int i3 = iArr[i];
            long j = i2;
            switch (iE) {
                case 0:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.t(obj, j, AbstractC4247eM2.f(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 1:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.u(obj, j, AbstractC4247eM2.g(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 2:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.w(obj, j, AbstractC4247eM2.i(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 3:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.w(obj, j, AbstractC4247eM2.i(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 4:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 5:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.w(obj, j, AbstractC4247eM2.i(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 6:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 7:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.r(obj, j, AbstractC4247eM2.B(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 8:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.x(obj, j, AbstractC4247eM2.k(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 9:
                    i(obj, obj2, i);
                    break;
                case 10:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.x(obj, j, AbstractC4247eM2.k(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 11:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 12:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 13:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 14:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.w(obj, j, AbstractC4247eM2.i(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 15:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.v(obj, j, AbstractC4247eM2.h(obj2, j));
                        k(obj, i);
                    }
                    break;
                case 16:
                    if (p(obj2, i)) {
                        AbstractC4247eM2.w(obj, j, AbstractC4247eM2.i(obj2, j));
                        k(obj, i);
                    }
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    i(obj, obj2, i);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.j.b(obj, obj2, j);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    Class cls = AbstractC9742xx2.a;
                    AbstractC4247eM2.x(obj, j, C5488im2.a(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (t(obj2, i3, i)) {
                        AbstractC4247eM2.x(obj, j, AbstractC4247eM2.k(obj2, j));
                        l(obj, i3, i);
                    }
                    break;
                case 60:
                    j(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(obj2, i3, i)) {
                        AbstractC4247eM2.x(obj, j, AbstractC4247eM2.k(obj2, j));
                        l(obj, i3, i);
                    }
                    break;
                case 68:
                    j(obj, obj2, i);
                    break;
            }
        }
        AbstractC9742xx2.x(this.k, obj, obj2);
        if (this.f) {
            AbstractC9742xx2.w(this.l, obj, obj2);
        }
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final boolean e(Object obj, Object obj2) {
        boolean zG;
        for (int i = 0; i < this.a.length; i += 3) {
            int iF = F(i);
            long j = iF & 1048575;
            switch (E(iF)) {
                case 0:
                    if (!o(obj, obj2, i) || Double.doubleToLongBits(AbstractC4247eM2.f(obj, j)) != Double.doubleToLongBits(AbstractC4247eM2.f(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!o(obj, obj2, i) || Float.floatToIntBits(AbstractC4247eM2.g(obj, j)) != Float.floatToIntBits(AbstractC4247eM2.g(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.i(obj, j) != AbstractC4247eM2.i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.i(obj, j) != AbstractC4247eM2.i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.i(obj, j) != AbstractC4247eM2.i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.B(obj, j) != AbstractC4247eM2.B(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!o(obj, obj2, i) || !AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!o(obj, obj2, i) || !AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!o(obj, obj2, i) || !AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.i(obj, j) != AbstractC4247eM2.i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.h(obj, j) != AbstractC4247eM2.h(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!o(obj, obj2, i) || AbstractC4247eM2.i(obj, j) != AbstractC4247eM2.i(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!o(obj, obj2, i) || !AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zG = AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j));
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    zG = AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jC = C(i) & 1048575;
                    if (AbstractC4247eM2.h(obj, jC) != AbstractC4247eM2.h(obj2, jC) || !AbstractC9742xx2.g(AbstractC4247eM2.k(obj, j), AbstractC4247eM2.k(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!zG) {
                return false;
            }
        }
        if (!this.k.d(obj).equals(this.k.d(obj2))) {
            return false;
        }
        if (this.f) {
            return this.l.b(obj).equals(this.l.b(obj2));
        }
        return true;
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final void f(Object obj, byte[] bArr, int i, int i2, C6745nE1 c6745nE1) throws U92 {
        w(obj, bArr, i, i2, 0, c6745nE1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.daaw.InterfaceC7500pw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r20, com.daaw.InterfaceC10148zQ2 r21) {
        /*
            Method dump skipped, instruction units count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.g(java.lang.Object, com.daaw.zQ2):void");
    }

    public final void i(Object obj, Object obj2, int i) {
        if (p(obj2, i)) {
            int iF = F(i) & 1048575;
            Unsafe unsafe = p;
            long j = iF;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC7500pw2 interfaceC7500pw2I = I(i);
            if (!p(obj, i)) {
                if (s(object)) {
                    Object objZze = interfaceC7500pw2I.zze();
                    interfaceC7500pw2I.d(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                k(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!s(object2)) {
                Object objZze2 = interfaceC7500pw2I.zze();
                interfaceC7500pw2I.d(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC7500pw2I.d(object2, object);
        }
    }

    public final void j(Object obj, Object obj2, int i) {
        int i2 = this.a[i];
        if (t(obj2, i2, i)) {
            int iF = F(i) & 1048575;
            Unsafe unsafe = p;
            long j = iF;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            InterfaceC7500pw2 interfaceC7500pw2I = I(i);
            if (!t(obj, i2, i)) {
                if (s(object)) {
                    Object objZze = interfaceC7500pw2I.zze();
                    interfaceC7500pw2I.d(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                l(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!s(object2)) {
                Object objZze2 = interfaceC7500pw2I.zze();
                interfaceC7500pw2I.d(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            interfaceC7500pw2I.d(object2, object);
        }
    }

    public final void k(Object obj, int i) {
        int iC = C(i);
        long j = 1048575 & iC;
        if (j == 1048575) {
            return;
        }
        AbstractC4247eM2.v(obj, j, (1 << (iC >>> 20)) | AbstractC4247eM2.h(obj, j));
    }

    public final void l(Object obj, int i, int i2) {
        AbstractC4247eM2.v(obj, C(i2) & 1048575, i);
    }

    public final void m(Object obj, int i, Object obj2) {
        p.putObject(obj, F(i) & 1048575, obj2);
        k(obj, i);
    }

    public final void n(Object obj, int i, int i2, Object obj2) {
        p.putObject(obj, F(i2) & 1048575, obj2);
        l(obj, i, i2);
    }

    public final boolean o(Object obj, Object obj2, int i) {
        return p(obj, i) == p(obj2, i);
    }

    public final boolean p(Object obj, int i) {
        int iC = C(i);
        long j = iC & 1048575;
        if (j != 1048575) {
            return (AbstractC4247eM2.h(obj, j) & (1 << (iC >>> 20))) != 0;
        }
        int iF = F(i);
        long j2 = iF & 1048575;
        switch (E(iF)) {
            case 0:
                return Double.doubleToRawLongBits(AbstractC4247eM2.f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC4247eM2.g(obj, j2)) != 0;
            case 2:
                return AbstractC4247eM2.i(obj, j2) != 0;
            case 3:
                return AbstractC4247eM2.i(obj, j2) != 0;
            case 4:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 5:
                return AbstractC4247eM2.i(obj, j2) != 0;
            case 6:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 7:
                return AbstractC4247eM2.B(obj, j2);
            case 8:
                Object objK = AbstractC4247eM2.k(obj, j2);
                if (objK instanceof String) {
                    return !((String) objK).isEmpty();
                }
                if (objK instanceof BM1) {
                    return !BM1.C.equals(objK);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC4247eM2.k(obj, j2) != null;
            case 10:
                return !BM1.C.equals(AbstractC4247eM2.k(obj, j2));
            case 11:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 12:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 13:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 14:
                return AbstractC4247eM2.i(obj, j2) != 0;
            case 15:
                return AbstractC4247eM2.h(obj, j2) != 0;
            case 16:
                return AbstractC4247eM2.i(obj, j2) != 0;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC4247eM2.k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(obj, i) : (i3 & i4) != 0;
    }

    public final boolean t(Object obj, int i, int i2) {
        return AbstractC4247eM2.h(obj, (long) (C(i2) & 1048575)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0df4  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0daa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0ad5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0dc1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0aea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.daaw.C6745nE1 r42) throws com.daaw.U92 {
        /*
            Method dump skipped, instruction units count: 3840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.w(java.lang.Object, byte[], int, int, int, com.daaw.nE1):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0473  */
    @Override // com.daaw.InterfaceC7500pw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C4109dr2.zza(java.lang.Object):int");
    }

    @Override // com.daaw.InterfaceC7500pw2
    public final Object zze() {
        return ((F32) this.e).i();
    }
}
