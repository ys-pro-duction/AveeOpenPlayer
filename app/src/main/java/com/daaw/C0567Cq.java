package com.daaw;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.daaw.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0567Cq {
    public static final EnumC2551Vk[] e;
    public static final C0567Cq f;
    public static final C0567Cq g;
    public static final C0567Cq h;
    public final boolean a;
    public final String[] b;
    public final String[] c;
    public final boolean d;

    static {
        EnumC2551Vk[] enumC2551VkArr = {EnumC2551Vk.TLS_AES_128_GCM_SHA256, EnumC2551Vk.TLS_AES_256_GCM_SHA384, EnumC2551Vk.TLS_CHACHA20_POLY1305_SHA256, EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, EnumC2551Vk.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, EnumC2551Vk.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, EnumC2551Vk.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, EnumC2551Vk.TLS_RSA_WITH_AES_128_GCM_SHA256, EnumC2551Vk.TLS_RSA_WITH_AES_256_GCM_SHA384, EnumC2551Vk.TLS_RSA_WITH_AES_128_CBC_SHA, EnumC2551Vk.TLS_RSA_WITH_AES_256_CBC_SHA, EnumC2551Vk.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        e = enumC2551VkArr;
        b bVarF = new b(true).f(enumC2551VkArr);
        EnumC4168e41 enumC4168e41 = EnumC4168e41.TLS_1_3;
        EnumC4168e41 enumC4168e412 = EnumC4168e41.TLS_1_2;
        C0567Cq c0567CqE = bVarF.i(enumC4168e41, enumC4168e412).h(true).e();
        f = c0567CqE;
        g = new b(c0567CqE).i(enumC4168e41, enumC4168e412, EnumC4168e41.TLS_1_1, EnumC4168e41.TLS_1_0).h(true).e();
        h = new b(false).e();
    }

    public void c(SSLSocket sSLSocket, boolean z) {
        C0567Cq c0567CqE = e(sSLSocket, z);
        sSLSocket.setEnabledProtocols(c0567CqE.c);
        String[] strArr = c0567CqE.b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List d() {
        String[] strArr = this.b;
        if (strArr == null) {
            return null;
        }
        EnumC2551Vk[] enumC2551VkArr = new EnumC2551Vk[strArr.length];
        int i = 0;
        while (true) {
            String[] strArr2 = this.b;
            if (i >= strArr2.length) {
                return AbstractC7117ob1.a(enumC2551VkArr);
            }
            enumC2551VkArr[i] = EnumC2551Vk.a(strArr2[i]);
            i++;
        }
    }

    public final C0567Cq e(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        if (this.b != null) {
            enabledCipherSuites = (String[]) AbstractC7117ob1.c(String.class, this.b, sSLSocket.getEnabledCipherSuites());
        } else {
            enabledCipherSuites = null;
        }
        if (z && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (enabledCipherSuites == null) {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            int length = enabledCipherSuites.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
            strArr[length] = "TLS_FALLBACK_SCSV";
            enabledCipherSuites = strArr;
        }
        return new b(this).g(enabledCipherSuites).j((String[]) AbstractC7117ob1.c(String.class, this.c, sSLSocket.getEnabledProtocols())).e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0567Cq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0567Cq c0567Cq = (C0567Cq) obj;
        boolean z = this.a;
        if (z != c0567Cq.a) {
            return false;
        }
        return !z || (Arrays.equals(this.b, c0567Cq.b) && Arrays.equals(this.c, c0567Cq.c) && this.d == c0567Cq.d);
    }

    public boolean f() {
        return this.d;
    }

    public List g() {
        EnumC4168e41[] enumC4168e41Arr = new EnumC4168e41[this.c.length];
        int i = 0;
        while (true) {
            String[] strArr = this.c;
            if (i >= strArr.length) {
                return AbstractC7117ob1.a(enumC4168e41Arr);
            }
            enumC4168e41Arr[i] = EnumC4168e41.a(strArr[i]);
            i++;
        }
    }

    public int hashCode() {
        if (this.a) {
            return ((((527 + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        List listD = d();
        return "ConnectionSpec(cipherSuites=" + (listD == null ? "[use default]" : listD.toString()) + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.d + ")";
    }

    /* JADX INFO: renamed from: com.daaw.Cq$b */
    public static final class b {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public b(boolean z) {
            this.a = z;
        }

        public C0567Cq e() {
            return new C0567Cq(this);
        }

        public b f(EnumC2551Vk... enumC2551VkArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[enumC2551VkArr.length];
            for (int i = 0; i < enumC2551VkArr.length; i++) {
                strArr[i] = enumC2551VkArr[i].B;
            }
            this.b = strArr;
            return this;
        }

        public b g(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr == null) {
                this.b = null;
                return this;
            }
            this.b = (String[]) strArr.clone();
            return this;
        }

        public b h(boolean z) {
            if (!this.a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.d = z;
            return this;
        }

        public b i(EnumC4168e41... enumC4168e41Arr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (enumC4168e41Arr.length == 0) {
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            String[] strArr = new String[enumC4168e41Arr.length];
            for (int i = 0; i < enumC4168e41Arr.length; i++) {
                strArr[i] = enumC4168e41Arr[i].B;
            }
            this.c = strArr;
            return this;
        }

        public b j(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr == null) {
                this.c = null;
                return this;
            }
            this.c = (String[]) strArr.clone();
            return this;
        }

        public b(C0567Cq c0567Cq) {
            this.a = c0567Cq.a;
            this.b = c0567Cq.b;
            this.c = c0567Cq.c;
            this.d = c0567Cq.d;
        }
    }

    public C0567Cq(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
    }
}
