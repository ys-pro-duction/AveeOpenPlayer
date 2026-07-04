package com.daaw;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: com.daaw.l93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6168l93 extends TT2 {
    public final byte[] e;
    public final DatagramPacket f;
    public Uri g;
    public DatagramSocket h;
    public MulticastSocket i;
    public InetAddress j;
    public boolean k;
    public int l;

    public C6168l93(int i) {
        super(true);
        byte[] bArr = new byte[2000];
        this.e = bArr;
        this.f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) throws C5042h93 {
        Uri uri = c5835k03.a;
        this.g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.g.getPort();
        m(c5835k03);
        try {
            this.j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.j, port);
            if (this.j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.i = multicastSocket;
                multicastSocket.joinGroup(this.j);
                this.h = this.i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.k = true;
            n(c5835k03);
            return -1L;
        } catch (IOException e) {
            throw new C5042h93(e, 2001);
        } catch (SecurityException e2) {
            throw new C5042h93(e2, 2006);
        }
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) throws C5042h93 {
        if (i2 == 0) {
            return 0;
        }
        if (this.l == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f);
                int length = this.f.getLength();
                this.l = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new C5042h93(e, 2002);
            } catch (IOException e2) {
                throw new C5042h93(e2, 2001);
            }
        }
        int length2 = this.f.getLength();
        int i3 = this.l;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.e, length2 - i3, bArr, i, iMin);
        this.l -= iMin;
        return iMin;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        return this.g;
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        InetAddress inetAddress;
        this.g = null;
        MulticastSocket multicastSocket = this.i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.j = null;
        this.l = 0;
        if (this.k) {
            this.k = false;
            l();
        }
    }
}
