package com.daaw;

import j$.util.DesugarCollections;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.daaw.Rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2154Rp0 {
    public static final List a = DesugarCollections.unmodifiableList(Arrays.asList(EnumC5886kB0.HTTP_2));

    public static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i, C0567Cq c0567Cq) throws SSLPeerUnverifiedException {
        AbstractC7785qy0.o(sSLSocketFactory, "sslSocketFactory");
        AbstractC7785qy0.o(socket, "socket");
        AbstractC7785qy0.o(c0567Cq, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        c0567Cq.c(sSLSocket, false);
        String strH = C1820Op0.e().h(sSLSocket, str, c0567Cq.f() ? a : null);
        List list = a;
        AbstractC7785qy0.w(list.contains(EnumC5886kB0.a(strH)), "Only " + list + " are supported, but negotiated protocol is %s", strH);
        if (hostnameVerifier == null) {
            hostnameVerifier = C1197Ip0.a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
