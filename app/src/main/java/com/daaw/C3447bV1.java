package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.bV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3447bV1 {
    public long a;

    public final long a(ByteBuffer byteBuffer) {
        C3009Zu1 c3009Zu1;
        C2905Yu1 c2905Yu1;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new C2489Uu1(new C3168aV1(byteBufferDuplicate), C5688jV1.c).l().iterator();
            while (true) {
                c3009Zu1 = null;
                if (!it.hasNext()) {
                    c2905Yu1 = null;
                    break;
                }
                InterfaceC2697Wu1 interfaceC2697Wu1 = (InterfaceC2697Wu1) it.next();
                if (interfaceC2697Wu1 instanceof C2905Yu1) {
                    c2905Yu1 = (C2905Yu1) interfaceC2697Wu1;
                    break;
                }
            }
            Iterator it2 = c2905Yu1.l().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC2697Wu1 interfaceC2697Wu12 = (InterfaceC2697Wu1) it2.next();
                if (interfaceC2697Wu12 instanceof C3009Zu1) {
                    c3009Zu1 = (C3009Zu1) interfaceC2697Wu12;
                    break;
                }
            }
            long jH = (c3009Zu1.h() * 1000) / c3009Zu1.i();
            this.a = jH;
            return jH;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
