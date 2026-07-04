package com.daaw;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.daaw.g10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4720g10 {
    public static final Logger f = Logger.getLogger(C4720g10.class.getName());
    public static final C4720g10 g = new C4720g10();
    public final ConcurrentNavigableMap a = new ConcurrentSkipListMap();
    public final ConcurrentNavigableMap b = new ConcurrentSkipListMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final ConcurrentMap d = new ConcurrentHashMap();
    public final ConcurrentMap e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: com.daaw.g10$b */
    public static final class b {
        public final c a;

        public b(c cVar) {
            this.a = (c) AbstractC7785qy0.n(cVar);
        }
    }

    /* JADX INFO: renamed from: com.daaw.g10$c */
    public static final class c {
        public final String a;
        public final Certificate b;
        public final Certificate c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e) {
                C4720g10.f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e);
            }
            this.a = cipherSuite;
            this.b = certificate2;
            this.c = certificate;
        }
    }

    public static void b(Map map, InterfaceC6125l10 interfaceC6125l10) {
    }

    public static long f(InterfaceC8921v10 interfaceC8921v10) {
        return interfaceC8921v10.f().d();
    }

    public static C4720g10 g() {
        return g;
    }

    public static void h(Map map, InterfaceC6125l10 interfaceC6125l10) {
    }

    public void c(InterfaceC6125l10 interfaceC6125l10) {
        b(this.d, interfaceC6125l10);
    }

    public void d(InterfaceC6125l10 interfaceC6125l10) {
        b(this.b, interfaceC6125l10);
    }

    public void e(InterfaceC6125l10 interfaceC6125l10) {
        b(this.c, interfaceC6125l10);
    }

    public void i(InterfaceC6125l10 interfaceC6125l10) {
        h(this.d, interfaceC6125l10);
    }

    public void j(InterfaceC6125l10 interfaceC6125l10) {
        h(this.b, interfaceC6125l10);
    }

    public void k(InterfaceC6125l10 interfaceC6125l10) {
        h(this.c, interfaceC6125l10);
    }
}
