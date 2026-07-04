package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.daaw.C3561bt0;
import com.daaw.HV0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public class IV0 implements C3561bt0.a {
    public final XmlPullParserFactory a;

    public static class b extends C3000Zs0 {
        public b(String str) {
            super("Missing required field: " + str);
        }
    }

    public static class c extends a {
        public boolean e;
        public UUID f;
        public byte[] g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        public static String q(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        @Override // com.daaw.IV0.a
        public Object b() {
            UUID uuid = this.f;
            return new HV0.a(uuid, AbstractC9249wB0.a(uuid, this.g));
        }

        @Override // com.daaw.IV0.a
        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.daaw.IV0.a
        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = false;
            }
        }

        @Override // com.daaw.IV0.a
        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = true;
                this.f = UUID.fromString(q(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.daaw.IV0.a
        public void o(XmlPullParser xmlPullParser) {
            if (this.e) {
                this.g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class d extends a {
        public Format e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static List q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrR = AbstractC6280lb1.r(str);
                byte[][] bArrK = AbstractC9129vm.k(bArrR);
                if (bArrK == null) {
                    arrayList.add(bArrR);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrK);
            }
            return arrayList;
        }

        public static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.daaw.IV0.a
        public Object b() {
            return this.e;
        }

        @Override // com.daaw.IV0.a
        public void n(XmlPullParser xmlPullParser) throws C3000Zs0 {
            int iIntValue = ((Integer) c("Type")).intValue();
            String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
            int iK = k(xmlPullParser, "Bitrate");
            String strR = r(m(xmlPullParser, "FourCC"));
            if (iIntValue == 2) {
                this.e = Format.z(attributeValue, "video/mp4", strR, null, iK, k(xmlPullParser, "MaxWidth"), k(xmlPullParser, "MaxHeight"), -1.0f, q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
                return;
            }
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    this.e = Format.p(attributeValue, "application/mp4", strR, null, iK, 0, (String) c("Language"));
                    return;
                } else {
                    this.e = Format.l(attributeValue, "application/mp4", strR, null, iK, 0, null);
                    return;
                }
            }
            if (strR == null) {
                strR = "audio/mp4a-latm";
            }
            int iK2 = k(xmlPullParser, "Channels");
            int iK3 = k(xmlPullParser, "SamplingRate");
            List listQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            if (listQ.isEmpty() && "audio/mp4a-latm".equals(strR)) {
                listQ = Collections.singletonList(AbstractC9129vm.b(iK3, iK2));
            }
            this.e = Format.h(attributeValue, "audio/mp4", strR, null, iK, iK2, iK3, listQ, 0, (String) c("Language"));
        }
    }

    public static class e extends a {
        public final List e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;
        public int k;
        public boolean l;
        public HV0.a m;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
            this.k = -1;
            this.m = null;
            this.e = new LinkedList();
        }

        @Override // com.daaw.IV0.a
        public void a(Object obj) {
            if (obj instanceof HV0.b) {
                this.e.add((HV0.b) obj);
            } else if (obj instanceof HV0.a) {
                AbstractC7115ob.f(this.m == null);
                this.m = (HV0.a) obj;
            }
        }

        @Override // com.daaw.IV0.a
        public Object b() {
            int size = this.e.size();
            HV0.b[] bVarArr = new HV0.b[size];
            this.e.toArray(bVarArr);
            if (this.m != null) {
                HV0.a aVar = this.m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar.a, "video/mp4", aVar.b));
                for (int i = 0; i < size; i++) {
                    HV0.b bVar = bVarArr[i];
                    int i2 = 0;
                    while (true) {
                        Format[] formatArr = bVar.j;
                        if (i2 < formatArr.length) {
                            formatArr[i2] = formatArr[i2].b(drmInitData);
                            i2++;
                        }
                    }
                }
            }
            return new HV0(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, bVarArr);
        }

        @Override // com.daaw.IV0.a
        public void n(XmlPullParser xmlPullParser) {
            this.f = k(xmlPullParser, "MajorVersion");
            this.g = k(xmlPullParser, "MinorVersion");
            this.h = j(xmlPullParser, "TimeScale", 10000000L);
            this.i = l(xmlPullParser, "Duration");
            this.j = j(xmlPullParser, "DVRWindowLength", 0L);
            this.k = i(xmlPullParser, "LookaheadCount", -1);
            this.l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.h));
        }
    }

    public static class f extends a {
        public final String e;
        public final List f;
        public int g;
        public String h;
        public long i;
        public String j;
        public String k;
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;
        public ArrayList q;
        public long r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.e = str;
            this.f = new LinkedList();
        }

        @Override // com.daaw.IV0.a
        public void a(Object obj) {
            if (obj instanceof Format) {
                this.f.add((Format) obj);
            }
        }

        @Override // com.daaw.IV0.a
        public Object b() {
            Format[] formatArr = new Format[this.f.size()];
            this.f.toArray(formatArr);
            return new HV0.b(this.e, this.k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, formatArr, this.q, this.r);
        }

        @Override // com.daaw.IV0.a
        public boolean d(String str) {
            return "c".equals(str);
        }

        @Override // com.daaw.IV0.a
        public void n(XmlPullParser xmlPullParser) throws C3000Zs0 {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }

        public final void q(XmlPullParser xmlPullParser) throws C3000Zs0 {
            int iS = s(xmlPullParser);
            this.g = iS;
            p("Type", Integer.valueOf(iS));
            if (this.g == 3) {
                this.h = m(xmlPullParser, "Subtype");
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            this.j = xmlPullParser.getAttributeValue(null, "Name");
            this.k = m(xmlPullParser, "Url");
            this.l = i(xmlPullParser, "MaxWidth", -1);
            this.m = i(xmlPullParser, "MaxHeight", -1);
            this.n = i(xmlPullParser, "DisplayWidth", -1);
            this.o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue;
            p("Language", attributeValue);
            long jI = i(xmlPullParser, "TimeScale", -1);
            this.i = jI;
            if (jI == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList();
        }

        public final void r(XmlPullParser xmlPullParser) throws C3000Zs0 {
            int size = this.q.size();
            long j = j(xmlPullParser, "t", -9223372036854775807L);
            int i = 1;
            if (j == -9223372036854775807L) {
                if (size == 0) {
                    j = 0;
                } else {
                    if (this.r == -1) {
                        throw new C3000Zs0("Unable to infer start time");
                    }
                    j = ((Long) this.q.get(size - 1)).longValue() + this.r;
                }
            }
            this.q.add(Long.valueOf(j));
            this.r = j(xmlPullParser, "d", -9223372036854775807L);
            long j2 = j(xmlPullParser, "r", 1L);
            if (j2 > 1 && this.r == -9223372036854775807L) {
                throw new C3000Zs0("Repeated chunk with unspecified duration");
            }
            while (true) {
                long j3 = i;
                if (j3 >= j2) {
                    return;
                }
                this.q.add(Long.valueOf((this.r * j3) + j));
                i++;
            }
        }

        public final int s(XmlPullParser xmlPullParser) throws C3000Zs0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw new C3000Zs0("Invalid key value[" + attributeValue + "]");
        }
    }

    public IV0() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // com.daaw.C3561bt0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public HV0 a(Uri uri, InputStream inputStream) throws C3000Zs0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (HV0) new e(null, uri.toString()).f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e2) {
            throw new C3000Zs0(e2);
        }
    }

    public static abstract class a {
        public final String a;
        public final String b;
        public final a c;
        public final List d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.c = aVar;
            this.a = str;
            this.b = str2;
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair pair = (Pair) this.d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        public final Object f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.b.equals(name)) {
                        n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a aVarE = e(this, name, this.a);
                            if (aVarE == null) {
                                i = 1;
                            } else {
                                a(aVarE.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        public final int i(XmlPullParser xmlPullParser, String str, int i) throws C3000Zs0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new C3000Zs0(e);
            }
        }

        public final long j(XmlPullParser xmlPullParser, String str, long j) throws C3000Zs0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new C3000Zs0(e);
            }
        }

        public final int k(XmlPullParser xmlPullParser, String str) throws C3000Zs0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new C3000Zs0(e);
            }
        }

        public final long l(XmlPullParser xmlPullParser, String str) throws C3000Zs0 {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new b(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new C3000Zs0(e);
            }
        }

        public final String m(XmlPullParser xmlPullParser, String str) throws b {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        public abstract void n(XmlPullParser xmlPullParser);

        public final void p(String str, Object obj) {
            this.d.add(Pair.create(str, obj));
        }

        public void a(Object obj) {
        }

        public void h(XmlPullParser xmlPullParser) {
        }

        public void o(XmlPullParser xmlPullParser) {
        }
    }
}
