package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import com.daaw.C9061vY;
import com.daaw.InterfaceC5781jp;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.As0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0368As0 {
    public static final InterfaceC5418iY a(Resources resources, int i) {
        return AbstractC7938rY.a(InterfaceC5418iY.a, resources, i);
    }

    public static final C8775uY b(Resources.Theme theme, Resources resources, int i, InterfaceC5781jp interfaceC5781jp, int i2) throws XmlPullParserException, IOException {
        interfaceC5781jp.e(2112503116);
        C9061vY c9061vY = (C9061vY) interfaceC5781jp.O(B5.h());
        C9061vY.b bVar = new C9061vY.b(theme, i);
        C9061vY.a aVarB = c9061vY.b(bVar);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i);
            G10.f(xml, "res.getXml(id)");
            if (!G10.c(AbstractC0654Dj1.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
            aVarB = AbstractC4885gd1.a(theme, resources, xml);
            c9061vY.d(bVar, aVarB);
        }
        C8775uY c8775uYB = aVarB.b();
        interfaceC5781jp.L();
        return c8775uYB;
    }

    public static final AbstractC9718xs0 c(int i, InterfaceC5781jp interfaceC5781jp, int i2) {
        AbstractC9718xs0 abstractC9718xs0B;
        interfaceC5781jp.e(473971343);
        Context context = (Context) interfaceC5781jp.O(B5.g());
        Resources resources = context.getResources();
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        if (objF == aVar.a()) {
            objF = new TypedValue();
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        TypedValue typedValue = (TypedValue) objF;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !BY0.D(charSequence, ".xml", false, 2, null)) {
            interfaceC5781jp.e(-738265196);
            Object objValueOf = Integer.valueOf(i);
            interfaceC5781jp.e(511388516);
            boolean zP = interfaceC5781jp.P(objValueOf) | interfaceC5781jp.P(charSequence);
            Object objF2 = interfaceC5781jp.f();
            if (zP || objF2 == aVar.a()) {
                G10.f(resources, "res");
                objF2 = a(resources, i);
                interfaceC5781jp.H(objF2);
            }
            interfaceC5781jp.L();
            C1779Of c1779Of = new C1779Of((InterfaceC5418iY) objF2, 0L, 0L, 6, null);
            interfaceC5781jp.L();
            abstractC9718xs0B = c1779Of;
        } else {
            interfaceC5781jp.e(-738265321);
            Resources.Theme theme = context.getTheme();
            G10.f(theme, "context.theme");
            G10.f(resources, "res");
            abstractC9718xs0B = AbstractC4039dd1.b(b(theme, resources, i, interfaceC5781jp, ((i2 << 6) & 896) | 72), interfaceC5781jp, 0);
            interfaceC5781jp.L();
        }
        interfaceC5781jp.L();
        return abstractC9718xs0B;
    }
}
