package com.daaw;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2563Vn {
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public C2563Vn(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    public static C2563Vn a(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(IT.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(AbstractC5771jn.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static C2563Vn b(int i) {
        return new C2563Vn(null, null, i);
    }

    public static C2563Vn c(ColorStateList colorStateList) {
        return new C2563Vn(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static C2563Vn d(Shader shader) {
        return new C2563Vn(shader, null, 0);
    }

    public static C2563Vn g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.c) {
            return false;
        }
        this.c = colorForState;
        return true;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        return h() || this.c != 0;
    }
}
