package com.daaw;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.w40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9215w40 implements InterfaceC6628mp0, InterfaceC9081vc1 {
    public C9215w40 a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map d;
    public final Map e;
    public final InterfaceC6349lp0 f;
    public final boolean g;

    public C9215w40(Writer writer, Map map, Map map2, InterfaceC6349lp0 interfaceC6349lp0, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = interfaceC6349lp0;
        this.g = z;
    }

    @Override // com.daaw.InterfaceC6628mp0
    public InterfaceC6628mp0 a(C3122aK c3122aK, int i) {
        return k(c3122aK.b(), i);
    }

    @Override // com.daaw.InterfaceC6628mp0
    public InterfaceC6628mp0 b(C3122aK c3122aK, long j) {
        return l(c3122aK.b(), j);
    }

    @Override // com.daaw.InterfaceC6628mp0
    public InterfaceC6628mp0 e(C3122aK c3122aK, Object obj) {
        return m(c3122aK.b(), obj);
    }

    @Override // com.daaw.InterfaceC6628mp0
    public InterfaceC6628mp0 f(C3122aK c3122aK, boolean z) {
        return n(c3122aK.b(), z);
    }

    public C9215w40 g(int i) throws IOException {
        v();
        this.c.value(i);
        return this;
    }

    public C9215w40 h(long j) throws IOException {
        v();
        this.c.value(j);
        return this;
    }

    public C9215w40 i(Object obj, boolean z) {
        int i = 0;
        if (z && q(obj)) {
            throw new GG(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    i(it.next(), false);
                }
                this.c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new GG(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            }
            InterfaceC6349lp0 interfaceC6349lp0 = (InterfaceC6349lp0) this.d.get(obj.getClass());
            if (interfaceC6349lp0 != null) {
                return s(interfaceC6349lp0, obj, z);
            }
            InterfaceC8795uc1 interfaceC8795uc1 = (InterfaceC8795uc1) this.e.get(obj.getClass());
            if (interfaceC8795uc1 != null) {
                interfaceC8795uc1.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return s(this.f, obj, z);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return p((byte[]) obj);
        }
        this.c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i < length) {
                this.c.value(r7[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                h(jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.c.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.c.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                i(obj2, false);
            }
        }
        this.c.endArray();
        return this;
    }

    @Override // com.daaw.InterfaceC9081vc1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C9215w40 c(String str) throws IOException {
        v();
        this.c.value(str);
        return this;
    }

    public C9215w40 k(String str, int i) throws IOException {
        v();
        this.c.name(str);
        return g(i);
    }

    public C9215w40 l(String str, long j) throws IOException {
        v();
        this.c.name(str);
        return h(j);
    }

    public C9215w40 m(String str, Object obj) {
        return this.g ? u(str, obj) : t(str, obj);
    }

    public C9215w40 n(String str, boolean z) throws IOException {
        v();
        this.c.name(str);
        return d(z);
    }

    @Override // com.daaw.InterfaceC9081vc1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C9215w40 d(boolean z) throws IOException {
        v();
        this.c.value(z);
        return this;
    }

    public C9215w40 p(byte[] bArr) throws IOException {
        v();
        if (bArr == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void r() {
        v();
        this.c.flush();
    }

    public C9215w40 s(InterfaceC6349lp0 interfaceC6349lp0, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        interfaceC6349lp0.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final C9215w40 t(String str, Object obj) throws IOException {
        v();
        this.c.name(str);
        if (obj != null) {
            return i(obj, false);
        }
        this.c.nullValue();
        return this;
    }

    public final C9215w40 u(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        v();
        this.c.name(str);
        return i(obj, false);
    }

    public final void v() throws IOException {
        if (!this.b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        C9215w40 c9215w40 = this.a;
        if (c9215w40 != null) {
            c9215w40.v();
            this.a.b = false;
            this.a = null;
            this.c.endObject();
        }
    }
}
