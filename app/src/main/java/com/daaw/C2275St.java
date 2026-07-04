package com.daaw;

import android.util.Base64;
import android.util.JsonReader;
import com.daaw.AbstractC1316Jt;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.St, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2275St {
    public static final InterfaceC2073Qv a = new C5852k40().j(C5157hc.a).k(true).i();

    /* JADX INFO: renamed from: com.daaw.St$a */
    public interface a {
        Object a(JsonReader jsonReader);
    }

    public static AbstractC1316Jt.d A(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.d.a aVarA = AbstractC1316Jt.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("files")) {
                aVarA.b(l(jsonReader, new a() { // from class: com.daaw.Ot
                    @Override // com.daaw.C2275St.a
                    public final Object a(JsonReader jsonReader2) {
                        return C2275St.z(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.AbstractC0086e B(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.AbstractC0086e.a aVarA = AbstractC1316Jt.e.AbstractC0086e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    aVarA.b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarA.c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt C(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.b bVarB = AbstractC1316Jt.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    bVarB.g(A(jsonReader));
                    break;
                case "sdkVersion":
                    bVarB.i(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarB.b(k(jsonReader));
                    break;
                case "buildVersion":
                    bVarB.c(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarB.e(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarB.f(jsonReader.nextString());
                    break;
                case "platform":
                    bVarB.h(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarB.d(jsonReader.nextString());
                    break;
                case "session":
                    bVarB.j(D(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarB.a();
    }

    public static AbstractC1316Jt.e D(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.b bVarA = AbstractC1316Jt.e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    bVarA.l(jsonReader.nextLong());
                    break;
                case "identifier":
                    bVarA.j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarA.e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarA.d(o(jsonReader));
                    break;
                case "events":
                    bVarA.f(l(jsonReader, new a() { // from class: com.daaw.Nt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.p(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarA.k(B(jsonReader));
                    break;
                case "app":
                    bVarA.b(j(jsonReader));
                    break;
                case "user":
                    bVarA.m(E(jsonReader));
                    break;
                case "generator":
                    bVarA.g(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarA.c(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarA.h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static AbstractC1316Jt.e.f E(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.f.a aVarA = AbstractC1316Jt.e.f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("identifier")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.a j(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.a.AbstractC0073a abstractC0073aA = AbstractC1316Jt.e.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC0073aA.e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC0073aA.b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC0073aA.c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC0073aA.g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC0073aA.f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC0073aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0073aA.a();
    }

    public static AbstractC1316Jt.a k(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.a.b bVarA = AbstractC1316Jt.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarA.b(l(jsonReader, new a() { // from class: com.daaw.Lt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.m(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarA.d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarA.f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarA.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarA.i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarA.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarA.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarA.j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static NY l(JsonReader jsonReader, a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.a(jsonReader));
        }
        jsonReader.endArray();
        return NY.e(arrayList);
    }

    public static AbstractC1316Jt.a.AbstractC0071a m(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.a.AbstractC0071a.AbstractC0072a abstractC0072aA = AbstractC1316Jt.a.AbstractC0071a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC0072aA.d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC0072aA.b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC0072aA.c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0072aA.a();
    }

    public static AbstractC1316Jt.c n(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.c.a aVarA = AbstractC1316Jt.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals(SubscriberAttributeKt.JSON_NAME_KEY)) {
                aVarA.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarA.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.c o(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.c.a aVarA = AbstractC1316Jt.e.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    aVarA.i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarA.e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarA.h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarA.b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarA.f(jsonReader.nextString());
                    break;
                case "state":
                    aVarA.j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarA.g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.d p(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.b bVarA = AbstractC1316Jt.e.d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    bVarA.c(s(jsonReader));
                    break;
                case "app":
                    bVarA.b(q(jsonReader));
                    break;
                case "log":
                    bVarA.d(w(jsonReader));
                    break;
                case "type":
                    bVarA.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarA.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarA.a();
    }

    public static AbstractC1316Jt.e.d.a q(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.AbstractC0074a abstractC0074aA = AbstractC1316Jt.e.d.a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "background":
                    abstractC0074aA.b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC0074aA.d(t(jsonReader));
                    break;
                case "internalKeys":
                    abstractC0074aA.e(l(jsonReader, new a() { // from class: com.daaw.Mt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.n(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC0074aA.c(l(jsonReader, new a() { // from class: com.daaw.Mt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.n(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC0074aA.f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0074aA.a();
    }

    public static AbstractC1316Jt.e.d.a.b.AbstractC0075a r(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a abstractC0076aA = AbstractC1316Jt.e.d.a.b.AbstractC0075a.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC0076aA.c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC0076aA.d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC0076aA.f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC0076aA.b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0076aA.a();
    }

    public static AbstractC1316Jt.e.d.c s(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.c.a aVarA = AbstractC1316Jt.e.d.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    aVarA.b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarA.c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarA.e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarA.d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarA.g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarA.f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.d.a.b t(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.AbstractC0077b abstractC0077bA = AbstractC1316Jt.e.d.a.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC0077bA.b(k(jsonReader));
                    break;
                case "threads":
                    abstractC0077bA.f(l(jsonReader, new a() { // from class: com.daaw.Pt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.y(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC0077bA.e(x(jsonReader));
                    break;
                case "binaries":
                    abstractC0077bA.c(l(jsonReader, new a() { // from class: com.daaw.Qt
                        @Override // com.daaw.C2275St.a
                        public final Object a(JsonReader jsonReader2) {
                            return C2275St.r(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC0077bA.d(u(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0077bA.a();
    }

    public static AbstractC1316Jt.e.d.a.b.c u(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.c.AbstractC0078a abstractC0078aA = AbstractC1316Jt.e.d.a.b.c.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0078aA.c(l(jsonReader, new C2169Rt()));
                    break;
                case "reason":
                    abstractC0078aA.e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC0078aA.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC0078aA.b(u(jsonReader));
                    break;
                case "overflowCount":
                    abstractC0078aA.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0078aA.a();
    }

    public static AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b v(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a abstractC0084aA = AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC0084aA.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC0084aA.f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC0084aA.e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC0084aA.b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0084aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0084aA.a();
    }

    public static AbstractC1316Jt.e.d.AbstractC0085d w(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.AbstractC0085d.a aVarA = AbstractC1316Jt.e.d.AbstractC0085d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("content")) {
                aVarA.b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public static AbstractC1316Jt.e.d.a.b.AbstractC0079d x(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a abstractC0080aA = AbstractC1316Jt.e.d.a.b.AbstractC0079d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC0080aA.b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC0080aA.c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC0080aA.d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0080aA.a();
    }

    public static AbstractC1316Jt.e.d.a.b.AbstractC0081e y(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0082a abstractC0082aA = AbstractC1316Jt.e.d.a.b.AbstractC0081e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC0082aA.b(l(jsonReader, new C2169Rt()));
                    break;
                case "name":
                    abstractC0082aA.d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC0082aA.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC0082aA.a();
    }

    public static AbstractC1316Jt.d.b z(JsonReader jsonReader) throws IOException {
        AbstractC1316Jt.d.b.a aVarA = AbstractC1316Jt.d.b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                aVarA.c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarA.b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarA.a();
    }

    public AbstractC1316Jt F(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC1316Jt abstractC1316JtC = C(jsonReader);
                jsonReader.close();
                return abstractC1316JtC;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String G(AbstractC1316Jt abstractC1316Jt) {
        return a.b(abstractC1316Jt);
    }

    public AbstractC1316Jt.e.d h(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC1316Jt.e.d dVarP = p(jsonReader);
                jsonReader.close();
                return dVarP;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public String i(AbstractC1316Jt.e.d dVar) {
        return a.b(dVar);
    }
}
