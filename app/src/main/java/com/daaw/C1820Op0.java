package com.daaw;

import com.daaw.C1944Pu0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.daaw.Op0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1820Op0 {
    public static final Logger b = Logger.getLogger(C1820Op0.class.getName());
    public static final C1944Pu0 c = C1944Pu0.e();
    public static C1820Op0 d = d(C1820Op0.class.getClassLoader());
    public final C1944Pu0 a;

    /* JADX INFO: renamed from: com.daaw.Op0$a */
    public static final class a extends C1820Op0 {
        public static final C2888Yq0 e;
        public static final C2888Yq0 f;
        public static final C2888Yq0 g;
        public static final C2888Yq0 h;
        public static final C2888Yq0 i;
        public static final C2888Yq0 j;
        public static final Method k;
        public static final Method l;
        public static final Method m;
        public static final Method n;
        public static final Method o;
        public static final Method p;
        public static final Constructor q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            NoSuchMethodException e2;
            ClassNotFoundException e3;
            Method method6;
            Class<?> cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            e = new C2888Yq0(null, "setUseSessionTickets", cls);
            f = new C2888Yq0(null, "setHostname", String.class);
            g = new C2888Yq0(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            h = new C2888Yq0(null, "setAlpnProtocols", byte[].class);
            i = new C2888Yq0(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            j = new C2888Yq0(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            } catch (ClassNotFoundException e4) {
                e = e4;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e5) {
                e = e5;
                method = null;
                method2 = null;
            }
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e6) {
                e = e6;
                method2 = null;
                method3 = method2;
                method4 = method3;
                C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                m = method;
                n = method2;
                o = method3;
                k = method4;
                l = method5;
                try {
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                } catch (ClassNotFoundException e7) {
                    e3 = e7;
                    method6 = null;
                    C1820Op0.b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e3);
                    p = method6;
                    q = constructor;
                } catch (NoSuchMethodException e8) {
                    e2 = e8;
                    method6 = null;
                    C1820Op0.b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e2);
                    p = method6;
                    q = constructor;
                }
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e9) {
                    e3 = e9;
                    C1820Op0.b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e3);
                } catch (NoSuchMethodException e10) {
                    e2 = e10;
                    C1820Op0.b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e2);
                }
                p = method6;
                q = constructor;
            } catch (NoSuchMethodException e11) {
                e = e11;
                method2 = null;
                method3 = method2;
                method4 = method3;
                C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                m = method;
                n = method2;
                o = method3;
                k = method4;
                l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                p = method6;
                q = constructor;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                    try {
                        method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                    } catch (ClassNotFoundException e12) {
                        e = e12;
                        C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                    }
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    method4 = null;
                } catch (NoSuchMethodException e15) {
                    e = e15;
                    method4 = null;
                }
            } catch (ClassNotFoundException e16) {
                e = e16;
                method3 = null;
                method4 = method3;
                C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                m = method;
                n = method2;
                o = method3;
                k = method4;
                l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                p = method6;
                q = constructor;
            } catch (NoSuchMethodException e17) {
                e = e17;
                method3 = null;
                method4 = method3;
                C1820Op0.b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                m = method;
                n = method2;
                o = method3;
                k = method4;
                l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                p = method6;
                q = constructor;
            }
            m = method;
            n = method2;
            o = method3;
            k = method4;
            l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e18) {
                e3 = e18;
            } catch (NoSuchMethodException e19) {
                e2 = e19;
            }
            p = method6;
            q = constructor;
        }

        public a(C1944Pu0 c1944Pu0) {
            super(c1944Pu0);
        }

        @Override // com.daaw.C1820Op0
        public void c(SSLSocket sSLSocket, String str, List list) {
            Constructor constructor;
            boolean z;
            Method method;
            String[] strArrI = C1820Op0.i(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (C1820Op0.g(str)) {
                            Method method2 = k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                e.e(sSLSocket, Boolean.TRUE);
                            } else {
                                l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = p;
                            if (method3 == null || (constructor = q) == null) {
                                f.e(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InstantiationException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(e4);
                }
            }
            Method method4 = o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    m.invoke(sSLParameters, strArrI);
                    z = true;
                } catch (InvocationTargetException e5) {
                    if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e5;
                    }
                    C1820Op0.b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z = false;
                }
            } else {
                z = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z && (method = n) != null && Arrays.equals(strArrI, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {C1944Pu0.b(list)};
            if (this.a.i() == C1944Pu0.h.ALPN_AND_NPN) {
                h.f(sSLSocket, objArr);
            }
            if (this.a.i() == C1944Pu0.h.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            j.f(sSLSocket, objArr);
        }

        @Override // com.daaw.C1820Op0
        public String f(SSLSocket sSLSocket) {
            Method method = o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e3);
                    }
                    C1820Op0.b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.a.i() == C1944Pu0.h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, AbstractC7117ob1.b);
                    }
                } catch (Exception e4) {
                    C1820Op0.b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
                }
            }
            if (this.a.i() != C1944Pu0.h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) i.f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, AbstractC7117ob1.b);
                    }
                } catch (Exception e5) {
                    C1820Op0.b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
                }
            }
            return null;
        }

        @Override // com.daaw.C1820Op0
        public String h(SSLSocket sSLSocket, String str, List list) {
            String strF = f(sSLSocket);
            return strF == null ? super.h(sSLSocket, str, list) : strF;
        }
    }

    public C1820Op0(C1944Pu0 c1944Pu0) {
        this.a = (C1944Pu0) AbstractC7785qy0.o(c1944Pu0, "platform");
    }

    public static C1820Op0 d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                return new C1820Op0(c);
            }
        }
        return new a(c);
    }

    public static C1820Op0 e() {
        return d;
    }

    public static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            AbstractC7365pU.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static String[] i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumC5886kB0) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
        this.a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strF = f(sSLSocket);
            if (strF != null) {
                return strF;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.a.a(sSLSocket);
        }
    }
}
