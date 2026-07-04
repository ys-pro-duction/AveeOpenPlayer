package com.daaw;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class OO {

    public static class a {
        public static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public interface b {
    }

    public static final class c implements b {
        public final d[] a;

        public c(d[] dVarArr) {
            this.a = dVarArr;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e implements b {
        public final LO a;
        public final int b;
        public final int c;
        public final String d;

        public e(LO lo, int i, int i2, String str) {
            this.a = lo;
            this.c = i;
            this.b = i2;
            this.d = str;
        }

        public int a() {
            return this.c;
        }

        public LO b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }

    public static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC3378bE0.h);
        String string = typedArrayObtainAttributes.getString(AbstractC3378bE0.i);
        String string2 = typedArrayObtainAttributes.getString(AbstractC3378bE0.m);
        String string3 = typedArrayObtainAttributes.getString(AbstractC3378bE0.n);
        int resourceId = typedArrayObtainAttributes.getResourceId(AbstractC3378bE0.j, 0);
        int integer = typedArrayObtainAttributes.getInteger(AbstractC3378bE0.k, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(AbstractC3378bE0.l, 500);
        String string4 = typedArrayObtainAttributes.getString(AbstractC3378bE0.o);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new LO(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC3378bE0.p);
        int i = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC3378bE0.y) ? AbstractC3378bE0.y : AbstractC3378bE0.r, RCHTTPStatusCodes.BAD_REQUEST);
        boolean z = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(AbstractC3378bE0.w) ? AbstractC3378bE0.w : AbstractC3378bE0.s, 0);
        int i2 = typedArrayObtainAttributes.hasValue(AbstractC3378bE0.z) ? AbstractC3378bE0.z : AbstractC3378bE0.t;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(AbstractC3378bE0.x) ? AbstractC3378bE0.x : AbstractC3378bE0.u);
        int i3 = typedArrayObtainAttributes.getInt(i2, 0);
        int i4 = typedArrayObtainAttributes.hasValue(AbstractC3378bE0.v) ? AbstractC3378bE0.v : AbstractC3378bE0.q;
        int resourceId = typedArrayObtainAttributes.getResourceId(i4, 0);
        String string2 = typedArrayObtainAttributes.getString(i4);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i, z, string, i3, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
