package com.daaw;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.daaw.OC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.v21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C8927v21 extends AbstractC9647xe {
    public final StringBuilder D;
    public final RectF E;
    public final Matrix F;
    public final Paint G;
    public final Paint H;
    public final Map I;
    public final C7131oe0 J;
    public final C8362t21 K;
    public final C4615ff0 L;
    public final C0737Ee0 M;
    public AbstractC9089ve N;
    public AbstractC9089ve O;
    public AbstractC9089ve P;
    public AbstractC9089ve Q;
    public AbstractC9089ve R;
    public AbstractC9089ve S;
    public AbstractC9089ve T;
    public AbstractC9089ve U;
    public AbstractC9089ve V;
    public AbstractC9089ve W;

    /* JADX INFO: renamed from: com.daaw.v21$a */
    public class a extends Paint {
        public a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: renamed from: com.daaw.v21$b */
    public class b extends Paint {
        public b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: renamed from: com.daaw.v21$c */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OC.a.values().length];
            a = iArr;
            try {
                iArr[OC.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[OC.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[OC.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8927v21(C4615ff0 c4615ff0, C5595j90 c5595j90) {
        I6 i6;
        I6 i62;
        H6 h6;
        H6 h62;
        super(c4615ff0, c5595j90);
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new a(1);
        this.H = new b(1);
        this.I = new HashMap();
        this.J = new C7131oe0();
        this.L = c4615ff0;
        this.M = c5595j90.b();
        C8362t21 c8362t21H = c5595j90.s().h();
        this.K = c8362t21H;
        c8362t21H.a(this);
        j(c8362t21H);
        T6 t6T = c5595j90.t();
        if (t6T != null && (h62 = t6T.a) != null) {
            AbstractC9089ve abstractC9089veH = h62.h();
            this.N = abstractC9089veH;
            abstractC9089veH.a(this);
            j(this.N);
        }
        if (t6T != null && (h6 = t6T.b) != null) {
            AbstractC9089ve abstractC9089veH2 = h6.h();
            this.P = abstractC9089veH2;
            abstractC9089veH2.a(this);
            j(this.P);
        }
        if (t6T != null && (i62 = t6T.c) != null) {
            AbstractC9089ve abstractC9089veH3 = i62.h();
            this.R = abstractC9089veH3;
            abstractC9089veH3.a(this);
            j(this.R);
        }
        if (t6T == null || (i6 = t6T.d) == null) {
            return;
        }
        AbstractC9089ve abstractC9089veH4 = i6.h();
        this.T = abstractC9089veH4;
        abstractC9089veH4.a(this);
        j(this.T);
    }

    public final void O(OC.a aVar, Canvas canvas, float f) {
        int i = c.a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else {
            if (i != 3) {
                return;
            }
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    public final String P(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!c0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.J.e(j)) {
            return (String) this.J.g(j);
        }
        this.D.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.D.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.D.toString();
        this.J.k(j, string);
        return string;
    }

    public final void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public final void R(C7341pO c7341pO, Matrix matrix, float f, OC oc, Canvas canvas) {
        List listY = Y(c7341pO);
        for (int i = 0; i < listY.size(); i++) {
            Path pathI = ((C3276as) listY.get(i)).i();
            pathI.computeBounds(this.E, false);
            this.F.set(matrix);
            this.F.preTranslate(0.0f, (-oc.g) * AbstractC0301Ab1.e());
            this.F.preScale(f, f);
            pathI.transform(this.F);
            if (oc.k) {
                U(pathI, this.G, canvas);
                U(pathI, this.H, canvas);
            } else {
                U(pathI, this.H, canvas);
                U(pathI, this.G, canvas);
            }
        }
    }

    public final void S(String str, OC oc, Canvas canvas) {
        if (oc.k) {
            Q(str, this.G, canvas);
            Q(str, this.H, canvas);
        } else {
            Q(str, this.H, canvas);
            Q(str, this.G, canvas);
        }
    }

    public final void T(String str, OC oc, Canvas canvas, float f) {
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            length += strP.length();
            S(strP, oc, canvas);
            canvas.translate(this.G.measureText(strP) + f, 0.0f);
        }
    }

    public final void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void V(String str, OC oc, Matrix matrix, C6504mO c6504mO, Canvas canvas, float f, float f2) {
        OC oc2;
        Matrix matrix2;
        Canvas canvas2;
        float f3;
        float fFloatValue;
        int i = 0;
        while (i < str.length()) {
            C7341pO c7341pO = (C7341pO) this.M.c().g(C7341pO.c(str.charAt(i), c6504mO.a(), c6504mO.c()));
            if (c7341pO == null) {
                oc2 = oc;
                matrix2 = matrix;
                canvas2 = canvas;
                f3 = f2;
            } else {
                oc2 = oc;
                matrix2 = matrix;
                canvas2 = canvas;
                f3 = f2;
                R(c7341pO, matrix2, f3, oc2, canvas2);
                float fB = ((float) c7341pO.b()) * f3 * AbstractC0301Ab1.e() * f;
                float f4 = oc2.e / 10.0f;
                AbstractC9089ve abstractC9089ve = this.U;
                if (abstractC9089ve != null) {
                    fFloatValue = ((Float) abstractC9089ve.h()).floatValue();
                } else {
                    AbstractC9089ve abstractC9089ve2 = this.T;
                    if (abstractC9089ve2 != null) {
                        fFloatValue = ((Float) abstractC9089ve2.h()).floatValue();
                    }
                    canvas2.translate(fB + (f4 * f), 0.0f);
                }
                f4 += fFloatValue;
                canvas2.translate(fB + (f4 * f), 0.0f);
            }
            i++;
            matrix = matrix2;
            f2 = f3;
            oc = oc2;
            canvas = canvas2;
        }
    }

    public final void W(OC oc, Matrix matrix, C6504mO c6504mO, Canvas canvas) {
        Canvas canvas2 = canvas;
        AbstractC9089ve abstractC9089ve = this.V;
        float fFloatValue = (abstractC9089ve != null ? ((Float) abstractC9089ve.h()).floatValue() : oc.c) / 100.0f;
        float fG = AbstractC0301Ab1.g(matrix);
        String str = oc.a;
        float fE = oc.f * AbstractC0301Ab1.e();
        List listA0 = a0(str);
        int size = listA0.size();
        int i = 0;
        while (i < size) {
            String str2 = (String) listA0.get(i);
            float fZ = Z(str2, c6504mO, fFloatValue, fG);
            canvas2.save();
            O(oc.d, canvas2, fZ);
            canvas2.translate(0.0f, (i * fE) - (((size - 1) * fE) / 2.0f));
            V(str2, oc, matrix, c6504mO, canvas2, fG, fFloatValue);
            canvas.restore();
            i++;
            canvas2 = canvas;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089 A[LOOP:0: B:17:0x0087->B:18:0x0089, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(com.daaw.OC r8, com.daaw.C6504mO r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L8
            goto Lc0
        L8:
            java.lang.String r0 = r8.a
            com.daaw.ff0 r1 = r7.L
            r1.V()
            android.graphics.Paint r1 = r7.G
            r1.setTypeface(r9)
            com.daaw.ve r9 = r7.V
            if (r9 == 0) goto L23
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L25
        L23:
            float r9 = r8.c
        L25:
            android.graphics.Paint r1 = r7.G
            float r2 = com.daaw.AbstractC0301Ab1.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f
            float r2 = com.daaw.AbstractC0301Ab1.e()
            float r1 = r1 * r2
            int r2 = r8.e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.daaw.ve r3 = r7.U
            if (r3 == 0) goto L64
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L62:
            float r2 = r2 + r3
            goto L73
        L64:
            com.daaw.ve r3 = r7.T
            if (r3 == 0) goto L73
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L62
        L73:
            float r3 = com.daaw.AbstractC0301Ab1.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r3 = 0
        L87:
            if (r3 >= r0) goto Lc0
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.H
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            com.daaw.OC$a r6 = r8.d
            r7.O(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L87
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8927v21.X(com.daaw.OC, com.daaw.mO, android.graphics.Canvas):void");
    }

    public final List Y(C7341pO c7341pO) {
        if (this.I.containsKey(c7341pO)) {
            return (List) this.I.get(c7341pO);
        }
        List listA = c7341pO.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C3276as(this.L, this, (C7911rR0) listA.get(i)));
        }
        this.I.put(c7341pO, arrayList);
        return arrayList;
    }

    public final float Z(String str, C6504mO c6504mO, float f, float f2) {
        float fB = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            C7341pO c7341pO = (C7341pO) this.M.c().g(C7341pO.c(str.charAt(i), c6504mO.a(), c6504mO.c()));
            if (c7341pO != null) {
                fB = (float) (((double) fB) + (c7341pO.b() * ((double) f) * ((double) AbstractC0301Ab1.e()) * ((double) f2)));
            }
        }
        return fB;
    }

    public final List a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    public final Typeface b0(C6504mO c6504mO) {
        Typeface typeface;
        AbstractC9089ve abstractC9089ve = this.W;
        if (abstractC9089ve != null && (typeface = (Typeface) abstractC9089ve.h()) != null) {
            return typeface;
        }
        Typeface typefaceW = this.L.W(c6504mO.a(), c6504mO.c());
        return typefaceW != null ? typefaceW : c6504mO.d();
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.T70
    public void c(Object obj, C8530tf0 c8530tf0) {
        super.c(obj, c8530tf0);
        if (obj == InterfaceC7136of0.a) {
            AbstractC9089ve abstractC9089ve = this.O;
            if (abstractC9089ve != null) {
                G(abstractC9089ve);
            }
            if (c8530tf0 == null) {
                this.O = null;
                return;
            }
            C6843nc1 c6843nc1 = new C6843nc1(c8530tf0);
            this.O = c6843nc1;
            c6843nc1.a(this);
            j(this.O);
            return;
        }
        if (obj == InterfaceC7136of0.b) {
            AbstractC9089ve abstractC9089ve2 = this.Q;
            if (abstractC9089ve2 != null) {
                G(abstractC9089ve2);
            }
            if (c8530tf0 == null) {
                this.Q = null;
                return;
            }
            C6843nc1 c6843nc12 = new C6843nc1(c8530tf0);
            this.Q = c6843nc12;
            c6843nc12.a(this);
            j(this.Q);
            return;
        }
        if (obj == InterfaceC7136of0.s) {
            AbstractC9089ve abstractC9089ve3 = this.S;
            if (abstractC9089ve3 != null) {
                G(abstractC9089ve3);
            }
            if (c8530tf0 == null) {
                this.S = null;
                return;
            }
            C6843nc1 c6843nc13 = new C6843nc1(c8530tf0);
            this.S = c6843nc13;
            c6843nc13.a(this);
            j(this.S);
            return;
        }
        if (obj == InterfaceC7136of0.t) {
            AbstractC9089ve abstractC9089ve4 = this.U;
            if (abstractC9089ve4 != null) {
                G(abstractC9089ve4);
            }
            if (c8530tf0 == null) {
                this.U = null;
                return;
            }
            C6843nc1 c6843nc14 = new C6843nc1(c8530tf0);
            this.U = c6843nc14;
            c6843nc14.a(this);
            j(this.U);
            return;
        }
        if (obj == InterfaceC7136of0.F) {
            AbstractC9089ve abstractC9089ve5 = this.V;
            if (abstractC9089ve5 != null) {
                G(abstractC9089ve5);
            }
            if (c8530tf0 == null) {
                this.V = null;
                return;
            }
            C6843nc1 c6843nc15 = new C6843nc1(c8530tf0);
            this.V = c6843nc15;
            c6843nc15.a(this);
            j(this.V);
            return;
        }
        if (obj != InterfaceC7136of0.M) {
            if (obj == InterfaceC7136of0.O) {
                this.K.q(c8530tf0);
                return;
            }
            return;
        }
        AbstractC9089ve abstractC9089ve6 = this.W;
        if (abstractC9089ve6 != null) {
            G(abstractC9089ve6);
        }
        if (c8530tf0 == null) {
            this.W = null;
            return;
        }
        C6843nc1 c6843nc16 = new C6843nc1(c8530tf0);
        this.W = c6843nc16;
        c6843nc16.a(this);
        j(this.W);
    }

    public final boolean c0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // com.daaw.AbstractC9647xe, com.daaw.InterfaceC7301pE
    public void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.M.b().width(), this.M.b().height());
    }

    @Override // com.daaw.AbstractC9647xe
    public void u(Canvas canvas, Matrix matrix, int i) {
        canvas.save();
        if (!this.L.I0()) {
            canvas.concat(matrix);
        }
        OC oc = (OC) this.K.h();
        C6504mO c6504mO = (C6504mO) this.M.g().get(oc.b);
        if (c6504mO == null) {
            canvas.restore();
            return;
        }
        AbstractC9089ve abstractC9089ve = this.O;
        if (abstractC9089ve != null) {
            this.G.setColor(((Integer) abstractC9089ve.h()).intValue());
        } else {
            AbstractC9089ve abstractC9089ve2 = this.N;
            if (abstractC9089ve2 != null) {
                this.G.setColor(((Integer) abstractC9089ve2.h()).intValue());
            } else {
                this.G.setColor(oc.h);
            }
        }
        AbstractC9089ve abstractC9089ve3 = this.Q;
        if (abstractC9089ve3 != null) {
            this.H.setColor(((Integer) abstractC9089ve3.h()).intValue());
        } else {
            AbstractC9089ve abstractC9089ve4 = this.P;
            if (abstractC9089ve4 != null) {
                this.H.setColor(((Integer) abstractC9089ve4.h()).intValue());
            } else {
                this.H.setColor(oc.i);
            }
        }
        int iIntValue = ((this.x.h() == null ? 100 : ((Integer) this.x.h().h()).intValue()) * 255) / 100;
        this.G.setAlpha(iIntValue);
        this.H.setAlpha(iIntValue);
        AbstractC9089ve abstractC9089ve5 = this.S;
        if (abstractC9089ve5 != null) {
            this.H.setStrokeWidth(((Float) abstractC9089ve5.h()).floatValue());
        } else {
            AbstractC9089ve abstractC9089ve6 = this.R;
            if (abstractC9089ve6 != null) {
                this.H.setStrokeWidth(((Float) abstractC9089ve6.h()).floatValue());
            } else {
                this.H.setStrokeWidth(oc.j * AbstractC0301Ab1.e() * AbstractC0301Ab1.g(matrix));
            }
        }
        if (this.L.I0()) {
            W(oc, matrix, c6504mO, canvas);
        } else {
            X(oc, c6504mO, canvas);
        }
        canvas.restore();
    }
}
