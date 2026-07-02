package com.daaw;

import android.graphics.Color;
import android.graphics.Rect;
import com.daaw.AbstractC6977o40;
import com.daaw.C5595j90;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.l90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6165l90 {
    public static final AbstractC6977o40.a a = AbstractC6977o40.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("d", "a");
    public static final AbstractC6977o40.a c = AbstractC6977o40.a.a("ty", "nm");

    /* JADX INFO: renamed from: com.daaw.l90$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C5595j90.b.values().length];
            a = iArr;
            try {
                iArr[C5595j90.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C5595j90.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static C5595j90 a(AbstractC6977o40 abstractC6977o40, C0737Ee0 c0737Ee0) {
        Float f;
        C5595j90.b bVar = C5595j90.b.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        abstractC6977o40.d();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        String strR = "UNSET";
        V6 v6G = null;
        S6 s6D = null;
        T6 t6A = null;
        I6 i6F = null;
        C5177hg c5177hgB = null;
        C8416tE c8416tEB = null;
        long jI = 0;
        long jI2 = -1;
        C5595j90.b bVar2 = bVar;
        int I = 0;
        int color = 0;
        float F = 1.0f;
        float F2 = 0.0f;
        float f2 = 0.0f;
        int I2 = 0;
        int I3 = 0;
        int I4 = 0;
        float F3 = 0.0f;
        boolean zS = false;
        String strR2 = null;
        C5595j90.a aVar = null;
        String strR3 = null;
        while (abstractC6977o40.o()) {
            switch (abstractC6977o40.o0(a)) {
                case 0:
                    strR = abstractC6977o40.R();
                    break;
                case 1:
                    jI = abstractC6977o40.I();
                    break;
                case 2:
                    strR3 = abstractC6977o40.R();
                    break;
                case 3:
                    int I5 = abstractC6977o40.I();
                    aVar = C5595j90.a.UNKNOWN;
                    if (I5 < aVar.ordinal()) {
                        aVar = C5595j90.a.values()[I5];
                    }
                    break;
                case 4:
                    jI2 = abstractC6977o40.I();
                    break;
                case 5:
                    I2 = (int) (abstractC6977o40.I() * AbstractC0301Ab1.e());
                    break;
                case 6:
                    I = (int) (abstractC6977o40.I() * AbstractC0301Ab1.e());
                    break;
                case 7:
                    color = Color.parseColor(abstractC6977o40.R());
                    break;
                case 8:
                    v6G = W6.g(abstractC6977o40, c0737Ee0);
                    break;
                case 9:
                    int I6 = abstractC6977o40.I();
                    if (I6 < C5595j90.b.values().length) {
                        bVar2 = C5595j90.b.values()[I6];
                        int i = a.a[bVar2.ordinal()];
                        if (i == 1) {
                            c0737Ee0.a("Unsupported matte type: Luma");
                        } else if (i == 2) {
                            c0737Ee0.a("Unsupported matte type: Luma Inverted");
                        }
                        c0737Ee0.s(1);
                    } else {
                        c0737Ee0.a("Unsupported matte type: " + I6);
                    }
                    break;
                case 10:
                    abstractC6977o40.c();
                    while (abstractC6977o40.o()) {
                        arrayList.add(AbstractC2224Sg0.a(abstractC6977o40, c0737Ee0));
                    }
                    c0737Ee0.s(arrayList.size());
                    abstractC6977o40.j();
                    break;
                case 11:
                    abstractC6977o40.c();
                    while (abstractC6977o40.o()) {
                        InterfaceC6921ns interfaceC6921nsA = AbstractC7200os.a(abstractC6977o40, c0737Ee0);
                        if (interfaceC6921nsA != null) {
                            arrayList2.add(interfaceC6921nsA);
                        }
                    }
                    abstractC6977o40.j();
                    break;
                case 12:
                    abstractC6977o40.d();
                    while (abstractC6977o40.o()) {
                        int iO0 = abstractC6977o40.o0(b);
                        if (iO0 == 0) {
                            s6D = Y6.d(abstractC6977o40, c0737Ee0);
                        } else if (iO0 != 1) {
                            abstractC6977o40.p0();
                            abstractC6977o40.q0();
                        } else {
                            abstractC6977o40.c();
                            if (abstractC6977o40.o()) {
                                t6A = U6.a(abstractC6977o40, c0737Ee0);
                            }
                            while (abstractC6977o40.o()) {
                                abstractC6977o40.q0();
                            }
                            abstractC6977o40.j();
                        }
                    }
                    abstractC6977o40.l();
                    break;
                case 13:
                    abstractC6977o40.c();
                    ArrayList arrayList3 = new ArrayList();
                    while (abstractC6977o40.o()) {
                        abstractC6977o40.d();
                        while (abstractC6977o40.o()) {
                            int iO02 = abstractC6977o40.o0(c);
                            if (iO02 == 0) {
                                int I7 = abstractC6977o40.I();
                                if (I7 == 29) {
                                    c5177hgB = AbstractC5455ig.b(abstractC6977o40, c0737Ee0);
                                } else if (I7 == 25) {
                                    c8416tEB = new C8695uE().b(abstractC6977o40, c0737Ee0);
                                }
                            } else if (iO02 != 1) {
                                abstractC6977o40.p0();
                                abstractC6977o40.q0();
                            } else {
                                arrayList3.add(abstractC6977o40.R());
                            }
                        }
                        abstractC6977o40.l();
                    }
                    abstractC6977o40.j();
                    c0737Ee0.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    break;
                case 14:
                    F = (float) abstractC6977o40.F();
                    break;
                case 15:
                    F3 = (float) abstractC6977o40.F();
                    break;
                case 16:
                    I3 = (int) (abstractC6977o40.I() * AbstractC0301Ab1.e());
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    I4 = (int) (abstractC6977o40.I() * AbstractC0301Ab1.e());
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    F2 = (float) abstractC6977o40.F();
                    break;
                case 19:
                    f2 = (float) abstractC6977o40.F();
                    break;
                case 20:
                    i6F = Y6.f(abstractC6977o40, c0737Ee0, false);
                    break;
                case 21:
                    strR2 = abstractC6977o40.R();
                    break;
                case 22:
                    zS = abstractC6977o40.s();
                    break;
                default:
                    abstractC6977o40.p0();
                    abstractC6977o40.q0();
                    break;
            }
        }
        abstractC6977o40.l();
        ArrayList arrayList4 = new ArrayList();
        if (F2 > 0.0f) {
            f = fValueOf2;
            arrayList4.add(new Y70(c0737Ee0, fValueOf2, fValueOf2, null, 0.0f, Float.valueOf(F2)));
        } else {
            f = fValueOf2;
        }
        if (f2 <= 0.0f) {
            f2 = c0737Ee0.f();
        }
        arrayList4.add(new Y70(c0737Ee0, fValueOf, fValueOf, null, F2, Float.valueOf(f2)));
        arrayList4.add(new Y70(c0737Ee0, f, f, null, f2, Float.valueOf(Float.MAX_VALUE)));
        if (strR.endsWith(".ai") || "ai".equals(strR2)) {
            c0737Ee0.a("Convert your Illustrator layers to shape layers.");
        }
        return new C5595j90(arrayList2, c0737Ee0, strR, jI, aVar, jI2, strR3, arrayList, v6G, I2, I, color, F, F3, I3, I4, s6D, t6A, arrayList4, bVar2, i6F, zS, c5177hgB, c8416tEB);
    }

    public static C5595j90 b(C0737Ee0 c0737Ee0) {
        Rect rectB = c0737Ee0.b();
        List list = Collections.EMPTY_LIST;
        return new C5595j90(list, c0737Ee0, "__container", -1L, C5595j90.a.PRE_COMP, -1L, null, list, new V6(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, C5595j90.b.NONE, null, false, null, null);
    }
}
