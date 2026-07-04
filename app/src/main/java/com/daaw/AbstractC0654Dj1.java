package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.daaw.C8775uY;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.Dj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0654Dj1 {
    public static final int a = 0;

    public static final C8775uY.a a(C10061z6 c10061z6, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jG;
        int iZ;
        ColorStateList colorStateListF;
        G10.g(c10061z6, "<this>");
        G10.g(resources, "res");
        G10.g(attributeSet, "attrs");
        A6 a6 = A6.a;
        TypedArray typedArrayL = c10061z6.l(resources, theme, attributeSet, a6.F());
        boolean zE = c10061z6.e(typedArrayL, "autoMirrored", a6.a(), false);
        float fH = c10061z6.h(typedArrayL, "viewportWidth", a6.H(), 0.0f);
        float fH2 = c10061z6.h(typedArrayL, "viewportHeight", a6.G(), 0.0f);
        if (fH <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fH2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayL.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fB = c10061z6.b(typedArrayL, a6.I(), 0.0f);
        float fB2 = c10061z6.b(typedArrayL, a6.n(), 0.0f);
        if (typedArrayL.hasValue(a6.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayL.getValue(a6.D(), typedValue);
            jG = (typedValue.type == 2 || (colorStateListF = c10061z6.f(typedArrayL, theme, "tint", a6.D())) == null) ? C2559Vm.b.g() : AbstractC3530bn.b(colorStateListF.getDefaultColor());
        } else {
            jG = C2559Vm.b.g();
        }
        long j = jG;
        int iD = c10061z6.d(typedArrayL, a6.E(), -1);
        if (iD == -1) {
            iZ = C2323Tf.b.z();
        } else if (iD == 3) {
            iZ = C2323Tf.b.B();
        } else if (iD == 5) {
            iZ = C2323Tf.b.z();
        } else if (iD != 9) {
            switch (iD) {
                case 14:
                    iZ = C2323Tf.b.q();
                    break;
                case 15:
                    iZ = C2323Tf.b.v();
                    break;
                case 16:
                    iZ = C2323Tf.b.t();
                    break;
                default:
                    iZ = C2323Tf.b.z();
                    break;
            }
        } else {
            iZ = C2323Tf.b.y();
        }
        int i = iZ;
        float fL = C6460mD.l(fB / resources.getDisplayMetrics().density);
        float fL2 = C6460mD.l(fB2 / resources.getDisplayMetrics().density);
        typedArrayL.recycle();
        return new C8775uY.a(null, fL, fL2, fH, fH2, j, i, zE, 1, null);
    }

    public static final int b(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : GY0.b.c() : GY0.b.b() : GY0.b.a();
    }

    public static final int c(int i, int i2) {
        return i != 0 ? i != 1 ? i != 2 ? i2 : IY0.b.a() : IY0.b.c() : IY0.b.b();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        G10.g(xmlPullParser, "<this>");
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    public static final AbstractC2117Rg e(C2563Vn c2563Vn) {
        if (!c2563Vn.l()) {
            return null;
        }
        Shader shaderF = c2563Vn.f();
        return shaderF != null ? AbstractC2223Sg.a(shaderF) : new GU0(AbstractC3530bn.b(c2563Vn.e()), null);
    }

    public static final void f(C10061z6 c10061z6, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C8775uY.a aVar) {
        G10.g(c10061z6, "<this>");
        G10.g(resources, "res");
        G10.g(attributeSet, "attrs");
        G10.g(aVar, "builder");
        A6 a6 = A6.a;
        TypedArray typedArrayL = c10061z6.l(resources, theme, attributeSet, a6.b());
        String strJ = c10061z6.j(typedArrayL, a6.c());
        if (strJ == null) {
            strJ = "";
        }
        List listA = AbstractC3203ad1.a(c10061z6.j(typedArrayL, a6.d()));
        typedArrayL.recycle();
        C8775uY.a.b(aVar, strJ, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listA, 254, null);
    }

    public static final int g(C10061z6 c10061z6, Resources resources, AttributeSet attributeSet, Resources.Theme theme, C8775uY.a aVar, int i) throws XmlPullParserException {
        G10.g(c10061z6, "<this>");
        G10.g(resources, "res");
        G10.g(attributeSet, "attrs");
        G10.g(aVar, "builder");
        int eventType = c10061z6.k().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !G10.c("group", c10061z6.k().getName())) {
                return i;
            }
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                aVar.f();
            }
            return 0;
        }
        String name = c10061z6.k().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i;
            }
            f(c10061z6, resources, theme, attributeSet, aVar);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i;
            }
            i(c10061z6, resources, theme, attributeSet, aVar);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i;
        }
        h(c10061z6, resources, theme, attributeSet, aVar);
        return i;
    }

    public static final void h(C10061z6 c10061z6, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C8775uY.a aVar) {
        G10.g(c10061z6, "<this>");
        G10.g(resources, "res");
        G10.g(attributeSet, "attrs");
        G10.g(aVar, "builder");
        A6 a6 = A6.a;
        TypedArray typedArrayL = c10061z6.l(resources, theme, attributeSet, a6.e());
        float fH = c10061z6.h(typedArrayL, "rotation", a6.i(), 0.0f);
        float fC = c10061z6.c(typedArrayL, a6.g(), 0.0f);
        float fC2 = c10061z6.c(typedArrayL, a6.h(), 0.0f);
        float fH2 = c10061z6.h(typedArrayL, "scaleX", a6.j(), 1.0f);
        float fH3 = c10061z6.h(typedArrayL, "scaleY", a6.k(), 1.0f);
        float fH4 = c10061z6.h(typedArrayL, "translateX", a6.l(), 0.0f);
        float fH5 = c10061z6.h(typedArrayL, "translateY", a6.m(), 0.0f);
        String strJ = c10061z6.j(typedArrayL, a6.f());
        if (strJ == null) {
            strJ = "";
        }
        typedArrayL.recycle();
        aVar.a(strJ, fH, fC, fC2, fH2, fH3, fH4, fH5, AbstractC3203ad1.e());
    }

    public static final void i(C10061z6 c10061z6, Resources resources, Resources.Theme theme, AttributeSet attributeSet, C8775uY.a aVar) {
        G10.g(c10061z6, "<this>");
        G10.g(resources, "res");
        G10.g(attributeSet, "attrs");
        G10.g(aVar, "builder");
        A6 a6 = A6.a;
        TypedArray typedArrayL = c10061z6.l(resources, theme, attributeSet, a6.o());
        if (!M81.j(c10061z6.k(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String strJ = c10061z6.j(typedArrayL, a6.r());
        if (strJ == null) {
            strJ = "";
        }
        String str = strJ;
        List listA = AbstractC3203ad1.a(c10061z6.j(typedArrayL, a6.s()));
        C2563Vn c2563VnG = c10061z6.g(typedArrayL, theme, "fillColor", a6.q(), 0);
        float fH = c10061z6.h(typedArrayL, "fillAlpha", a6.p(), 1.0f);
        int iB = b(c10061z6.i(typedArrayL, "strokeLineCap", a6.v(), -1), GY0.b.a());
        int iC = c(c10061z6.i(typedArrayL, "strokeLineJoin", a6.w(), -1), IY0.b.a());
        float fH2 = c10061z6.h(typedArrayL, "strokeMiterLimit", a6.x(), 1.0f);
        C2563Vn c2563VnG2 = c10061z6.g(typedArrayL, theme, "strokeColor", a6.u(), 0);
        float fH3 = c10061z6.h(typedArrayL, "strokeAlpha", a6.t(), 1.0f);
        float fH4 = c10061z6.h(typedArrayL, "strokeWidth", a6.y(), 1.0f);
        float fH5 = c10061z6.h(typedArrayL, "trimPathEnd", a6.z(), 1.0f);
        float fH6 = c10061z6.h(typedArrayL, "trimPathOffset", a6.B(), 0.0f);
        float fH7 = c10061z6.h(typedArrayL, "trimPathStart", a6.C(), 0.0f);
        int i = c10061z6.i(typedArrayL, "fillType", a6.A(), a);
        typedArrayL.recycle();
        aVar.c(listA, i == 0 ? C7206ot0.b.b() : C7206ot0.b.a(), str, e(c2563VnG), fH, e(c2563VnG2), fH3, fH4, iB, iC, fH2, fH7, fH5, fH6);
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        G10.g(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}
