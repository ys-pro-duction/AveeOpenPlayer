package com.daaw;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class IT {
    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = M81.k(resources, theme, attributeSet, AbstractC3378bE0.A);
        float f = M81.f(typedArrayK, xmlPullParser, "startX", AbstractC3378bE0.J, 0.0f);
        float f2 = M81.f(typedArrayK, xmlPullParser, "startY", AbstractC3378bE0.K, 0.0f);
        float f3 = M81.f(typedArrayK, xmlPullParser, "endX", AbstractC3378bE0.L, 0.0f);
        float f4 = M81.f(typedArrayK, xmlPullParser, "endY", AbstractC3378bE0.M, 0.0f);
        float f5 = M81.f(typedArrayK, xmlPullParser, "centerX", AbstractC3378bE0.E, 0.0f);
        float f6 = M81.f(typedArrayK, xmlPullParser, "centerY", AbstractC3378bE0.F, 0.0f);
        int iG = M81.g(typedArrayK, xmlPullParser, "type", AbstractC3378bE0.D, 0);
        int iB = M81.b(typedArrayK, xmlPullParser, "startColor", AbstractC3378bE0.B, 0);
        boolean zJ = M81.j(xmlPullParser, "centerColor");
        int iB2 = M81.b(typedArrayK, xmlPullParser, "centerColor", AbstractC3378bE0.I, 0);
        int iB3 = M81.b(typedArrayK, xmlPullParser, "endColor", AbstractC3378bE0.C, 0);
        int iG2 = M81.g(typedArrayK, xmlPullParser, "tileMode", AbstractC3378bE0.H, 0);
        float f7 = M81.f(typedArrayK, xmlPullParser, "gradientRadius", AbstractC3378bE0.G, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f, f2, f3, f4, aVarA.a, aVarA.b, d(iG2)) : new SweepGradient(f5, f6, aVarA.a, aVarA.b);
        }
        if (f7 > 0.0f) {
            return new RadialGradient(f5, f6, f7, aVarA.a, aVarA.b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        return new com.daaw.IT.a(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.IT.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = com.daaw.AbstractC3378bE0.N
            android.content.res.TypedArray r3 = com.daaw.M81.k(r8, r11, r10, r3)
            int r5 = com.daaw.AbstractC3378bE0.O
            boolean r5 = r3.hasValue(r5)
            int r6 = com.daaw.AbstractC3378bE0.P
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = com.daaw.AbstractC3378bE0.O
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = com.daaw.AbstractC3378bE0.P
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            com.daaw.IT$a r8 = new com.daaw.IT$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.IT.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):com.daaw.IT$a");
    }

    public static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(List list, List list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) list.get(i)).intValue();
                this.b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
