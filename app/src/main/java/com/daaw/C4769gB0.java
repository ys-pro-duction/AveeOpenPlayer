package com.daaw;

import com.daaw.InterfaceC3644cB0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4769gB0 implements InterfaceC6628mp0 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final C3122aK g = C3122aK.a(SubscriberAttributeKt.JSON_NAME_KEY).b(C0724Eb.b().c(1).a()).a();
    public static final C3122aK h = C3122aK.a("value").b(C0724Eb.b().c(2).a()).a();
    public static final InterfaceC6349lp0 i = new InterfaceC6349lp0() { // from class: com.daaw.fB0
        @Override // com.daaw.BG
        public final void a(Object obj, Object obj2) {
            C4769gB0.c((Map.Entry) obj, (InterfaceC6628mp0) obj2);
        }
    };
    public OutputStream a;
    public final Map b;
    public final Map c;
    public final InterfaceC6349lp0 d;
    public final C5604jB0 e = new C5604jB0(this);

    /* JADX INFO: renamed from: com.daaw.gB0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC3644cB0.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC3644cB0.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC3644cB0.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InterfaceC3644cB0.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4769gB0(OutputStream outputStream, Map map, Map map2, InterfaceC6349lp0 interfaceC6349lp0) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = interfaceC6349lp0;
    }

    public static /* synthetic */ void c(Map.Entry entry, InterfaceC6628mp0 interfaceC6628mp0) {
        interfaceC6628mp0.e(g, entry.getKey());
        interfaceC6628mp0.e(h, entry.getValue());
    }

    public static ByteBuffer o(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static InterfaceC3644cB0 t(C3122aK c3122aK) {
        InterfaceC3644cB0 interfaceC3644cB0 = (InterfaceC3644cB0) c3122aK.c(InterfaceC3644cB0.class);
        if (interfaceC3644cB0 != null) {
            return interfaceC3644cB0;
        }
        throw new GG("Field has no @Protobuf config");
    }

    public static int u(C3122aK c3122aK) {
        InterfaceC3644cB0 interfaceC3644cB0 = (InterfaceC3644cB0) c3122aK.c(InterfaceC3644cB0.class);
        if (interfaceC3644cB0 != null) {
            return interfaceC3644cB0.tag();
        }
        throw new GG("Field has no @Protobuf config");
    }

    public InterfaceC6628mp0 d(C3122aK c3122aK, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        v((u(c3122aK) << 3) | 1);
        this.a.write(o(8).putDouble(d).array());
        return this;
    }

    @Override // com.daaw.InterfaceC6628mp0
    public InterfaceC6628mp0 e(C3122aK c3122aK, Object obj) {
        return h(c3122aK, obj, true);
    }

    public InterfaceC6628mp0 g(C3122aK c3122aK, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        v((u(c3122aK) << 3) | 5);
        this.a.write(o(4).putFloat(f2).array());
        return this;
    }

    public InterfaceC6628mp0 h(C3122aK c3122aK, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    v((u(c3122aK) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    v(bytes.length);
                    this.a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(c3122aK, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    q(i, c3122aK, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return d(c3122aK, ((Double) obj).doubleValue(), z);
                }
                if (obj instanceof Float) {
                    return g(c3122aK, ((Float) obj).floatValue(), z);
                }
                if (obj instanceof Number) {
                    return l(c3122aK, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return n(c3122aK, ((Boolean) obj).booleanValue(), z);
                }
                if (!(obj instanceof byte[])) {
                    InterfaceC6349lp0 interfaceC6349lp0 = (InterfaceC6349lp0) this.b.get(obj.getClass());
                    if (interfaceC6349lp0 != null) {
                        return q(interfaceC6349lp0, c3122aK, obj, z);
                    }
                    InterfaceC8795uc1 interfaceC8795uc1 = (InterfaceC8795uc1) this.c.get(obj.getClass());
                    return interfaceC8795uc1 != null ? r(interfaceC8795uc1, c3122aK, obj, z) : obj instanceof VA0 ? a(c3122aK, ((VA0) obj).b()) : obj instanceof Enum ? a(c3122aK, ((Enum) obj).ordinal()) : q(this.d, c3122aK, obj, z);
                }
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    v((u(c3122aK) << 3) | 2);
                    v(bArr.length);
                    this.a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC6628mp0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C4769gB0 a(C3122aK c3122aK, int i2) {
        return j(c3122aK, i2, true);
    }

    public C4769gB0 j(C3122aK c3122aK, int i2, boolean z) throws IOException {
        if (!z || i2 != 0) {
            InterfaceC3644cB0 interfaceC3644cB0T = t(c3122aK);
            int i3 = a.a[interfaceC3644cB0T.intEncoding().ordinal()];
            if (i3 == 1) {
                v(interfaceC3644cB0T.tag() << 3);
                v(i2);
                return this;
            }
            if (i3 == 2) {
                v(interfaceC3644cB0T.tag() << 3);
                v((i2 << 1) ^ (i2 >> 31));
                return this;
            }
            if (i3 == 3) {
                v((interfaceC3644cB0T.tag() << 3) | 5);
                this.a.write(o(4).putInt(i2).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC6628mp0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C4769gB0 b(C3122aK c3122aK, long j) {
        return l(c3122aK, j, true);
    }

    public C4769gB0 l(C3122aK c3122aK, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            InterfaceC3644cB0 interfaceC3644cB0T = t(c3122aK);
            int i2 = a.a[interfaceC3644cB0T.intEncoding().ordinal()];
            if (i2 == 1) {
                v(interfaceC3644cB0T.tag() << 3);
                w(j);
                return this;
            }
            if (i2 == 2) {
                v(interfaceC3644cB0T.tag() << 3);
                w((j >> 63) ^ (j << 1));
                return this;
            }
            if (i2 == 3) {
                v((interfaceC3644cB0T.tag() << 3) | 1);
                this.a.write(o(8).putLong(j).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.daaw.InterfaceC6628mp0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C4769gB0 f(C3122aK c3122aK, boolean z) {
        return n(c3122aK, z, true);
    }

    public C4769gB0 n(C3122aK c3122aK, boolean z, boolean z2) {
        return j(c3122aK, z ? 1 : 0, z2);
    }

    public final long p(InterfaceC6349lp0 interfaceC6349lp0, Object obj) throws IOException {
        C8789ub0 c8789ub0 = new C8789ub0();
        try {
            OutputStream outputStream = this.a;
            this.a = c8789ub0;
            try {
                interfaceC6349lp0.a(obj, this);
                this.a = outputStream;
                long jA = c8789ub0.a();
                c8789ub0.close();
                return jA;
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c8789ub0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final C4769gB0 q(InterfaceC6349lp0 interfaceC6349lp0, C3122aK c3122aK, Object obj, boolean z) throws IOException {
        long jP = p(interfaceC6349lp0, obj);
        if (z && jP == 0) {
            return this;
        }
        v((u(c3122aK) << 3) | 2);
        w(jP);
        interfaceC6349lp0.a(obj, this);
        return this;
    }

    public final C4769gB0 r(InterfaceC8795uc1 interfaceC8795uc1, C3122aK c3122aK, Object obj, boolean z) {
        this.e.b(c3122aK, z);
        interfaceC8795uc1.a(obj, this.e);
        return this;
    }

    public C4769gB0 s(Object obj) {
        if (obj == null) {
            return this;
        }
        InterfaceC6349lp0 interfaceC6349lp0 = (InterfaceC6349lp0) this.b.get(obj.getClass());
        if (interfaceC6349lp0 != null) {
            interfaceC6349lp0.a(obj, this);
            return this;
        }
        throw new GG("No encoder for " + obj.getClass());
    }

    public final void v(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void w(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
