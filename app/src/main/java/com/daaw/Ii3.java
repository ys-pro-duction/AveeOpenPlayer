package com.daaw;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Ii3 implements InterfaceC9661xg3 {
    public final InterfaceC1810Om2 a;
    public final H32 b;
    public final Q42 c;
    public final Gi3 d;
    public final SparseArray e;
    public C8057rw2 f;
    public InterfaceC6406m12 g;
    public InterfaceC1834Os2 h;
    public boolean i;

    public Ii3(InterfaceC1810Om2 interfaceC1810Om2) {
        interfaceC1810Om2.getClass();
        this.a = interfaceC1810Om2;
        this.f = new C8057rw2(AbstractC9004vJ2.I(), interfaceC1810Om2, new InterfaceC5531iv2() { // from class: com.daaw.Ih3
            @Override // com.daaw.InterfaceC5531iv2
            public final void a(Object obj, C1617Mq1 c1617Mq1) {
            }
        });
        H32 h32 = new H32();
        this.b = h32;
        this.c = new Q42();
        this.d = new Gi3(h32);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void X(Ii3 ii3) {
        final C10219zg3 c10219zg3V = ii3.V();
        ii3.Z(c10219zg3V, 1028, new InterfaceC0803Eu2() { // from class: com.daaw.Hg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
        ii3.f.e();
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void A(Dg3 dg3) {
        this.f.f(dg3);
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void B(final long j, final int i) {
        final C10219zg3 c10219zg3C0 = c0();
        Z(c10219zg3C0, 1021, new InterfaceC0803Eu2(j, i) { // from class: com.daaw.Jh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void C(final int i, final int i2) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 24, new InterfaceC0803Eu2(i, i2) { // from class: com.daaw.ui3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void D(final int i, final long j) {
        final C10219zg3 c10219zg3C0 = c0();
        Z(c10219zg3C0, 1018, new InterfaceC0803Eu2() { // from class: com.daaw.Fh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).k(c10219zg3C0, i, j);
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void E(final String str) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1012, new InterfaceC0803Eu2() { // from class: com.daaw.Ng3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void F(final C8787ua3 c8787ua3) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1015, new InterfaceC0803Eu2() { // from class: com.daaw.ii3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void G(int i, Vp3 vp3, final Rp3 rp3) {
        final C10219zg3 c10219zg3B0 = b0(i, vp3);
        Z(c10219zg3B0, 1004, new InterfaceC0803Eu2() { // from class: com.daaw.Kh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).i(c10219zg3B0, rp3);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void H(final float f) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 22, new InterfaceC0803Eu2(f) { // from class: com.daaw.bh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void I(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final C10219zg3 c10219zg3B0 = b0(i, vp3);
        Z(c10219zg3B0, 1000, new InterfaceC0803Eu2() { // from class: com.daaw.Pg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void J(final boolean z, final int i) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, -1, new InterfaceC0803Eu2(z, i) { // from class: com.daaw.lh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void K(final int i, final long j, final long j2) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1011, new InterfaceC0803Eu2(i, j, j2) { // from class: com.daaw.fh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void L(final C2485Ut1 c2485Ut1, final C9631xa3 c9631xa3) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1009, new InterfaceC0803Eu2() { // from class: com.daaw.ei3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).m(c10219zg3D0, c2485Ut1, c9631xa3);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void M(final C9027vP1 c9027vP1) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 14, new InterfaceC0803Eu2() { // from class: com.daaw.Fi3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void N(final InterfaceC6406m12 interfaceC6406m12, Looper looper) {
        boolean z = true;
        if (this.g != null && !this.d.b.isEmpty()) {
            z = false;
        }
        AbstractC6048km2.f(z);
        interfaceC6406m12.getClass();
        this.g = interfaceC6406m12;
        this.h = this.a.a(looper, null);
        this.f = this.f.a(looper, new InterfaceC5531iv2() { // from class: com.daaw.jh3
            @Override // com.daaw.InterfaceC5531iv2
            public final void a(Object obj, C1617Mq1 c1617Mq1) {
                this.a.Y(interfaceC6406m12, (Dg3) obj, c1617Mq1);
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void O(final String str, final long j, final long j2) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1008, new InterfaceC0803Eu2(str, j2, j) { // from class: com.daaw.ph3
            public final /* synthetic */ String b;

            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.Js3
    public final void P(final int i, final long j, final long j2) {
        final C10219zg3 c10219zg3A0 = a0(this.d.c());
        Z(c10219zg3A0, 1006, new InterfaceC0803Eu2() { // from class: com.daaw.Zg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).j(c10219zg3A0, i, j, j2);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void Q(AbstractC8657u52 abstractC8657u52, final int i) {
        InterfaceC6406m12 interfaceC6406m12 = this.g;
        interfaceC6406m12.getClass();
        this.d.i(interfaceC6406m12);
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 0, new InterfaceC0803Eu2(i) { // from class: com.daaw.Tg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void R(final Exception exc) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1014, new InterfaceC0803Eu2() { // from class: com.daaw.si3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void S(final Exception exc) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1029, new InterfaceC0803Eu2() { // from class: com.daaw.oi3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void T(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3, final IOException iOException, final boolean z) {
        final C10219zg3 c10219zg3B0 = b0(i, vp3);
        Z(c10219zg3B0, 1003, new InterfaceC0803Eu2() { // from class: com.daaw.hh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).c(c10219zg3B0, mp3, rp3, iOException, z);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void U(final YL1 yl1, final int i) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 1, new InterfaceC0803Eu2(yl1, i) { // from class: com.daaw.Vg3
            public final /* synthetic */ YL1 b;

            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    public final C10219zg3 V() {
        return a0(this.d.b());
    }

    public final C10219zg3 W(AbstractC8657u52 abstractC8657u52, int i, Vp3 vp3) {
        Vp3 vp32 = true == abstractC8657u52.o() ? null : vp3;
        long jZza = this.a.zza();
        boolean z = abstractC8657u52.equals(this.g.zzn()) && i == this.g.zzd();
        long jE = 0;
        if (vp32 == null || !vp32.b()) {
            if (z) {
                jE = this.g.zzj();
            } else if (!abstractC8657u52.o()) {
                long j = abstractC8657u52.e(i, this.c, 0L).l;
                jE = AbstractC9004vJ2.E(0L);
            }
        } else if (z && this.g.zzb() == vp32.b && this.g.zzc() == vp32.c) {
            jE = this.g.zzk();
        }
        return new C10219zg3(jZza, abstractC8657u52, i, vp32, jE, this.g.zzn(), this.g.zzd(), this.d.b(), this.g.zzk(), this.g.zzm());
    }

    public final /* synthetic */ void Y(InterfaceC6406m12 interfaceC6406m12, Dg3 dg3, C1617Mq1 c1617Mq1) {
        dg3.h(interfaceC6406m12, new Bg3(c1617Mq1, this.e));
    }

    public final void Z(C10219zg3 c10219zg3, int i, InterfaceC0803Eu2 interfaceC0803Eu2) {
        this.e.put(i, c10219zg3);
        C8057rw2 c8057rw2 = this.f;
        c8057rw2.d(i, interfaceC0803Eu2);
        c8057rw2.c();
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void a(final boolean z) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 3, new InterfaceC0803Eu2(z) { // from class: com.daaw.Lg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    public final C10219zg3 a0(Vp3 vp3) {
        this.g.getClass();
        AbstractC8657u52 abstractC8657u52A = vp3 == null ? null : this.d.a(vp3);
        if (vp3 != null && abstractC8657u52A != null) {
            return W(abstractC8657u52A, abstractC8657u52A.n(vp3.a, this.b).c, vp3);
        }
        int iZzd = this.g.zzd();
        AbstractC8657u52 abstractC8657u52Zzn = this.g.zzn();
        if (iZzd >= abstractC8657u52Zzn.c()) {
            abstractC8657u52Zzn = AbstractC8657u52.a;
        }
        return W(abstractC8657u52Zzn, iZzd, null);
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void b(final boolean z) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 7, new InterfaceC0803Eu2(z) { // from class: com.daaw.nh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    public final C10219zg3 b0(int i, Vp3 vp3) {
        InterfaceC6406m12 interfaceC6406m12 = this.g;
        interfaceC6406m12.getClass();
        if (vp3 != null) {
            return this.d.a(vp3) != null ? a0(vp3) : W(AbstractC8657u52.a, i, vp3);
        }
        AbstractC8657u52 abstractC8657u52Zzn = interfaceC6406m12.zzn();
        if (i >= abstractC8657u52Zzn.c()) {
            abstractC8657u52Zzn = AbstractC8657u52.a;
        }
        return W(abstractC8657u52Zzn, i, null);
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void c(final long j) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1010, new InterfaceC0803Eu2(j) { // from class: com.daaw.mh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    public final C10219zg3 c0() {
        return a0(this.d.d());
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void d(final C7375pW1 c7375pW1) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 12, new InterfaceC0803Eu2() { // from class: com.daaw.Fg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    public final C10219zg3 d0() {
        return a0(this.d.e());
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void e(final G02 g02, final G02 g022, final int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        Gi3 gi3 = this.d;
        InterfaceC6406m12 interfaceC6406m12 = this.g;
        interfaceC6406m12.getClass();
        gi3.g(interfaceC6406m12);
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 11, new InterfaceC0803Eu2() { // from class: com.daaw.gi3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).q(c10219zg3V, g02, g022, i);
            }
        });
    }

    public final C10219zg3 e0(AbstractC4004dV1 abstractC4004dV1) {
        Vp3 vp3;
        return (!(abstractC4004dV1 instanceof Sa3) || (vp3 = ((Sa3) abstractC4004dV1).O) == null) ? V() : a0(vp3);
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void f(final C2485Ut1 c2485Ut1, final C9631xa3 c9631xa3) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1017, new InterfaceC0803Eu2() { // from class: com.daaw.Wh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).p(c10219zg3D0, c2485Ut1, c9631xa3);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void g(final int i) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 4, new InterfaceC0803Eu2() { // from class: com.daaw.Sh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).e(c10219zg3V, i);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void h(final C2326Tf2 c2326Tf2) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 25, new InterfaceC0803Eu2() { // from class: com.daaw.ai3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                C10219zg3 c10219zg3 = c10219zg3D0;
                C2326Tf2 c2326Tf22 = c2326Tf2;
                ((Dg3) obj).d(c10219zg3, c2326Tf22);
                int i = c2326Tf22.a;
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void i(final C8787ua3 c8787ua3) {
        final C10219zg3 c10219zg3C0 = c0();
        Z(c10219zg3C0, 1013, new InterfaceC0803Eu2() { // from class: com.daaw.Qh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void j(List list, Vp3 vp3) {
        InterfaceC6406m12 interfaceC6406m12 = this.g;
        interfaceC6406m12.getClass();
        this.d.h(list, vp3, interfaceC6406m12);
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void k(final AbstractC4004dV1 abstractC4004dV1) {
        final C10219zg3 c10219zg3E0 = e0(abstractC4004dV1);
        Z(c10219zg3E0, 10, new InterfaceC0803Eu2() { // from class: com.daaw.Gh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void l(final String str) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1019, new InterfaceC0803Eu2() { // from class: com.daaw.Eh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void m(final C8787ua3 c8787ua3) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1007, new InterfaceC0803Eu2() { // from class: com.daaw.Jg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void n(final int i) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 6, new InterfaceC0803Eu2(i) { // from class: com.daaw.Dh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void o(Dg3 dg3) {
        this.f.b(dg3);
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void p(final AbstractC4004dV1 abstractC4004dV1) {
        final C10219zg3 c10219zg3E0 = e0(abstractC4004dV1);
        Z(c10219zg3E0, 10, new InterfaceC0803Eu2() { // from class: com.daaw.Oh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).b(c10219zg3E0, abstractC4004dV1);
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void q(final C8787ua3 c8787ua3) {
        final C10219zg3 c10219zg3C0 = c0();
        Z(c10219zg3C0, 1020, new InterfaceC0803Eu2() { // from class: com.daaw.Yh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
                ((Dg3) obj).n(c10219zg3C0, c8787ua3);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void r(final boolean z) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 23, new InterfaceC0803Eu2(z) { // from class: com.daaw.Xg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void s(final String str, final long j, final long j2) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1016, new InterfaceC0803Eu2(str, j2, j) { // from class: com.daaw.qi3
            public final /* synthetic */ String b;

            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void t(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final C10219zg3 c10219zg3B0 = b0(i, vp3);
        Z(c10219zg3B0, 1002, new InterfaceC0803Eu2() { // from class: com.daaw.Mh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void u(final Object obj, final long j) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 26, new InterfaceC0803Eu2() { // from class: com.daaw.mi3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj2) {
                ((Dg3) obj2).o(c10219zg3D0, obj, j);
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void v(final C6844nc2 c6844nc2) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 2, new InterfaceC0803Eu2() { // from class: com.daaw.oh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void w(final Exception exc) {
        final C10219zg3 c10219zg3D0 = d0();
        Z(c10219zg3D0, 1030, new InterfaceC0803Eu2() { // from class: com.daaw.dh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC6915nq3
    public final void x(int i, Vp3 vp3, final Mp3 mp3, final Rp3 rp3) {
        final C10219zg3 c10219zg3B0 = b0(i, vp3);
        Z(c10219zg3B0, 1001, new InterfaceC0803Eu2() { // from class: com.daaw.Uh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void y(final boolean z, final int i) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 5, new InterfaceC0803Eu2(z, i) { // from class: com.daaw.Hh3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9067vZ1
    public final void z(final PY1 py1) {
        final C10219zg3 c10219zg3V = V();
        Z(c10219zg3V, 13, new InterfaceC0803Eu2() { // from class: com.daaw.Rg3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void zzN() {
        InterfaceC1834Os2 interfaceC1834Os2 = this.h;
        AbstractC6048km2.b(interfaceC1834Os2);
        interfaceC1834Os2.f(new Runnable() { // from class: com.daaw.ki3
            @Override // java.lang.Runnable
            public final void run() {
                Ii3.X(this.B);
            }
        });
    }

    @Override // com.daaw.InterfaceC9661xg3
    public final void zzu() {
        if (this.i) {
            return;
        }
        final C10219zg3 c10219zg3V = V();
        this.i = true;
        Z(c10219zg3V, -1, new InterfaceC0803Eu2() { // from class: com.daaw.ci3
            @Override // com.daaw.InterfaceC0803Eu2
            public final void zza(Object obj) {
            }
        });
    }
}
