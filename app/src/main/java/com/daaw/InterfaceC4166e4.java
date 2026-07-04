package com.daaw;

import android.view.Surface;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC1896Pi0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* JADX INFO: renamed from: com.daaw.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC4166e4 {

    /* JADX INFO: renamed from: com.daaw.e4$a */
    public static final class a {
        public final long a;
        public final L31 b;
        public final int c;
        public final InterfaceC1792Oi0.a d;
        public final long e;
        public final long f;
        public final long g;

        public a(long j, L31 l31, int i, InterfaceC1792Oi0.a aVar, long j2, long j3, long j4) {
            this.a = j;
            this.b = l31;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = j3;
            this.g = j4;
        }
    }

    void A(a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar);

    void B(a aVar);

    void C(a aVar, int i);

    void a(a aVar, InterfaceC1896Pi0.c cVar);

    void b(a aVar, InterfaceC1896Pi0.c cVar);

    void c(a aVar, int i, long j);

    void d(a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar);

    void e(a aVar, int i);

    void f(a aVar);

    void g(a aVar, boolean z, int i);

    void h(a aVar, int i);

    void i(a aVar, int i, C0912Fw c0912Fw);

    void j(a aVar, boolean z);

    void k(a aVar, int i, Format format);

    void l(a aVar, Metadata metadata);

    void m(a aVar, Surface surface);

    void n(a aVar, TrackGroupArray trackGroupArray, C3338b51 c3338b51);

    void o(a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar);

    void p(a aVar);

    void q(a aVar, InterfaceC1896Pi0.b bVar, InterfaceC1896Pi0.c cVar, IOException iOException, boolean z);

    void r(a aVar, int i, long j, long j2);

    void s(a aVar, int i, C0912Fw c0912Fw);

    void t(a aVar, C9457ww0 c9457ww0);

    void u(a aVar);

    void v(a aVar, int i, String str, long j);

    void w(a aVar, int i, long j, long j2);

    void x(a aVar, int i, int i2, int i3, float f);

    void y(a aVar, VI vi);

    void z(a aVar);
}
