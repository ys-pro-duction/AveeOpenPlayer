package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Xj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2756Xj0 {
    public static final Logger c = Logger.getLogger(C2756Xj0.class.getName());
    public static final e d = new a();
    public static final d e = new b();
    public static final AbstractC7688qe f = AbstractC7688qe.a().k();
    public Object[] a;
    public int b;

    /* JADX INFO: renamed from: com.daaw.Xj0$a */
    public class a implements e {
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$c */
    public static class c extends g {
        public final d f;

        public /* synthetic */ c(String str, boolean z, d dVar, a aVar) {
            this(str, z, dVar);
        }

        @Override // com.daaw.C2756Xj0.g
        public Object h(byte[] bArr) {
            return this.f.b(new String(bArr, AbstractC0439Bk.a));
        }

        @Override // com.daaw.C2756Xj0.g
        public byte[] j(Object obj) {
            return this.f.a(obj).getBytes(AbstractC0439Bk.a);
        }

        public c(String str, boolean z, d dVar) {
            super(str, z, dVar, null);
            AbstractC7785qy0.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f = (d) AbstractC7785qy0.o(dVar, "marshaller");
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$d */
    public interface d {
        String a(Object obj);

        Object b(String str);
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$e */
    public interface e {
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$f */
    public interface f {
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$g */
    public static abstract class g {
        public static final BitSet e = b();
        public final String a;
        public final String b;
        public final byte[] c;
        public final Object d;

        public /* synthetic */ g(String str, boolean z, Object obj, a aVar) {
            this(str, z, obj);
        }

        public static BitSet b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        public static g e(String str, d dVar) {
            return f(str, false, dVar);
        }

        public static g f(String str, boolean z, d dVar) {
            return new c(str, z, dVar, null);
        }

        public static g g(String str, boolean z, j jVar) {
            return new i(str, z, jVar, null);
        }

        public static String k(String str, boolean z) {
            AbstractC7785qy0.o(str, "name");
            AbstractC7785qy0.e(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                C2756Xj0.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (!z || cCharAt != ':' || i != 0) {
                    AbstractC7785qy0.g(e.get(cCharAt), "Invalid character '%s' in key name '%s'", cCharAt, str);
                }
            }
            return str;
        }

        public byte[] a() {
            return this.c;
        }

        public final Object c(Class cls) {
            if (cls.isInstance(this.d)) {
                return cls.cast(this.d);
            }
            return null;
        }

        public final String d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.b.equals(((g) obj).b);
        }

        public abstract Object h(byte[] bArr);

        public final int hashCode() {
            return this.b.hashCode();
        }

        public boolean i() {
            return false;
        }

        public abstract byte[] j(Object obj);

        public String toString() {
            return "Key{name='" + this.b + "'}";
        }

        public g(String str, boolean z, Object obj) {
            String str2 = (String) AbstractC7785qy0.o(str, "name");
            this.a = str2;
            String strK = k(str2.toLowerCase(Locale.ROOT), z);
            this.b = strK;
            this.c = strK.getBytes(AbstractC0439Bk.a);
            this.d = obj;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$h */
    public static final class h {
        public final Object a;
        public volatile byte[] b;

        public h(f fVar, Object obj) {
            this.a = obj;
        }

        public static h a(g gVar, Object obj) {
            b(gVar);
            AbstractC6314li0.a(AbstractC7785qy0.n(null));
            return new h(null, obj);
        }

        public static f b(g gVar) {
            AbstractC6314li0.a(gVar.c(f.class));
            return null;
        }

        public byte[] c() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            this.b = C2756Xj0.r(e());
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }

        public Object d(g gVar) {
            if (gVar.i()) {
                b(gVar);
            }
            return gVar.h(c());
        }

        public InputStream e() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$i */
    public static final class i extends g {
        public final j f;

        public /* synthetic */ i(String str, boolean z, j jVar, a aVar) {
            this(str, z, jVar);
        }

        @Override // com.daaw.C2756Xj0.g
        public Object h(byte[] bArr) {
            return this.f.b(bArr);
        }

        @Override // com.daaw.C2756Xj0.g
        public byte[] j(Object obj) {
            return this.f.a(obj);
        }

        public i(String str, boolean z, j jVar) {
            super(str, z, jVar, null);
            AbstractC7785qy0.k(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
            this.f = (j) AbstractC7785qy0.o(jVar, "marshaller");
        }
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$j */
    public interface j {
        byte[] a(Object obj);

        Object b(byte[] bArr);
    }

    public C2756Xj0(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    public static byte[] r(InputStream inputStream) {
        try {
            return AbstractC4062di.d(inputStream);
        } catch (IOException e2) {
            throw new RuntimeException("failure reading serialized stream", e2);
        }
    }

    public final boolean c(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public final int d() {
        Object[] objArr = this.a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    public void e(g gVar) {
        if (i()) {
            return;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (!c(gVar.a(), o(i3))) {
                n(i2, o(i3));
                t(i2, s(i3));
                i2++;
            }
        }
        Arrays.fill(this.a, i2 * 2, k(), (Object) null);
        this.b = i2;
    }

    public final void f(int i2) {
        Object[] objArr = new Object[i2];
        if (!i()) {
            System.arraycopy(this.a, 0, objArr, 0, k());
        }
        this.a = objArr;
    }

    public Object g(g gVar) {
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (c(gVar.a(), o(i2))) {
                return w(i2, gVar);
            }
        }
        return null;
    }

    public int h() {
        return this.b;
    }

    public final boolean i() {
        return this.b == 0;
    }

    public Set j() {
        if (i()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            hashSet.add(new String(o(i2), 0));
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public final int k() {
        return this.b * 2;
    }

    public final void l() {
        if (k() == 0 || k() == d()) {
            f(Math.max(k() * 2, 8));
        }
    }

    public void m(C2756Xj0 c2756Xj0) {
        if (c2756Xj0.i()) {
            return;
        }
        int iD = d() - k();
        if (i() || iD < c2756Xj0.k()) {
            f(k() + c2756Xj0.k());
        }
        System.arraycopy(c2756Xj0.a, 0, this.a, k(), c2756Xj0.k());
        this.b += c2756Xj0.b;
    }

    public final void n(int i2, byte[] bArr) {
        this.a[i2 * 2] = bArr;
    }

    public final byte[] o(int i2) {
        return (byte[]) this.a[i2 * 2];
    }

    public void p(g gVar, Object obj) {
        AbstractC7785qy0.o(gVar, SubscriberAttributeKt.JSON_NAME_KEY);
        AbstractC7785qy0.o(obj, "value");
        l();
        n(this.b, gVar.a());
        if (gVar.i()) {
            t(this.b, h.a(gVar, obj));
        } else {
            u(this.b, gVar.j(obj));
        }
        this.b++;
    }

    public byte[][] q() {
        byte[][] bArr = new byte[k()][];
        Object[] objArr = this.a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, k());
            return bArr;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            int i3 = i2 * 2;
            bArr[i3] = o(i2);
            bArr[i3 + 1] = v(i2);
        }
        return bArr;
    }

    public final Object s(int i2) {
        return this.a[(i2 * 2) + 1];
    }

    public final void t(int i2, Object obj) {
        if (this.a instanceof byte[][]) {
            f(d());
        }
        this.a[(i2 * 2) + 1] = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.b; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            byte[] bArrO = o(i2);
            Charset charset = AbstractC0439Bk.a;
            String str = new String(bArrO, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(f.e(v(i2)));
            } else {
                sb.append(new String(v(i2), charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public final void u(int i2, byte[] bArr) {
        this.a[(i2 * 2) + 1] = bArr;
    }

    public final byte[] v(int i2) {
        Object objS = s(i2);
        return objS instanceof byte[] ? (byte[]) objS : ((h) objS).c();
    }

    public final Object w(int i2, g gVar) {
        Object objS = s(i2);
        return objS instanceof byte[] ? gVar.h((byte[]) objS) : ((h) objS).d(gVar);
    }

    public C2756Xj0(int i2, byte[]... bArr) {
        this(i2, (Object[]) bArr);
    }

    public C2756Xj0(int i2, Object[] objArr) {
        this.b = i2;
        this.a = objArr;
    }

    public C2756Xj0() {
    }

    /* JADX INFO: renamed from: com.daaw.Xj0$b */
    public class b implements d {
        @Override // com.daaw.C2756Xj0.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(String str) {
            return str;
        }

        @Override // com.daaw.C2756Xj0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }
    }
}
