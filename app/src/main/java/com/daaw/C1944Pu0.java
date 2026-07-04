package com.daaw;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.daaw.Pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1944Pu0 {
    public static final Logger b = Logger.getLogger(C1944Pu0.class.getName());
    public static final String[] c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final C1944Pu0 d = d();
    public final Provider a;

    /* JADX INFO: renamed from: com.daaw.Pu0$a */
    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$b */
    public class b implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$c */
    public class c implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$d */
    public static class d extends C1944Pu0 {
        public final C2888Yq0 e;
        public final C2888Yq0 f;
        public final Method g;
        public final Method h;
        public final C2888Yq0 i;
        public final C2888Yq0 j;
        public final h k;

        public d(C2888Yq0 c2888Yq0, C2888Yq0 c2888Yq02, Method method, Method method2, C2888Yq0 c2888Yq03, C2888Yq0 c2888Yq04, Provider provider, h hVar) {
            super(provider);
            this.e = c2888Yq0;
            this.f = c2888Yq02;
            this.g = method;
            this.h = method2;
            this.i = c2888Yq03;
            this.j = c2888Yq04;
            this.k = hVar;
        }

        @Override // com.daaw.C1944Pu0
        public void c(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.e.e(sSLSocket, Boolean.TRUE);
                this.f.e(sSLSocket, str);
            }
            if (this.j.g(sSLSocket)) {
                this.j.f(sSLSocket, C1944Pu0.b(list));
            }
        }

        @Override // com.daaw.C1944Pu0
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.i.g(sSLSocket) && (bArr = (byte[]) this.i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, AbstractC7117ob1.b);
            }
            return null;
        }

        @Override // com.daaw.C1944Pu0
        public h i() {
            return this.k;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$e */
    public static class e extends C1944Pu0 {
        public final Method e;
        public final Method f;

        public /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // com.daaw.C1944Pu0
        public void c(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EnumC5886kB0 enumC5886kB0 = (EnumC5886kB0) it.next();
                if (enumC5886kB0 != EnumC5886kB0.HTTP_1_0) {
                    arrayList.add(enumC5886kB0.toString());
                }
            }
            try {
                this.e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.daaw.C1944Pu0
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // com.daaw.C1944Pu0
        public h i() {
            return h.ALPN_AND_NPN;
        }

        public e(Provider provider, Method method, Method method2) {
            super(provider);
            this.e = method;
            this.f = method2;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$f */
    public static class f extends C1944Pu0 {
        public final Method e;
        public final Method f;
        public final Method g;
        public final Class h;
        public final Class i;

        public f(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.e = method;
            this.f = method2;
            this.g = method3;
            this.h = cls;
            this.i = cls2;
        }

        @Override // com.daaw.C1944Pu0
        public void a(SSLSocket sSLSocket) {
            try {
                this.g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e) {
                C1944Pu0.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
            }
        }

        @Override // com.daaw.C1944Pu0
        public void c(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                EnumC5886kB0 enumC5886kB0 = (EnumC5886kB0) list.get(i);
                if (enumC5886kB0 != EnumC5886kB0.HTTP_1_0) {
                    arrayList.add(enumC5886kB0.toString());
                }
            }
            try {
                this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(C1944Pu0.class.getClassLoader(), new Class[]{this.h, this.i}, new g(arrayList)));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.daaw.C1944Pu0
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
                if (!gVar.b && gVar.c == null) {
                    C1944Pu0.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (gVar.b) {
                    return null;
                }
                return gVar.c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // com.daaw.C1944Pu0
        public h i() {
            return h.ALPN_AND_NPN;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$g */
    public static class g implements InvocationHandler {
        public final List a;
        public boolean b;
        public String c;

        public g(List list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = AbstractC7117ob1.a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.a.get(0);
                    this.c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.c = (String) objArr[0];
            return null;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Pu0$h */
    public enum h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public C1944Pu0(Provider provider) {
        this.a = provider;
    }

    public static byte[] b(List list) {
        C4057dh c4057dh = new C4057dh();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            EnumC5886kB0 enumC5886kB0 = (EnumC5886kB0) list.get(i);
            if (enumC5886kB0 != EnumC5886kB0.HTTP_1_0) {
                c4057dh.L(enumC5886kB0.toString().length());
                c4057dh.d0(enumC5886kB0.toString());
            }
        }
        return c4057dh.w0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.daaw.Pu0$a] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.reflect.Method] */
    public static C1944Pu0 d() {
        Method method;
        Provider providerF = f();
        ?? method2 = 0;
        method2 = 0;
        if (providerF != null) {
            C2888Yq0 c2888Yq0 = new C2888Yq0(null, "setUseSessionTickets", Boolean.TYPE);
            C2888Yq0 c2888Yq02 = new C2888Yq0(null, "setHostname", String.class);
            C2888Yq0 c2888Yq03 = new C2888Yq0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            C2888Yq0 c2888Yq04 = new C2888Yq0(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                method = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
            }
            Method method3 = method;
            ?? r9 = method2;
            h hVar = (providerF.getName().equals("GmsCore_OpenSSL") || providerF.getName().equals("Conscrypt") || providerF.getName().equals("Ssl_Guard") || k()) ? h.ALPN_AND_NPN : j() ? h.NPN : h.NONE;
            return new d(c2888Yq0, c2888Yq02, method3, r9, c2888Yq03, c2888Yq04, providerF, hVar);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), null);
                    return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), method2);
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused4) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                return new C1944Pu0(provider);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static C1944Pu0 e() {
        return d;
    }

    public static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : c) {
                if (str.equals(provider.getClass().getName())) {
                    b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    public static boolean j() {
        try {
            C1944Pu0.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e2) {
            b.log(Level.FINE, "Can't find class", (Throwable) e2);
            return false;
        }
    }

    public static boolean k() {
        try {
            C1944Pu0.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e2) {
            b.log(Level.FINE, "Can't find class", (Throwable) e2);
            return false;
        }
    }

    public Provider g() {
        return this.a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public h i() {
        return h.NONE;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
