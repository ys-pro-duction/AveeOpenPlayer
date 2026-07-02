package com.daaw;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.Bj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0437Bj1 {
    public static final String c = null;
    public a a;
    public KQ b;

    /* JADX INFO: renamed from: com.daaw.Bj1$a */
    public interface a {
        Object a(String str, String str2, int i, String str3);
    }

    public C0437Bj1(a aVar, KQ kq) {
        this.a = aVar;
        this.b = kq;
    }

    public List a(InputStream inputStream, C7378pX0 c7378pX0) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            xmlPullParserNewPullParser.nextTag();
            return c(xmlPullParserNewPullParser);
        } finally {
            inputStream.close();
        }
    }

    public final Object b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, c, "entry");
        String strE = null;
        String strE2 = null;
        String strE3 = null;
        String strE4 = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("server_name")) {
                    strE = e(xmlPullParser, name);
                } else if (name.equals("listen_url")) {
                    strE2 = e(xmlPullParser, name);
                } else if (name.equals("bitrate")) {
                    strE3 = e(xmlPullParser, name);
                } else if (name.equals("genre")) {
                    strE4 = e(xmlPullParser, name);
                } else {
                    f(xmlPullParser);
                }
            }
        }
        return this.a.a(strE, strE2, AbstractC0405Bb1.w(strE3), strE4);
    }

    public final List c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        List list = (List) this.b.a();
        xmlPullParser.require(2, c, "directory");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("entry")) {
                    list.add(b(xmlPullParser));
                } else {
                    f(xmlPullParser);
                }
            }
        }
        return list;
    }

    public final String d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    public final String e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = c;
        xmlPullParser.require(2, str2, str);
        String strD = d(xmlPullParser);
        xmlPullParser.require(3, str2, str);
        return strD;
    }

    public final void f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
