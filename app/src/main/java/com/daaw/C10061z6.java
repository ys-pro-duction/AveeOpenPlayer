package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: com.daaw.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C10061z6 {
    public final XmlPullParser a;
    public int b;

    public C10061z6(XmlPullParser xmlPullParser, int i) {
        G10.g(xmlPullParser, "xmlParser");
        this.a = xmlPullParser;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final float b(TypedArray typedArray, int i, float f) {
        G10.g(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i, f);
        m(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float c(TypedArray typedArray, int i, float f) {
        G10.g(typedArray, "typedArray");
        float f2 = typedArray.getFloat(i, f);
        m(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int d(TypedArray typedArray, int i, int i2) {
        G10.g(typedArray, "typedArray");
        int i3 = typedArray.getInt(i, i2);
        m(typedArray.getChangingConfigurations());
        return i3;
    }

    public final boolean e(TypedArray typedArray, String str, int i, boolean z) {
        G10.g(typedArray, "typedArray");
        G10.g(str, "attrName");
        boolean zA = M81.a(typedArray, this.a, str, i, z);
        m(typedArray.getChangingConfigurations());
        return zA;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10061z6)) {
            return false;
        }
        C10061z6 c10061z6 = (C10061z6) obj;
        return G10.c(this.a, c10061z6.a) && this.b == c10061z6.b;
    }

    public final ColorStateList f(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        G10.g(typedArray, "typedArray");
        G10.g(str, "attrName");
        ColorStateList colorStateListC = M81.c(typedArray, this.a, theme, str, i);
        m(typedArray.getChangingConfigurations());
        return colorStateListC;
    }

    public final C2563Vn g(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        G10.g(typedArray, "typedArray");
        G10.g(str, "attrName");
        C2563Vn c2563VnE = M81.e(typedArray, this.a, theme, str, i, i2);
        m(typedArray.getChangingConfigurations());
        G10.f(c2563VnE, "result");
        return c2563VnE;
    }

    public final float h(TypedArray typedArray, String str, int i, float f) {
        G10.g(typedArray, "typedArray");
        G10.g(str, "attrName");
        float f2 = M81.f(typedArray, this.a, str, i, f);
        m(typedArray.getChangingConfigurations());
        return f2;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final int i(TypedArray typedArray, String str, int i, int i2) {
        G10.g(typedArray, "typedArray");
        G10.g(str, "attrName");
        int iG = M81.g(typedArray, this.a, str, i, i2);
        m(typedArray.getChangingConfigurations());
        return iG;
    }

    public final String j(TypedArray typedArray, int i) {
        G10.g(typedArray, "typedArray");
        String string = typedArray.getString(i);
        m(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser k() {
        return this.a;
    }

    public final TypedArray l(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        G10.g(resources, "res");
        G10.g(attributeSet, "set");
        G10.g(iArr, "attrs");
        TypedArray typedArrayK = M81.k(resources, theme, attributeSet, iArr);
        G10.f(typedArrayK, "obtainAttributes(\n      …          attrs\n        )");
        m(typedArrayK.getChangingConfigurations());
        return typedArrayK;
    }

    public final void m(int i) {
        this.b = i | this.b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + ')';
    }

    public /* synthetic */ C10061z6(XmlPullParser xmlPullParser, int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
