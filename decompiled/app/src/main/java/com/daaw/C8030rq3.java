package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.daaw.rq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8030rq3 implements Tp3, Sp3 {
    public final Tp3[] B;
    public Sp3 F;
    public C6362lr3 G;
    public final Gp3 J;
    public final ArrayList D = new ArrayList();
    public final HashMap E = new HashMap();
    public InterfaceC4678fr3 I = new Fp3(new InterfaceC4678fr3[0]);
    public final IdentityHashMap C = new IdentityHashMap();
    public Tp3[] H = new Tp3[0];

    public C8030rq3(Gp3 gp3, long[] jArr, Tp3... tp3Arr) {
        this.J = gp3;
        this.B = tp3Arr;
        for (int i = 0; i < tp3Arr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.B[i] = new C7473pq3(tp3Arr[i], j);
            }
        }
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final void a(long j) {
        this.I.a(j);
    }

    @Override // com.daaw.Sp3
    public final void b(Tp3 tp3) {
        this.D.remove(tp3);
        if (!this.D.isEmpty()) {
            return;
        }
        int i = 0;
        for (Tp3 tp32 : this.B) {
            i += tp32.zzh().a;
        }
        A62[] a62Arr = new A62[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Tp3[] tp3Arr = this.B;
            if (i2 >= tp3Arr.length) {
                this.G = new C6362lr3(a62Arr);
                Sp3 sp3 = this.F;
                sp3.getClass();
                sp3.b(this);
                return;
            }
            C6362lr3 c6362lr3Zzh = tp3Arr[i2].zzh();
            int i4 = c6362lr3Zzh.a;
            int i5 = 0;
            while (i5 < i4) {
                A62 a62B = c6362lr3Zzh.b(i5);
                A62 a62C = a62B.c(i2 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + a62B.b);
                this.E.put(a62C, a62B);
                a62Arr[i3] = a62C;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    public final Tp3 c(int i) {
        Tp3 tp3 = this.B[i];
        return tp3 instanceof C7473pq3 ? ((C7473pq3) tp3).B : tp3;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean d(C9651xe3 c9651xe3) {
        if (this.D.isEmpty()) {
            return this.I.d(c9651xe3);
        }
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((Tp3) this.D.get(i)).d(c9651xe3);
        }
        return false;
    }

    @Override // com.daaw.Tp3
    public final long e(long j) {
        long jE = this.H[0].e(j);
        int i = 1;
        while (true) {
            Tp3[] tp3Arr = this.H;
            if (i >= tp3Arr.length) {
                return jE;
            }
            if (tp3Arr[i].e(jE) != jE) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.daaw.Tp3
    public final long f(InterfaceC9442ws3[] interfaceC9442ws3Arr, boolean[] zArr, InterfaceC4110dr3[] interfaceC4110dr3Arr, boolean[] zArr2, long j) {
        int length;
        int length2 = interfaceC9442ws3Arr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = interfaceC9442ws3Arr.length;
            if (i >= length) {
                break;
            }
            InterfaceC4110dr3 interfaceC4110dr3 = interfaceC4110dr3Arr[i];
            Integer num = interfaceC4110dr3 == null ? null : (Integer) this.C.get(interfaceC4110dr3);
            iArr[i] = num == null ? -1 : num.intValue();
            InterfaceC9442ws3 interfaceC9442ws3 = interfaceC9442ws3Arr[i];
            if (interfaceC9442ws3 != null) {
                String str = interfaceC9442ws3.zze().b;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.C.clear();
        InterfaceC4110dr3[] interfaceC4110dr3Arr2 = new InterfaceC4110dr3[length];
        InterfaceC4110dr3[] interfaceC4110dr3Arr3 = new InterfaceC4110dr3[length];
        InterfaceC9442ws3[] interfaceC9442ws3Arr2 = new InterfaceC9442ws3[length];
        ArrayList arrayList = new ArrayList(this.B.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.B.length) {
            for (int i3 = 0; i3 < interfaceC9442ws3Arr.length; i3++) {
                interfaceC4110dr3Arr3[i3] = iArr[i3] == i2 ? interfaceC4110dr3Arr[i3] : null;
                if (iArr2[i3] == i2) {
                    InterfaceC9442ws3 interfaceC9442ws32 = interfaceC9442ws3Arr[i3];
                    interfaceC9442ws32.getClass();
                    A62 a62 = (A62) this.E.get(interfaceC9442ws32.zze());
                    a62.getClass();
                    interfaceC9442ws3Arr2[i3] = new C7194oq3(interfaceC9442ws32, a62);
                } else {
                    interfaceC9442ws3Arr2[i3] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            long jF = this.B[i2].f(interfaceC9442ws3Arr2, zArr, interfaceC4110dr3Arr3, zArr2, j2);
            if (i2 == 0) {
                j2 = jF;
            } else if (jF != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i4 = 0; i4 < interfaceC9442ws3Arr.length; i4++) {
                if (iArr2[i4] == i2) {
                    InterfaceC4110dr3 interfaceC4110dr32 = interfaceC4110dr3Arr3[i4];
                    interfaceC4110dr32.getClass();
                    interfaceC4110dr3Arr2[i4] = interfaceC4110dr32;
                    this.C.put(interfaceC4110dr32, Integer.valueOf(i2));
                    z = true;
                } else if (iArr[i4] == i2) {
                    AbstractC6048km2.f(interfaceC4110dr3Arr3[i4] == null);
                }
            }
            if (z) {
                arrayList2.add(this.B[i2]);
            }
            i2++;
            arrayList = arrayList2;
        }
        System.arraycopy(interfaceC4110dr3Arr2, 0, interfaceC4110dr3Arr, 0, length);
        Tp3[] tp3Arr = (Tp3[]) arrayList.toArray(new Tp3[0]);
        this.H = tp3Arr;
        this.I = new Fp3(tp3Arr);
        return j2;
    }

    @Override // com.daaw.Tp3
    public final void g(Sp3 sp3, long j) {
        this.F = sp3;
        Collections.addAll(this.D, this.B);
        int i = 0;
        while (true) {
            Tp3[] tp3Arr = this.B;
            if (i >= tp3Arr.length) {
                return;
            }
            tp3Arr[i].g(this, j);
            i++;
        }
    }

    @Override // com.daaw.Tp3
    public final void h(long j, boolean z) {
        for (Tp3 tp3 : this.H) {
            tp3.h(j, false);
        }
    }

    @Override // com.daaw.InterfaceC4389er3
    public final /* bridge */ /* synthetic */ void i(InterfaceC4678fr3 interfaceC4678fr3) {
        Sp3 sp3 = this.F;
        sp3.getClass();
        sp3.i(this);
    }

    @Override // com.daaw.Tp3
    public final long k(long j, C3777cg3 c3777cg3) {
        Tp3[] tp3Arr = this.H;
        return (tp3Arr.length > 0 ? tp3Arr[0] : this.B[0]).k(j, c3777cg3);
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzb() {
        return this.I.zzb();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzc() {
        return this.I.zzc();
    }

    @Override // com.daaw.Tp3
    public final long zzd() {
        long j = -9223372036854775807L;
        for (Tp3 tp3 : this.H) {
            long jZzd = tp3.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && tp3.e(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (Tp3 tp32 : this.H) {
                    if (tp32 == tp3) {
                        break;
                    }
                    if (tp32.e(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.daaw.Tp3
    public final C6362lr3 zzh() {
        C6362lr3 c6362lr3 = this.G;
        c6362lr3.getClass();
        return c6362lr3;
    }

    @Override // com.daaw.Tp3
    public final void zzk() {
        int i = 0;
        while (true) {
            Tp3[] tp3Arr = this.B;
            if (i >= tp3Arr.length) {
                return;
            }
            tp3Arr[i].zzk();
            i++;
        }
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        return this.I.zzp();
    }
}
