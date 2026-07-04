package com.daaw;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.daaw.C8775uY;
import com.daaw.C9061vY;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.gd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4885gd1 {
    public static final C9061vY.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        G10.g(resources, "res");
        G10.g(xmlResourceParser, "parser");
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C10061z6 c10061z6 = new C10061z6(xmlResourceParser, 0, 2, null);
        G10.f(attributeSetAsAttributeSet, "attrs");
        C8775uY.a aVarA = AbstractC0654Dj1.a(c10061z6, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!AbstractC0654Dj1.d(xmlResourceParser)) {
            iG = AbstractC0654Dj1.g(c10061z6, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new C9061vY.a(aVarA.e(), c10061z6.a());
    }
}
